package com.kela.backend.business.service;

import com.kela.backend.controller.CustomerController;
import com.kela.backend.data.entity.User;
import com.kela.backend.data.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CustomUserDetailService implements UserDetailsService {

    private final UserRepository userRepository;
    public static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @Autowired
    public CustomUserDetailService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        user.setPassword(user.getPassword());
        //user.setRoles(Collections.singletonList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }

    public Boolean comparePassword(String passwordAuth, String passwordBase) {
        return bCryptPasswordEncoder.matches(passwordAuth, passwordBase);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("find User : " + username);
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("No user present with username : " + username);
        } else {
            System.out.println("User : " + new UserRepositoryUserDetails(user));
            return new UserRepositoryUserDetails(user);
        }
    }

    private final static class UserRepositoryUserDetails extends User implements UserDetails {
        public UserRepositoryUserDetails(User user) {
            super(user);
        }

        @Override
        public String getUsername() {
            return super.getUsername();
        }

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            return getRoles();
        }

        @Override
        public boolean isAccountNonExpired() {
            return false;
        }

        @Override
        public boolean isAccountNonLocked() {
            return false;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return false;
        }

        @Override
        public boolean isEnabled() {
            return false;
        }

    }

}
