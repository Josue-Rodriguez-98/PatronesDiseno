public class Car {
    
    CarType.Model model;
    
    public Car(CarType.Model model){
        this.model = model;
    }
    
    public CarType.Model getModel(){
        return this.model;
    }
    
    public void setModel(CarType.Model model){
        this.model = model;
    }
    
}
