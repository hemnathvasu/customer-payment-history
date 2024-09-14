package com.dailycode.customer.Dto;


public class AgreementDetailDTO {
    private int agreementId;
    private String agreementDate;
    private String productInfo;
    private String paymentMethod;
    private String active;
    private String customerId;

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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "AgreementDetailDTO{" +
                "agreementId=" + agreementId +
                ", agreementDate='" + agreementDate + '\'' +
                ", productInfo='" + productInfo + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", active='" + active + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}

