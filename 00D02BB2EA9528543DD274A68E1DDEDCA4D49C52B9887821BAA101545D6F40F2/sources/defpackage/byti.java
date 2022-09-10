package defpackage;

import android.app.Application;
import android.content.Intent;
import android.widget.RemoteViews;
import com.google.android.apps.gmm.transit.TransitStationService;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: byti  reason: default package */
/* loaded from: classes4.dex */
public final class byti {
    static final String a = String.valueOf(byti.class.getCanonicalName()).concat(".ACTION_USER_SATISFACTION_NOTIFICATION_RESPONSE_HELPFUL");
    static final String b = String.valueOf(byti.class.getCanonicalName()).concat(".ACTION_USER_SATISFACTION_NOTIFICATION_RESPONSE_NOT_HELPFUL");
    static final String c = String.valueOf(byti.class.getCanonicalName()).concat(".ACTION_LOCATION_ACCURACY_NOTIFICATION_RESPONSE_YES");
    static final String d = String.valueOf(bytu.class.getCanonicalName()).concat(".ACTION_INLINE_LOCATION_ACCURACY_SURVEY_HERE");
    static final String e = String.valueOf(bytu.class.getCanonicalName()).concat(".ACTION_INLINE_LOCATION_ACCURACY_SURVEY_NOT_HERE");
    static final String f = String.valueOf(byti.class.getCanonicalName()).concat(".ACTION_LOCATION_ACCURACY_NOTIFICATION_RESPONSE_NO");
    public final Application g;
    public final bysw h;

    public byti(Application application, bysw byswVar) {
        this.g = application;
        this.h = byswVar;
    }

    public final Intent a(String str, akqq akqqVar) {
        return byvv.a(str, this.g, TransitStationService.class).putExtra("EXTRA_STATION_LATITUDE", akqqVar.a).putExtra("EXTRA_STATION_LONGITUDE", akqqVar.b);
    }

    public final RemoteViews c() {
        return new RemoteViews(this.g.getPackageName(), (int) R.layout.transit_station_happiness);
    }

    public final Intent b(boolean z, akqq akqqVar, boolean z2, boolean z3) {
        return a(z ? a : b, akqqVar).putExtra("EXTRA_IS_REALTIME_INFORMATION_AVAILABLE", z2).putExtra("EXTRA_IS_ALERT_INFORMATION_AVAILABLE", z3);
    }
}
