package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
/* compiled from: PG */
/* renamed from: sd  reason: default package */
/* loaded from: classes.dex */
final class sd {
    public static sd a;
    public final Context b;
    public final sc c = new sc();
    private final LocationManager d;

    public sd(Context context, LocationManager locationManager) {
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
