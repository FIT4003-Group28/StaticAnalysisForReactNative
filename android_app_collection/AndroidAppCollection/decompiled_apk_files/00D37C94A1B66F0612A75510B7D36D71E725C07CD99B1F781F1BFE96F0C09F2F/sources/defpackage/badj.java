package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;
/* compiled from: PG */
/* renamed from: badj  reason: default package */
/* loaded from: classes2.dex */
final class badj implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ int b;
    final /* synthetic */ badn c;

    public badj(badn badnVar, long j, int i) {
        this.c = badnVar;
        this.a = j;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect.Observer observer;
        observer = this.c.b.mObserver;
        observer.onNetworkConnect(this.a, this.b);
    }
}
