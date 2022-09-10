package defpackage;
/* compiled from: PG */
/* renamed from: aswh  reason: default package */
/* loaded from: classes2.dex */
final class aswh implements asxv {
    final /* synthetic */ aswi a;

    public aswh(aswi aswiVar) {
        this.a = aswiVar;
    }

    @Override // defpackage.asxv
    public final void a(aszm aszmVar, @dzsi aszm aszmVar2) {
        bvrj.UI_THREAD.c();
        asld asldVar = aszmVar.c.a;
        this.a.i(asldVar == asld.FREE_MOVEMENT);
        if (asldVar == asld.OVERVIEW) {
            this.a.k(1);
            return;
        }
        aswi aswiVar = this.a;
        aswiVar.l(false, aswiVar.g);
    }
}
