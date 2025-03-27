package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class MemberService {
    private List<Member> members = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addMember() {
        System.out.print("Enter Member ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Member Name: ");
        String name = scanner.nextLine();
        members.add(new Member(id, name));
        System.out.println("Member added successfully!");
    }

    public void deleteMember() {
        System.out.print("Enter Member ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        members.removeIf(member -> member.getId() == id);
        System.out.println("Member deleted successfully!");
    }

    public void listMembers() {
        if (members.isEmpty()) {
            System.out.println("No members registered.");
        } else {
            members.forEach(System.out::println);
        }
    }

    public void searchMember() {
        System.out.print("Enter Member Name to search: ");
        String name = scanner.nextLine();
        members.stream()
                .filter(member -> member.getName().equalsIgnoreCase(name))
                .forEach(System.out::println);
    }

    public void updateMember() {
        System.out.print("Enter Member ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Member member : members) {
            if (member.getId() == id) {
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                member.setName(newName);
                System.out.println("Member updated successfully!");
                return;
            }
        }
        System.out.println("Member not found.");
    }

    public void sortMembers() {
        members.sort(Comparator.comparing(Member::getName));
        System.out.println("Members sorted alphabetically.");
    }
}
