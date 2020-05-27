public class Main {
  public static void main(String[] args) {
    EagerSingleton singleton = EagerSingleton.getInstance();
    System.out.println(singleton);
    System.out.println(EagerSingleton.getInstance());
  }
}