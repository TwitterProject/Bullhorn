package me.soulyana.bullhorn;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Lob
    private String message;

    private String postedAt;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "appUser_id")
    private AppUser appUser;

    @OneToMany(mappedBy = "post")
    public Set<Comment> comments;

    public Post(java.lang.String message, java.lang.String postedAt) {
        this.message = message;
        this.postedAt = postedAt;
        this.appUser = appUser;

    }

    public Post() {
        this.comments = new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(String postedAt) {
        this.postedAt = postedAt;
    }


    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

//    //add Method for adding users
//    public void addUser(AppUser aUser) {
//        this.appUser.add(aUser);
//    }

}
