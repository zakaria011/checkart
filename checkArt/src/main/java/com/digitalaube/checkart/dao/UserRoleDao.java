package com.digitalaube.checkart.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitalaube.checkart.bean.UserRole;

@Repository
public interface UserRoleDao extends JpaRepository<UserRole, Long>{

}
