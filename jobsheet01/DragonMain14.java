package jobsheet01;

public class DragonMain14 {
    public static void main(String[] args) {
        
        Dragon14 naga1 = new Dragon14();
        Dragon14 naga2 = new Dragon14();

       
        System.out.println("--- NAGA 1 ---");
        naga1.move(5);
        naga1.printStatus();


        System.out.println("--- NAGA 2 ---");
        naga2.changeDirection(2); 
        naga2.move(3);           
        naga2.printStatus();
    }
}