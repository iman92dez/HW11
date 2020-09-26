package domains;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;
    @Column(nullable = false, unique = true)
    private String title;
    @Column(nullable = false, columnDefinition = "text")
    private String brief;
    @Column(nullable = false, columnDefinition = "text")
    private String content;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false, updatable = false)
    private Date createDate;
    @Temporal(TemporalType.DATE)
    private Date lastUpdateDate;
    @Temporal(TemporalType.DATE)
    private Date publishDate;
    @Column(nullable = false)
    private Boolean isPublished;
//    @ManyToOne
//    @JoinColumn(name = "fk_user")
//    private User user;
//    @ManyToOne
//    @JoinColumn(name = "fk_category")
//    private Category category;
//    @ManyToMany
//    @JoinTable(
//            name = "article_tag",
//            joinColumns = @JoinColumn(name = "fk_article",referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "fk_tag"))
//    private List<Tag> tagList = new ArrayList<>();

    public Article() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }
}