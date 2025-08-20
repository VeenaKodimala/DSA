package com.Basics;

import java.util.Scanner;

public class QueueUsingLnkdList {

    Node front = null;
    Node rear = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueUsingLnkdList qll = new QueueUsingLnkdList();
        int choice;
        do {
            System.out.println("Enter your choice");
            System.out.println("1. Insert an element in queue");
            System.out.println("2. Delete an element in queue");
            System.out.println("3. Print first element in queue");
            System.out.println("4. Print all elements in queue");

            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            qll.mainMenu(choice);
        } while (choice != 5);
    }

    public void mainMenu(int choice) {
        try {
            Scanner sc = new Scanner(System.in);
            switch (choice) {
                case 1: {
                    System.out.println("Enter the data to insert");
                    int data = sc.nextInt();
                    enqueue(data);
                    print();
                    break;
                }
                case 2:{
                    int data = dequeue();
                    print();
                    break;
                }
                case 3:{
                    int peek = peek();
                    System.out.println("First element of the queue:: "+peek);
                    break;
                }
                case 4:{
                    print();
                    break;
                }
                default:{
                    System.out.println("Wrong choice");
                }
            }


        } catch (Exception e) {
            System.out.println("Exception in mainMenu:: " + e);
        }
    }

    public void enqueue(int data) {
        try {
            Node temp = null;
            try {
                temp = new Node(data);
            } catch (OutOfMemoryError e) {
                System.out.println("Cannot create node, memory is full");
                System.exit(1);
            }
            if (front == null && rear == null) {
                front = rear = temp;
            } else {
                rear.next = temp;
                rear = temp;
            }
        } catch (Exception e) {
            System.out.println("Exception in enqueue:: " + e);
        }
    }

    public int dequeue() {
        try {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                int data = front.data;
                front = front.next;
                return data;
            }

        } catch (Exception e) {
            System.out.println("Exception in dequeue:: " + e);
            return -1;

        }
    }

    public int peek() {
        try {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                int peek = front.data;
                return peek;
            }

        } catch (Exception e) {
            System.out.println("Exception in peek:: " + e);
            return -1;
        }
    }

    public void print() {
        try {
            Node temp = front;
            System.out.println("Queue:::");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        } catch (Exception e) {
            System.out.println("Exception in print");
        }

    }

    public boolean isEmpty() {
        try {
            if (front == null && rear == null) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Exception in isEmpty");
            return true;
        }
    }


     class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

}
