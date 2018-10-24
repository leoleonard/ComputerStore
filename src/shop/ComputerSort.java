package shop;

import java.util.Arrays;

public class ComputerSort {
    public static void main(String[] args) {

        Computer[] computers = new Computer[]{
                new Computer("Dell", 4500, 8),
                new Computer("Apple", 3200, 16),
                new Computer("Lenovo", 4100, 32),
                new Computer("Asus", 2400, 32)
        };

        boolean changes;

        do {
            changes = false;
            for (int i = 0; i < computers.length - 1; i++) {
                Computer c1 = computers[i];
                Computer c2 = computers[i + 1];

                int compareResults = compareTo(c1, c2);

                if (compareResults > 0) {
                    swapElements(computers, i);
                    changes = true;
                }
            }
        } while (changes);

        String arraysAsString = Arrays.toString(computers);
        System.out.println(arraysAsString);
    }

    private static void swapElements(Computer[] computers, int i) {
        Computer temp = computers[i];
        computers[i] = computers[i + 1];
        computers[i + 1] = temp;
    }

    private static int compareTo(Computer c1, Computer c2) {
        if (c1.getCpuMhz() > c2.getCpuMhz()) {
            return 1;
        } else if (c1.getCpuMhz() == c2.getCpuMhz()) {

            if (c1.getRam() > c2.getRam()) {
                return 1;
            } else if (c1.getRam() == c2.getRam()) {
                return c1.getName().compareTo(c2.getName());
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }


}
