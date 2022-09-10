package defpackage;

import android.location.Location;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: crnj  reason: default package */
/* loaded from: classes5.dex */
public final class crnj {
    public final dclb<String> a = dcci.n();
    final cjse b = new cjse();
    final cjse c = new cjse();
    final cjse d = new cjse();
    double e;
    @dzsi
    public Location f;
    @dzsi
    public GmmLocation g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(Location location) {
        if (location == null) {
            return;
        }
        this.a.add(location.getProvider());
        String provider = location.getProvider();
        if (!"gps".equals(provider) && !"fused".equals(provider)) {
            return;
        }
        Location location2 = this.f;
        if (location2 != null && location2.hasSpeed() && location2.hasBearing()) {
            float max = Math.max(0.0f, ((float) (location.getTime() - location2.getTime())) / 1000.0f);
            double bearing = location2.getBearing();
            Double.isNaN(bearing);
            double d = bearing * 0.017453292519943295d;
            double speed = location2.getSpeed() * max;
            double cos = Math.cos(d);
            double cos2 = Math.cos(location2.getLatitude() * 0.017453292519943295d);
            double sin = Math.sin(d);
            amvs amvsVar = new amvs();
            double latitude = location2.getLatitude();
            Double.isNaN(speed);
            double d2 = latitude + (((cos * speed) * 180.0d) / 2.0015115070354454E7d);
            double longitude = location2.getLongitude();
            Double.isNaN(speed);
            amvsVar.v(d2, longitude + (((speed * sin) * 180.0d) / (cos2 * 2.0015115070354454E7d)));
            this.d.a(location.distanceTo(amvsVar.d()));
        }
        if (location.hasAccuracy()) {
            this.c.a(location.getAccuracy());
        }
        this.f = location;
    }

    @dzsi
    public final synchronized int b() {
        int i;
        if (this.a.isEmpty()) {
            return 0;
        }
        String str = (String) new crni(this).b().j(this.a.j());
        if ("network".equals(str)) {
            i = 2;
        } else if ("gps".equals(str)) {
            i = 1;
        } else if (!"fused".equals(str)) {
            return 0;
        } else {
            i = 3;
        }
        return i;
    }
}
