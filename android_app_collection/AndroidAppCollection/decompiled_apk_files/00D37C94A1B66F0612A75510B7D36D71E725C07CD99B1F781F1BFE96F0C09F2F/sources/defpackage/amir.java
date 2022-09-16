package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
/* compiled from: PG */
/* renamed from: amir  reason: default package */
/* loaded from: classes.dex */
public final class amir implements amip {
    private final ConnectivityManager a;
    private final /* synthetic */ int b;

    public amir(Context context, ConnectivityManager connectivityManager, int i) {
        this.b = i;
        if (context.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) == 0) {
            aqxo.z(context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0, "An app using the NETWORK_CONNECTED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.a = connectivityManager;
    }

    public amir(Context context, ConnectivityManager connectivityManager) {
        if (context.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) == 0) {
            aqxo.z(context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0, "An app using the NETWORK_UNMETERED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.a = connectivityManager;
    }

    @Override // defpackage.amip
    public final boolean a() {
        if (this.b == 0) {
            boolean isActiveNetworkMetered = this.a.isActiveNetworkMetered();
            NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
            return !isActiveNetworkMetered && activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getDetailedState() != NetworkInfo.DetailedState.BLOCKED;
        }
        NetworkInfo activeNetworkInfo2 = this.a.getActiveNetworkInfo();
        return (activeNetworkInfo2 == null || !activeNetworkInfo2.isConnected() || activeNetworkInfo2.getDetailedState() == NetworkInfo.DetailedState.BLOCKED) ? false : true;
    }
}
