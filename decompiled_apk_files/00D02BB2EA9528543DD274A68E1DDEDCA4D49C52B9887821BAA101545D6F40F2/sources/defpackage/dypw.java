package defpackage;
/* compiled from: PG */
/* renamed from: dypw  reason: default package */
/* loaded from: classes6.dex */
final class dypw implements Runnable {
    final /* synthetic */ dypx a;

    public dypw(dypx dypxVar) {
        this.a = dypxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dypx dypxVar = this.a;
        dypxVar.c.l.remove(dypxVar.a);
        if (this.a.c.p.a != dyfk.SHUTDOWN || !this.a.c.l.isEmpty()) {
            return;
        }
        this.a.c.f();
    }
}
