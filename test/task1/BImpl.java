package task1;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/29/15.
 */
public class BImpl implements B {

  private final CImpl cImpl;

  public BImpl(CImpl cImpl) {

    this.cImpl = cImpl;
  }

  @Override
  public void negativeValue(int a, int b) {
    if (a > b) {
      cImpl.anotherMethod();
    } else {
      cImpl.printSomething();
    }

  }

  @Override
  public void positiveValue(int c, int d) {
    if (c == d) {
      System.out.println("Something");
    }

    if (c < d) {
      this.cImpl.printSomething();
    }
  }
}
