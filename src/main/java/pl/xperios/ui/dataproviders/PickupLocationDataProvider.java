package pl.xperios.ui.dataproviders;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.domain.PageRequest;

import com.vaadin.flow.data.provider.AbstractBackEndDataProvider;
import com.vaadin.flow.data.provider.Query;
import com.vaadin.flow.spring.annotation.SpringComponent;
import pl.xperios.backend.data.entity.PickupLocation;
import pl.xperios.backend.service.PickupLocationService;

/**
 * A singleton data provider which knows which pickup locations are available.
 */
@SpringComponent
public class PickupLocationDataProvider extends AbstractBackEndDataProvider<PickupLocation, String> {

	private transient PickupLocationService pickupLocationService;

	public PickupLocationDataProvider(PickupLocationService pickupLocationService) {
		this.pickupLocationService = pickupLocationService;
	}

	@Override
	protected int sizeInBackEnd(Query<PickupLocation, String> query) {
		return (int) pickupLocationService.countAnyMatching(query.getFilter());
	}

	@Override
	public Stream<PickupLocation> fetchFromBackEnd(Query<PickupLocation, String> query) {
		return findLocations(query).stream();
	}

	public List<PickupLocation> findLocations(Query<PickupLocation, String> query) {
		return pickupLocationService
				.findAnyMatching(query.getFilter(), PageRequest.of(query.getOffset(), query.getLimit())).getContent();

	}
}
