package defpackage;

import com.google.android.apps.gmm.place.timeline.service.detection.LocalLocationSignalDetectorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fug  reason: default package */
/* loaded from: classes6.dex */
public final class fug implements dxis {
    public volatile Object a = new dxjf();
    public volatile Object b = new dxjf();
    public volatile Object c = new dxjf();
    final /* synthetic */ fyu d;
    private volatile dzsj<dmkd> e;

    public fug(fyu fyuVar) {
        this.d = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        LocalLocationSignalDetectorService localLocationSignalDetectorService = (LocalLocationSignalDetectorService) obj;
        localLocationSignalDetectorService.a = this.d.qc();
        bvrv e = this.d.a.e();
        dxjg.e(e);
        localLocationSignalDetectorService.b = e;
        ckcw rU = this.d.a.rU();
        dxjg.e(rU);
        localLocationSignalDetectorService.c = rU;
        dzsj dzsjVar = this.e;
        if (dzsjVar == null) {
            dzsjVar = new fuf(this);
            this.e = dzsjVar;
        }
        localLocationSignalDetectorService.d = new bmsy(dxjc.c(dzsjVar));
    }
}
