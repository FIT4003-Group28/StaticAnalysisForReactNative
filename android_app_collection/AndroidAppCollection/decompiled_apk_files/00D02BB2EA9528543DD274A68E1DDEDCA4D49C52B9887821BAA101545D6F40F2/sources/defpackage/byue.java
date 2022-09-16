package defpackage;

import android.app.Application;
import android.content.Intent;
import com.google.android.apps.gmm.transit.TransitStationService;
/* compiled from: PG */
/* renamed from: byue  reason: default package */
/* loaded from: classes4.dex */
public final class byue {
    public final byut a;
    public final bytg b;
    public final Application c;
    public final byuc d;
    public final auhi e;
    public final byud f;
    public final btvo g;
    public final bytc h;
    public final byuf i;

    public byue(byut byutVar, bytg bytgVar, Application application, byuc byucVar, auhi auhiVar, byud byudVar, btvo btvoVar, bytc bytcVar, byuf byufVar) {
        this.a = byutVar;
        this.b = bytgVar;
        this.c = application;
        this.d = byucVar;
        this.e = auhiVar;
        this.f = byudVar;
        this.g = btvoVar;
        this.h = bytcVar;
        this.i = byufVar;
    }

    public final void a() {
        this.e.m(dpyv.TRANSIT_STATION.dm);
    }

    public final void b() {
        this.e.m(dpyv.TRANSIT_STATION_FEEDBACK.dm);
    }

    public final Intent c(bzjj bzjjVar) {
        Application application = this.c;
        String str = bzjjVar.h;
        String str2 = bzjjVar.b;
        return byvv.a(TransitStationService.g, application, TransitStationService.class).putExtra("EXTRA_TRANSIT_STATION_NAME", str2).putExtra("EXTRA_TRANSIT_STATION_LOCALE", str).putExtra("EXTRA_TRANSIT_STATION_FEATURE_ID", bzjjVar.c);
    }

    public final Intent d(bzjj bzjjVar, boolean z, boolean z2) {
        return TransitStationService.k(TransitStationService.h, this.c, bzjjVar.h, bzjjVar.b, bzjjVar.c, z, z2);
    }
}
