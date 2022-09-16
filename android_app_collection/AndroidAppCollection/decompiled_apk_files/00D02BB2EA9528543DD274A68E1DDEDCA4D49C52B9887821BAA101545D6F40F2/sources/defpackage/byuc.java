package defpackage;

import android.app.Application;
import android.content.Intent;
import com.google.android.apps.gmm.transit.TransitStationService;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: byuc  reason: default package */
/* loaded from: classes4.dex */
public final class byuc {
    public final Application a;
    private final auhi b;
    private final auhj c;
    private final bysw d;
    private final bytc e;

    public byuc(auhi auhiVar, auhj auhjVar, bysw byswVar, bytc bytcVar, Application application) {
        this.b = auhiVar;
        this.c = auhjVar;
        this.d = byswVar;
        this.e = bytcVar;
        this.a = application;
    }

    @dzsi
    public final augc a(bzjj bzjjVar, Intent intent, Intent intent2, boolean z, boolean z2, ddzg ddzgVar, boolean z3, long j) {
        aujb g = this.b.g(dpyv.TRANSIT_STATION.dm);
        if (g == null) {
            this.e.a(41);
            return null;
        }
        augc b = this.c.b(dpyv.TRANSIT_STATION.dm, g);
        b.T = akqi.b(bzjjVar.c);
        b.w(2131232602);
        b.D(akm.c(this.a, R.color.quantum_googblue));
        b.E(intent, auhw.BROADCAST);
        b.m(intent2, auhw.BROADCAST);
        b.v = this.d.c();
        b.H(0);
        b.C(true);
        b.P = j;
        b.I();
        b.O = !z3;
        if (this.d.e().W) {
            b.J = ddzgVar;
        }
        if (z) {
            b.B(auoe.k(ddcu.JJ).i(1, 2131232818, this.a.getString(R.string.TRANSIT_NOTIFICATION_INLINE_DISABLE), byvv.a(bytu.b, this.a, TransitStationService.class), auhw.BROADCAST, true));
            if (z2) {
                b.B(auoe.k(ddcu.JL).i(2, 2131232634, this.a.getString(R.string.TRANSIT_STATION_INLINE_LOCATION_ACCURACY_SURVEY_HERE), byvv.a(byti.d, this.a, TransitStationService.class), auhw.BROADCAST, true));
                b.B(auoe.k(ddcu.JM).i(3, 2131232577, this.a.getString(R.string.TRANSIT_STATION_INLINE_LOCATION_ACCURACY_SURVEY_NOT_HERE), byvv.a(byti.e, this.a, TransitStationService.class), auhw.BROADCAST, true));
            }
        }
        return b;
    }
}
