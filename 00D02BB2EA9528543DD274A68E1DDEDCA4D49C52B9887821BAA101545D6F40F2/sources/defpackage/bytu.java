package defpackage;

import android.app.Application;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bytu  reason: default package */
/* loaded from: classes4.dex */
public final class bytu {
    static final String a = String.valueOf(bytu.class.getCanonicalName()).concat(".ACTION_TURN_OFF_STATION");
    static final String b = String.valueOf(bytu.class.getCanonicalName()).concat(".ACTION_TURN_OFF");
    static final String c = String.valueOf(bytu.class.getCanonicalName()).concat(".ACTION_KEEP_ON");
    static final String d = String.valueOf(bytu.class.getCanonicalName()).concat(".ACTION_KEEP_ON_STATION");
    public final Application e;
    public final cklv f;
    private final bysw g;

    public bytu(Application application, bysw byswVar, cklv cklvVar) {
        this.e = application;
        this.g = byswVar;
        this.f = cklvVar;
    }

    public static Bitmap b(Resources resources) {
        return bvlf.a(bvly.a().b(resources, R.raw.transit_departure_board), resources.getDimensionPixelSize(R.dimen.notification_large_icon_width), resources.getDimensionPixelSize(R.dimen.notification_large_icon_height), Bitmap.Config.ARGB_8888);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean d(dpyv dpyvVar) {
        return dpyvVar == dpyv.TRANSIT_STATION || dpyvVar == dpyv.TRANSIT_SCHEMATIC_MAP;
    }

    public final void a(augc augcVar) {
        augcVar.w(2131232783);
        augcVar.v = this.g.c();
    }

    public final RemoteViews c() {
        return new RemoteViews(this.e.getPackageName(), (int) R.layout.transit_station_followup);
    }
}
