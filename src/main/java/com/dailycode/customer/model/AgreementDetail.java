package com.dailycode.customer.model;


import jakarta.persistence.*;

@Entity
public class AgreementDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int agreementId;
    private String agreementDate;
    private String productInfo;
    private String paymentMethod;
    private String active;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    public int getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(int agreementId) {
        this.agreementId = agreementId;
    }

    public String getAgreementDate() {
        return agreementDate;
    }

    public void setAgreementDate(String agreementDate) {
        this.agreementDate = agreementDate;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "AgreementDetail{" +
                "agreementId=" + agreementId +
                ", agreementDate='" + agreementDate + '\'' +
                ", productInfo='" + productInfo + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", active='" + active + '\'' +
                ", customer=" + customer +
                '}';
    }
}