package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationDidntGoHereActionBroadcastReceiver;
/* compiled from: PG */
/* renamed from: fxd  reason: default package */
/* loaded from: classes6.dex */
final class fxd implements dxis {
    final /* synthetic */ fyu a;

    public fxd(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ReviewAtAPlaceNotificationDidntGoHereActionBroadcastReceiver reviewAtAPlaceNotificationDidntGoHereActionBroadcastReceiver = (ReviewAtAPlaceNotificationDidntGoHereActionBroadcastReceiver) obj;
        Application a = this.a.a.a();
        dxjg.e(a);
        reviewAtAPlaceNotificationDidntGoHereActionBroadcastReceiver.a = new bzuu(a, this.a.cu(), this.a.bg());
        reviewAtAPlaceNotificationDidntGoHereActionBroadcastReceiver.b = this.a.cu();
        reviewAtAPlaceNotificationDidntGoHereActionBroadcastReceiver.c = this.a.rw();
        cqat rR = this.a.a.rR();
        dxjg.e(rR);
        reviewAtAPlaceNotificationDidntGoHereActionBroadcastReceiver.d = rR;
    }
}
