package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gmm.transit.TransitStationService;
import com.google.android.filament.R;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.NearbyAlertFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: byvp  reason: default package */
/* loaded from: classes4.dex */
public final class byvp implements degu<dbsg<Boolean>> {
    final /* synthetic */ TransitStationService a;

    public byvp(TransitStationService transitStationService) {
        this.a = transitStationService;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.u.e(ckhs.EXCEPTION);
        bvoo.k(th);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dbsg<Boolean> dbsgVar) {
        NearbyAlertFilter nearbyAlertFilter;
        bytc bytcVar;
        int i;
        dbsg<Boolean> dbsgVar2 = dbsgVar;
        this.a.u.e((ckhs) dbsgVar2.h(byvo.a).c(ckhs.NOT_SIGNED_IN));
        TransitStationService transitStationService = this.a;
        boolean booleanValue = dbsgVar2.c(false).booleanValue();
        transitStationService.v.a(150);
        if (!booleanValue) {
            transitStationService.ab.a();
        }
        if (transitStationService.i().C) {
            nearbyAlertFilter = NearbyAlertFilter.b(dcdc.f(1030));
        } else if (TextUtils.isEmpty("_transit_stations_")) {
            throw new IllegalArgumentException("NearbyAlertFilters must contain a non empty chain name to match results with.");
        } else {
            nearbyAlertFilter = new NearbyAlertFilter(null, null, "_transit_stations_", false);
        }
        NearbyAlertRequest nearbyAlertRequest = new NearbyAlertRequest(7, transitStationService.P.e().b, null, nearbyAlertFilter, false, 0, R.styleable.AppCompatTheme_textColorAlertDialogListItem);
        PendingIntent b = transitStationService.F.b(TransitStationService.i, 134217728);
        if (!transitStationService.O.a()) {
            return;
        }
        byuk byukVar = transitStationService.O;
        copm copmVar = byukVar.b;
        GoogleApiClient googleApiClient = byukVar.a;
        dbsk.s(googleApiClient);
        cnwc.n(b, "callbackIntent == null");
        Status status = (Status) googleApiClient.execute(new copi(cool.d, googleApiClient, b)).f();
        if (booleanValue) {
            byuk byukVar2 = transitStationService.O;
            byukVar2.c();
            copm copmVar2 = byukVar2.b;
            GoogleApiClient googleApiClient2 = byukVar2.a;
            dbsk.s(googleApiClient2);
            cnwc.n(b, "callbackIntent == null");
            Status status2 = (Status) googleApiClient2.execute(new copk(cool.d, googleApiClient2, nearbyAlertRequest, b)).f();
            if (!status2.d()) {
                String str = status2.h;
                bytcVar = transitStationService.v;
                i = 17;
            } else {
                bytcVar = transitStationService.v;
                i = 78;
            }
            bytcVar.a(i);
        }
        if (!booleanValue) {
            transitStationService.f();
            transitStationService.n();
        }
        long millis = TimeUnit.MINUTES.toMillis(transitStationService.i().B);
        if (millis <= 0) {
            return;
        }
        Intent intent = new Intent(TransitStationService.c, Uri.EMPTY, transitStationService.C, TransitStationService.class);
        intent.putExtra("EXTRA_REREGISTER_TRIGGER", "ELAPSED_TIME");
        transitStationService.K.set(0, transitStationService.r.b() + millis, transitStationService.F.a(intent, 134217728));
    }
}
