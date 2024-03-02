package org.example;

public class MultifunctionalPrinterImpl implements MultifunctionalPrinter, Scanner{
    @Override
    public void print(String document) {
        System.out.println("Printing a document, please wait....");
    }

    @Override
    public void copy(String document) {
        System.out.println("Copying a document, please wait...");
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning a document, please wait...");
    }

    @Override
    public void loadInk() {
        System.out.println("Loading ink, please wait...");
    }

    @Override
    public void loadToner() {
        System.out.println("Loading toner, please wait...");
    }

    @Override
    public void loadPaper() {
        System.out.println("Loading paper, please wait...");
    }
}
