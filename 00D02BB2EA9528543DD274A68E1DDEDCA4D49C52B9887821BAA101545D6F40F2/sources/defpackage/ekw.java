package defpackage;

import com.google.android.apps.gmm.cloudmessage.receiver.FcmService;
/* compiled from: PG */
/* renamed from: ekw  reason: default package */
/* loaded from: classes6.dex */
final class ekw implements dxis {
    final /* synthetic */ fyu a;

    public ekw(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        FcmService fcmService = (FcmService) obj;
        fcmService.a = dxjc.c(this.a.kb());
        fcmService.f = this.a.aE();
        ckcw rU = this.a.a.rU();
        dxjg.e(rU);
        fcmService.b = rU;
        fcmService.c = this.a.qc();
        fyu fyuVar = this.a;
        dzsj dzsjVar = fyuVar.eB;
        if (dzsjVar == null) {
            dzsjVar = new fxy(fyuVar, 763);
            fyuVar.eB = dzsjVar;
        }
        dxio c = dxjc.c(dzsjVar);
        pci hO = fyuVar.hO();
        pbj bw = fyuVar.bw();
        dzsj dzsjVar2 = fyuVar.eC;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fxy(fyuVar, 764);
            fyuVar.eC = dzsjVar2;
        }
        dxio c2 = dxjc.c(dzsjVar2);
        fyuVar.ay();
        cqat rR = fyuVar.a.rR();
        dxjg.e(rR);
        dccx dccxVar = new dccx();
        dccxVar.g((pai) c2.a());
        dccxVar.g((pai) c.a());
        if (bw != null) {
            dccxVar.g(new pbf(bw.n(), rR));
        }
        dccxVar.g(hO);
        dcdc f = dccxVar.f();
        dxjg.f(f);
        fcmService.d = new pbv(f, dxjc.c(this.a.p()));
        bvrv e = this.a.a.e();
        dxjg.e(e);
        fcmService.e = e;
    }
}
