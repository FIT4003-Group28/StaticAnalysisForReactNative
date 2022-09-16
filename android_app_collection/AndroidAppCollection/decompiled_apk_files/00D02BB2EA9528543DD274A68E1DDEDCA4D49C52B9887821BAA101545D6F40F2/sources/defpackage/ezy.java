package defpackage;
/* compiled from: PG */
/* renamed from: ezy  reason: default package */
/* loaded from: classes6.dex */
final class ezy<T> implements dzsj<T> {
    final /* synthetic */ ezz a;
    private final int b;

    public ezy(ezz ezzVar, int i) {
        this.a = ezzVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [T, bvbi] */
    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return (T) baua.b(this.a.b.fc());
            }
            ezz ezzVar = this.a;
            T t = (T) ezzVar.c;
            if (t != null) {
                return t;
            }
            dxio c = dxjc.c(ezzVar.b.eW.h());
            bvrb tn = ezzVar.b.eW.a.tn();
            dxjg.e(tn);
            ?? r1 = (T) bvbk.b(bvbj.b(c, tn));
            ezzVar.c = r1;
            return r1;
        }
        ezz ezzVar2 = this.a;
        dzsj<gfq> ly = ezzVar2.b.ly();
        dzsj<gga> ad = ezzVar2.b.ad();
        dzsj<bwqv> er = ezzVar2.b.eW.er();
        dzsj<axsa> oL = ezzVar2.b.eW.oL();
        dzsj<ania> hj = ezzVar2.b.eW.hj();
        dzsj<arfm> bd = ezzVar2.b.bd();
        dzsj dzsjVar = ezzVar2.a;
        if (dzsjVar == null) {
            dzsjVar = new ezy(ezzVar2, 1);
            ezzVar2.a = dzsjVar;
        }
        return (T) new bbai(ly, ad, er, oL, hj, bd, dzsjVar);
    }
}
