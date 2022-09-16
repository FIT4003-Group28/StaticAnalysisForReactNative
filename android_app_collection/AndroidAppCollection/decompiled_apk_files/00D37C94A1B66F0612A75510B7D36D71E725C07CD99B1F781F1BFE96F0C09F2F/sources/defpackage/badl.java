package defpackage;

import android.net.Network;
import org.chromium.net.NetworkChangeNotifierAutoDetect;
/* compiled from: PG */
/* renamed from: badl  reason: default package */
/* loaded from: classes2.dex */
final class badl implements Runnable {
    final /* synthetic */ Network a;
    final /* synthetic */ badn b;

    public badl(badn badnVar, Network network) {
        this.b = badnVar;
        this.a = network;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect.Observer observer;
        observer = this.b.b.mObserver;
        observer.onNetworkDisconnect(NetworkChangeNotifierAutoDetect.networkToNetId(this.a));
    }
}
