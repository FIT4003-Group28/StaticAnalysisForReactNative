package defpackage;
/* compiled from: PG */
/* renamed from: fek  reason: default package */
/* loaded from: classes6.dex */
final class fek<T> implements dzsj<T> {
    final /* synthetic */ fel a;
    private final int b;

    public fek(fel felVar, int i) {
        this.a = felVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            fel felVar = this.a;
            ftt fttVar = felVar.a;
            return (T) new bxcu(fttVar.eV, dxjh.c(fttVar.m()), felVar.a.aR(), felVar.a.eW.K(), felVar.a.gW(), felVar.a.vE());
        }
        fel felVar2 = this.a;
        btvo rp = felVar2.a.eW.a.rp();
        dxjg.e(rp);
        bwqv rD = felVar2.a.eW.a.rD();
        dxjg.e(rD);
        return (T) new bxcr(rp, rD, felVar2.a.a);
    }
}
