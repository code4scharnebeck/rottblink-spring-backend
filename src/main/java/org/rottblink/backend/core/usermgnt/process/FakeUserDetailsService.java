package org.rottblink.backend.core.usermgnt.process;

// @Service
// public class FakeUserDetailsService implements UserDetailsService {
//
// @Autowired
// private PersonRepository personRepository;
//
// @Override
// public UserDetails loadUserByUsername(String username) throws
// UsernameNotFoundException {
// Person person = personRepository.findByFirstNameEquals(username);
// if (person == null) {
// throw new UsernameNotFoundException("Username " + username + " not found");
// }
// return new User(username, "password", getGrantedAuthorities(username));
// }
//
// private Collection<? extends GrantedAuthority> getGrantedAuthorities(String
// username) {
// Collection<? extends GrantedAuthority> authorities;
// if (username.equals("John")) {
// authorities = asList(() -> "ROLE_ADMIN", () -> "ROLE_BASIC");
// } else {
// authorities = asList(() -> "ROLE_BASIC");
// }
// return authorities;
// }
// }