package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.offline.update.OfflineManualDownloadService;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fvt  reason: default package */
/* loaded from: classes6.dex */
final class fvt implements dxis {
    final /* synthetic */ fyu a;

    public fvt(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        OfflineManualDownloadService offlineManualDownloadService = (OfflineManualDownloadService) obj;
        dehq tg = this.a.a.tg();
        dxjg.e(tg);
        offlineManualDownloadService.b = tg;
        offlineManualDownloadService.c = this.a.T();
        Executor sU = this.a.a.sU();
        dxjg.e(sU);
        offlineManualDownloadService.d = sU;
        Application a = this.a.a.a();
        dxjg.e(a);
        offlineManualDownloadService.e = a;
        offlineManualDownloadService.f = this.a.qH();
        ckcw rU = this.a.a.rU();
        dxjg.e(rU);
        offlineManualDownloadService.g = rU;
        offlineManualDownloadService.h = this.a.qc();
        offlineManualDownloadService.i = this.a.cN();
        avzs f = this.a.dj().f();
        dbsk.s(f);
        offlineManualDownloadService.j = f;
        this.a.cY();
        offlineManualDownloadService.x = this.a.S();
        bvrv e = this.a.a.e();
        dxjg.e(e);
        offlineManualDownloadService.k = e;
        bvjj rB = this.a.a.rB();
        dxjg.e(rB);
        offlineManualDownloadService.l = rB;
        offlineManualDownloadService.m = this.a.qP();
        fyu fyuVar = this.a;
        Object obj3 = fyuVar.ef;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = fyuVar.ef;
                if (obj2 instanceof dxjf) {
                    akfa rK = fyuVar.a.rK();
                    dxjg.e(rK);
                    avty avtyVar = new avty(rK);
                    btrm rz = fyuVar.a.rz();
                    dxjg.e(rz);
                    avtx avtxVar = avtyVar.b;
                    dceq a2 = dcet.a();
                    a2.b(gds.class, new avtz(gds.class, avtxVar));
                    rz.g(avtxVar, a2.a());
                    avtyVar.b(avtyVar.a.j());
                    dxjc.d(fyuVar.ef, avtyVar);
                    fyuVar.ef = avtyVar;
                    obj2 = avtyVar;
                }
            }
            obj3 = obj2;
        }
        offlineManualDownloadService.n = (avty) obj3;
        akfa rK2 = this.a.a.rK();
        dxjg.e(rK2);
        offlineManualDownloadService.o = rK2;
        offlineManualDownloadService.p = this.a.D();
        offlineManualDownloadService.q = this.a.de();
        offlineManualDownloadService.r = this.a.L();
        offlineManualDownloadService.s = this.a.N();
        offlineManualDownloadService.t = this.a.dk();
    }
}
