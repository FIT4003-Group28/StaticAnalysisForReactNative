package defpackage;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btxs  reason: default package */
/* loaded from: classes.dex */
public final class btxs implements Runnable {
    final /* synthetic */ btxv a;
    private final btxu b = new btxu();
    private final ConnectivityManager c;
    private final btyh d;
    private final bvjj e;
    private final URL f;

    public btxs(btxv btxvVar, Application application, btyh btyhVar, bvjj bvjjVar, URL url) {
        this.a = btxvVar;
        this.c = (ConnectivityManager) application.getSystemService("connectivity");
        this.d = btyhVar;
        this.e = bvjjVar;
        this.f = url;
    }

    private final int a() {
        NetworkInfo activeNetworkInfo = this.c.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return 4;
        }
        if (!this.e.m(bvjk.et, false) || activeNetworkInfo.getType() == 1) {
            if (!activeNetworkInfo.isConnected()) {
                return 4;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkCapabilities networkCapabilities = this.c.getNetworkCapabilities(this.c.getActiveNetwork());
                if (networkCapabilities != null && networkCapabilities.hasCapability(17)) {
                    return 2;
                }
                if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                    return 1;
                }
            }
            try {
                try {
                    try {
                        SSLContext a = this.b.a();
                        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) this.f.openConnection();
                        httpsURLConnection.setSSLSocketFactory(a.getSocketFactory());
                        httpsURLConnection.setConnectTimeout(btxv.a);
                        httpsURLConnection.connect();
                        int responseCode = httpsURLConnection.getResponseCode();
                        httpsURLConnection.disconnect();
                        return responseCode == 204 ? 1 : 2;
                    } catch (KeyManagementException unused) {
                        int i = btxv.a;
                        return 5;
                    }
                } catch (IOException unused2) {
                    int i2 = btxv.a;
                    return 5;
                } catch (NullPointerException e) {
                    btty.a(e);
                    throw e;
                }
            } catch (SocketTimeoutException unused3) {
                int i3 = btxv.a;
                return 3;
            } catch (NoSuchAlgorithmException e2) {
                int i4 = btxv.a;
                throw new RuntimeException(e2);
            }
        }
        if (!this.d.b()) {
            this.d.d();
        }
        int i5 = btxv.a;
        return 4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<btxt> arrayList;
        int a = a();
        btxv btxvVar = this.a;
        synchronized (btxvVar) {
            arrayList = btxvVar.b;
            dbsk.s(arrayList);
            btxvVar.b = null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a(a);
        }
    }
}
