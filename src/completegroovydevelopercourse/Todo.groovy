package completegroovydevelopercourse

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString
class Todo {
    String title
    Boolean completed
    Date created
    Integer likes

    public Todo(String title) {
        this.title = title
        this.completed = false
        this.created = new Date()
        this.likes = 0
    }

    void addToLikes() {
        likes += 1
    }

    // Right click to generate constructor, getters and setters
    String getTitle() {
        return title
    }

    void setTitle(String title) {
        this.title = title
    }

    Boolean getCompleted() {
        return completed
    }

    void setCompleted(Boolean completed) {
        this.completed = completed
    }

    Date getCreated() {
        return created
    }

    void setCreated(Date created) {
        this.created = created
    }

    Integer getLikes() {
        return likes
    }

    void setLikes(Integer likes) {
        this.likes = likes
    }
}
