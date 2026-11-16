import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Workshop {
    private String name;
    private int capacity;
    private int minimumScore;
    private List<Participant> participants;

    public Workshop(String name, int capacity, int minimumScore) {
        this.name = name;
        this.capacity = capacity;
        this.minimumScore = minimumScore;
        this.participants = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMinimumScore() {
        return minimumScore;
    }

    public void setMinimumScore(int minimumScore) {
        this.minimumScore = minimumScore;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public void registerParticipant(Participant participant) {
        participant.setStatus(Status.REGISTERED);
        participants.add(participant);
    }

    public void assignRandomScore() {
        for (Participant participant : participants) {
            int score = (int) (Math.random() * 21);
            participant.setScore(score);
        }
    }

    public void sortPartcipants() {
        participants.sort(Comparator.comparing(Participant::getScore).reversed().thenComparing(Participant::getId));
    }

    public void assignVacancies() {
        int admitted = 0;

        for (Participant participant : participants) {
            if (participant.getScore() < minimumScore) {
                participant.setStatus(Status.NOT_QUALIFIED);
                continue;
            }

            if (admitted < capacity) {
                participant.setStatus(Status.ADMITTED);
                admitted++;
                continue;
            }

            participant.setStatus(Status.WAITEDLIST);

        }
    }

    public void showParticipants() {
        System.out.println("Participants in the workshop: " + name);

        for (Participant participant : participants) {
            System.out.println(participant);
        }

        System.out.println();
    }

}
