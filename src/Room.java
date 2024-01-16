public class Room implements Comparable<Room> {
    private int width, length;

    public Room(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public int compareTo(Room o) {
        int thisAreal = this.getLength() * this.getWidth();
        int oAreal = o.getLength() * o.getWidth();

        return oAreal - thisAreal;
    }
}
