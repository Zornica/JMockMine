package task1;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/28/15.
 */
public class Person {
  private String name;

  public Person(String name) {

    this.name = name;
  }

  public boolean sendMessage(Message message, MessageSender sender) {
    return sender.send(message);

  }
}
