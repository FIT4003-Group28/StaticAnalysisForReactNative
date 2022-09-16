package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
/* compiled from: PG */
/* renamed from: pg  reason: default package */
/* loaded from: classes4.dex */
final class pg {
    public static pg a;
    public final Context b;
    public final pf c = new pf();
    private final LocationManager d;

    public pg(Context context, LocationManager locationManager) {
        this.b = context;
        this.d = locationManager;
    }

    public final Location a(String str) {
        try {
            if (!this.d.isProviderEnabled(str)) {
                return null;
            }
            return this.d.getLastKnownLocation(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
