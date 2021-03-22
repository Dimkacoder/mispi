class C extends B {
  public C() {
    t5 = 2;
    t1 = 5;
    t20 = 2L;
  }
  public void t7() {
    System.out.println("метод t7 в классе C");
    System.out.println(t31 - 5);
  }
  public void t38() {
    System.out.println("метод t38 в классе C");
    System.out.println(t5 + 3);
  }
  public void t30() {
    System.out.println("метод t30 в классе C");
    System.out.println(t5 << 1);
  }
  public static void t16() {
    System.out.println("метод t16 в классе C");
    System.out.println((t23 + 2));
  }
  public static void t39() {
    System.out.println("метод t39 в классе C");
    System.out.println(t23--);
  }
  public static void t33() {
    System.out.println("метод t33 в классе C");
    System.out.println(t25);
  }
  public static void t27() {
    System.out.println("метод t27 в классе C");
    System.out.println((t25 + 2));
  }
  public void t9(B r) {
    r.t38();
  }
  public void t9(C r) {
    r.t37();
  }
}
