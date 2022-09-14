package com.google.android.apps.gmm.map.model.location;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.apps.gmm.location.model.DeviceLocation;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
/* compiled from: PG */
/* loaded from: classes.dex */
public class GmmLocation extends DeviceLocation {
    public static final dcqe g = dcqe.c("com.google.android.apps.gmm.map.model.location.GmmLocation");
    public final akra h;
    @dzsi
    public altv i;
    public final long j;
    public final long k;
    @dzsi
    public final amvu l;
    @dzsi
    public final amvt m;
    public final boolean n;
    @dzsi
    public final Location o;
    private final float p;
    private final float q;
    private final float r;

    public GmmLocation(amvs amvsVar) {
        super(amvsVar.g);
        long elapsedRealtime;
        if (amvsVar.v) {
            super.setAccuracy(amvsVar.a);
        }
        if (amvsVar.w) {
            super.setAltitude(amvsVar.b);
        }
        if (amvsVar.x) {
            super.setBearing(amvsVar.c);
        }
        super.setLatitude(amvsVar.e);
        super.setLongitude(amvsVar.f);
        if (amvsVar.y) {
            super.setSpeed(amvsVar.i);
        }
        float f = Float.NaN;
        if (Build.VERSION.SDK_INT >= 26) {
            this.p = Float.NaN;
            if (amvsVar.a()) {
                super.setSpeedAccuracyMetersPerSecond(amvsVar.j);
            }
            this.q = Float.NaN;
            if (amvsVar.b()) {
                super.setBearingAccuracyDegrees(amvsVar.k);
            }
            this.r = Float.NaN;
            if (amvsVar.c()) {
                super.setVerticalAccuracyMeters(amvsVar.l);
            }
        } else {
            this.p = amvsVar.a() ? amvsVar.j : Float.NaN;
            this.q = amvsVar.b() ? amvsVar.k : Float.NaN;
            this.r = amvsVar.c() ? amvsVar.l : f;
        }
        if (amvsVar.z) {
            super.setTime(amvsVar.m);
        }
        if (amvsVar.A) {
            super.setElapsedRealtimeNanos(amvsVar.o * 1000000);
        }
        this.c = amvsVar.z;
        this.d = amvsVar.A;
        if (amvsVar.B) {
            elapsedRealtime = amvsVar.n;
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.j = elapsedRealtime;
        this.k = amvsVar.o;
        super.setExtras(amvsVar.d);
        akra akraVar = amvsVar.q;
        dbsk.s(akraVar);
        this.h = akraVar;
        altv altvVar = amvsVar.p;
        this.i = altvVar;
        if (altvVar != null) {
            dtai m = altvVar.a.m();
            int i = altvVar.b;
            this.a = m;
            this.b = i;
        }
        this.l = amvsVar.r;
        this.m = amvsVar.s;
        this.n = amvsVar.u;
        this.o = amvsVar.t;
        this.e = amvsVar.h;
    }

    private static boolean I(boolean z, double d, boolean z2, double d2) {
        return z ? z2 && d == d2 : !z2;
    }

    public final amvs A() {
        amvs amvsVar = new amvs();
        amvsVar.j(this);
        return amvsVar;
    }

    public final akqq B() {
        return new akqq(getLatitude(), getLongitude());
    }

    public final akra C() {
        return akra.e(getLatitude(), getLongitude());
    }

    public final float D(akql akqlVar) {
        float[] fArr = new float[1];
        double latitude = getLatitude();
        double longitude = getLongitude();
        double d = akqlVar.a;
        Double.isNaN(d);
        double d2 = akqlVar.b;
        Double.isNaN(d2);
        distanceBetween(latitude, longitude, d * 1.0E-6d, 1.0E-6d * d2, fArr);
        return fArr[0];
    }

    public final float E(akra akraVar) {
        float[] fArr = new float[1];
        distanceBetween(getLatitude(), getLongitude(), akraVar.k(), akraVar.o(), fArr);
        return fArr[0];
    }

    public final float F(akqq akqqVar) {
        float[] fArr = new float[1];
        distanceBetween(getLatitude(), getLongitude(), akqqVar.a, akqqVar.b, fArr);
        return fArr[0];
    }

    public final boolean G(long j) {
        amvu amvuVar = this.l;
        return amvuVar != null && amvuVar.k.e(j);
    }

    public final double H(long j) {
        if (G(j)) {
            return this.l.k.i(j);
        }
        return Double.NaN;
    }

    @Override // com.google.android.apps.gmm.location.model.DeviceLocation, defpackage.ahnc
    public final long b() {
        return this.k;
    }

    @Override // com.google.android.apps.gmm.location.model.DeviceLocation
    public final boolean e() {
        amvu amvuVar = this.l;
        return amvuVar != null && amvuVar.a;
    }

    @Override // android.location.Location
    public final boolean equals(@dzsi Object obj) {
        bvoo.h("GmmLocation.equals is only supported for unit tests", new Object[0]);
        if (!(obj instanceof GmmLocation)) {
            return false;
        }
        GmmLocation gmmLocation = (GmmLocation) obj;
        if (!dbsd.a(gmmLocation.h, this.h) || !dbsd.a(gmmLocation.i, this.i) || !I(gmmLocation.hasAccuracy(), gmmLocation.getAccuracy(), hasAccuracy(), getAccuracy()) || !I(gmmLocation.hasAltitude(), gmmLocation.getAltitude(), hasAltitude(), getAltitude()) || !I(gmmLocation.hasBearing(), gmmLocation.getBearing(), hasBearing(), getBearing()) || !dbsd.a(gmmLocation.getExtras(), getExtras()) || !I(true, gmmLocation.getLatitude(), true, getLatitude()) || !I(true, gmmLocation.getLongitude(), true, getLongitude()) || !dbsd.a(gmmLocation.getProvider(), getProvider()) || !I(gmmLocation.hasSpeed(), gmmLocation.getSpeed(), hasSpeed(), getSpeed())) {
            return false;
        }
        boolean z = gmmLocation.c;
        long time = gmmLocation.getTime();
        boolean z2 = this.c;
        long time2 = getTime();
        if (!z ? z2 : !(z2 && time == time2)) {
            return false;
        }
        return gmmLocation.j == this.j && dbsd.a(gmmLocation.l, this.l) && dbsd.a(gmmLocation.m, this.m) && dbsd.a(gmmLocation.o, this.o);
    }

    public final boolean g() {
        amvw x = x();
        return x != null && x.h() > 0.75d;
    }

    @Override // android.location.Location
    public final float getBearingAccuracyDegrees() {
        if (!hasBearingAccuracy()) {
            return 1000000.0f;
        }
        return Build.VERSION.SDK_INT >= 26 ? super.getBearingAccuracyDegrees() : this.q;
    }

    @Override // android.location.Location
    public final float getSpeedAccuracyMetersPerSecond() {
        if (!hasSpeedAccuracy()) {
            return 1000000.0f;
        }
        return Build.VERSION.SDK_INT >= 26 ? super.getSpeedAccuracyMetersPerSecond() : this.p;
    }

    @Override // android.location.Location
    public final float getVerticalAccuracyMeters() {
        if (!hasVerticalAccuracy()) {
            return 1000000.0f;
        }
        return Build.VERSION.SDK_INT >= 26 ? super.getVerticalAccuracyMeters() : this.r;
    }

    public final boolean h() {
        return this.l != null;
    }

    @Override // android.location.Location
    public final boolean hasBearingAccuracy() {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.hasBearingAccuracy();
        }
        return !Float.isNaN(this.q);
    }

    @Override // android.location.Location
    public final boolean hasSpeedAccuracy() {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.hasSpeedAccuracy();
        }
        return !Float.isNaN(this.p);
    }

    @Override // android.location.Location
    public final boolean hasVerticalAccuracy() {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.hasVerticalAccuracy();
        }
        return !Float.isNaN(this.r);
    }

    @Override // android.location.Location
    public final int hashCode() {
        return ((((((((((((Arrays.hashCode(new Object[]{this.h, this.i, getProvider(), getExtras(), this.l, this.m, this.o}) + 31) * 31) + ((int) getAccuracy())) * 31) + ((int) getTime())) * 31) + ((int) this.j)) * 31) + ((int) getBearing())) * 31) + ((int) getAltitude())) * 31) + ((int) getSpeed());
    }

    public final boolean i() {
        amvt amvtVar = this.m;
        return amvtVar != null && amvtVar.a;
    }

    public final boolean j() {
        amvt amvtVar = this.m;
        return amvtVar != null && amvtVar.b >= 0;
    }

    public final boolean k() {
        amvt amvtVar = this.m;
        return amvtVar != null && amvtVar.c;
    }

    public final boolean l() {
        amvu amvuVar = this.l;
        return amvuVar != null && amvuVar.b;
    }

    public final long m() {
        amvu amvuVar = this.l;
        if (amvuVar != null) {
            return amvuVar.n;
        }
        return 0L;
    }

    public final boolean n() {
        amvu amvuVar = this.l;
        return amvuVar != null && amvuVar.p;
    }

    public final boolean o() {
        amvu amvuVar = this.l;
        return amvuVar != null && amvuVar.r;
    }

    public final boolean p() {
        amvu amvuVar = this.l;
        return amvuVar != null && amvuVar.o;
    }

    @dzsi
    public final Long q() {
        amvu amvuVar = this.l;
        if (amvuVar != null) {
            return Long.valueOf(amvuVar.s);
        }
        return null;
    }

    public final boolean r() {
        amvu amvuVar = this.l;
        return (amvuVar == null || amvuVar.v == null) ? false : true;
    }

    @dzsi
    public final amvr s() {
        amvu amvuVar = this.l;
        if (amvuVar != null) {
            return amvuVar.v;
        }
        return null;
    }

    @Override // android.location.Location
    public final void setAccuracy(float f) {
        throw new UnsupportedOperationException();
    }

    @Override // android.location.Location
    public final void setAltitude(double d) {
        throw new UnsupportedOperationException();
    }

    @Override // android.location.Location
    public final void setBearing(float f) {
        throw new UnsupportedOperationException();
    }

    @Override // android.location.Location
    public final void setBearingAccuracyDegrees(float f) {
        throw new UnsupportedOperationException();
    }

    @Override // android.location.Location
    public final void setExtras(Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    @Override // android.location.Location
    public final void setLatitude(double d) {
        throw new UnsupportedOperationException();
    }

    @Override // android.location.Location
    public final void setLongitude(double d) {
        throw new UnsupportedOperationException();
    }

    @Override // android.location.Location
    public final void setProvider(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // android.location.Location
    public final void setSpeed(float f) {
        throw new UnsupportedOperationException();
    }

    @Override // android.location.Location
    public final void setSpeedAccuracyMetersPerSecond(float f) {
        throw new UnsupportedOperationException();
    }

    @Override // android.location.Location
    public final void setTime(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // android.location.Location
    public final void setVerticalAccuracyMeters(float f) {
        throw new UnsupportedOperationException();
    }

    @dzsi
    public final amvx t() {
        amvu amvuVar = this.l;
        if (amvuVar != null) {
            return amvuVar.c;
        }
        return null;
    }

    @Override // android.location.Location
    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        DateFormat timeInstance = DateFormat.getTimeInstance(2);
        dbsb b = dbsc.b(this);
        b.b("source", getProvider());
        b.b("point", this.h.T());
        String str5 = "n/a";
        if (hasAccuracy()) {
            float accuracy = getAccuracy();
            StringBuilder sb = new StringBuilder(17);
            sb.append(accuracy);
            sb.append(" m");
            str = sb.toString();
        } else {
            str = str5;
        }
        b.b("accuracy", str);
        if (hasSpeed()) {
            float speed = getSpeed();
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append(speed);
            sb2.append(" m/s");
            str2 = sb2.toString();
        } else {
            str2 = str5;
        }
        b.b("speed", str2);
        if (hasSpeedAccuracy()) {
            float speedAccuracyMetersPerSecond = getSpeedAccuracyMetersPerSecond();
            StringBuilder sb3 = new StringBuilder(19);
            sb3.append(speedAccuracyMetersPerSecond);
            sb3.append(" m/s");
            str3 = sb3.toString();
        } else {
            str3 = str5;
        }
        b.b("speedAcc", str3);
        if (hasBearing()) {
            float bearing = getBearing();
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append(bearing);
            sb4.append(" degrees");
            str4 = sb4.toString();
        } else {
            str4 = str5;
        }
        b.b("bearing", str4);
        b.b("time", timeInstance.format(new Date(getTime())));
        b.g("relativetime", this.j);
        altv altvVar = this.i;
        if (altvVar != null) {
            str5 = altvVar;
        }
        b.b("level", str5);
        b.b("routeSnappingInfo", this.l);
        b.b("gpsInfo", this.m);
        b.h("fixups", this.n);
        b.b("rawLocation", this.o);
        return b.toString();
    }

    @dzsi
    public final akra u() {
        amvu amvuVar = this.l;
        if (amvuVar != null) {
            return amvuVar.e;
        }
        return null;
    }

    public final float v() {
        if (this.l == null || t() == null) {
            return Float.NaN;
        }
        return this.l.f;
    }

    public final float w() {
        if (this.l == null || t() == null) {
            return Float.NaN;
        }
        return this.l.g;
    }

    @dzsi
    public final amvw x() {
        amvu amvuVar = this.l;
        if (amvuVar != null) {
            return amvuVar.i;
        }
        return null;
    }

    public final boolean y(long j) {
        amvu amvuVar = this.l;
        return amvuVar != null && amvuVar.l.e(j);
    }

    public final double z(long j) {
        if (y(j)) {
            return this.l.l.i(j);
        }
        return Double.NaN;
    }
}
