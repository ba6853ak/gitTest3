import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {

    private static final int LOTTO_MAX_NUMBER = 45;
    private static final int LOTTO_NUMBERS_COUNT = 6;
    private static final int TOTAL_TICKETS = 5;

    public static void main(String[] args) {
        List<Set<Integer>> tickets = generateLottoTickets(TOTAL_TICKETS);

        for (int i = 0; i < tickets.size(); i++) {
            System.out.println("Lotto  Ticket " + (i + 1) + ": " + tickets.get(i));
        }
    }

    private static List<Set<Integer>> generateLottoTickets(int totalTickets) {
        List<Set<Integer>> tickets = new ArrayList<>();

        for (int i = 0; i < totalTickets; i++) {
            Set<Integer> ticket = generateLottoTicket();
            tickets.add(ticket);
        }

        return tickets;
    }

    private static Set<Integer> generateLottoTicket() {
        Set<Integer> ticket = new HashSet<>();
        Random random = new Random();

        while (ticket.size() < LOTTO_NUMBERS_COUNT) {
            int number = random.nextInt(LOTTO_MAX_NUMBER) + 1;
            ticket.add(number);
        }

        return new TreeSet<>(ticket); // Sort the numbers for better readability
    }
}