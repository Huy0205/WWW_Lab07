package vn.edu.iuh.fit.lab07.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.lab07.backend.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
