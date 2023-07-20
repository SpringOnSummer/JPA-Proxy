package devel0624.io.velog.repo;

import devel0624.io.velog.entity.DataInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataInformationRepository extends JpaRepository<DataInformation, Long> {
}
