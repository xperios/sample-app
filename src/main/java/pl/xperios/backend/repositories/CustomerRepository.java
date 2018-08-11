package pl.xperios.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.xperios.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
