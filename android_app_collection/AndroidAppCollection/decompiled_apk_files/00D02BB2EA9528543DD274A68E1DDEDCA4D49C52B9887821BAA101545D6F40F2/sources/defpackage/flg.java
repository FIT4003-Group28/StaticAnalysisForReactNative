package defpackage;
/* compiled from: PG */
/* renamed from: flg  reason: default package */
/* loaded from: classes6.dex */
final class flg<T> implements dzsj<T> {
    final /* synthetic */ flh a;

    public flg(flh flhVar) {
        this.a = flhVar;
    }

    @Override // defpackage.dzsj
    public final T a() {
        flh flhVar = this.a;
        gga wk = flhVar.a.wk();
        efh h = flhVar.a.h();
        btrm rz = flhVar.a.eW.a.rz();
        dxjg.e(rz);
        dzsj<afwt> q = flhVar.a.q();
        dzsj<axxh> A = flhVar.a.A();
        dxio c = dxjc.c(flhVar.a.x());
        dxio c2 = dxjc.c(flhVar.a.eW.ed());
        dxio c3 = dxjc.c(flhVar.a.eW.u());
        acyp bW = flhVar.a.eW.bW();
        btvo rp = flhVar.a.eW.a.rp();
        dxjg.e(rp);
        return (T) new bsri(wk, h, rz, q, A, c, c2, c3, bW, rp);
    }
}
