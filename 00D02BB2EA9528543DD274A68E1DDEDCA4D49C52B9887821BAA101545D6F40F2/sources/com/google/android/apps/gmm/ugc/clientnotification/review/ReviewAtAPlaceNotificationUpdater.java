package com.google.android.apps.gmm.ugc.clientnotification.review;

import android.app.Application;
import android.app.KeyguardManager;
import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import com.google.android.apps.gmm.review.api.ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams;
import com.google.android.apps.gmm.ugc.intent.AutoValue_ReviewIntent_MinimalPlacemark;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ReviewAtAPlaceNotificationUpdater extends BroadcastReceiver {
    static final String a;
    public static final /* synthetic */ int g = 0;
    public bzux b;
    public gdo c;
    public dxio<bzva> d;
    public dxio<bzvy> e;
    public cqat f;

    static {
        String canonicalName = ReviewAtAPlaceNotificationUpdater.class.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 14);
        sb.append(canonicalName);
        sb.append(".");
        sb.append("UPDATE_ACTION");
        a = sb.toString();
    }

    public static final ReviewAtAPlaceNotificationAdapter$AdapterParams a(Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("intent_extras_bundle");
        dbsk.s(parcelableExtra);
        Parcelable parcelable = ((Bundle) parcelableExtra).getParcelable("adapter_params");
        dbsk.s(parcelable);
        return (ReviewAtAPlaceNotificationAdapter$AdapterParams) parcelable;
    }

    public static final ReviewAtAPlaceNotificationAdapter$AdapterParams b(Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("intent_extras_bundle");
        dbsk.s(parcelableExtra);
        Parcelable parcelable = ((Bundle) parcelableExtra).getParcelable("last_adapter_params");
        dbsk.s(parcelable);
        return (ReviewAtAPlaceNotificationAdapter$AdapterParams) parcelable;
    }

    public static Intent c(Context context, String str, ReviewAtAPlaceNotificationAdapter$AdapterParams reviewAtAPlaceNotificationAdapter$AdapterParams, ReviewAtAPlaceNotificationAdapter$AdapterParams reviewAtAPlaceNotificationAdapter$AdapterParams2) {
        Bundle bundle = new Bundle();
        bundle.putString("action_type", str);
        bundle.putParcelable("adapter_params", reviewAtAPlaceNotificationAdapter$AdapterParams);
        bundle.putParcelable("last_adapter_params", reviewAtAPlaceNotificationAdapter$AdapterParams2);
        Intent intent = new Intent();
        intent.setAction(a);
        intent.setClass(context, ReviewAtAPlaceNotificationUpdater.class);
        intent.putExtra("intent_extras_bundle", bundle);
        return intent;
    }

    private final void d() {
        bzux bzuxVar = this.b;
        bzuxVar.a.g(ckhc.REVIEW_AT_A_PLACE_NOTIFICATION_UPDATER);
        this.c.e();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dbsg<ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams> dbsgVar;
        dnqg bZ;
        dbsg i;
        dbsg<ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams> dbsgVar2;
        dxiq.c(this, context);
        this.c.b();
        this.b.a.f(ckhc.REVIEW_AT_A_PLACE_NOTIFICATION_UPDATER);
        intent.getAction();
        try {
            long b = this.f.b();
            Parcelable parcelableExtra = intent.getParcelableExtra("intent_extras_bundle");
            dbsk.s(parcelableExtra);
            String string = ((Bundle) parcelableExtra).getString("action_type");
            dbsk.s(string);
            bzuz a2 = this.d.a().a(a(intent));
            bzvy a3 = this.e.a();
            Application a4 = a3.a.a();
            bzvy.a(a4, 1);
            dxio a5 = ((dxjh) a3.b).a();
            bzvy.a(a5, 2);
            dxio a6 = ((dxjh) a3.c).a();
            bzvy.a(a6, 3);
            bqli a7 = a3.d.a();
            bzvy.a(a7, 4);
            bzvy.a(intent, 5);
            final bzvv bzvvVar = new bzvv(a4, a5, a6, a7, intent, b);
            final String str = "";
            if (string.equals("send_button_click")) {
                auug d = ((bzvh) a2).e.a().d(auuh.c(null, dpyv.REVIEW_AT_A_PLACE.dm));
                if (d == null) {
                    ((bzvh) a2).c.a(3);
                    i = dbpy.a;
                } else {
                    cjtd b2 = d.b();
                    if (b2 == null) {
                        ((bzvh) a2).c.a(4);
                        i = dbpy.a;
                    } else {
                        cjsa cjsaVar = b2.m;
                        if (cjsaVar == null) {
                            ((bzvh) a2).c.a(5);
                            i = dbpy.a;
                        } else {
                            ((bzvh) a2).c.a(2);
                            i = dbsg.i(cjsaVar);
                        }
                    }
                }
                cjta b3 = cjtd.b();
                b3.d = dtya.df;
                if (i.a()) {
                    b3.i = (cjsa) i.b();
                }
                cjqm i2 = ((bzvh) a2).h.i(b3.a());
                if (!i2.a().a()) {
                    bvoo.h("The client EI returned from logging a send button click should not be null!", new Object[0]);
                }
                final int intValue = ((bzvh) a2).j.s().a().c(0).intValue();
                dbsk.b(intValue > 0, "Star rating to be sending with review must be non-zero!");
                Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(bzvvVar.b);
                if (resultsFromIntent != null) {
                    CharSequence charSequence = resultsFromIntent.getCharSequence("quick_review_text");
                    dbsk.s(charSequence);
                    str = charSequence.toString();
                }
                ((bzvh) a2).j.q();
                ((ckcp) ((bzvh) a2).c.a.a(ckdz.au)).a(str.length());
                if (str.isEmpty()) {
                    bvoo.h("The in-line notification review should never be empty!", new Object[0]);
                }
                dnqh c = bzwi.c(((bzvh) a2).j.r() ? blpk.SERVICE_RECOMMENDATION_POST_INTERACTION_NOTIFICATION_INLINE : blpk.REVIEW_AT_A_PLACE_NOTIFICATION_INLINE);
                dsqp dsqpVar = (dsqp) c.cu(5);
                dsqpVar.bC(c);
                dnqg dnqgVar = (dnqg) dsqpVar;
                if (i2.a().a()) {
                    String b4 = i2.a().b();
                    if (dnqgVar.c) {
                        dnqgVar.bF();
                        dnqgVar.c = false;
                    }
                    dnqh dnqhVar = (dnqh) dnqgVar.b;
                    dnqh dnqhVar2 = dnqh.p;
                    b4.getClass();
                    dnqhVar.a |= 2;
                    dnqhVar.c = b4;
                }
                if (bzvh.f(bzvvVar.b)) {
                    bqjg b5 = ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams.b();
                    b5.b(ckdw.NOTIFICATION_SEND_REVIEW_BUTTON_CLICK);
                    dbsgVar2 = dbsg.i(b5.a());
                } else {
                    dbsgVar2 = dbpy.a;
                }
                bzvw h = bzvx.h();
                bqkw k = bqkx.k();
                k.c(((bzvh) a2).j.q());
                k.f(intValue);
                k.e(str);
                h.c(k.h());
                bqky h2 = bqkz.h();
                h2.d(dnqgVar.bK());
                h2.f(dbsgVar2);
                h2.g(chbv.NEVER_SHOW);
                h2.c(dhpj.UNKNOWN_CONTRIBUTION_SOURCE);
                h.e(h2.a());
                h.d(((bzvh) a2).b.getString(R.string.SENDING_REVIEW_FOR_PLACE));
                h.f(((bzvh) a2).b.getString(R.string.SUCCESSFULLY_SENT_REVIEW));
                final bzvh bzvhVar = (bzvh) a2;
                h.g(new Runnable(bzvhVar, bzvvVar, intValue) { // from class: bzvb
                    private final bzvh a;
                    private final bzvv b;
                    private final int c;

                    {
                        this.a = bzvhVar;
                        this.b = bzvvVar;
                        this.c = intValue;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bzvh bzvhVar2 = this.a;
                        bzvv bzvvVar2 = this.b;
                        int i3 = this.c;
                        bzvh.g(bzvvVar2, bzvhVar2.j.l());
                        bzuv a8 = bzvhVar2.f.a();
                        long a9 = bzvhVar2.j.a();
                        bzrm c2 = bzrn.c();
                        c2.c(a8.b.getString(R.string.POST_INLINE_RATING_THANKS_NOTIFICATION_BEFORE_TITLE_RATING_TEXT, new Object[]{Integer.valueOf(i3)}));
                        c2.b(bzuv.a);
                        dbsg j = dbsg.j(a8.b(a9, c2.a(), R.string.POST_INLINE_REVIEW_THANKS_NOTIFICATION_SUBTITLE, a8.a()));
                        if (j.a()) {
                            bzvvVar2.d((augj) j.b());
                        }
                    }
                });
                h.b(((bzvh) a2).b.getString(R.string.FAILED_TO_SEND_REVIEW_FOR_PLACE_TRY_AGAIN));
                final bzvh bzvhVar2 = (bzvh) a2;
                ((bzus) h).a = dbsg.i(new Runnable(bzvhVar2, bzvvVar, intValue, str) { // from class: bzvc
                    private final bzvh a;
                    private final bzvv b;
                    private final int c;
                    private final String d;

                    {
                        this.a = bzvhVar2;
                        this.b = bzvvVar;
                        this.c = intValue;
                        this.d = str;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        blpk blpkVar;
                        augj a8;
                        bzvh bzvhVar3 = this.a;
                        bzvv bzvvVar2 = this.b;
                        int i3 = this.c;
                        String str2 = this.d;
                        bzvh.g(bzvvVar2, bzvhVar3.j.l());
                        if (bzvhVar3.j.r()) {
                            blpkVar = blpk.SERVICE_RECOMMENDATION_POST_INTERACTION_NOTIFICATION_INLINE;
                        } else {
                            blpkVar = blpk.REVIEW_AT_A_PLACE_NOTIFICATION_INLINE;
                        }
                        bzvz a9 = bzvhVar3.g.a();
                        akqi q = bzvhVar3.j.q();
                        String c2 = bzvhVar3.j.c();
                        boolean o = bzvhVar3.j.o();
                        aujb h3 = a9.c.h(dpyv.REVIEW_AT_A_PLACE_SUBMISSION_FAILURE.dm);
                        if (h3 == null) {
                            bvoo.h("Review submission failure notification type retrieved from the GmmNotificationManager is null!", new Object[0]);
                            a8 = null;
                        } else {
                            augc b6 = a9.e.b(h3.a, h3);
                            Application application = a9.b;
                            cceh ccehVar = new cceh();
                            String o2 = q.o();
                            if (o2 != null) {
                                ccehVar.a = o2;
                                if (c2 != null) {
                                    ccehVar.b = c2;
                                    ccehVar.c = Boolean.valueOf(o);
                                    String str3 = ccehVar.a == null ? " featureIdString" : "";
                                    if (ccehVar.b == null) {
                                        str3 = str3.concat(" placeName");
                                    }
                                    if (ccehVar.c == null) {
                                        str3 = String.valueOf(str3).concat(" visitDateRequired");
                                    }
                                    if (!str3.isEmpty()) {
                                        String valueOf = String.valueOf(str3);
                                        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                                    }
                                    AutoValue_ReviewIntent_MinimalPlacemark autoValue_ReviewIntent_MinimalPlacemark = new AutoValue_ReviewIntent_MinimalPlacemark(ccehVar.a, ccehVar.b, ccehVar.c.booleanValue());
                                    Intent d2 = ccfn.d(application);
                                    d2.putExtra("source", blpkVar.o);
                                    d2.putExtra("should_log_conversion_for_review_notification", false);
                                    d2.putExtra("minimal_placemark_for_launching_review_editor_page", autoValue_ReviewIntent_MinimalPlacemark);
                                    d2.putExtra("num_rating_stars_for_populating_review_editor_page", i3);
                                    d2.putExtra("full_review_text_for_populating_review_editor_page", str2);
                                    Resources resources = a9.b.getResources();
                                    String string2 = resources.getString(R.string.REVIEW_AT_A_PLACE_SUBMISSION_FAILURE_NOTIFICATION_TITLE);
                                    String string3 = resources.getString(R.string.REVIEW_AT_A_PLACE_SUBMISSION_FAILURE_NOTIFICATION_SUBTITLE);
                                    b6.f = string2;
                                    b6.g = string3;
                                    b6.C(true);
                                    b6.D(resources.getColor(R.color.quantum_googblue));
                                    b6.E(d2, auhw.ACTIVITY);
                                    a9.d.a(b6, 2131231774, null, string2, string3);
                                    a8 = b6.a();
                                } else {
                                    throw new NullPointerException("Null placeName");
                                }
                            } else {
                                throw new NullPointerException("Null featureIdString");
                            }
                        }
                        dbsg j = dbsg.j(a8);
                        if (j.a()) {
                            bzvvVar2.d((augj) j.b());
                        }
                    }
                });
                bzvvVar.e(h.a());
            } else if (string.equals("star_rating_click")) {
                KeyguardManager keyguardManager = (KeyguardManager) ((bzvh) a2).b.getSystemService("keyguard");
                if (keyguardManager == null || !keyguardManager.isKeyguardLocked()) {
                    bzvvVar.a();
                    int intValue2 = ((bzvh) a2).j.s().a().c(0).intValue();
                    boolean f = bzvh.f(bzvvVar.b);
                    if (f) {
                        bqjg b6 = ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams.b();
                        b6.b(ckdw.NOTIFICATION_STAR_CLICK);
                        dbsgVar = dbsg.i(b6.a());
                    } else {
                        dbsgVar = dbpy.a;
                    }
                    bzvw h3 = bzvx.h();
                    bqkw k2 = bqkx.k();
                    k2.c(((bzvh) a2).j.q());
                    k2.f(intValue2);
                    k2.e(str);
                    h3.c(k2.h());
                    bqky h4 = bqkz.h();
                    if (((bzvh) a2).j.r()) {
                        ddda dddaVar = f ? ddda.fo : ddda.fp;
                        bZ = dnqh.p.bZ();
                        int i3 = dddaVar.b;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dnqh dnqhVar3 = (dnqh) bZ.b;
                        dnqhVar3.a |= 64;
                        dnqhVar3.g = i3;
                    } else {
                        ddda dddaVar2 = f ? ddda.fa : ddda.fb;
                        bZ = dnqh.p.bZ();
                        int i4 = dddaVar2.b;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dnqh dnqhVar4 = (dnqh) bZ.b;
                        dnqhVar4.a |= 64;
                        dnqhVar4.g = i4;
                    }
                    String b7 = cjqg.b(((bzvh) a2).h);
                    if (b7 != null) {
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dnqh dnqhVar5 = (dnqh) bZ.b;
                        b7.getClass();
                        dnqhVar5.a |= 2;
                        dnqhVar5.c = b7;
                    }
                    h4.d(bZ.bK());
                    h4.f(dbsgVar);
                    h4.g(chbv.NEVER_SHOW);
                    h4.c(dhpj.UNKNOWN_CONTRIBUTION_SOURCE);
                    h3.e(h4.a());
                    h3.d(intValue2 > 0 ? ((bzvh) a2).b.getResources().getQuantityString(R.plurals.SENDING_STAR_RATING_FOR_PLACE, intValue2, Integer.valueOf(intValue2)) : ((bzvh) a2).b.getString(R.string.DELETING_RATING));
                    h3.f(intValue2 > 0 ? ((bzvh) a2).b.getResources().getQuantityString(R.plurals.SUCCESSFULLY_RATED_PLACE, intValue2, Integer.valueOf(intValue2)) : ((bzvh) a2).b.getString(R.string.DELETED_RATING));
                    h3.g(new bzvf((bzvh) a2));
                    h3.b(intValue2 > 0 ? ((bzvh) a2).b.getResources().getQuantityString(R.plurals.FAILED_TO_RATE_PLACE_TRY_AGAIN, intValue2, Integer.valueOf(intValue2)) : ((bzvh) a2).b.getString(R.string.FAILED_TO_DELETE_YOUR_RATING_TRY_AGAIN));
                    bzvvVar.e(h3.a());
                } else {
                    ReviewAtAPlaceNotificationAdapter$AdapterParams b8 = b(bzvvVar.b);
                    if (((bzvh) a2).i.e(((bzvh) a2).b)) {
                        Toast.makeText(((bzvh) a2).b, ((bzvh) a2).b.getString(R.string.UNLOCK_SCREEN_AND_TRY_AGAIN), 1).show();
                    }
                    bzuy p = b8.p();
                    p.b(true);
                    bzvvVar.b(p.f());
                    if (!((bzvh) a2).j.j()) {
                        ((bzvh) a2).b.registerReceiver(new bzvg(bzvvVar, b8), new IntentFilter("android.intent.action.USER_PRESENT"));
                    }
                    ((ckcn) ((bzvh) a2).c.a.a(ckdz.at)).a();
                }
            } else if (string.equals("done_button_click")) {
                dbsk.j(((bzvh) a2).j.s().a().a() && !((bzvh) a2).j.s().a().equals(((bzvh) a2).d()), "The user can only click on a DONE button when they have a non-zero rating different from the initial star rating when the notification was triggered, but numRatingStars was %s and initialNumRatingStars is %s", ((bzvh) a2).j.s().a(), ((bzvh) a2).d());
                bzuv a8 = ((bzvh) a2).f.a();
                int intValue3 = ((bzvh) a2).j.s().a().b().intValue();
                long a9 = ((bzvh) a2).j.a();
                bzrm c2 = bzrn.c();
                c2.c(a8.b.getString(R.string.POST_INLINE_RATING_THANKS_NOTIFICATION_BEFORE_TITLE_RATING_TEXT, new Object[]{Integer.valueOf(intValue3)}));
                c2.b(bzuv.a);
                dbsg j = dbsg.j(a8.b(a9, c2.a(), R.string.POST_INLINE_RATING_THANKS_NOTIFICATION_SUBTITLE, a8.a()));
                bzvvVar.c(((bzvh) a2).j.l());
                if (j.a()) {
                    bzvvVar.d((augj) j.b());
                }
            } else {
                bvoo.h("Received unknown actionType: %s", string);
            }
        } finally {
            d();
        }
    }
}
