import java.util.ArrayList;

public class HeadHunter implements Subject{
    
    ArrayList<String> jobs;
    ArrayList<Observer> jobseekers;
    
    public HeadHunter(){
        this.jobs = new ArrayList<>();
        this.jobseekers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.jobseekers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.jobseekers.remove(observer);
        
    }

    @Override
    public void notifyAllObservers() {
        for (Observer jobseeker : jobseekers) {
            jobseeker.update(this);
        }
    }
    
    public void addJob(String job){
        this.jobs.add(job);
        this.notifyAllObservers();
    }
    
    public ArrayList<String> getJobs(){
        return this.jobs;
    }
    
    public String toString(){
        String retVal = "This headhunter offers: \n";
        int index = 1;
        for (String job : jobs) {
            retVal += index + ") " + job + "\n";
            index++;
        }
        return retVal;
    }
}
