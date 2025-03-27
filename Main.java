package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nClub Member Management");
            System.out.println("1. Add Member");
            System.out.println("2. Delete Member");
            System.out.println("3. List Members");
            System.out.println("4. Search Member");
            System.out.println("5. Update Member");
            System.out.println("6. Sort Members Alphabetically");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: memberService.addMember(); break;
                case 2: memberService.deleteMember(); break;
                case 3: memberService.listMembers(); break;
                case 4: memberService.searchMember(); break;
                case 5: memberService.updateMember(); break;
                case 6: memberService.sortMembers(); break;
                case 7: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid option, try again.");
            }
        }
    }
}