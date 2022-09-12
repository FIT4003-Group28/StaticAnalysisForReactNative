package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
/* compiled from: PG */
/* renamed from: crxq  reason: default package */
/* loaded from: classes5.dex */
public final class crxq {
    public final ConnectivityManager a;

    public crxq(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
    }

    public final boolean a() {
        return b(false);
    }

    public final boolean b(boolean z) {
        NetworkInfo networkInfo = this.a.getNetworkInfo(1);
        if (networkInfo == null || !networkInfo.isConnected()) {
            return !z && c();
        }
        return true;
    }

    public final boolean c() {
        NetworkInfo networkInfo = this.a.getNetworkInfo(0);
        return networkInfo != null && networkInfo.isConnected();
    }
}
