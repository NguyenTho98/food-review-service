package vn.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.food.entity.main.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //
}
