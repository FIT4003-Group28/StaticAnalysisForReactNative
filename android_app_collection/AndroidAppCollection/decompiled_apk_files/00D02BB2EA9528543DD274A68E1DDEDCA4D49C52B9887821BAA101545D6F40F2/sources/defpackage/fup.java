package defpackage;

import com.google.android.apps.gmm.locationsharing.interprocess.impl.LocationSharingReportingService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fup  reason: default package */
/* loaded from: classes6.dex */
public final class fup implements dxis {
    final /* synthetic */ fyu a;
    private volatile dzsj<aiar> b;

    public fup(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        LocationSharingReportingService locationSharingReportingService = (LocationSharingReportingService) obj;
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fuo(this);
            this.b = dzsjVar;
        }
        locationSharingReportingService.a = dxjc.c(dzsjVar);
        ckcw rU = this.a.a.rU();
        dxjg.e(rU);
        locationSharingReportingService.b = rU;
        bvrv e = this.a.a.e();
        dxjg.e(e);
        locationSharingReportingService.c = e;
        btvo rp = this.a.a.rp();
        dxjg.e(rp);
        locationSharingReportingService.d = rp;
    }

    public final ahzi b() {
        return new ahzi(this.a.hz(), this.a.hw());
    }
}
