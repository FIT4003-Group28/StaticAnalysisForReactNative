package defpackage;
/* compiled from: PG */
/* renamed from: dymz  reason: default package */
/* loaded from: classes6.dex */
final class dymz implements Runnable {
    final /* synthetic */ dyjb a;
    final /* synthetic */ dync b;

    public dymz(dync dyncVar, dyjb dyjbVar) {
        this.b = dyncVar;
        this.a = dyjbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dbsk.m(((dyqy) this.b.f).a.A.get(), "Channel must have been shut down");
    }
}
