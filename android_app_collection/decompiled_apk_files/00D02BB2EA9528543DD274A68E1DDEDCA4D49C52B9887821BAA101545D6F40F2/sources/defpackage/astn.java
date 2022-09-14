package defpackage;
/* compiled from: PG */
/* renamed from: astn  reason: default package */
/* loaded from: classes2.dex */
final class astn implements crzp<daqq> {
    final /* synthetic */ astp a;

    public astn(astp astpVar) {
        this.a = astpVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<daqq> crzmVar) {
        astp astpVar = this.a;
        int i = astpVar.a;
        daqq l = crzmVar.l();
        dbsk.s(l);
        int a = daqm.a(l.e);
        if (a == 0) {
            a = 1;
        }
        astpVar.a = a;
        astp astpVar2 = this.a;
        if (astpVar2.a != i) {
            cqkx.p(astpVar2);
        }
    }
}
