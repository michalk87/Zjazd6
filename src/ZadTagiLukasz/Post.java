package ZadTagiLukasz;

import java.util.ArrayList;
import java.util.List;

public class Post implements Addable {

    private String title;
    private String author;

    private List<Tag> tagList;

    public Post(String title, String author) {
        this.title = title;
        this.author = author;
        this.tagList = new ArrayList<>();
    }
    @Override

    public void addTag(Tag tag){
        boolean index = false;
        for (Tag tag1 : tagList){
            if (!tag1.getTitle().equals(tag.getTitle())){
                index = true;

            }
        }

        if (tagList.contains(tag))
        tagList.add(tag);
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", tagList=" + tagList +
                '}';
    }
}
