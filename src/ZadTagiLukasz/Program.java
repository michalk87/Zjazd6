package ZadTagiLukasz;

public class Program {
    public static void main(String[] args) {

        Post post = new Post("Programowanie jest super", "Michalos");
        post.addTag(new Tag("programowanie"));
        post.addTag(new Tag("java"));
        post.addTag(new Tag("programowanie"));

        System.out.println(post);

    }
}
