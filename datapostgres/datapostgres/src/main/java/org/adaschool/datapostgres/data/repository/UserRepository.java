package org.adaschool.datapostgres.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.adaschool.datapostgres.data.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
