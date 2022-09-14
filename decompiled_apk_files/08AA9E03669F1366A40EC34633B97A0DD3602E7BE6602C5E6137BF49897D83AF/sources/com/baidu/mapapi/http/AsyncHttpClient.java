package com.baidu.mapapi.http;

import android.content.Context;
import android.os.Build;
import com.baidu.mapapi.UIMsg;
import com.baidu.mapapi.http.HttpClient;
/* loaded from: classes.dex */
public class AsyncHttpClient {

    /* renamed from: a  reason: collision with root package name */
    Context f1532a;

    /* renamed from: b  reason: collision with root package name */
    private int f1533b = UIMsg.m_AppUI.MSG_APP_SAVESCREEN;

    /* renamed from: c  reason: collision with root package name */
    private int f1534c = UIMsg.m_AppUI.MSG_APP_SAVESCREEN;

    static {
        if (Build.VERSION.SDK_INT <= 8) {
            System.setProperty("http.keepAlive", "false");
        }
    }

    public AsyncHttpClient(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        this.f1532a = context;
    }

    public void get(String str, HttpClient.ProtoResultCallback protoResultCallback) {
        if (str == null) {
            throw new IllegalArgumentException("URI cannot be null");
        }
        new Thread(new a(this, protoResultCallback, str)).start();
    }
}
