package com.baidu.mapapi.http;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.baidu.platform.comapi.util.f;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes.dex */
public class HttpClient {

    /* renamed from: a  reason: collision with root package name */
    HttpURLConnection f1535a;

    /* renamed from: b  reason: collision with root package name */
    private Context f1536b;

    /* renamed from: c  reason: collision with root package name */
    private String f1537c = null;

    /* renamed from: d  reason: collision with root package name */
    private String f1538d = null;
    private int e;
    private int f;
    private String g;
    private ProtoResultCallback h;

    /* loaded from: classes.dex */
    public enum HttpStateError {
        NETWORK_ERROR,
        INNER_ERROR
    }

    /* loaded from: classes.dex */
    public static abstract class ProtoResultCallback {
        public abstract void onFailed(HttpStateError httpStateError);

        public abstract void onSuccess(String str);
    }

    public HttpClient(Context context, String str, ProtoResultCallback protoResultCallback) {
        this.f1536b = context;
        this.g = str;
        this.h = protoResultCallback;
    }

    private HttpURLConnection a() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f1537c).openConnection();
            httpURLConnection.setRequestMethod(this.g);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setConnectTimeout(this.e);
            httpURLConnection.setReadTimeout(this.f);
            return httpURLConnection;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getAuthToken() {
        return f.A;
    }

    public static String getPhoneInfo() {
        return f.c();
    }

    protected boolean checkNetwork() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f1536b.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isAvailable();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[Catch: Exception -> 0x00c4, TryCatch #6 {Exception -> 0x00c4, blocks: (B:14:0x0032, B:54:0x00b4, B:55:0x00ba, B:57:0x00be, B:58:0x00c3, B:45:0x009b, B:46:0x00a1, B:48:0x00a5, B:30:0x0076, B:31:0x007c, B:33:0x0080), top: B:65:0x0032 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void request(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mapapi.http.HttpClient.request(java.lang.String):void");
    }

    public void setMaxTimeOut(int i) {
        this.e = i;
    }

    public void setReadTimeOut(int i) {
        this.f = i;
    }
}
