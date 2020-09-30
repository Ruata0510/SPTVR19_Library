/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19library;

import entity.Reader;
import entity.Book;
import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    private Book[] books = new Book[10];
    public void run() {
        System.out.println("-----Библиотека-----");
        boolean repeat = true; 
        do{
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить новую книгу ");
            System.out.println("2. Cписок книг ");
            System.out.println("3. Зарегестрировать нового читателя ");
            System.out.println("4. Список читателей");
            System.out.println("5. Выдать книгу читателю ");
            System.out.println("6. Вернуть книгу в библиотеку ");
            System.out.println("Выберете задачу: ");
            Scanner scanner = new Scanner(System.in);
            String task = scanner.nextLine();
            switch (task) {
                case "0":
                    System.out.println("Конец программы");
                    repeat = false;
                case "1":
                   System.out.println("Добавить новую книгу");
                   // создаём обьект книги
                   Book book = new Book("Voina i mir", "Lev Tolstoi", 2010);
                   books[0] = book;
                   Book book1 = new Book("Otsi i deti", "L. Turgenev", 2014);
                   books[1] = book1;
                   break;
                case "2":
                   System.out.println("Cписок книг");
                   for (int i = 0; i < books.length; i++) {
                       if(books[i]!=null) {
                          System.out.printf("Название книги: ", books[i].toString());
                       }
                   } 
                   break;
                case "3":
                   System.out.println("Зарегестрировать нового читателя");
                   Reader reader = new Reader("Elena Petrova", "+37253595654");
                   System.out.println("Добавлен читатель: " + reader.getName());
                   break;
                case "4":
                   System.out.println("Выдать книгу читателю");
                   break;   
                case "5":
                   System.out.println("Выдать книгу читателю");
                   break;
                case "6":
                   System.out.println("Вернуть книгу в библиотеку");
                   break;
                default:
                    System.out.println("Нет такой задачи");
            }
        } while(repeat);
    }
}
