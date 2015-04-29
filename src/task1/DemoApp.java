package task1;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/29/15.
 */
public class DemoApp {

  public static void main(String[] args) {
    Person john = new Person("John");
    MessageSender sender = new InMemoryMessageSender();

    if (!john.sendMessage(new Message(new Person("Peter"), "test1", "vkfkfk"), sender)) {
      System.out.println("John was not able to send message to Peter.");
    } else {
      System.out.println("Message was send successfully.");
    }

  }
}
