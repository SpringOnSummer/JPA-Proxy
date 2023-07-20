package devel0624.io.velog.repo;

import devel0624.io.velog.entity.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data,Long> {

    Page<Data> readAllBy(Pageable pageable);
}
