package com.baidu.mapapi.http;

import com.baidu.mapapi.http.HttpClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HttpClient.ProtoResultCallback f1539a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f1540b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AsyncHttpClient f1541c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(AsyncHttpClient asyncHttpClient, HttpClient.ProtoResultCallback protoResultCallback, String str) {
        this.f1541c = asyncHttpClient;
        this.f1539a = protoResultCallback;
        this.f1540b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        int i2;
        HttpClient httpClient = new HttpClient(this.f1541c.f1532a, "GET", this.f1539a);
        i = this.f1541c.f1533b;
        httpClient.setMaxTimeOut(i);
        i2 = this.f1541c.f1534c;
        httpClient.setReadTimeOut(i2);
        httpClient.request(this.f1540b);
    }
}
