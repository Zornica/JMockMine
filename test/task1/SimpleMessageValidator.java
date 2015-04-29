package task1;

import demotask.MessageValidator;
import demotask.SimpleMessage;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/29/15.
 */
public class SimpleMessageValidator implements MessageValidator {

  @Override
  public boolean validate(SimpleMessage message) {
    if ("".equals(message.title)) {
      return false;
    }

    if ("".equals(message.body)) {
      return false;
    }

    if ("".equals(message.recipient)) {
      return false;
    }
    return true;
  }
}
