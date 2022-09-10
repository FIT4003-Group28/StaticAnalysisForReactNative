package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.RemoteViews;
import com.google.android.apps.maps.R;
import java.util.Random;
/* compiled from: PG */
/* renamed from: bytg  reason: default package */
/* loaded from: classes4.dex */
public final class bytg {
    public final Application a;
    private final byti b;
    private final bysw c;
    private final btvo d;
    private final bytc e;
    private final auhi f;
    private final auhj g;
    private final byth h;
    private final cklv i;

    public bytg(byti bytiVar, btvo btvoVar, bysw byswVar, bytc bytcVar, auhi auhiVar, auhj auhjVar, byth bythVar, cklv cklvVar, Application application) {
        this.b = bytiVar;
        this.c = byswVar;
        this.d = btvoVar;
        this.e = bytcVar;
        this.f = auhiVar;
        this.g = auhjVar;
        this.h = bythVar;
        this.i = cklvVar;
        this.a = application;
    }

    private static boolean c(int i) {
        return new Random().nextInt(100) < i;
    }

    private final dkqz d() {
        dkqz dkqzVar = this.d.getNotificationsParameters().m;
        return dkqzVar == null ? dkqz.ap : dkqzVar;
    }

    public final void a(bzjj bzjjVar, akqq akqqVar, boolean z, boolean z2, CharSequence charSequence, boolean z3) {
        boolean z4;
        if (c(this.c.e().o)) {
            z4 = z3;
        } else if (!z3) {
            return;
        } else {
            z4 = true;
        }
        if (!this.h.b() || z4) {
            aujb g = this.f.g(dpyv.TRANSIT_STATION_FEEDBACK.dm);
            if (g == null) {
                this.e.a(41);
                return;
            }
            augc b = this.g.b(dpyv.TRANSIT_STATION_FEEDBACK.dm, g);
            if (z4 || !c(d().u) || !d().p) {
                if (d().q) {
                    if (z4) {
                        this.e.a(253);
                    } else {
                        this.e.a(92);
                    }
                    byti bytiVar = this.b;
                    String str = bzjjVar.c;
                    String str2 = bzjjVar.b;
                    boolean z5 = d().K;
                    Resources b2 = this.i.b(bzjjVar.h);
                    RemoteViews c = bytiVar.c();
                    if (Build.VERSION.SDK_INT > 23) {
                        c.setViewVisibility(R.id.transit_notification_header, 0);
                    }
                    c.setImageViewResource(R.id.feedback_button_left, 2131232634);
                    c.setImageViewResource(R.id.feedback_button_right, 2131232577);
                    c.setTextViewText(R.id.transit_notification_app_name, charSequence);
                    c.setOnClickPendingIntent(R.id.feedback_button_left, PendingIntent.getBroadcast(bytiVar.g, 0, bytiVar.a(byti.c, akqqVar).putExtra("EXTRA_TRANSIT_STATION_FEATURE_ID", str), 268435456));
                    c.setOnClickPendingIntent(R.id.feedback_button_right, PendingIntent.getBroadcast(bytiVar.g, 0, bytiVar.a(byti.f, akqqVar), 268435456));
                    c.setTextViewText(R.id.feedback_notification_title, b2.getString(R.string.TRANSIT_STATION_LOCATION_ACCURACY_NOTIFICATION_TITLE));
                    c.setTextViewText(R.id.feedback_notification_text, b2.getString(R.string.TRANSIT_STATION_LOCATION_ACCURACY_NOTIFICATION_TEXT, str2));
                    b.i = c;
                    b.v = bytiVar.h.c();
                    b.H(0);
                    b.C(true);
                    b.I();
                    b.a();
                }
            } else {
                this.e.a(91);
                byti bytiVar2 = this.b;
                boolean z6 = d().K;
                RemoteViews c2 = bytiVar2.c();
                if (Build.VERSION.SDK_INT > 23) {
                    c2.setViewVisibility(R.id.transit_notification_header, 0);
                }
                int i = 2131232944;
                c2.setImageViewResource(R.id.feedback_button_left, z6 ? 2131232944 : 2131232939);
                if (true == z6) {
                    i = 2131232939;
                }
                c2.setImageViewResource(R.id.feedback_button_right, i);
                c2.setTextViewText(R.id.transit_notification_app_name, charSequence);
                c2.setOnClickPendingIntent(R.id.feedback_button_left, PendingIntent.getBroadcast(bytiVar2.g, 0, bytiVar2.b(z6, akqqVar, z, z2), 268435456));
                c2.setOnClickPendingIntent(R.id.feedback_button_right, PendingIntent.getBroadcast(bytiVar2.g, 0, bytiVar2.b(!z6, akqqVar, z, z2), 268435456));
                c2.setTextViewText(R.id.feedback_notification_title, bytiVar2.g.getString(R.string.TRANSIT_STATION_USER_SATISFACTION_NOTIFICATION_TITLE));
                c2.setTextViewText(R.id.feedback_notification_text, bytiVar2.g.getString(R.string.TRANSIT_STATION_USER_SATISFACTION_NOTIFICATION_TEXT));
                b.i = c2;
                b.w(2131232783);
                b.v = bytiVar2.h.c();
                b.H(0);
                b.C(true);
                b.I();
                b.a();
            }
            this.f.j(b.a());
        }
    }

    public final void b() {
        new Handler(Looper.getMainLooper()).post(new bytf(this));
    }
}
