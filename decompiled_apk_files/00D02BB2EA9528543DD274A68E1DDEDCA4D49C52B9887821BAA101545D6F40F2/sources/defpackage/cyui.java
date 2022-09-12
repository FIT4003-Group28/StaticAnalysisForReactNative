package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* compiled from: PG */
/* renamed from: cyui  reason: default package */
/* loaded from: classes5.dex */
public final class cyui {
    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    public static void b(cyes cyesVar) {
        int i = cyuh.a[cyesVar.ordinal()];
    }
}
