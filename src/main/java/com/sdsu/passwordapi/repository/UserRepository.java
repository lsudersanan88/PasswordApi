package com.sdsu.passwordapi.repository;

import com.sdsu.passwordapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    @Override
    <S extends User> S save(S s);
}
