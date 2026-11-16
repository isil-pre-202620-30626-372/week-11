public class App {
    public static void main(String[] args) throws Exception {
        Workshop workshop = new Workshop("Introduction to Java", 5, 15);

        Participant[] participants = {
                new Participant(1, "Ana Garcia", "555-0101"),
                new Participant(2, "Luis Martinez", "555-0102"),
                new Participant(3, "Maria Lopez", "555-0103"),
                new Participant(4, "Carlos Rodriguez", "555-0104"),
                new Participant(5, "Sofia Hernandez", "555-0105"),
                new Participant(6, "Diego Perez", "555-0106"),
                new Participant(7, "Valeria Torres", "555-0107"),
                new Participant(8, "Jorge Ramirez", "555-0108"),
                new Participant(9, "Camila Flores", "555-0109"),
                new Participant(10, "Mateo Sanchez", "555-0110"),
                new Participant(11, "Lucia Rivera", "555-0111"),
                new Participant(12, "Andres Gomez", "555-0112"),
                new Participant(13, "Elena Diaz", "555-0113"),
                new Participant(14, "Gabriel Cruz", "555-0114"),
                new Participant(15, "Paula Morales", "555-0115"),
                new Participant(16, "Nicolas Reyes", "555-0116"),
                new Participant(17, "Daniela Ortiz", "555-0117"),
                new Participant(18, "Samuel Castillo", "555-0118"),
                new Participant(19, "Isabella Vega", "555-0119"),
                new Participant(20, "Adrian Mendoza", "555-0120")
        };

        for (Participant participant : participants) {
            workshop.registerParticipant(participant);
        }

        workshop.showParticipants();

        workshop.assignRandomScore();

        workshop.showParticipants();

        workshop.sortPartcipants();

        workshop.showParticipants();

        workshop.assignVacancies();

        workshop.showParticipants();

    }
}
