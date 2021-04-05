package ru.netologi.manager;

import ru.netologi.domain.Post;

public class PostManager {
    private Post[] posts;

    public Post[] getPosts() {
        return posts;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }

    public Post[] search(int IdOwner, String domain, String query, int ownersOnly, int count, int offset) {
        return null;
    }

    public void delete(int idPost, int idOwner) {

    }
}
