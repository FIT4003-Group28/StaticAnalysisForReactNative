package defpackage;

import android.app.Application;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams;
import com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationUpdater;
/* compiled from: PG */
/* renamed from: bzvv  reason: default package */
/* loaded from: classes4.dex */
public final class bzvv {
    public final Application a;
    public final Intent b;
    private final dxio<bzvk> c;
    private final dxio<auhi> d;
    private final bqli e;
    private final long f;

    public bzvv(Application application, dxio<bzvk> dxioVar, dxio<auhi> dxioVar2, bqli bqliVar, Intent intent, long j) {
        this.a = application;
        this.c = dxioVar;
        this.d = dxioVar2;
        this.e = bqliVar;
        this.b = intent;
        this.f = j;
    }

    public final void a() {
        this.c.a().a(ReviewAtAPlaceNotificationUpdater.a(this.b));
    }

    public final void b(ReviewAtAPlaceNotificationAdapter$AdapterParams reviewAtAPlaceNotificationAdapter$AdapterParams) {
        this.c.a().a(reviewAtAPlaceNotificationAdapter$AdapterParams);
    }

    public final void c(int i) {
        this.d.a().m(i);
    }

    public final void d(augj augjVar) {
        this.d.a().j(augjVar);
    }

    public final void e(bzvx bzvxVar) {
        Toast.makeText(this.a, bzvxVar.c(), 0).show();
        int i = ReviewAtAPlaceNotificationUpdater.g;
        ReviewAtAPlaceNotificationUpdater.a(this.b).q();
        bqli bqliVar = this.e;
        bqku c = bqla.c();
        c.b(bzvxVar.a());
        c.c(bzvxVar.b());
        bqliVar.a(c.d(), new bzvu(this, bzvxVar), this.f);
    }
}
