import entities.Comment;
import entities.Post;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    DateTimeFormatter br = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    Post post = new Post(LocalDateTime.parse("21/06/2018 13:05:44", br), "Traveling to New Zeeland", "I'm going to visit this wonderful country!", 12);

    Comment c1 = new Comment("Have a nice trip!");
    Comment c2 = new Comment("Wow that's awesome!");
    post.addComment(c1);
    post.addComment(c2);

    IO.println(post);



}
