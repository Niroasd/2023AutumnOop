package week5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.out;

public class ShowGuests {
    public static void main(String[] args) throws IOException {
        int[] guests = new int[10];
        int[] howManyRoomsWith = new int[10];

        ArrayList<Integer> largestRooms = new ArrayList<>();
        int largestSoFar = 0;
        int hotelGuests = 0;

        Scanner diskScanner = new Scanner(
                new File("D:\\2023AutumnOOP\\2023AutumnOop\\week5\\src\\main\\java\\week5\\GuestList.txt"));

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            guests[roomNum] = diskScanner.nextInt();
            hotelGuests += guests[roomNum];
            howManyRoomsWith[guests[roomNum]] += 1;

            if (guests[roomNum] == largestSoFar) {
                largestRooms.add(roomNum);
            } else if (guests[roomNum] > largestSoFar) {
                largestSoFar = guests[roomNum];
                largestRooms.clear();
                largestRooms.add(roomNum);
            }
        }

        // out.println("Room\tGuests");

        // for (int roomNum = 9; roomNum >= 0; roomNum--) {
        // out.print(roomNum);
        // out.print("\t");
        // out.println(guests[roomNum]);
        // }

        // tarkistus tarvitaanko monikkoa string formaatissa.
        String plural = "e";
        if (largestRooms.size() > 1) {
            plural = "i";
        }

        System.out.println(String.format("Eniten ihmisia huone%sssa: %s\nSuurin ihmismaara: %s", plural, largestRooms,
                largestSoFar));

        System.out.println(String.format("hotellissa on %s asukasta.\n", hotelGuests));

        System.out.println(
                "Alkaa tyhjista huoneista, yhden hlon huoneeseen, 2 hlon jne...\n" + Arrays.toString(howManyRoomsWith));

        diskScanner.close();

    }
}
