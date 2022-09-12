package defpackage;
/* compiled from: PG */
/* renamed from: dypc  reason: default package */
/* loaded from: classes6.dex */
final class dypc implements Runnable {
    final /* synthetic */ dyqe a;

    public dypc(dyqe dyqeVar) {
        this.a = dyqeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.a.f(dyjb.m.g("Keepalive failed. The connection is likely gone"));
    }
}
