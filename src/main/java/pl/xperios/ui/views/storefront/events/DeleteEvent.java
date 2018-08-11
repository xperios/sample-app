package pl.xperios.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import pl.xperios.ui.views.orderedit.OrderItemEditor;

public class DeleteEvent extends ComponentEvent<OrderItemEditor> {
	public DeleteEvent(OrderItemEditor component) {
		super(component, false);
	}
}