package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
/* compiled from: PG */
/* renamed from: ajzy  reason: default package */
/* loaded from: classes2.dex */
public final class ajzy extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ ajzz a;

    public ajzy(ajzz ajzzVar) {
        this.a = ajzzVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a.b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        this.a.b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.a.b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        this.a.b();
    }
}
