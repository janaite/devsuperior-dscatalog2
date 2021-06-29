package dev.janaite.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.janaite.dslearnbds.entities.Enrollment;
import dev.janaite.dslearnbds.entities.pk.EnrollmentPK;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK >{

}
