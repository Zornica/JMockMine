package demotask;

/**
* Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/29/15.
*/
public final class SimpleMessage {
  public final String recipient;
  public final String title;
  public final String body;

  public SimpleMessage(String recipient, String title, String body) {

    this.recipient = recipient;
    this.title = title;
    this.body = body;
  }
}
