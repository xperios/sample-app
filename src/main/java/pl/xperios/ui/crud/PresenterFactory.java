/**
 *
 */
package pl.xperios.ui.crud;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import pl.xperios.backend.data.entity.Order;
import pl.xperios.backend.data.entity.Product;
import pl.xperios.backend.data.entity.User;
import pl.xperios.backend.service.OrderService;
import pl.xperios.backend.service.ProductService;
import pl.xperios.backend.service.UserService;
import pl.xperios.ui.views.storefront.StorefrontView;

@Configuration
public class PresenterFactory {

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public CrudEntityPresenter<Product> productPresenter(ProductService crudService, User currentUser) {
		return new CrudEntityPresenter<>(crudService, currentUser);
	}

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public CrudEntityPresenter<User> userPresenter(UserService crudService, User currentUser) {
		return new CrudEntityPresenter<>(crudService, currentUser);
	}

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public EntityPresenter<Order, StorefrontView> orderEntityPresenter(OrderService crudService, User currentUser) {
		return new EntityPresenter<>(crudService, currentUser);
	}

}
