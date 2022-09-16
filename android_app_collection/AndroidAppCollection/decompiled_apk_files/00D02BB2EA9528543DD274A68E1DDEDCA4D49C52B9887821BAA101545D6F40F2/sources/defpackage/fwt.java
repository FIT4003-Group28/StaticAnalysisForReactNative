package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.ugc.phototaken.PhotoTakenObserverService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fwt  reason: default package */
/* loaded from: classes6.dex */
public final class fwt implements dxis {
    final /* synthetic */ fyu a;
    private volatile dzsj<cdha> b;

    public fwt(fyu fyuVar) {
        this.a = fyuVar;
    }

    private final dzsj<cdha> b() {
        dzsj<cdha> dzsjVar = this.b;
        if (dzsjVar == null) {
            fws fwsVar = new fws(this);
            this.b = fwsVar;
            return fwsVar;
        }
        return dzsjVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        PhotoTakenObserverService photoTakenObserverService = (PhotoTakenObserverService) obj;
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
        photoTakenObserverService.a = cdgm.b(b, le, rR, aL, rU, rp, aZ, lp, lv, c, aH, a, pV, vb, c2, c3, cdhcVar, c4);
        bvrb tn = this.a.a.tn();
        dxjg.e(tn);
        photoTakenObserverService.b = tn;
        dxjg.e(this.a.a.rp());
        cqat rR2 = this.a.a.rR();
        dxjg.e(rR2);
        photoTakenObserverService.c = rR2;
        ckcw rU2 = this.a.a.rU();
        dxjg.e(rU2);
        photoTakenObserverService.d = rU2;
        bvrv e = this.a.a.e();
        dxjg.e(e);
        photoTakenObserverService.e = e;
        photoTakenObserverService.f = this.a.qc();
        photoTakenObserverService.g = dxjc.c(this.a.iW());
    }
}
