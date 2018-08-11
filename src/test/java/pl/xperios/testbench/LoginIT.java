package pl.xperios.testbench;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import pl.xperios.testbench.elements.ui.DashboardViewElement;
import pl.xperios.testbench.elements.ui.LoginViewElement;
import pl.xperios.testbench.elements.ui.StorefrontViewElement;

public class LoginIT extends AbstractIT {

	@Test
	public void loginWorks() {
		LoginViewElement loginView = openLoginView();
		assertEquals("Email", loginView.getUsernameLabel());
		loginView.login("barista@vaadin.com", "barista");
	}

	@Test
	public void logout() {
		LoginViewElement loginView = openLoginView();
		StorefrontViewElement storefront = loginView.login("barista@vaadin.com", "barista");
		storefront.getMenu().logout();
		Assert.assertTrue(getDriver().getCurrentUrl().endsWith("login"));
	}

	@Test
	public void loginToNotDefaultUrl() {
		LoginViewElement loginView = openLoginView(getDriver(), APP_URL + "dashboard");
		DashboardViewElement dashboard = loginView.login("admin@vaadin.com", "admin", DashboardViewElement.class);
		Assert.assertNotNull(dashboard);
	}

}