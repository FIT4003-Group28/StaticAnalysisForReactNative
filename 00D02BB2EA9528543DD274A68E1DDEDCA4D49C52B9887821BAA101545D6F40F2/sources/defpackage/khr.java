package defpackage;
/* compiled from: PG */
/* renamed from: khr  reason: default package */
/* loaded from: classes7.dex */
final class khr implements crzp<Boolean> {
    final /* synthetic */ kht a;

    public khr(kht khtVar) {
        this.a = khtVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<Boolean> crzmVar) {
        Boolean l = crzmVar.l();
        dbsk.s(l);
        boolean booleanValue = l.booleanValue();
        kht khtVar = this.a;
        if (khtVar.o == booleanValue) {
            return;
        }
        khtVar.o = booleanValue;
        if (!booleanValue) {
            dukx dukxVar = khtVar.d.getCarParameters().e;
            if (dukxVar == null) {
                dukxVar = dukx.c;
            }
            khtVar.p = dukxVar.b;
            this.a.n = false;
        }
        if (this.a.l.isEmpty()) {
            return;
        }
        int b = this.a.m.b();
        kht khtVar2 = this.a;
        khtVar2.p(Math.max(0, b + khtVar2.q));
    }
}
