package shop;

import java.util.Arrays;

public class ComputerSort {
    public static void main(String[] args) {

        Computer[] computers = new Computer[]{
                new Computer("Dell", 4500, 8),
                new Computer("Apple", 3200, 16),
                new Computer("Lenovo", 4100, 21)
        };

        boolean changes;

        do {
            changes = false;
            for (int i = 0; i < computers.length - 1; i++) {
                if (computers[i].getCpuMhz() > computers[i + 1].getCpuMhz()) {
                    Computer temp = computers[i];
                    computers[i] = computers[i + 1];
                    computers[i + 1] = temp;
                    changes = true;
                }
            }
        } while (changes);

        String arraysAsString = Arrays.toString(computers);
        System.out.println(arraysAsString);
    }


}
