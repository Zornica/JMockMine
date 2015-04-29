package task1;

import demotask.MessageValidator;
import demotask.SimpleMessage;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/29/15.
 */
public class FakeValidator implements MessageValidator {

  public boolean result;

  @Override
  public boolean validate(SimpleMessage simpleMessage) {
    return result;
  }
}
