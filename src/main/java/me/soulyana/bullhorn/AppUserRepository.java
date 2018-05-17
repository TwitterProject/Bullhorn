package me.soulyana.bullhorn;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface AppUserRepository extends CrudRepository<AppUser, Long> {
    AppUser findByUsername(String username);
//    AppUser findByEmail(String email);
//    Long countByEmail(String email);
//    Long countByUsername(String email);
//
//    // get a list of Users who have any post or comments that match a string
//    Collection<AppUser> findByPostsIsAndCommentsIs(Post post, Comment comment);
//
//    Long countByRoles(AppRole role);
}
