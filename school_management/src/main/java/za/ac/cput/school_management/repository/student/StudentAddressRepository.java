package za.ac.cput.school_management.repository.student;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.school_management.domain.Lookup.Name;
import org.springframework.stereotype.Repository;

/*
    StudentAddress.java
    Entity for the StudentAddress
    Zavian Minnies (217230458)
    17 June 2022
 */

public interface StudentAddressRepository extends IRepository <StudentAddress, String> {
}
