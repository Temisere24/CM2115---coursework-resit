
public class MakeChallengeRoom extends MakeRoom {
    @Override
    public Room MakeRoom(String name, String description){
        return new ChallengeRoom(name, description);
    }
}
