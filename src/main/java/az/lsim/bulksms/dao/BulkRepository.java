package az.lsim.bulksms.dao;

import az.lsim.bulksms.Entity.Bulk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BulkRepository extends JpaRepository<Bulk, Integer> {
}
