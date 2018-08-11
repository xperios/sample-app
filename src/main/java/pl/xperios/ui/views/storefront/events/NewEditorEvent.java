package pl.xperios.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import pl.xperios.ui.views.orderedit.OrderItemsEditor;

public class NewEditorEvent extends ComponentEvent<OrderItemsEditor> {

	public NewEditorEvent(OrderItemsEditor component) {
		super(component, false);
	}
}