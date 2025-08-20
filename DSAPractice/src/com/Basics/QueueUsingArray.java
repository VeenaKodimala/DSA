package com.Basics;

import java.util.Scanner;

public class QueueUsingArray {
    public static final int MAX = 100;
    int[] queue = new int[MAX];
    int front = -1, rear = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueUsingArray q = new QueueUsingArray();
        int choice;
        do {
            System.out.println("1. Insert an element in queue");
            System.out.println("2. Delete an element in queue");
            System.out.println("3. Print all elements in queue");
            System.out.println("4. Print first element in queue");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            /* when i call a non-static method from a non-static method from a
             * ststic method, it will throw and error stating,
             *  i cannot call a non-static method from static method.
             * but when i create an object and call it,
             * there will be no error. why and what's the difference? -
             * this is because, non-static method: tied to object
             * of the clss, but static method, tied to class,
             * no object is needed. */
            q.mainMenu(choice);
        } while (choice < 5);
    }

    public void mainMenu(int choice) {
        try {
            Scanner sc = new Scanner(System.in);
            switch (choice) {
                case 1: {
                    System.out.println("Enter the data to" +
                            " insert in queue");
                    int data = sc.nextInt();
                    enqueue(data);
                    print();
                    break;
                }
                case 2: {
                    int data = dequeue();
                    System.out.println("The deleted data is: " + data);
                    print();
                    break;
                }
                case 3: {
                    print();
                    break;
                }
                case 4: {
                    int data = peek();
                    System.out.println("The first element of queue:: " + data);
                    break;

                }
                case 5: {
                    System.out.println("Exiting...");
                    break;
                }
                default:
                    System.out.println("Default case: wrong choice");
            }
        } catch (Exception e) {
            System.out.println("Exception in mainMenu:: " + e);
        }
    }

    public void enqueue(int data) {
        try {
            if (isFull()) {
                //System.out.println("inside if 1");
                System.out.println("Queue is full");
            } else if (front == -1 && rear == -1) {
                //System.out.println("inside if 2");
                rear = 0;
                front = 0;
                //System.out.println("rear after increment::: " + rear);
                queue[rear] = data;
            } else {
                //System.out.println("inside else");
                rear = rear + 1;
                //System.out.println("rear:: " + rear);
                queue[rear] = data;
            }
        } catch (Exception e) {
            System.out.println("Exception in enqueue:: " + e);
        }
    }

    public int dequeue() {
        try {
            if (isEmpty()) {
                System.out.println("Que is empty");
                return -1;
            } else {
                int data = queue[front];
                front = front + 1;
                return data;

            }

        } catch (Exception e) {
            System.out.println("Exception in dequeue:: " + e);
            return -1;
        }
    }

    public boolean isEmpty() {
        try {
            return front == -1 || front == rear + 1;

        } catch (Exception e) {
            System.out.println("Exception in isEmpty::: " + e);
            return true;

        }

    }

    public boolean isFull() {
        try {
            return rear == MAX - 1;

        } catch (Exception e) {
            System.out.println("Exception in isFull:: " + e);
            return true;

        }
    }

    public int peek() {
        try {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int data = queue[front];
            front = front + 1;
            return data;

        } catch (Exception e) {
            System.out.println("Exception in peek:: " + e);
            return -1;
        }
    }

    public void print() {
        try {
            if (isEmpty()) {
                System.out.println("Queue is empty");
            } else {
                //System.out.println("front:: " + front);
                //System.out.println("rear:: " + rear);
                System.out.println("Queue:: ");
                for (int i = front; i <= rear; i++) {
                    System.out.println(queue[i] + " ");
                }
            }

        } catch (Exception e) {
            System.out.println("Exception in print:: " + e);
        }
    }


}
