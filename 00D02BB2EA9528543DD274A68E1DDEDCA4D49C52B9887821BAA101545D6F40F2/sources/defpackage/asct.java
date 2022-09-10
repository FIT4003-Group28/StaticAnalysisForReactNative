package defpackage;
/* compiled from: PG */
/* renamed from: asct  reason: default package */
/* loaded from: classes2.dex */
final class asct implements ascw {
    final /* synthetic */ ascu a;

    public asct(ascu ascuVar) {
        this.a = ascuVar;
    }

    @Override // defpackage.ascw
    public final void a() {
        gga ggaVar = this.a.aE;
        dbsk.s(ggaVar);
        begj begjVar = new begj();
        begjVar.i = this.a.ad;
        begjVar.c = jjn.EXPANDED;
        begjVar.F = true;
        begjVar.K = true;
        this.a.bb.b(new ascs(ggaVar, this.a.aQ.a(), begjVar), bvrj.UI_THREAD);
    }
}
