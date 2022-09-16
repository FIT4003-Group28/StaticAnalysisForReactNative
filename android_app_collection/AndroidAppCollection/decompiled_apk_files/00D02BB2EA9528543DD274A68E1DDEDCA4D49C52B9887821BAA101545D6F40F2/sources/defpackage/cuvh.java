package defpackage;
/* compiled from: PG */
/* renamed from: cuvh  reason: default package */
/* loaded from: classes5.dex */
public final class cuvh implements cuvf {
    public final cuvg a;
    public cufp b;
    public cufj[] c;

    public cuvh(cuvg cuvgVar, cufp cufpVar, cufj[] cufjVarArr) {
        cuvgVar.setPresenter(this);
        this.a = cuvgVar;
        this.b = cufpVar;
        this.c = cufjVarArr;
    }

    @Override // defpackage.cuvu
    public final void A() {
    }

    @Override // defpackage.cuvu
    public final void B() {
    }

    @Override // defpackage.cuvu
    public final void z() {
        this.a.a(this.b, this.c);
    }
}
