public class MakeCombatRoom extends MakeRoom {
    @Override
    public Room MakeRoom(String name, String description){
        return new CombatRoom(name, description);
    }
}
