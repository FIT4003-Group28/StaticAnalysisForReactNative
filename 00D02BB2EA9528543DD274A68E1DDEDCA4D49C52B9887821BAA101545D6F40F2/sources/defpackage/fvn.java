package defpackage;

import com.google.android.apps.gmm.offline.update.OfflineAutoUpdateJobService;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fvn  reason: default package */
/* loaded from: classes6.dex */
final class fvn implements dxis {
    final /* synthetic */ fyu a;

    public fvn(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        OfflineAutoUpdateJobService offlineAutoUpdateJobService = (OfflineAutoUpdateJobService) obj;
        offlineAutoUpdateJobService.a = dxjc.c(this.a.hS());
        ckcw rU = this.a.a.rU();
        dxjg.e(rU);
        offlineAutoUpdateJobService.b = rU;
        offlineAutoUpdateJobService.c = this.a.qc();
        this.a.cY();
        offlineAutoUpdateJobService.d = dxjc.c(this.a.hR());
        bvrv e = this.a.a.e();
        dxjg.e(e);
        offlineAutoUpdateJobService.e = e;
        Executor sV = this.a.a.sV();
        dxjg.e(sV);
        offlineAutoUpdateJobService.f = sV;
        offlineAutoUpdateJobService.g = dxjc.c(this.a.eY());
        cqat rR = this.a.a.rR();
        dxjg.e(rR);
        offlineAutoUpdateJobService.h = rR;
    }
}
