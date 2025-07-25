
public class CreateChallengeRoom extends CreateRoom {
    @Override
    public Room CreateRoom(String name, String description){
        return new ChallengeRoom(name, description);
    }
}
