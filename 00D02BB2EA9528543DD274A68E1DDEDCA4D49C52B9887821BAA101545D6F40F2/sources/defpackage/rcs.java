package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* compiled from: PG */
/* renamed from: rcs  reason: default package */
/* loaded from: classes7.dex */
public final class rcs extends BroadcastReceiver {
    final /* synthetic */ rcu a;

    public rcs(rcu rcuVar) {
        this.a = rcuVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo;
        rcu rcuVar;
        dwao dwaoVar;
        amte amteVar;
        if ((this.a.g == rcq.SUCCESS && ((amteVar = this.a.h) == null || !amteVar.a.d())) || this.a.g == rcq.ERROR_LOCATION_DISABLED || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected() || (dwaoVar = (rcuVar = this.a).k) == null) {
            return;
        }
        rcuVar.a(dwaoVar);
    }
}
