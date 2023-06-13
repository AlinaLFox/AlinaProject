package com.example.DemoAlinaProject.Controler;

import com.example.DemoAlinaProject.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
