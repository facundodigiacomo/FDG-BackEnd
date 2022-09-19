
package com.appArgProg.BackEndSpringBoot.security.repository;

import com.appArgProg.BackEndSpringBoot.security.entity.Rol;
import com.appArgProg.BackEndSpringBoot.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
