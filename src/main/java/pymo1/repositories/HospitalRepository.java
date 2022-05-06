package pymo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pymo1.models.HospitalModel;

public interface HospitalRepository extends JpaRepository<HospitalModel, Integer>{

}
