package com.example.demo.entiry;

import lombok.Data;

public class contorller {

    private String ctr_id;

    public String getCtr_id() {
        return ctr_id;
    }

    public void setCtr_id(String ctr_id) {
        this.ctr_id = ctr_id;
    }

    public String getCtr_password() {
        return ctr_password;
    }

    public void setCtr_password(String ctr_password) {
        this.ctr_password = ctr_password;
    }

    private String ctr_password;

}
