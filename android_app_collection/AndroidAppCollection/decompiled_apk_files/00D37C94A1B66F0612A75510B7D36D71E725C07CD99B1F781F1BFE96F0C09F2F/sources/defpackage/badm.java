package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;
/* compiled from: PG */
/* renamed from: badm  reason: default package */
/* loaded from: classes2.dex */
final class badm implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ badn b;

    public badm(badn badnVar, int i) {
        this.b = badnVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect.Observer observer;
        observer = this.b.b.mObserver;
        observer.onConnectionTypeChanged(this.a);
    }
}
