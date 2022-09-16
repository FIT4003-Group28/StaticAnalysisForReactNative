package defpackage;

import android.app.Application;
import android.content.Intent;
import android.widget.RemoteViews;
import com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams;
import com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationUpdater;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bzvk  reason: default package */
/* loaded from: classes4.dex */
public final class bzvk {
    private static final dcqe a = dcqe.c("bzvk");
    private final Application b;
    private final auoi c;
    private final auhi d;
    private final auhj e;
    private final bzva f;
    private final bzux g;
    private final dxio<cjnx> h;

    public bzvk(Application application, auoi auoiVar, auhi auhiVar, auhj auhjVar, bzva bzvaVar, bzux bzuxVar, dxio<cjnx> dxioVar) {
        this.b = application;
        this.c = auoiVar;
        this.d = auhiVar;
        this.e = auhjVar;
        this.f = bzvaVar;
        this.g = bzuxVar;
        this.h = dxioVar;
    }

    public final void a(ReviewAtAPlaceNotificationAdapter$AdapterParams reviewAtAPlaceNotificationAdapter$AdapterParams) {
        dbsg<auog> dbsgVar;
        augc b;
        augj a2;
        int l = reviewAtAPlaceNotificationAdapter$AdapterParams.l();
        aujb g = this.d.g(l);
        if (g == null) {
            bvoo.h("Creation of notification failed because notificationType was null. %d", Integer.valueOf(l));
            a2 = null;
        } else {
            dbsg<byte[]> m = reviewAtAPlaceNotificationAdapter$AdapterParams.m();
            dbsg<byte[]> n = reviewAtAPlaceNotificationAdapter$AdapterParams.n();
            if (!m.a() || !n.a()) {
                dbsgVar = dbpy.a;
            } else {
                dbsgVar = this.c.b(reviewAtAPlaceNotificationAdapter$AdapterParams.d().b(), m.b(), n.b());
            }
            if (dbsgVar.a()) {
                b = this.e.a(dbsgVar.b().d.d, dbsgVar.b().d.e, l, g);
            } else {
                b = this.e.b(l, g);
            }
            b.O = true;
            if (reviewAtAPlaceNotificationAdapter$AdapterParams.i()) {
                ((ckcn) this.g.a.a(ckdz.av)).a();
            }
            bzuz a3 = this.f.a(reviewAtAPlaceNotificationAdapter$AdapterParams);
            String a4 = a3.a();
            String b2 = a3.b();
            b.A(reviewAtAPlaceNotificationAdapter$AdapterParams.a());
            b.f = a4;
            b.g = b2;
            b.T = reviewAtAPlaceNotificationAdapter$AdapterParams.q();
            b.C(true);
            b.D(this.b.getResources().getColor(R.color.quantum_googblue));
            b.E(a3.c(), auhw.ACTIVITY);
            b(b, reviewAtAPlaceNotificationAdapter$AdapterParams);
            if (this.h.a().f()) {
                ddzf bZ = ddzg.t.bZ();
                ddeo bZ2 = ddep.f.bZ();
                dtbk g2 = reviewAtAPlaceNotificationAdapter$AdapterParams.q().g();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddep ddepVar = (ddep) bZ2.b;
                g2.getClass();
                ddepVar.b = g2;
                ddepVar.a |= 1;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddzg ddzgVar = (ddzg) bZ.b;
                ddep bK = bZ2.bK();
                bK.getClass();
                ddzgVar.g = bK;
                ddzgVar.a |= 67108864;
                b.J = bZ.bK();
            }
            a2 = b.a();
        }
        if (a2 == null) {
            return;
        }
        this.d.j(a2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(auof auofVar, ReviewAtAPlaceNotificationAdapter$AdapterParams reviewAtAPlaceNotificationAdapter$AdapterParams) {
        dbsg<String> i;
        dbsg<String> i2;
        Intent c;
        auhw auhwVar;
        boolean z;
        int i3;
        reviewAtAPlaceNotificationAdapter$AdapterParams.e();
        if (bzrr.b() && reviewAtAPlaceNotificationAdapter$AdapterParams.e().a()) {
            auofVar.M(reviewAtAPlaceNotificationAdapter$AdapterParams.e().b());
        }
        bzuz a2 = this.f.a(reviewAtAPlaceNotificationAdapter$AdapterParams);
        bzuo bzuoVar = new bzuo();
        bzvh bzvhVar = (bzvh) a2;
        String a3 = bzvhVar.a();
        if (a3 != null) {
            bzuoVar.a = a3;
            String b = bzvhVar.b();
            if (b == null) {
                throw new NullPointerException("Null subtitle");
            }
            bzuoVar.b = b;
            bzuoVar.d = 4;
            dlir b2 = (!bzvhVar.k.a() || !bzvhVar.k.b().d().a()) ? dlir.QUANTUM_IC_RATE_REVIEW : bzvhVar.k.b().d().b();
            if (b2 == null) {
                throw new NullPointerException("Null beginningIcon");
            }
            bzuoVar.c = b2;
            String c2 = bzvhVar.j.c();
            if (c2 == null) {
                throw new NullPointerException("Null placeName");
            }
            bzuoVar.e = c2;
            dbsg<String> e = bzrr.b() ? dbpy.a : bzvhVar.j.e();
            if (e == null) {
                throw new NullPointerException("Null accountName");
            }
            bzuoVar.f = e;
            dbsg<Integer> a4 = bzvhVar.j.s().a();
            if (a4 == null) {
                throw new NullPointerException("Null numRatingStars");
            }
            bzuoVar.g = a4;
            bzuoVar.j = new bzve(bzvhVar);
            if (bzvhVar.j.j()) {
                i = dbsg.i(bzvhVar.b.getString(R.string.UNLOCK_SCREEN_AND_TRY_AGAIN));
                i2 = dbpy.a;
            } else if (bzvhVar.j.s().a().a()) {
                if (bzvhVar.j.h().a()) {
                    i = dbsg.i(bzvhVar.b.getString(R.string.THANKS_FOR_THE_TIP));
                    i2 = dbpy.a;
                } else {
                    i = dbsg.i(bzvhVar.b.getString(R.string.TAP_ON_STAR_TO_CHANGE_RATING));
                    i2 = dbpy.a;
                }
            } else if (bzvhVar.d().a() || bzvhVar.j.h().a()) {
                i = dbsg.i(bzvhVar.b.getString(R.string.CANCEL_CONVERSATIONAL));
                i2 = dbsg.i(bzvhVar.b.getString(R.string.TAP_STAR_AGAIN_TO_POST_RATING));
            } else {
                i = dbsg.i(bzvhVar.b.getString(R.string.TAP_STAR_TO_RATE_PUBLICLY));
                i2 = dbpy.a;
            }
            bzuoVar.h = i;
            bzuoVar.i = i2;
            bzvr bzvrVar = bzvhVar.d;
            String str = bzuoVar.a == null ? " title" : "";
            if (bzuoVar.b == null) {
                str = str.concat(" subtitle");
            }
            if (bzuoVar.c == null) {
                str = String.valueOf(str).concat(" beginningIcon");
            }
            if (bzuoVar.d == null) {
                str = String.valueOf(str).concat(" subtitleMaxLinesExpanded");
            }
            if (bzuoVar.e == null) {
                str = String.valueOf(str).concat(" placeName");
            }
            if (bzuoVar.j == null) {
                str = String.valueOf(str).concat(" starClickIntentFactory");
            }
            if (!str.isEmpty()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            bzup bzupVar = new bzup(bzuoVar.a, bzuoVar.b, bzuoVar.c, bzuoVar.d.intValue(), bzuoVar.e, bzuoVar.f, bzuoVar.g, bzuoVar.h, bzuoVar.i, bzuoVar.j);
            Application a5 = bzvrVar.a.a();
            bzvr.a(a5, 1);
            bzvr.a(bzupVar, 2);
            bzvq bzvqVar = new bzvq(a5, bzupVar);
            RemoteViews a6 = bzvqVar.a();
            auoc[] b3 = bzvqVar.b();
            if (b3 != null) {
                auofVar.k(a6, b3);
            } else {
                auofVar.k(a6, new auoc[0]);
            }
            RemoteViews c3 = bzvqVar.c();
            auoc[] d = bzvqVar.d();
            if (d != null) {
                auofVar.i(c3, d);
            } else {
                auofVar.i(c3, new auoc[0]);
            }
            auofVar.L(new ic());
            dbsg<byte[]> m = reviewAtAPlaceNotificationAdapter$AdapterParams.m();
            dbsg<byte[]> n = reviewAtAPlaceNotificationAdapter$AdapterParams.n();
            boolean z2 = m.a() && n.a() && this.c.b(reviewAtAPlaceNotificationAdapter$AdapterParams.d().b(), m.b(), n.b()).a();
            bzvt s = bzvhVar.j.s();
            boolean a7 = bzrr.a();
            boolean a8 = bzvhVar.j.s().a().a();
            if (!a7 || a8) {
                auod l = z2 ? auoe.l(ddcu.Jt) : auoe.k(ddcu.Jr);
                String string = bzvhVar.b.getString(R.string.WRITE_REVIEW);
                if (!a7 || bzvhVar.j.o()) {
                    c = bzvhVar.c();
                    auhwVar = auhw.ACTIVITY;
                    z = true;
                } else {
                    String string2 = bzvhVar.b.getString(R.string.WRITE_REVIEW_GHOST_TEXT_HINT);
                    if (bzvhVar.j.f().a()) {
                        string2 = bzvhVar.j.f().b();
                    }
                    io ioVar = new io("quick_review_text");
                    ioVar.a = string2;
                    l.e(ioVar.a());
                    dbsk.b(bzvhVar.j.s().a().a(), "A review being sent must contain a star rating!");
                    Application application = bzvhVar.b;
                    ReviewAtAPlaceNotificationAdapter$AdapterParams reviewAtAPlaceNotificationAdapter$AdapterParams2 = bzvhVar.j;
                    c = ReviewAtAPlaceNotificationUpdater.c(application, "send_button_click", reviewAtAPlaceNotificationAdapter$AdapterParams2, reviewAtAPlaceNotificationAdapter$AdapterParams2);
                    auhwVar = auhw.BROADCAST;
                    z = false;
                }
                auofVar.B(l.i(1, 2131232596, string, c, auhwVar, z));
                i3 = 2;
            } else {
                i3 = 1;
            }
            if (!s.a().a() || s.a().equals(bzvhVar.d())) {
                return;
            }
            String string3 = bzvhVar.b.getString(R.string.DONE_ACTION);
            Application application2 = bzvhVar.b;
            ReviewAtAPlaceNotificationAdapter$AdapterParams reviewAtAPlaceNotificationAdapter$AdapterParams3 = bzvhVar.j;
            auofVar.B((z2 ? auoe.l(ddcu.Js) : auoe.k(ddcu.Jr)).i(i3, 2131232634, string3, ReviewAtAPlaceNotificationUpdater.c(application2, "done_button_click", reviewAtAPlaceNotificationAdapter$AdapterParams3, reviewAtAPlaceNotificationAdapter$AdapterParams3), auhw.BROADCAST, false));
            return;
        }
        throw new NullPointerException("Null title");
    }
}
