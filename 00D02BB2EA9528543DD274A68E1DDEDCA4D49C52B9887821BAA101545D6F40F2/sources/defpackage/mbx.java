package defpackage;
/* compiled from: PG */
/* renamed from: mbx  reason: default package */
/* loaded from: classes7.dex */
final class mbx implements crzp<aufb> {
    final /* synthetic */ mcb a;

    public mbx(mcb mcbVar) {
        this.a = mcbVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<aufb> crzmVar) {
        aufb l = crzmVar.l();
        dbsk.s(l);
        mcb mcbVar = this.a;
        boolean z = l.c;
        if (mcbVar.d == z) {
            return;
        }
        mcbVar.d = z;
        mcbVar.f(mcbVar.e, mcbVar.f);
        mcbVar.b.d(z, dcbg.b(mcbVar.c).s(mbt.a).z());
    }
}
