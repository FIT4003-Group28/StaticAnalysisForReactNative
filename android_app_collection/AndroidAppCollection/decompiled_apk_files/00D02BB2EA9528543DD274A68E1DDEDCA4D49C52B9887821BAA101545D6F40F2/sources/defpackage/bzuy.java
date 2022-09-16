package defpackage;

import com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams;
/* compiled from: PG */
/* renamed from: bzuy  reason: default package */
/* loaded from: classes4.dex */
public abstract class bzuy {
    protected abstract ReviewAtAPlaceNotificationAdapter$AdapterParams a();

    public abstract void b(boolean z);

    public abstract void c(bzvt bzvtVar);

    public abstract void d(int i);

    public abstract void e(boolean z);

    public final ReviewAtAPlaceNotificationAdapter$AdapterParams f() {
        ReviewAtAPlaceNotificationAdapter$AdapterParams a = a();
        boolean z = true;
        if (a.l() != dpyv.REVIEW_AT_A_PLACE.dm && a.l() != dpyv.SERVICE_RECOMMENDATION_POST_INTERACTION.dm) {
            z = false;
        }
        dbsk.m(z, "NotificationId should ever only be either REVIEW_AT_A_PLACE or SERVICE_RECOMMENDATION_POST_INTERACTION.");
        return a;
    }
}
