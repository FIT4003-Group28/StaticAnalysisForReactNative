package defpackage;

import android.app.Application;
import android.content.Intent;
import android.os.Handler;
import com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams;
import com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationUpdater;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bzvh  reason: default package */
/* loaded from: classes4.dex */
public final class bzvh implements bzuz {
    public static final dcqe a = dcqe.c("bzvh");
    public final Application b;
    public final bzux c;
    public final bzvr d;
    public final dxio<auui> e;
    public final dxio<bzuv> f;
    public final dxio<bzvz> g;
    public final cjqy h;
    public final cpv i;
    public final ReviewAtAPlaceNotificationAdapter$AdapterParams j;
    public final dbsg<auog> k;

    public bzvh(Application application, auoi auoiVar, bzux bzuxVar, bzvr bzvrVar, dxio<auui> dxioVar, dxio<bzuv> dxioVar2, dxio<bzvz> dxioVar3, cjqy cjqyVar, cpv cpvVar, ReviewAtAPlaceNotificationAdapter$AdapterParams reviewAtAPlaceNotificationAdapter$AdapterParams) {
        this.b = application;
        this.c = bzuxVar;
        this.d = bzvrVar;
        this.e = dxioVar;
        this.f = dxioVar2;
        this.g = dxioVar3;
        this.h = cjqyVar;
        this.i = cpvVar;
        this.j = reviewAtAPlaceNotificationAdapter$AdapterParams;
        dbsg<byte[]> m = reviewAtAPlaceNotificationAdapter$AdapterParams.m();
        dbsg<byte[]> n = reviewAtAPlaceNotificationAdapter$AdapterParams.n();
        this.k = (!m.a() || !n.a()) ? dbpy.a : auoiVar.b(reviewAtAPlaceNotificationAdapter$AdapterParams.d().b(), m.b(), n.b());
    }

    public static boolean f(Intent intent) {
        return !ReviewAtAPlaceNotificationUpdater.b(intent).h().a();
    }

    public static void g(final bzvv bzvvVar, final int i) {
        if (ako.b()) {
            bzvvVar.a();
            new Handler().postDelayed(new Runnable(bzvvVar, i) { // from class: bzvd
                private final bzvv a;
                private final int b;

                {
                    this.a = bzvvVar;
                    this.b = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c(this.b);
                }
            }, 500L);
            return;
        }
        bzvvVar.c(i);
    }

    @Override // defpackage.bzuz
    public final String a() {
        if (this.k.a()) {
            return this.k.b().a().toString();
        }
        return this.b.getResources().getString(true != e() ? R.string.INTERACTIVE_REVIEW_AT_A_PLACE_NOTIFICATION_TITLE : R.string.REVIEW_AT_A_PLACE_NOTIFICATION_PLACE_RATED_BEFORE_TITLE);
    }

    @Override // defpackage.bzuz
    public final String b() {
        if (this.k.a()) {
            return this.k.b().b().toString();
        }
        return this.b.getResources().getString(true != e() ? R.string.REVIEW_AT_A_PLACE_NOTIFICATION_SUBTITLE : R.string.REVIEW_AT_A_PLACE_NOTIFICATION_PLACE_RATED_BEFORE_SUBTITLE, this.j.c());
    }

    @Override // defpackage.bzuz
    public final Intent c() {
        blpk blpkVar;
        boolean z = !this.j.h().a();
        bzvt s = this.j.s();
        if (this.k.a()) {
            return this.k.b().c().putExtra("should_log_conversion_for_review_notification", z).putExtra("visit_date_required", this.j.o());
        }
        Application application = this.b;
        if (this.j.r()) {
            blpkVar = blpk.SERVICE_RECOMMENDATION_POST_INTERACTION_NOTIFICATION;
        } else {
            blpkVar = blpk.REVIEW_AT_A_PLACE_NOTIFICATION;
        }
        akqi q = this.j.q();
        String c = this.j.c();
        boolean o = this.j.o();
        Integer f = s.a().f();
        String f2 = s.b().f();
        Intent d = ccfn.d(application);
        d.putExtra("source", blpkVar.o);
        d.putExtra("should_log_conversion_for_review_notification", z);
        d.putExtra("feature_id", q.o());
        d.putExtra("place_name", c);
        d.putExtra("visit_date_required", o);
        if (f != null) {
            d.putExtra("num_rating_stars", f.intValue());
        }
        if (f2 == null) {
            return d;
        }
        d.putExtra("full_review_text", f2);
        return d;
    }

    public final dbsg<Integer> d() {
        return this.j.g().a() ? this.j.g().b().a() : dbpy.a;
    }

    public final boolean e() {
        return d().a();
    }
}
