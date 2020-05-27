public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        HeadHunter hunter = new HeadHunter();
        hunter.registerObserver(new JobSeeker("Josue"));
        hunter.registerObserver(new JobSeeker("Martin"));
        hunter.addJob("Microsoft Xbox");
    }
}
