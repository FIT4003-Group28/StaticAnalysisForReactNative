package defpackage;

import android.app.Application;
import android.widget.RemoteViews;
import com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationUpdater;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bzvq  reason: default package */
/* loaded from: classes4.dex */
public final class bzvq implements bzvm {
    private static final int[] a = {R.id.review_at_a_place_notification_star_1, R.id.review_at_a_place_notification_star_2, R.id.review_at_a_place_notification_star_3, R.id.review_at_a_place_notification_star_4, R.id.review_at_a_place_notification_star_5};
    private final bzvp b;
    private final RemoteViews c;
    private final RemoteViews d;

    public bzvq(Application application, bzvp bzvpVar) {
        String string;
        String string2;
        this.b = bzvpVar;
        RemoteViews clone = new RemoteViews(application.getPackageName(), (int) R.layout.review_at_a_place_notification_stars).clone();
        bzvn.a(clone, R.id.review_at_a_place_notification_icon_before_title, 2131232865, application);
        bzup bzupVar = (bzup) bzvpVar;
        clone.setTextViewText(R.id.review_at_a_place_notification_title, bzupVar.a);
        clone.setTextViewText(R.id.review_at_a_place_notification_subtitle, bzupVar.b);
        this.c = clone;
        RemoteViews clone2 = clone.clone();
        clone2.setInt(R.id.review_at_a_place_notification_subtitle, "setMaxLines", bzupVar.c);
        clone2.setViewVisibility(R.id.review_at_a_place_notification_subtext_linear_layout, 0);
        bzvn.a(clone2, R.id.review_at_a_place_notification_icon_before_subtext, 2131232857, application);
        if (!bzrr.b() && !bzupVar.e.a()) {
            bvoo.h("Notification subtext is not supported, but accountName is empty.", new Object[0]);
        }
        if (bzupVar.e.a()) {
            string = application.getString(R.string.POSTING_PUBLICLY_AS_USERNAME_DISCLAIMER, new Object[]{bzupVar.e.b()});
        } else {
            string = application.getString(R.string.POSTING_PUBLICLY_DISCLAIMER);
        }
        clone2.setTextViewText(R.id.review_at_a_place_notification_subtext, string);
        clone2.setViewVisibility(R.id.review_at_a_place_notification_subtext, 0);
        clone2.setViewVisibility(R.id.review_at_a_place_notification_bottom_padding, 0);
        int intValue = bzupVar.f.c(0).intValue();
        clone2.setViewVisibility(R.id.review_at_a_place_notification_row_of_stars, 0);
        int i = 0;
        while (i < 5) {
            clone2.setImageViewResource(a[i], intValue > i ? 2131231750 : 2131231749);
            i++;
        }
        dbsg<String> dbsgVar = bzupVar.g;
        dbsg<String> dbsgVar2 = bzupVar.h;
        e(clone2, R.id.review_at_a_place_notification_below_stars_line_1, dbsgVar);
        e(clone2, R.id.review_at_a_place_notification_below_stars_line_2, dbsgVar2);
        if (bzupVar.f.a()) {
            string2 = application.getResources().getQuantityString(R.plurals.CURRENT_RATING_CONTENT_DESCRIPTION, bzupVar.f.b().intValue(), bzupVar.d, bzupVar.f.b());
        } else {
            string2 = application.getString(R.string.NO_CURRENT_RATING_CONTENT_DESCRIPTION, new Object[]{bzupVar.d});
        }
        clone2.setContentDescription(R.id.review_at_a_place_notification_row_of_stars, string2);
        int i2 = 0;
        while (i2 < 5) {
            int i3 = i2 + 1;
            clone2.setContentDescription(a[i2], application.getResources().getQuantityString(R.plurals.REVIEW_AT_A_PLACE_NOTIFICATION_INLINE_FIVE_STARS_CONTENT_DESCRIPTION, i3, Integer.valueOf(i3)));
            i2 = i3;
        }
        this.d = clone2;
    }

    private static void e(RemoteViews remoteViews, int i, dbsg<String> dbsgVar) {
        if (dbsgVar.a()) {
            remoteViews.setTextViewText(i, dbsgVar.b());
            remoteViews.setViewVisibility(i, 0);
            return;
        }
        remoteViews.setViewVisibility(i, 8);
    }

    @Override // defpackage.bzvm
    public final RemoteViews a() {
        return this.c;
    }

    @Override // defpackage.bzvm
    @dzsi
    public final auoc[] b() {
        return null;
    }

    @Override // defpackage.bzvm
    public final RemoteViews c() {
        return this.d;
    }

    @Override // defpackage.bzvm
    @dzsi
    public final auoc[] d() {
        auoc[] auocVarArr = new auoc[5];
        int i = 0;
        while (i < 5) {
            bzvh bzvhVar = ((bzup) this.b).i.a;
            int i2 = i + 1;
            Integer valueOf = Integer.valueOf(i2);
            dbsg<Integer> i3 = bzvhVar.j.s().a().c(0).equals(valueOf) ? dbpy.a : dbsg.i(valueOf);
            Application application = bzvhVar.b;
            bzuy p = bzvhVar.j.p();
            bzvs c = bzvhVar.j.s().c();
            c.b(i3);
            p.c(c.c());
            auocVarArr[i] = auoc.j(ReviewAtAPlaceNotificationUpdater.c(application, "star_rating_click", p.f(), bzvhVar.j), auhw.BROADCAST, a[i], dtya.de, false, true, ddcu.Jr);
            i = i2;
        }
        return auocVarArr;
    }
}
