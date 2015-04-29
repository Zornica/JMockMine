package task1;
//azzzzzz
/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/29/15.
 */
public class A {

  private final B b;

  public A(B b) {

    this.b = b;
  }

  public void doSomething(int value, int secondValue) {


    if (value > 0) {
      b.positiveValue(value, secondValue);
    }

    if (value < 0) {
      b.negativeValue(value, secondValue);
    }

  }
}
