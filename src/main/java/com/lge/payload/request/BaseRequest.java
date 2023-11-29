package com.lge.payload.request;

import java.util.Locale;

public class BaseRequest {
    private Locale lang;

    public Locale getLang() {
        return lang;
    }

    public void setLang(Locale lang) {
        this.lang = lang;
    }
}
