package defpackage;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.widget.RemoteViews;
import com.google.android.apps.gmm.transit.TransitStationService;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bytn  reason: default package */
/* loaded from: classes4.dex */
public final class bytn {
    private final bytu a;
    private final btvo b;
    private final bytc c;
    private final auhi d;
    private final auhj e;
    private final cqat f;

    public bytn(bytu bytuVar, btvo btvoVar, bytc bytcVar, auhi auhiVar, auhj auhjVar, cqat cqatVar) {
        this.a = bytuVar;
        this.b = btvoVar;
        this.c = bytcVar;
        this.d = auhiVar;
        this.e = auhjVar;
        this.f = cqatVar;
    }

    @dzsi
    private final augc c() {
        aujb g = this.d.g(dpyv.TRANSIT_STATION_FEEDBACK.dm);
        if (g == null) {
            this.c.a(41);
            return null;
        }
        return this.e.b(dpyv.TRANSIT_STATION_FEEDBACK.dm, g);
    }

    private final long d() {
        return this.f.b() + TimeUnit.SECONDS.toMillis(f().n);
    }

    private final void e(augc augcVar) {
        this.d.j(augcVar.a());
    }

    private final dkqz f() {
        dkqz dkqzVar = this.b.getNotificationsParameters().m;
        return dkqzVar == null ? dkqz.ap : dkqzVar;
    }

    public final void a(dpyv dpyvVar) {
        String string;
        if (!f().r || !bytu.d(dpyvVar)) {
            return;
        }
        this.c.a(62);
        augc c = c();
        if (c == null) {
            return;
        }
        bytu bytuVar = this.a;
        byst a = bysu.a();
        a.d(true);
        bysu a2 = a.a();
        long d = d();
        boolean z = f().G;
        boolean z2 = f().D;
        bytuVar.a(c);
        if (z) {
            Resources b = bytuVar.f.b(a2.d());
            bytl.p(bytuVar.e, a2);
            c.f = b.getString(R.string.TRANSIT_GLOBAL_BAN_NOTIFICATION);
            c.P = d;
            c.m = bytu.b(b);
            c.D(b.getColor(R.color.quantum_googblue500));
            c.B(auoe.k(ddcu.JI).i(1, 2131232818, b.getString(R.string.TRANSIT_NOTIFICATION_TURN_OFF), byvv.a(bytu.b, bytuVar.e, TransitStationService.class), auhw.BROADCAST, true));
            c.B(auoe.k(ddcu.JH).i(2, 2131232814, b.getString(R.string.TRANSIT_NOTIFICATION_KEEEP_ON), byvv.a(bytu.c, bytuVar.e, TransitStationService.class), auhw.BROADCAST, true));
        } else {
            Resources b2 = bytuVar.f.b(a2.d());
            RemoteViews c2 = bytuVar.c();
            dpyv dpyvVar2 = dpyv.UNKNOWN_NOTIFICATION_ID;
            if (dpyvVar.ordinal() == 165) {
                string = b2.getString(R.string.SCHEMATIC_MAP_GLOBAL_BAN_NOTIFICATION);
            } else {
                string = b2.getString(R.string.TRANSIT_GLOBAL_BAN_NOTIFICATION);
            }
            c2.setTextViewText(R.id.followup_notification_title, string);
            c2.setOnClickPendingIntent(R.id.followup_alarm_on_icon, PendingIntent.getBroadcast(bytuVar.e, 0, byvv.a(dpyvVar.ordinal() != 165 ? bytu.c : "ACTION_KEEP_ON_SCHEMATIC_MAP_NOTIFICATION", bytuVar.e, TransitStationService.class), 268435456));
            c2.setOnClickPendingIntent(R.id.followup_alarm_off_icon, PendingIntent.getBroadcast(bytuVar.e, 0, byvv.a(dpyvVar.ordinal() != 165 ? bytu.b : "ACTION_TURN_OFF_SCHEMATIC_MAP_NOTIFICATION", bytuVar.e, TransitStationService.class), 268435456));
            c.i = c2;
        }
        e(c);
    }

    public final void b(bysu bysuVar, dpyv dpyvVar) {
        String string;
        String string2;
        if (!f().s || !bytu.d(dpyvVar)) {
            return;
        }
        this.c.a(63);
        augc c = c();
        if (c == null) {
            return;
        }
        bytu bytuVar = this.a;
        long d = d();
        boolean z = f().G;
        boolean z2 = f().D;
        bytuVar.a(c);
        if (!z) {
            String d2 = bysuVar.d();
            Resources b = bytuVar.f.b(d2);
            RemoteViews c2 = bytuVar.c();
            dpyv dpyvVar2 = dpyv.UNKNOWN_NOTIFICATION_ID;
            if (dpyvVar.ordinal() == 165) {
                string = b.getString(R.string.SCHEMATIC_MAP_PER_STATION_BAN_NOTIFICATION_TITLE);
            } else {
                string = b.getString(R.string.TRANSIT_PER_STATION_BAN_NOTIFICATION_TITLE);
            }
            c2.setTextViewText(R.id.followup_notification_title, string);
            if (dpyvVar.ordinal() == 165) {
                string2 = b.getString(R.string.SCHEMATIC_MAP_STATION_BAN_NOTIFICATION_TEXT, bysuVar.c());
            } else {
                string2 = b.getString(R.string.TRANSIT_PER_STATION_BAN_NOTIFICATION_TEXT, bysuVar.c());
            }
            c2.setTextViewText(R.id.followup_notification_text, string2);
            c2.setOnClickPendingIntent(R.id.followup_alarm_on_icon, PendingIntent.getBroadcast(bytuVar.e, 0, byvv.a(dpyvVar.ordinal() != 165 ? bytu.d : "ACTION_KEEP_ON_SCHEMATIC_MAP_NOTIFICATION_FOR_STATION", bytuVar.e, TransitStationService.class).putExtra("EXTRA_TRANSIT_STATION_NAME", bysuVar.c()).putExtra("EXTRA_TRANSIT_STATION_LOCALE", d2).putExtra("EXTRA_TRANSIT_STATION_FEATURE_ID", bysuVar.b()).putExtra("EXTRA_IS_REALTIME_INFORMATION_AVAILABLE", bysuVar.e()).putExtra("EXTRA_IS_ALERT_INFORMATION_AVAILABLE", bysuVar.f()), 268435456));
            c2.setOnClickPendingIntent(R.id.followup_alarm_off_icon, PendingIntent.getBroadcast(bytuVar.e, 0, byvv.a(dpyvVar.ordinal() != 165 ? bytu.a : "ACTION_TURN_OFF_SCHEMATIC_MAP_NOTIFICATION_FOR_STATION", bytuVar.e, TransitStationService.class).putExtra("EXTRA_TRANSIT_STATION_NAME", bysuVar.c()).putExtra("EXTRA_TRANSIT_STATION_LOCALE", d2).putExtra("EXTRA_TRANSIT_STATION_FEATURE_ID", bysuVar.b()).putExtra("EXTRA_IS_REALTIME_INFORMATION_AVAILABLE", bysuVar.e()).putExtra("EXTRA_IS_ALERT_INFORMATION_AVAILABLE", bysuVar.f()), 268435456));
            c.i = c2;
        } else {
            bytl.p(bytuVar.e, bysuVar);
            String d3 = bysuVar.d();
            Resources b2 = bytuVar.f.b(d3);
            c.f = b2.getString(R.string.TRANSIT_PER_STATION_BAN_NOTIFICATION_TITLE);
            c.g = b2.getString(R.string.TRANSIT_PER_STATION_BAN_NOTIFICATION_TEXT, bysuVar.c());
            c.P = d;
            c.m = bytu.b(b2);
            c.D(b2.getColor(R.color.quantum_googblue500));
            c.B(auoe.k(ddcu.JO).i(1, 2131232818, b2.getString(R.string.TRANSIT_NOTIFICATION_TURN_OFF), byvv.a(bytu.a, bytuVar.e, TransitStationService.class).putExtra("EXTRA_TRANSIT_STATION_NAME", bysuVar.c()).putExtra("EXTRA_TRANSIT_STATION_LOCALE", d3).putExtra("EXTRA_TRANSIT_STATION_FEATURE_ID", bysuVar.b()).putExtra("EXTRA_IS_REALTIME_INFORMATION_AVAILABLE", bysuVar.e()).putExtra("EXTRA_IS_ALERT_INFORMATION_AVAILABLE", bysuVar.f()), auhw.BROADCAST, true));
            c.B(auoe.k(ddcu.JN).i(2, 2131232814, b2.getString(R.string.TRANSIT_NOTIFICATION_KEEEP_ON), byvv.a(bytu.d, bytuVar.e, TransitStationService.class).putExtra("EXTRA_TRANSIT_STATION_NAME", bysuVar.c()).putExtra("EXTRA_TRANSIT_STATION_LOCALE", d3).putExtra("EXTRA_TRANSIT_STATION_FEATURE_ID", bysuVar.b()).putExtra("EXTRA_IS_REALTIME_INFORMATION_AVAILABLE", bysuVar.e()).putExtra("EXTRA_IS_ALERT_INFORMATION_AVAILABLE", bysuVar.f()), auhw.BROADCAST, true));
        }
        e(c);
    }
}
