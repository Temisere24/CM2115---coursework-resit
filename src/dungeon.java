public class dungeon {
    private Room[] rooms = new Room[20];
    //number of rooms below
   //private int roomNum;

    public void addRoom(Room stage, int roomNum){
        if(roomNum >=0 && roomNum< rooms.length){
    rooms[roomNum] = stage;
        }else {
            System.out.println("room dosent exist");
    }
}
    public void getRoom(int roomNum){
        if (roomNum >= 0 && roomNum < rooms.length && rooms[roomNum] != null) {
     rooms[roomNum].describe();
        } else {
            System.out.println("Room not found at index " + roomNum);
        }
}
}

