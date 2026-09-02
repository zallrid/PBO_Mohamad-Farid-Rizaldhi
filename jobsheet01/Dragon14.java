package jobsheet01;

public class Dragon14 {
    int x;
    int y;
    int direction;

    public Dragon14() {
        direction = 1;
    }

    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Arah tidak valid. Masukkan 1 (atas), 2 (kanan), 3 (bawah), atau 4 (kiri).");
        }
    }

    public void move(int steps) {
        switch (direction) {
            case 1: 
                y += steps; 
                break;
            case 2: 
                x += steps; 
                break;
            case 3: 
                y -= steps; 
                break;
            case 4: 
                x -= steps; 
                break;
        }
    }

    public void printStatus() {
        System.out.println("Posisi Koordinat: (" + x + ", " + y + ")");
        System.out.println("Arah Saat Ini: " + direction);
        System.out.println("===================");
    }
}