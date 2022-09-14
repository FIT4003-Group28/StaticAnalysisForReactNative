package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* compiled from: PG */
/* renamed from: asuf  reason: default package */
/* loaded from: classes2.dex */
final class asuf extends BroadcastReceiver {
    final /* synthetic */ asuh a;

    public asuf(asuh asuhVar) {
        this.a = asuhVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            asuh asuhVar = this.a;
            boolean z = false;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                z = true;
            }
            asuhVar.c = z;
            this.a.k();
        } catch (SecurityException e) {
            bvoo.i(e);
        }
    }
}
