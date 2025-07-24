package com.Basics;

import java.util.Scanner;

public class SinglyLinkedList {
    Node head = null;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SinglyLinkedList sll = new SinglyLinkedList();
        int choice;
        do {
            System.out.println("Enter your choice:");
            System.out.println("1. Create an Singly linked list");
            System.out.println("2. Insert a node at the beginning");
            System.out.println("3. Insert a node at the end");
            System.out.println("4. Insert a node at an index");
            System.out.println("5. Exit");
            choice = sc.nextInt();
            sll.mainMenu(choice);
        } while (choice != 5);


    }

    public void printSLL() {
        try {
            System.out.println("----SLL----");
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        } catch (Exception e) {
            System.out.println("Exception in printSLL:: " + e);
        }
    }

    public void createSLL(int data) {
        try {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            }
        } catch (Exception e) {
            System.out.println("Exception in createSLL:: " + e);

        }

    }

    public void addAtBeginning(int data) {
        try {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        } catch (Exception e) {
            System.out.println("Exception in addAtBeginning:: " + e);
        }
    }

    public void addAtEnd(int data) {
        try {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }

        } catch (Exception e) {
            System.out.println("Exception in addAtEnd:: " + e);
        }
    }

    public int computeSLLSize() {
        int size = 0;
        try {
            if (head == null) {
                size = 0;
            } else {
                Node temp = head;
                while (temp != null) {
                    size = size + 1;
                    temp = temp.next;
                }
            }

        } catch (Exception e) {
            System.out.println("Exception in computeSLLSize:: " + e);
        }
        return size;
    }

    public void addatPos(int pos, int data, int size) {
        try {
            if (pos > size + 1) {
                System.out.println("SLL is too small to insert the node at position " + pos);
            } else if (head == null) {
                System.out.println("SLL is empty");
            } else {
                Node newNode = new Node(data);
                Node temp = head;

                for (int i = 1; i < pos-1; i++) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
        } catch (Exception e){
            System.out.println("Exception in addatPos: ");
            e.printStackTrace();
        }
    }

    public void mainMenu(int choice) {
        try {
            Scanner sc = new Scanner(System.in);
            switch (choice) {
                case 1: {
                    System.out.println("Enter the data to create Singly linked list::");
                    int data = sc.nextInt();
                    createSLL(data);
                    printSLL();
                    break;
                }
                case 2: {
                    System.out.println("Enter the data to insert at beginning of Singly linked list::");
                    int data = sc.nextInt();
                    addAtBeginning(data);
                    printSLL();
                    break;
                }
                case 3: {
                    System.out.println("Enter the data to insert at end of Singly linked list::");
                    int data = sc.nextInt();
                    addAtEnd(data);
                    printSLL();
                    break;
                }
                case 4: {
                    System.out.println("Enter at which position to add the new node:");
                    int pos = sc.nextInt();
                    System.out.println("Enter at data to insert:");
                    int data = sc.nextInt();
                    int sllSize = computeSLLSize();
                    addatPos(pos, data, sllSize);
                    printSLL();
                }
                case 5: {
                    System.out.println("Exiting.....");
                    break;
                }
                default: {
                    System.out.println("Inside default case");
                }

            }
        } catch (Exception e) {
            System.out.println("Exception in mainMenu:: " + e);
        }
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


}
