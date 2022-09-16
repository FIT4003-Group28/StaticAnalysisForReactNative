package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: aygc  reason: default package */
/* loaded from: classes2.dex */
final class aygc implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ aygi b;

    public aygc(aygi aygiVar, Status status) {
        this.b = aygiVar;
        this.a = status;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.e.c(this.a);
    }
}
