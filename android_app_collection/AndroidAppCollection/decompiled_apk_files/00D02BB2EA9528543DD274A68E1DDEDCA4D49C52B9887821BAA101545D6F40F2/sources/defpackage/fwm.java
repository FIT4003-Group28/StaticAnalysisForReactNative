package defpackage;

import android.app.Application;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fwm  reason: default package */
/* loaded from: classes6.dex */
public final class fwm<T> implements dzsj<T> {
    final /* synthetic */ fwn a;
    private final int b;

    public fwm(fwn fwnVar, int i) {
        this.a = fwnVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            fwn fwnVar = this.a;
            Application a = fwnVar.a.a.a();
            dxjg.e(a);
            btvo rp = fwnVar.a.a.rp();
            dxjg.e(rp);
            return (T) new cdha(a, rp);
        }
        fwn fwnVar2 = this.a;
        cdfy b = cdfz.b();
        aese le = fwnVar2.a.le();
        cqat rR = fwnVar2.a.a.rR();
        dxjg.e(rR);
        dxjg.e(fwnVar2.a.a.rB());
        bttf aL = fwnVar2.a.a.aL();
        dxjg.e(aL);
        ckcw rU = fwnVar2.a.a.rU();
        dxjg.e(rU);
        btvo rp2 = fwnVar2.a.a.rp();
        dxjg.e(rp2);
        bbpv aZ = fwnVar2.a.aZ();
        bduw lp = fwnVar2.a.lp();
        cdgl lv = fwnVar2.a.lv();
        dxio c = dxjc.c(fwnVar2.a.p());
        axrg aH = fwnVar2.a.aH();
        Application a2 = fwnVar2.a.a.a();
        dxjg.e(a2);
        cdgq pV = fwnVar2.a.pV();
        cdir vb = fwnVar2.a.vb();
        dxio c2 = dxjc.c(fwnVar2.a.iW());
        dxio c3 = dxjc.c(fwnVar2.b());
        cdhc cdhcVar = new cdhc(fwnVar2.a.at(), fwnVar2.b());
        dxio c4 = dxjc.c(fwnVar2.a.bf());
        dxjg.e(fwnVar2.a.a.sU());
        return (T) cdgm.b(b, le, rR, aL, rU, rp2, aZ, lp, lv, c, aH, a2, pV, vb, c2, c3, cdhcVar, c4);
    }
}
