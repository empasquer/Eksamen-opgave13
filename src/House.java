import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class House {
    private ArrayList<Room> rooms = new ArrayList<>();

    public ArrayList<Room> generateRooms() {

        for (int i = 0; i < 5; i++) {
            int randomWidth = new Random().nextInt(101) + 10;
            int randomLength = new Random().nextInt(101) + 10;
            this.rooms.add(new Room(randomWidth, randomLength));
        }

        return this.rooms;
    }


    public static void main(String[] args) {

        House myHouse = new House();
        ArrayList<Room> roomsInMyHouse = myHouse.generateRooms();

        for (Room room : roomsInMyHouse ) {
            System.out.println(room.getWidth());
        }

        System.out.println("_____");
        Collections.sort(roomsInMyHouse);

        for (Room room : roomsInMyHouse ) {
            System.out.println(room.getWidth()*room.getLength());
        }


        // Det her har jeg skrevet efter eksamen
        // Fik ikke tid til at lave det men fik lov til at forklare hvad jeg ville med det
        Room roomWithBiggestAreal = roomsInMyHouse.get(0);
        System.out.println("The biggest areal og myHouse's rooms is: "
                + roomWithBiggestAreal.getLength() * roomWithBiggestAreal.getWidth());

    }




}
