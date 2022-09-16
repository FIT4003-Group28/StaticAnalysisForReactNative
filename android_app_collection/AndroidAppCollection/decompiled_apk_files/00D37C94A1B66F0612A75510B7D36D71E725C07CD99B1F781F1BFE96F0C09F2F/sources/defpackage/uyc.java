package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* compiled from: PG */
/* renamed from: uyc  reason: default package */
/* loaded from: classes4.dex */
public final class uyc {
    private static snc w = new zgi(1);
    final long a;
    long b;
    long c;
    int d;
    int e;
    final String f;
    String i;
    int j;
    String k;
    baaf l;
    int m;
    azzs n;
    azzx o;
    azzk p;
    int q;
    int r;
    int s;
    int t;
    private int x;
    azzy u = azzy.REQUEST_STATUS_UNSPECIFIED;
    int v = -1;
    final String g = amps.b(null);
    final boolean h = false;

    private uyc(String str, String str2, boolean z, long j) {
        this.f = amps.b(str2);
        this.a = j;
    }

    static uyc c(String str, long j) {
        return new uyc(null, str, false, j);
    }

    public static uyc d(utq utqVar, String str, long j) {
        return c(str, j);
    }

    public int a() {
        return this.m;
    }

    public int b() {
        return this.x;
    }

    public uyc e(int i, int i2) {
        this.c = w.d() - this.a;
        this.d = i;
        this.e = i2;
        return this;
    }

    public uyc f(String str) {
        if (!amps.e(str)) {
            this.k = str;
        }
        return this;
    }

    public uyc g(int i) {
        if (i >= 0) {
            this.j = i;
        }
        return this;
    }

    public uyc h(azzk azzkVar) {
        this.p = azzkVar;
        return this;
    }

    public uyc i(String str) {
        this.i = str;
        return this;
    }

    public uyc j(int i) {
        this.r = i;
        return this;
    }

    public uyc k(int i) {
        this.q = i;
        return this;
    }

    public uyc l(azzy azzyVar) {
        this.u = azzyVar;
        return this;
    }

    public uyc m(int i) {
        this.x = i;
        return this;
    }

    public uyc n(utq utqVar, long j) {
        this.c = j;
        return this;
    }

    public uyc o(utq utqVar, long j) {
        this.b = j;
        return this;
    }

    public void p(Context context) {
        NetworkInfo activeNetworkInfo;
        this.l = uuo.f(context);
        int i = -1;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                i = activeNetworkInfo.getType();
            }
        } catch (SecurityException e) {
            ((amzw) ((amzw) ((amzw) uxz.a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/network/NetworkCapture", "getNetworkType", '$', "NetworkCapture.java")).q("Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml");
        }
        azzs b = azzs.b(i);
        if (b == null) {
            b = azzs.NONE;
        }
        this.n = b;
    }

    public boolean q() {
        return this.b > 0 || this.c > 0 || this.d > 0 || this.e > 0 || this.s > 0 || this.u == azzy.FAILED || this.u == azzy.CANCELED || this.v > 0;
    }
}
