package defpackage;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gmm.navigation.service.detection.ActivityRecognitionReceiver;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: asav  reason: default package */
/* loaded from: classes2.dex */
public final class asav {
    private static final long c = TimeUnit.MINUTES.toMillis(3);
    private static final long[] d = {0};
    public final cjqy a;
    public cjql b;
    private final Context e;
    private final cqat f;
    private final NotificationManager g;
    private final AlarmManager h;
    private final PendingIntent i;
    private final aukk j;
    private final cjqq k;

    public asav(Context context, cqat cqatVar, aukk aukkVar, cjqy cjqyVar, cjqq cjqqVar) {
        this.e = context;
        this.f = cqatVar;
        this.j = aukkVar;
        this.a = cjqyVar;
        this.k = cjqqVar;
        this.g = (NotificationManager) context.getSystemService("notification");
        this.h = (AlarmManager) context.getSystemService("alarm");
        Intent intent = new Intent(context, ActivityRecognitionReceiver.class);
        intent.setAction("TIMEOUT_NOTIFICATION");
        this.i = PendingIntent.getBroadcast(context, 0, intent, 268435456);
    }

    public final void a(List<asau> list) {
        String string = this.e.getString(R.string.FREE_NAV_DRIVING_DETECTED_NOTIFICATION_TITLE);
        String string2 = this.e.getString(R.string.FREE_NAV_DRIVING_DETECTED_NOTIFICATION_MESSAGE);
        if (!list.isEmpty()) {
            if (list.size() > 2) {
                list = list.subList(0, 2);
            }
            StringBuilder sb = new StringBuilder();
            for (asau asauVar : list) {
                if (sb.length() != 0) {
                    sb.append("  •  ");
                }
                Context context = this.e;
                sb.append(context.getString(R.string.FREE_NAV_DRIVING_DETECTED_NOTIFICATION_TIME_TO_DESTINATION, bvtb.e(context.getResources(), asauVar.b, bvsz.ABBREVIATED), asauVar.a));
            }
            string2 = sb.toString();
        }
        ib ibVar = new ib(this.e.getApplicationContext());
        ibVar.t(2131231959);
        ibVar.l(string);
        ibVar.k(string2);
        Intent intent = new Intent(this.e, ActivityRecognitionReceiver.class);
        intent.setAction("ACCEPT_NOTIFICATION");
        ibVar.g = PendingIntent.getBroadcast(this.e, 0, intent, 268435456);
        Intent intent2 = new Intent(this.e, ActivityRecognitionReceiver.class);
        intent2.setAction("DECLINE_NOTIFICATION");
        ibVar.n(PendingIntent.getBroadcast(this.e, 0, intent2, 268435456));
        ibVar.k = 2;
        ibVar.B = this.e.getResources().getColor(R.color.heads_up_navigation_notification_background);
        ibVar.C = 1;
        ibVar.y(d);
        ibVar.r(false);
        if (ako.a()) {
            this.j.a(false);
            ibVar.G = "OtherChannel";
        }
        try {
            this.g.notify(dpyv.NAVIGATION_START_DRIVING_MODE.dm, ibVar.b());
            this.b = this.k.g().d(cjtd.a(dtxn.eN));
        } catch (RuntimeException unused) {
        }
        this.h.set(3, this.f.e() + c, this.i);
    }

    public final void b() {
        this.g.cancel(dpyv.NAVIGATION_START_DRIVING_MODE.dm);
        this.h.cancel(this.i);
    }
}
