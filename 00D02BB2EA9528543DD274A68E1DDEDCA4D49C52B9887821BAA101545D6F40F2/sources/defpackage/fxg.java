package defpackage;

import com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationUpdater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fxg  reason: default package */
/* loaded from: classes6.dex */
public final class fxg implements dxis {
    final /* synthetic */ fyu a;
    private volatile dzsj<bzvy> b;

    public fxg(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ReviewAtAPlaceNotificationUpdater reviewAtAPlaceNotificationUpdater = (ReviewAtAPlaceNotificationUpdater) obj;
        dxjg.e(this.a.a.a());
        reviewAtAPlaceNotificationUpdater.b = this.a.bi();
        reviewAtAPlaceNotificationUpdater.c = this.a.qc();
        fyu fyuVar = this.a;
        dzsj dzsjVar = fyuVar.ew;
        if (dzsjVar == null) {
            dzsjVar = new fxy(fyuVar, 756);
            fyuVar.ew = dzsjVar;
        }
        reviewAtAPlaceNotificationUpdater.d = dxjc.c(dzsjVar);
        dzsj dzsjVar2 = this.b;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fxf(this);
            this.b = dzsjVar2;
        }
        reviewAtAPlaceNotificationUpdater.e = dxjc.c(dzsjVar2);
        cqat rR = this.a.a.rR();
        dxjg.e(rR);
        reviewAtAPlaceNotificationUpdater.f = rR;
    }
}
