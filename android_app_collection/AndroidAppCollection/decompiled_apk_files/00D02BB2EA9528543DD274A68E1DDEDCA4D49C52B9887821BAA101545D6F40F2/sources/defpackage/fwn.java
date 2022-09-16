package defpackage;

import com.google.android.apps.gmm.ugc.phototaken.PhotoTakenBackfillService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fwn  reason: default package */
/* loaded from: classes6.dex */
public final class fwn implements dxis {
    final /* synthetic */ fyu a;
    private volatile dzsj<cdha> b;
    private volatile dzsj<cdgj> c;

    public fwn(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        PhotoTakenBackfillService photoTakenBackfillService = (PhotoTakenBackfillService) obj;
        photoTakenBackfillService.g = dxjc.c(this.a.be());
        dzsj dzsjVar = this.c;
        if (dzsjVar == null) {
            dzsjVar = new fwm(this, 0);
            this.c = dzsjVar;
        }
        photoTakenBackfillService.h = dxjc.c(dzsjVar);
        photoTakenBackfillService.i = dxjc.c(this.a.pU());
        photoTakenBackfillService.j = dxjc.c(this.a.at());
        bvrv e = this.a.a.e();
        dxjg.e(e);
        photoTakenBackfillService.k = e;
        photoTakenBackfillService.l = this.a.qc();
    }

    public final dzsj<cdha> b() {
        dzsj<cdha> dzsjVar = this.b;
        if (dzsjVar == null) {
            fwm fwmVar = new fwm(this, 1);
            this.b = fwmVar;
            return fwmVar;
        }
        return dzsjVar;
    }
}
