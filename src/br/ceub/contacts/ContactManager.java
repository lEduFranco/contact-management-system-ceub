package br.ceub.contacts;

import java.util.Scanner;

public class ContactManager {
    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n--- Sistema de Gerenciamento de Contatos ---");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Buscar Contato");
            System.out.println("3. Remover Contato");
            System.out.println("4. Listar Contatos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String name = scanner.nextLine();
                    System.out.print("Digite o número de telefone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Digite o email: ");
                    String email = scanner.nextLine();

                    Contact contact = new Contact(name, phone, email);
                    contactList.addContact(contact);
                    break;

                case 2:
                    System.out.print("Digite o nome ou número de telefone para busca: ");
                    String searchKey = scanner.nextLine();
                    contactList.searchContact(searchKey);
                    break;

                case 3:
                    System.out.print("Digite o nome ou número de telefone para remoção: ");
                    String removeKey = scanner.nextLine();
                    contactList.removeContact(removeKey);
                    break;

                case 4:
                    System.out.println("\nLista de Contatos:");
                    contactList.listContacts();
                    break;

                case 5:
                    System.out.println("Saindo do sistema. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (option != 5);

        scanner.close();
    }
}
