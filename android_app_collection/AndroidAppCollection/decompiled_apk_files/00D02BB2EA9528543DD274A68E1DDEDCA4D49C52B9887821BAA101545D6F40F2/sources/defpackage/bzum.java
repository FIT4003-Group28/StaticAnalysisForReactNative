package defpackage;

import com.google.android.apps.gmm.ugc.clientnotification.review.AutoValue_ReviewAtAPlaceNotificationAdapter_AdapterParams;
import com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams;
/* compiled from: PG */
/* renamed from: bzum  reason: default package */
/* loaded from: classes4.dex */
public final class bzum extends bzuy {
    public Long a;
    public String b;
    public String c;
    public dbsg<String> d;
    public dbsg<String> e;
    public dbsg<String> f;
    public dbsg<bzvt> g;
    public Boolean h;
    public Boolean i;
    public dbsg<byte[]> j;
    public dbsg<byte[]> k;
    private dbsg<bzvt> l;
    private Boolean m;
    private Integer n;
    private Boolean o;

    public bzum() {
        this.d = dbpy.a;
        this.e = dbpy.a;
        this.f = dbpy.a;
        this.g = dbpy.a;
        this.l = dbpy.a;
        this.j = dbpy.a;
        this.k = dbpy.a;
    }

    public bzum(ReviewAtAPlaceNotificationAdapter$AdapterParams reviewAtAPlaceNotificationAdapter$AdapterParams) {
        this.d = dbpy.a;
        this.e = dbpy.a;
        this.f = dbpy.a;
        this.g = dbpy.a;
        this.l = dbpy.a;
        this.j = dbpy.a;
        this.k = dbpy.a;
        this.a = Long.valueOf(reviewAtAPlaceNotificationAdapter$AdapterParams.a());
        this.b = reviewAtAPlaceNotificationAdapter$AdapterParams.b();
        this.c = reviewAtAPlaceNotificationAdapter$AdapterParams.c();
        this.d = reviewAtAPlaceNotificationAdapter$AdapterParams.d();
        this.e = reviewAtAPlaceNotificationAdapter$AdapterParams.e();
        this.f = reviewAtAPlaceNotificationAdapter$AdapterParams.f();
        this.g = reviewAtAPlaceNotificationAdapter$AdapterParams.g();
        this.l = reviewAtAPlaceNotificationAdapter$AdapterParams.h();
        this.h = Boolean.valueOf(reviewAtAPlaceNotificationAdapter$AdapterParams.i());
        this.m = Boolean.valueOf(reviewAtAPlaceNotificationAdapter$AdapterParams.j());
        this.i = Boolean.valueOf(reviewAtAPlaceNotificationAdapter$AdapterParams.k());
        this.n = Integer.valueOf(reviewAtAPlaceNotificationAdapter$AdapterParams.l());
        this.j = reviewAtAPlaceNotificationAdapter$AdapterParams.m();
        this.k = reviewAtAPlaceNotificationAdapter$AdapterParams.n();
        this.o = Boolean.valueOf(reviewAtAPlaceNotificationAdapter$AdapterParams.o());
    }

    @Override // defpackage.bzuy
    public final void b(boolean z) {
        this.m = Boolean.valueOf(z);
    }

    @Override // defpackage.bzuy
    public final void c(bzvt bzvtVar) {
        this.l = dbsg.i(bzvtVar);
    }

    @Override // defpackage.bzuy
    public final void d(int i) {
        this.n = Integer.valueOf(i);
    }

    @Override // defpackage.bzuy
    public final void e(boolean z) {
        this.o = Boolean.valueOf(z);
    }

    @Override // defpackage.bzuy
    protected final ReviewAtAPlaceNotificationAdapter$AdapterParams a() {
        String str = this.a == null ? " notificationShownTimestamp" : "";
        if (this.b == null) {
            str = str.concat(" featureIdString");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" placeName");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" hasLargeIconBeenSavedToBitmapCache");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" isAlreadyShowingLockScreenFeedback");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" isDining");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" notificationId");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" visitDateRequired");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_ReviewAtAPlaceNotificationAdapter_AdapterParams(this.a.longValue(), this.b, this.c, this.d, this.e, this.f, this.g, this.l, this.h.booleanValue(), this.m.booleanValue(), this.i.booleanValue(), this.n.intValue(), this.j, this.k, this.o.booleanValue());
    }
}
