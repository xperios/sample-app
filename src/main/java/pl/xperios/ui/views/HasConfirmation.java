package pl.xperios.ui.views;

import pl.xperios.ui.components.ConfirmDialog;

public interface HasConfirmation {

	void setConfirmDialog(ConfirmDialog confirmDialog);

	ConfirmDialog getConfirmDialog();
}
