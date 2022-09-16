package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
/* compiled from: PG */
/* renamed from: dsz  reason: default package */
/* loaded from: classes3.dex */
final class dsz extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ dta a;

    public dsz(dta dtaVar) {
        this.a = dtaVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (dta.class) {
            this.a.a = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (dta.class) {
            this.a.a = null;
        }
    }
}
