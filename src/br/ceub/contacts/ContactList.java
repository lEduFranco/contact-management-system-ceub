package br.ceub.contacts;

public class ContactList {
    private Node head;

    public ContactList() {
        this.head = null;
    }

    public void addContact(Contact contact) {
        Node newNode = new Node(contact);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }

        System.out.println("Contato adicionado: " + contact);
    }

    public boolean searchContact(String nameOrPhone) {
        Node current = head;

        while (current != null) {
            Contact contact = current.getContact();
            if (contact.getName().equalsIgnoreCase(nameOrPhone) || 
                contact.getPhoneNumber().equals(nameOrPhone)) {
                System.out.println("Contato encontrado: " + contact);
                return true;
            }
            current = current.getNext();
        }

        System.out.println("Contato não encontrado.");
        return false;
    }

    public void removeContact(String nameOrPhone) {
        if (head == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        if (head.getContact().getName().equalsIgnoreCase(nameOrPhone) || 
            head.getContact().getPhoneNumber().equals(nameOrPhone)) {
            head = head.getNext();
            System.out.println("Contato removido.");
            return;
        }

        Node current = head;
        Node previous = null;

        while (current != null) {
            if (current.getContact().getName().equalsIgnoreCase(nameOrPhone) || 
                current.getContact().getPhoneNumber().equals(nameOrPhone)) {
                previous.setNext(current.getNext());
                System.out.println("Contato removido.");
                return;
            }
            previous = current;
            current = current.getNext();
        }

        System.out.println("Contato não encontrado para remoção.");
    }

    public void listContacts() {
        if (head == null) {
            System.out.println("A lista de contatos está vazia.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println(current.getContact());
            current = current.getNext();
        }
    }
}
