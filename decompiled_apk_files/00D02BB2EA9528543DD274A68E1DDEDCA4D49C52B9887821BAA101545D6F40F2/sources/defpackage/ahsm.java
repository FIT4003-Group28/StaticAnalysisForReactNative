package defpackage;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ahsm  reason: default package */
/* loaded from: classes.dex */
public class ahsm {
    public static final String EXTRA_KEY_LOCATION_TYPE = "locationType";
    public static final String SATELLITE_BUNDLE_STRING = "satellites";
    protected final Location location;

    /* JADX INFO: Access modifiers changed from: protected */
    public ahsm(Location location) {
        this.location = location;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Location buildLocation(String str, double d, double d2, @dzsi Long l, @dzsi Double d3, @dzsi Float f, @dzsi Float f2, @dzsi Float f3, float f4, float f5, float f6, @dzsi Integer num, @dzsi Integer num2) {
        return locationBuilder(str, d, d2, l, d3, f, f2, f3, f4, f5, f6, num, num2).d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static amvs locationBuilder(String str, double d, double d2, @dzsi Long l, @dzsi Double d3, @dzsi Float f, @dzsi Float f2, @dzsi Float f3, float f4, float f5, float f6, @dzsi Integer num, @dzsi Integer num2) {
        amvs amvsVar = new amvs();
        amvsVar.g = str;
        amvsVar.v(d, d2);
        if (l != null) {
            amvsVar.C(l.longValue());
        } else {
            amvsVar.C(System.currentTimeMillis());
        }
        if (d3 != null) {
            amvsVar.o(d3.doubleValue());
        }
        if (f != null) {
            amvsVar.p(f.floatValue());
        }
        if (f2 != null) {
            amvsVar.B(f2.floatValue());
        }
        if (f3 != null) {
            amvsVar.n(f3.floatValue());
        }
        amvsVar.j = f4;
        amvsVar.k = f5;
        amvsVar.l = f6;
        if (num != null || num2 != null) {
            Bundle bundle = new Bundle();
            if (num != null) {
                bundle.putInt(SATELLITE_BUNDLE_STRING, num.intValue());
            }
            if (num2 != null) {
                bundle.putInt("locationType", num2.intValue());
            }
            amvsVar.q(bundle);
        }
        return amvsVar;
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof ahsm)) {
            return false;
        }
        return dbsd.a(this.location, ((ahsm) obj).location);
    }

    @ckom(a = "accuracy")
    public Float getAccuracy() {
        return Float.valueOf(this.location.getAccuracy());
    }

    @ckom(a = "altitude")
    public Double getAltitude() {
        return Double.valueOf(this.location.getAltitude());
    }

    @ckom(a = "bearing")
    public Float getBearing() {
        return Float.valueOf(this.location.getBearing());
    }

    @ckom(a = "bearingAcc")
    public float getBearingAccuracyDegrees() {
        return this.location.getBearingAccuracyDegrees();
    }

    @ckom(a = "fusedLocationType")
    public Integer getFusedLocationType() {
        if (!hasFusedLocationType()) {
            return -1;
        }
        return Integer.valueOf(this.location.getExtras().getInt("locationType"));
    }

    @ckom(a = "lat")
    public double getLatitude() {
        return this.location.getLatitude();
    }

    public Location getLocation() {
        int i = ckfu.a;
        return this.location;
    }

    @ckom(a = "lng")
    public double getLongitude() {
        return this.location.getLongitude();
    }

    @ckom(a = "numSatellites")
    public Integer getNumSatellites() {
        dbsk.l(hasNumSatellites());
        Location location = this.location;
        if (!(location instanceof GmmLocation) || !((GmmLocation) location).j()) {
            return Integer.valueOf(this.location.getExtras().getInt(SATELLITE_BUNDLE_STRING));
        }
        amvt amvtVar = ((GmmLocation) this.location).m;
        return Integer.valueOf(amvtVar != null ? amvtVar.b : -1);
    }

    @ckom(a = "provider")
    public String getProvider() {
        return this.location.getProvider();
    }

    @ckom(a = "speed")
    public Float getSpeed() {
        return Float.valueOf(this.location.getSpeed());
    }

    @ckom(a = "speedAcc")
    public float getSpeedAccuracyMetersPerSecond() {
        return this.location.getSpeedAccuracyMetersPerSecond();
    }

    @ckom(a = "time")
    public Long getTime() {
        return Long.valueOf(this.location.getTime());
    }

    @ckom(a = "vertAcc")
    public float getVerticalAccuracyMeters() {
        return this.location.getVerticalAccuracyMeters();
    }

    @ckon(a = "accuracy")
    public boolean hasAccuracy() {
        return this.location.hasAccuracy();
    }

    @ckon(a = "altitude")
    public boolean hasAltitude() {
        return this.location.hasAltitude();
    }

    @ckon(a = "bearing")
    public boolean hasBearing() {
        return this.location.hasBearing();
    }

    @ckon(a = "bearingAcc")
    public boolean hasBearingAccuracy() {
        return Build.VERSION.SDK_INT >= 26 && this.location.hasBearingAccuracy();
    }

    @ckon(a = "fusedLocationType")
    public boolean hasFusedLocationType() {
        return this.location.getExtras() != null && this.location.getExtras().containsKey("locationType");
    }

    @ckon(a = "numSatellites")
    public boolean hasNumSatellites() {
        Location location = this.location;
        if (!(location instanceof GmmLocation) || !((GmmLocation) location).j()) {
            return this.location.getExtras() != null && this.location.getExtras().containsKey(SATELLITE_BUNDLE_STRING);
        }
        return true;
    }

    @ckon(a = "speed")
    public boolean hasSpeed() {
        return this.location.hasSpeed();
    }

    @ckon(a = "speedAcc")
    public boolean hasSpeedAccuracy() {
        return Build.VERSION.SDK_INT >= 26 && this.location.hasSpeedAccuracy();
    }

    @ckon(a = "vertAcc")
    public boolean hasVerticalAccuracy() {
        return Build.VERSION.SDK_INT >= 26 && this.location.hasVerticalAccuracy();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.location});
    }

    public String toRuntrackString(String str) {
        StringBuilder sb = new StringBuilder();
        if (String.valueOf(getProvider()).length() == 0) {
            new String("Accuracy: ");
        }
        if (hasSpeed() && hasBearing()) {
            akra e = akra.e(getLatitude(), getLongitude());
            akra akraVar = new akra();
            float floatValue = getBearing().floatValue();
            double floatValue2 = getSpeed().floatValue();
            double r = e.r();
            Double.isNaN(floatValue2);
            double d = (float) (floatValue2 * r);
            double d2 = (floatValue * 3.1415927f) / 180.0f;
            double sin = Math.sin(d2);
            Double.isNaN(d);
            double cos = Math.cos(d2);
            Double.isNaN(d);
            akraVar.t((int) (sin * d), (int) (d * cos));
            Arrays.asList(e, akraVar.C(e));
            sb.append("");
        }
        if (hasAccuracy()) {
            akra.e(getLatitude(), getLongitude());
            getAccuracy();
            sb.append("");
        }
        return sb.toString();
    }

    public String toString() {
        dbsb b = dbsc.b(this);
        b.b("provider", getProvider());
        b.d("lat", getLatitude());
        b.d("lng", getLongitude());
        b.b("time", getTime());
        if (hasAltitude()) {
            b.b("altitude", getAltitude());
        }
        if (hasBearing()) {
            b.b("bearing", getBearing());
        }
        if (hasSpeed()) {
            b.b("speed", getSpeed());
        }
        if (hasAccuracy()) {
            b.b("accuracy", getAccuracy());
        }
        if (hasSpeedAccuracy()) {
            b.e("speedAcc", getSpeedAccuracyMetersPerSecond());
        }
        if (hasBearingAccuracy()) {
            b.e("bearingAcc", getBearingAccuracyDegrees());
        }
        if (hasVerticalAccuracy()) {
            b.e("vertAcc", getVerticalAccuracyMeters());
        }
        if (hasNumSatellites()) {
            b.b("numSatellites", getNumSatellites());
        }
        if (hasFusedLocationType()) {
            b.b("fusedLocationType", getFusedLocationType());
        }
        toStringExtras(b);
        return b.toString();
    }

    protected void toStringExtras(dbsb dbsbVar) {
    }
}
