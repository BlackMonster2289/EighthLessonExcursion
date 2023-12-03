package com.example.eighthlessonexcursion.entity;

public class Ticket {

    // поля
    private int id; // идентификатор билета
    private float ticketPrice; // стоимость билета
    private int numberOfTickets; // количество билетов

    // конструктор
    public Ticket() {
    }

    public Ticket(int id, float ticketPrice, int numberOfTickets) {
        this.id = id;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    // геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    // метод подсчёта стоимости взрослых билетов
    public float ticketPriceAll() {
        return ticketPrice * numberOfTickets;
    }
}



