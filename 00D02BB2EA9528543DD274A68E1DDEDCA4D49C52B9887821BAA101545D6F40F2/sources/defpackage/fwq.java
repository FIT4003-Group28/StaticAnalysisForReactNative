package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.ugc.phototaken.PhotoTakenNotifierService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fwq  reason: default package */
/* loaded from: classes6.dex */
public final class fwq implements dxis {
    final /* synthetic */ fyu a;
    private volatile dzsj<cdha> b;

    public fwq(fyu fyuVar) {
        this.a = fyuVar;
    }

    private final dzsj<cdha> b() {
        dzsj<cdha> dzsjVar = this.b;
        if (dzsjVar == null) {
            fwp fwpVar = new fwp(this);
            this.b = fwpVar;
            return fwpVar;
        }
        return dzsjVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        PhotoTakenNotifierService photoTakenNotifierService = (PhotoTakenNotifierService) obj;
        photoTakenNotifierService.c = this.a.qc();
        photoTakenNotifierService.d = this.a.aH();
        cdfy b = cdfz.b();
        aese le = this.a.le();
        cqat rR = this.a.a.rR();
        dxjg.e(rR);
        dxjg.e(this.a.a.rB());
        bttf aL = this.a.a.aL();
        dxjg.e(aL);
        ckcw rU = this.a.a.rU();
        dxjg.e(rU);
        btvo rp = this.a.a.rp();
        dxjg.e(rp);
        bbpv aZ = this.a.aZ();
        bduw lp = this.a.lp();
        cdgl lv = this.a.lv();
        dxio c = dxjc.c(this.a.p());
        axrg aH = this.a.aH();
        Application a = this.a.a.a();
        dxjg.e(a);
        cdgq pV = this.a.pV();
        cdir vb = this.a.vb();
        dxio c2 = dxjc.c(this.a.iW());
        dxio c3 = dxjc.c(b());
        cdhc cdhcVar = new cdhc(this.a.at(), b());
        dxio c4 = dxjc.c(this.a.bf());
        dxjg.e(this.a.a.sU());
        photoTakenNotifierService.e = cdgm.b(b, le, rR, aL, rU, rp, aZ, lp, lv, c, aH, a, pV, vb, c2, c3, cdhcVar, c4);
        ckcw rU2 = this.a.a.rU();
        dxjg.e(rU2);
        photoTakenNotifierService.f = rU2;
        btvo rp2 = this.a.a.rp();
        dxjg.e(rp2);
        photoTakenNotifierService.g = rp2;
        cqat rR2 = this.a.a.rR();
        dxjg.e(rR2);
        photoTakenNotifierService.h = rR2;
        bvrv e = this.a.a.e();
        dxjg.e(e);
        photoTakenNotifierService.i = e;
    }
}