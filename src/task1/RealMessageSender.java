package task1;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/29/15.
 */
public class RealMessageSender implements MessageSender{
  @Override
  public boolean send(Message message) {

    if ("".equals(message.title) || message.title == null) {
      return false;
    }

    if ("".equals(message.body) || message.body == null) {
      return false;
    }

    return true;
  }
}
