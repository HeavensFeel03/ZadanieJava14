package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.util.Arrays.*;

public class AviaSoulsTest {
    AviaSouls souls = new AviaSouls();
    Ticket ticket1 = new Ticket("Воронеж", "Москва", 5000, 14, 15);
    Ticket ticket2 = new Ticket("Нью-Йорк", "Санкт-Петербург", 1500, 11, 20);
    Ticket ticket3 = new Ticket("Екатеринбург", "Новосибирск", 550, 13, 19);
    Ticket ticket4 = new Ticket("Иркутск", "Улан-Удэ", 300, 16, 18);
    Ticket ticket5 = new Ticket("Торонто", "Токио", 490, 14, 15);
    Ticket ticket6 = new Ticket("Воронеж", "Москва", 660, 14, 17);
    Ticket ticket7 = new Ticket("Воронеж", "Москва", 600, 14, 18);


    @BeforeEach
    public void setup() {

        souls.add(ticket1);
        souls.add(ticket2);
        souls.add(ticket3);
        souls.add(ticket4);
        souls.add(ticket5);
        souls.add(ticket6);
        souls.add(ticket7);
    }

    @Test
    public void ShouldCompareTo() {
        Ticket[] tickets = {ticket1, ticket2, ticket3, ticket4, ticket5};

        Ticket[] expected = {ticket4, ticket5, ticket3, ticket2, ticket1};
        Arrays.sort(tickets);


        Assertions.assertArrayEquals(expected, tickets);

    }

    @Test
    public void ShouldSearchCompareTo() {
        //Ticket[] tickets = {ticket1, ticket2, ticket3, ticket4, ticket5,ticket6,ticket7};

        Ticket[] expected = {ticket7, ticket6, ticket1};
        Ticket[] actual = souls.search("Воронеж", "Москва");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldSearchAndSortBy() {
        //Ticket[] tickets = {ticket1, ticket2, ticket3, ticket4, ticket5,ticket6,ticket7};

        Ticket[] expected = {ticket7, ticket6, ticket1};
        Ticket[] actual = souls.search("Воронеж", "Москва");


        Assertions.assertArrayEquals(expected, actual);

    }


}














