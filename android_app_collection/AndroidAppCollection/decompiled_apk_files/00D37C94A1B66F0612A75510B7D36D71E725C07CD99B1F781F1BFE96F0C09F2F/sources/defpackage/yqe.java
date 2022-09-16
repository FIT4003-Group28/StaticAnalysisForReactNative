package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
/* compiled from: PG */
/* renamed from: yqe  reason: default package */
/* loaded from: classes4.dex */
final class yqe extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ yqf a;

    public yqe(yqf yqfVar) {
        this.a = yqfVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        yqf yqfVar = this.a;
        yqfVar.a.e(networkCapabilities);
        ((ypx) yqfVar.b.get()).b(yqfVar.o(), yqfVar.p(), yqfVar.q(), yqfVar.i(), yqfVar.a());
    }
}
