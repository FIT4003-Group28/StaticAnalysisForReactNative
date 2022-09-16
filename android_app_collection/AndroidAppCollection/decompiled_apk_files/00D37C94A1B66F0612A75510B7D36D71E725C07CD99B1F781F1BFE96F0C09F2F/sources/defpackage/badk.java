package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;
/* compiled from: PG */
/* renamed from: badk  reason: default package */
/* loaded from: classes2.dex */
final class badk implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ badn b;

    public badk(badn badnVar, long j) {
        this.b = badnVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect.Observer observer;
        observer = this.b.b.mObserver;
        observer.onNetworkSoonToDisconnect(this.a);
    }
}
