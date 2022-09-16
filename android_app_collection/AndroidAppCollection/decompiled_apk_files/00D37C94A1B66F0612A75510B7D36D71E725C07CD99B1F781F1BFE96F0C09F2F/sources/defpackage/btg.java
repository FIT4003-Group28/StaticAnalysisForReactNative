package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
/* compiled from: PG */
/* renamed from: btg  reason: default package */
/* loaded from: classes2.dex */
final class btg extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ bth a;

    public btg(bth bthVar) {
        this.a = bthVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        bqf a = bqf.a();
        int i = bth.g;
        String.format("Network capabilities changed: %s", networkCapabilities);
        a.d(new Throwable[0]);
        bth bthVar = this.a;
        bthVar.g(bthVar.b());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        bqf a = bqf.a();
        int i = bth.g;
        a.d(new Throwable[0]);
        bth bthVar = this.a;
        bthVar.g(bthVar.b());
    }
}
