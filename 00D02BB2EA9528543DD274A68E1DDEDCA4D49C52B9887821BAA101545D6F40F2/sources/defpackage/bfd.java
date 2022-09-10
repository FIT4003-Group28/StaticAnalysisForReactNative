package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
/* compiled from: PG */
/* renamed from: bfd  reason: default package */
/* loaded from: classes3.dex */
final class bfd extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ bfe a;

    public bfd(bfe bfeVar) {
        this.a = bfeVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        bbz e = bbz.e();
        int i = bfe.f;
        e.a(new Throwable[0]);
        bfe bfeVar = this.a;
        bfeVar.g(bfeVar.b());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        bbz e = bbz.e();
        int i = bfe.f;
        e.a(new Throwable[0]);
        bfe bfeVar = this.a;
        bfeVar.g(bfeVar.b());
    }
}
