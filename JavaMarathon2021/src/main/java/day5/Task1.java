package day5;

public class Task1 {
    public static void main(String[] args) {

    	Car car1 = new Car();
    	car1.setModel("Toyota");
    	car1.setYear(1998);
    	car1.setColor("gray");
    
    	System.out.println(car1.getModel()+" "+car1.getColor()+" "+car1.getYearl());
    	
    	Motorbike m1 = new Motorbike ("Suzuki", "black", 2012);
    	
    	System.out.println(m1.getModel()+" "+m1.getColor()+" "+m1.getYearl());
    }
}
