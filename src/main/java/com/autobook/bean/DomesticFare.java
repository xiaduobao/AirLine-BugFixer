package com.autobook.bean;

/**
 * Created by jiabaowang on 2018/4/10.
 */
public class DomesticFare {
    // 票价
    private double ticketPrice;

    // 机场建设费
    private double airportTax = 0.0;

    // 燃油附加费
    private double fuelTax = 0.0;

    // 最低可接受的票价
    private double ticketPriceMin;

    // 最高可接受的票价
    private double ticketPriceMax;

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getAirportTax() {
        return airportTax;
    }

    public void setAirportTax(double airportTax) {
        this.airportTax = airportTax;
    }

    public double getFuelTax() {
        return fuelTax;
    }

    public void setFuelTax(double fuelTax) {
        this.fuelTax = fuelTax;
    }

    public double getTicketPriceMin() {
        return ticketPriceMin;
    }

    public void setTicketPriceMin(double ticketPriceMin) {
        this.ticketPriceMin = ticketPriceMin;
    }

    public double getTicketPriceMax() {
        return ticketPriceMax;
    }

    public void setTicketPriceMax(double ticketPriceMax) {
        this.ticketPriceMax = ticketPriceMax;
    }
}
