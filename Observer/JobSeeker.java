public class JobSeeker implements Observer{
    
    public String name;
    
    public JobSeeker(String name){
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(this.name + " is now watching what...\n" + subject);
    }
    
    @Override
    public String toString(){
        return this.name;
    }
    
}
