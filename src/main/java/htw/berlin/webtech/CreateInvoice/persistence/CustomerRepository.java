package htw.berlin.webtech.CreateInvoice.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

    List<CustomerEntity> findAllByFirstNameContains(String firstName);

}
