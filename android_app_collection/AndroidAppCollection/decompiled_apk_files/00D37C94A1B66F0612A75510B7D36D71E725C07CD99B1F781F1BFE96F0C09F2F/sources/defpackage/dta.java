package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
/* compiled from: PG */
/* renamed from: dta  reason: default package */
/* loaded from: classes3.dex */
public final class dta {
    public NetworkCapabilities a;

    public dta(ConnectivityManager connectivityManager) {
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new dsz(this));
        } catch (RuntimeException unused) {
            synchronized (dta.class) {
                this.a = null;
            }
        }
    }

    public static dta a(Context context) {
        if (context != null) {
            return new dta((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }
}
