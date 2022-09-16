package com.baidu.lbsapi.auth;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.ImagesContract;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private Context f1493a;

    /* renamed from: b  reason: collision with root package name */
    private String f1494b = null;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, String> f1495c = null;

    /* renamed from: d  reason: collision with root package name */
    private String f1496d = null;

    public g(Context context) {
        this.f1493a = context;
    }

    private String a(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) {
                return null;
            }
            String extraInfo = activeNetworkInfo.getExtraInfo();
            return extraInfo != null ? (extraInfo.trim().toLowerCase().equals("cmwap") || extraInfo.trim().toLowerCase().equals("uniwap") || extraInfo.trim().toLowerCase().equals("3gwap") || extraInfo.trim().toLowerCase().equals("ctwap")) ? extraInfo.trim().toLowerCase().equals("ctwap") ? "ctwap" : "cmwap" : "wifi" : "wifi";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc A[Catch: IOException -> 0x0100, TRY_ENTER, TRY_LEAVE, TryCatch #15 {IOException -> 0x0100, blocks: (B:52:0x00fc, B:73:0x0140, B:78:0x0162), top: B:102:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0167 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a7  */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(javax.net.ssl.HttpsURLConnection r12) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.lbsapi.auth.g.a(javax.net.ssl.HttpsURLConnection):void");
    }

    private static String b(HashMap<String, String> hashMap) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append("&");
            }
            sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            sb.append("=");
            sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
        }
        return sb.toString();
    }

    private HttpsURLConnection b() {
        String str;
        try {
            URL url = new URL(this.f1494b);
            String a2 = a(this.f1493a);
            if (a2 != null && !a2.equals("")) {
                a.a("checkNetwork = " + a2);
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) (a2.equals("cmwap") ? url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.172", 80))) : a2.equals("ctwap") ? url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.200", 80))) : url.openConnection());
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setRequestMethod("POST");
                httpsURLConnection.setConnectTimeout(50000);
                httpsURLConnection.setReadTimeout(50000);
                return httpsURLConnection;
            }
            a.b("Current network is not available.");
            this.f1496d = ErrorMessage.a("Current network is not available.");
            return null;
        } catch (MalformedURLException e) {
            a.a(e.getMessage());
            str = "Auth server could not be parsed as a URL.";
            this.f1496d = ErrorMessage.a(str);
            return null;
        } catch (Exception e2) {
            a.a(e2.getMessage());
            str = "Init httpsurlconnection failed.";
            this.f1496d = ErrorMessage.a(str);
            return null;
        }
    }

    private HashMap<String, String> c(HashMap<String, String> hashMap) {
        HashMap<String, String> hashMap2 = new HashMap<>();
        for (String str : hashMap.keySet()) {
            String str2 = str.toString();
            hashMap2.put(str2, hashMap.get(str2));
        }
        return hashMap2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a(HashMap<String, String> hashMap) {
        this.f1495c = c(hashMap);
        this.f1494b = this.f1495c.get(ImagesContract.URL);
        HttpsURLConnection b2 = b();
        if (b2 == null) {
            a.b("syncConnect failed,httpsURLConnection is null");
        } else {
            a(b2);
        }
        return this.f1496d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a() {
        NetworkInfo activeNetworkInfo;
        a.a("checkNetwork start");
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f1493a.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            if (!activeNetworkInfo.isAvailable()) {
                return false;
            }
            a.a("checkNetwork end");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
