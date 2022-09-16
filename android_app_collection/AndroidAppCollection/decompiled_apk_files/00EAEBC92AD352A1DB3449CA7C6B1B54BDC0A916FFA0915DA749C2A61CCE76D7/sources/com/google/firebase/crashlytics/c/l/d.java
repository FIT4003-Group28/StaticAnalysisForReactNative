package com.google.firebase.crashlytics.c.l;

import okhttp3.Headers;
import okhttp3.Response;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private int f9040a;

    /* renamed from: b  reason: collision with root package name */
    private String f9041b;

    /* renamed from: c  reason: collision with root package name */
    private Headers f9042c;

    d(int i, String str, Headers headers) {
        this.f9040a = i;
        this.f9041b = str;
        this.f9042c = headers;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d a(Response response) {
        return new d(response.code(), response.body() == null ? null : response.body().string(), response.headers());
    }

    public String a() {
        return this.f9041b;
    }

    public String a(String str) {
        return this.f9042c.get(str);
    }

    public int b() {
        return this.f9040a;
    }
}
