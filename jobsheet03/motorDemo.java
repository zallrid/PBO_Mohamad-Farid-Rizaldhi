package jobsheet03;

public class motorDemo {
    public static void main(String[] args) {
        motor motor1 = new motor();
        motor1.platNomor = "B 1234 XZ";
        int kecepatanBaru = 50;

        if (!motor1.statusMesin && kecepatanBaru > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        }
        else{
            motor1.kecepatan = kecepatanBaru;
        }
        motor1.displayInfo();

        motor motor2 = new motor();
        motor2.platNomor = "N 9840 AB";
        motor2.statusMesin = true;
        kecepatanBaru = 60;

        if (!motor2.statusMesin && kecepatanBaru > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        }
        else{
            motor1.kecepatan = kecepatanBaru;
        }
        motor2.displayInfo();

        motor motor3 = new motor();
        motor3.platNomor = "D 8343 CV";
        kecepatanBaru = 40;

        if (!motor3.statusMesin && kecepatanBaru > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        }
        else{
            motor1.kecepatan = kecepatanBaru;
        }
        motor3.displayInfo();
    }
}
