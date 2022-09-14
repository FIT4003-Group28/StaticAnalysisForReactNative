package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
/* loaded from: classes.dex */
class l {

    /* renamed from: d  reason: collision with root package name */
    private static l f962d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f963a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f964b;

    /* renamed from: c  reason: collision with root package name */
    private final a f965c = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f966a;

        /* renamed from: b  reason: collision with root package name */
        long f967b;

        /* renamed from: c  reason: collision with root package name */
        long f968c;

        /* renamed from: d  reason: collision with root package name */
        long f969d;

        /* renamed from: e  reason: collision with root package name */
        long f970e;

        /* renamed from: f  reason: collision with root package name */
        long f971f;

        a() {
        }
    }

    l(Context context, LocationManager locationManager) {
        this.f963a = context;
        this.f964b = locationManager;
    }

    private Location a(String str) {
        try {
            if (!this.f964b.isProviderEnabled(str)) {
                return null;
            }
            return this.f964b.getLastKnownLocation(str);
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l a(Context context) {
        if (f962d == null) {
            Context applicationContext = context.getApplicationContext();
            f962d = new l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f962d;
    }

    private void a(Location location) {
        long j;
        a aVar = this.f965c;
        long currentTimeMillis = System.currentTimeMillis();
        k a2 = k.a();
        a2.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a2.f959a;
        a2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a2.f961c == 1;
        long j3 = a2.f960b;
        long j4 = a2.f959a;
        boolean z2 = z;
        a2.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = a2.f960b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar.f966a = z2;
        aVar.f967b = j2;
        aVar.f968c = j3;
        aVar.f969d = j4;
        aVar.f970e = j5;
        aVar.f971f = j;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location = null;
        Location a2 = a.g.e.e.a(this.f963a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? a("network") : null;
        if (a.g.e.e.a(this.f963a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = a("gps");
        }
        return (location == null || a2 == null) ? location != null ? location : a2 : location.getTime() > a2.getTime() ? location : a2;
    }

    private boolean c() {
        return this.f965c.f971f > System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        a aVar = this.f965c;
        if (c()) {
            return aVar.f966a;
        }
        Location b2 = b();
        if (b2 != null) {
            a(b2);
            return aVar.f966a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
