/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 17-02-2020
 *   Time: 10:19 PM
 */


package contactList;

import contactADT.ContactADT;

public class ContactList<Contact> implements ContactADT<Contact> {
    private Node<Contact> head = null;
    private int size = 0;

    private class Node<Contact> {
        Contact data;
        Node<Contact> next;

        private Node(Contact data, Node<Contact> next) {
            this.data = data;
            this.next = next;
        }

        private Contact getData() {
            return data;
        }

        private Node<Contact> getNext() {
            return next;
        }
    }

    @Override
    public boolean add(Contact data) {
        return false;
    }

    @Override
    public Contact view() {
        return null;
    }

    @Override
    public Contact search(Contact data) {
        return null;
    }

    @Override
    public boolean delete() {
        return false;
    }
}
