package defpackage;

import java.net.MulticastSocket;
/* compiled from: PG */
/* renamed from: adba  reason: default package */
/* loaded from: classes.dex */
final class adba implements Runnable {
    final /* synthetic */ MulticastSocket a;
    final /* synthetic */ adbe b;

    public adba(adbe adbeVar, MulticastSocket multicastSocket) {
        this.b = adbeVar;
        this.a = multicastSocket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.e(this.a);
    }
}
