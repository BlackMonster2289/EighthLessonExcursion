package com.example.eighthlessonexcursion.entity;

public class TicketPensioner extends Ticket{

    // поля
    private float ticketDiscount; // скидка на билет

    // конструкторы
    public TicketPensioner() {
    }

    public TicketPensioner(int id, float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(id, ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    // геттеры и сеттеры
    public float getTicketDiscount() {
        return ticketDiscount;
    }

    public void setTicketDiscount(float ticketDiscount) {
        this.ticketDiscount= ticketDiscount;
    }

    // метод подсчёта стоимости пенсионерских билетов
    public float ticketPriceAll() {
        return getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount) / 100;
    }
}
