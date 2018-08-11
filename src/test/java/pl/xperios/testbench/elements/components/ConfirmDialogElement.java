package pl.xperios.testbench.elements.components;

import com.vaadin.flow.component.dialog.testbench.DialogElement;
import com.vaadin.testbench.elementsbase.Element;

@Element("confirm-dialog")
public class ConfirmDialogElement extends DialogElement {

	public void confirm() {
		callFunction("_ok");
	}
	
	public String getMessage() {
		return getPropertyString("message");
	}
}
