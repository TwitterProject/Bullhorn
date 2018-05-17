package me.soulyana.bullhorn;


import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Lob
    private String comment;

    private String postedAt;

    @ManyToOne
    private Post post;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "appUser_id")
    private AppUser appUser;

    public Comment() {

    }

    public Comment(String comment, String postedAt) {
        this.comment = comment;
        this.postedAt = postedAt;
        this.appUser = appUser;
//        this.appUser = new HashSet<>();

    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(String postedAt) {
        this.postedAt = postedAt;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }


//    //add Method for adding users
//    public void addUser(AppUser aUser) {
//        this.appUser.add(aUser);
//    }
}
