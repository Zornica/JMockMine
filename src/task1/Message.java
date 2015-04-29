package task1;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/28/15.
 */
public class Message {
  public final Person person;
  public final String title;
  public final String body;

  public Message(Person person, String title, String body) {

    this.person = person;
    this.title = title;
    this.body = body;
  }
}
