package defpackage;

import com.google.android.apps.gmm.locationsharing.reporting.ReporterService;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fwz  reason: default package */
/* loaded from: classes6.dex */
final class fwz implements dxis {
    final /* synthetic */ fyu a;

    public fwz(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ReporterService reporterService = (ReporterService) obj;
        ckcw rU = this.a.a.rU();
        dxjg.e(rU);
        reporterService.b = rU;
        cqat rR = this.a.a.rR();
        dxjg.e(rR);
        reporterService.c = rR;
        btvo rp = this.a.a.rp();
        dxjg.e(rp);
        reporterService.d = rp;
        bvrv e = this.a.a.e();
        dxjg.e(e);
        reporterService.e = e;
        akfa rK = this.a.a.rK();
        dxjg.e(rK);
        reporterService.f = rK;
        reporterService.g = this.a.cu();
        reporterService.h = this.a.bg();
        dxjg.e(this.a.a.rB());
        reporterService.i = this.a.eC();
        reporterService.j = this.a.eP();
        bvrb tn = this.a.a.tn();
        dxjg.e(tn);
        reporterService.k = tn;
        reporterService.l = this.a.eM();
        Executor sV = this.a.a.sV();
        dxjg.e(sV);
        reporterService.m = sV;
    }
}
