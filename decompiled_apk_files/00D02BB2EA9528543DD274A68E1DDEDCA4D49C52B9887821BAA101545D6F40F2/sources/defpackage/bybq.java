package defpackage;
/* compiled from: PG */
/* renamed from: bybq  reason: default package */
/* loaded from: classes4.dex */
final class bybq implements Runnable {
    final /* synthetic */ bybt a;

    public bybq(bybt bybtVar) {
        this.a = bybtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.d()) {
            return;
        }
        bybn bybnVar = this.a.c;
        dbsk.m(bybnVar.c.isEmpty(), "currentModels should be empty");
        dbsk.m(bybnVar.d.isEmpty(), "lastRenderedCarsByModel should be empty");
        bybf bybfVar = bybnVar.a;
        bybfVar.e.e();
        bybfVar.f.e();
        if (bybfVar.g == null) {
            return;
        }
        akuh akuhVar = bybfVar.g;
        dbsk.s(akuhVar);
        bybfVar.b.a().j(akuhVar);
        bybfVar.g = null;
    }
}
