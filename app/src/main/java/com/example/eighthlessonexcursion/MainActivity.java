 package com.example.eighthlessonexcursion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.eighthlessonexcursion.entity.Ticket;
import com.example.eighthlessonexcursion.entity.TicketChild;
import com.example.eighthlessonexcursion.entity.TicketPensioner;

 public class MainActivity extends AppCompatActivity {

    // создание полей
    private Ticket ticket, ticketChild, ticketPensioner; // поля сущностей билетов

    // создание дополнительных полей для вывода на экран плученных значений
    private TextView infoApp; // поле вывода информации анализа строки

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // создание объектов сущностей билетов
        ticket = new Ticket( 1, 35, 12);
        ticketChild = new TicketChild( 2, 35, 14, 50f);
        ticketPensioner = new TicketPensioner( 3, 35, 10, 45f);

        // привязка поля к разметке id
        infoApp = findViewById(R.id.infoApp);

        // расчёт стоимости билетов
        float ticketPrice = ticket.ticketPriceAll();
        float ticketPriceChild = ticketChild.ticketPriceAll();
        float ticketPriceAll = ticketPrice + ticketPriceChild;
        float ticketPricePensioner = ticketPensioner.ticketPriceAll();
        float ticketPriceAll2 = ticketPrice + ticketPricePensioner;


        // вывод информации на экран смартфона
        infoApp.setText("Стоимость всех билетов " + ticketPriceAll + ticketPriceAll2 + " монет\n"
                + "Из которых детские билеты стоят " + ticketPriceChild + " монетю "
                + "а пенсионеров " + ticketPricePensioner + " монет. "
                + "а взрослых " + ticketPrice + " монет");
    }
}