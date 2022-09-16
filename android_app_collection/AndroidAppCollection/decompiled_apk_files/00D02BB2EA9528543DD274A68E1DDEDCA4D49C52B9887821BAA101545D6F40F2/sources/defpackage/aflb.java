package defpackage;
/* compiled from: PG */
/* renamed from: aflb  reason: default package */
/* loaded from: classes2.dex */
final class aflb implements Runnable {
    final /* synthetic */ qbn a;
    final /* synthetic */ qbs b;
    final /* synthetic */ vun c;
    final /* synthetic */ afld d;

    public aflb(afld afldVar, qbn qbnVar, qbs qbsVar, vun vunVar) {
        this.d = afldVar;
        this.a = qbnVar;
        this.b = qbsVar;
        this.c = vunVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qcr u = qct.u(this.a, this.b);
        u.b(this.c.c);
        this.d.a.a().n(u.a());
    }
}
