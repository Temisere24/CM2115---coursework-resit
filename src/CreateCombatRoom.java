public class CreateCombatRoom extends CreateRoom {
    @Override
    public Room CreateRoom(String name, String description){
        return new CombatRoom(name, description);
    }
}
