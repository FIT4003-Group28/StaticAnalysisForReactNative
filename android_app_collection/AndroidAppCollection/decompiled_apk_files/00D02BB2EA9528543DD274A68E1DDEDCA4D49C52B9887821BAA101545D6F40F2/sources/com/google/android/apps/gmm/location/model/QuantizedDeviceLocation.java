package com.google.android.apps.gmm.location.model;

import android.location.Location;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class QuantizedDeviceLocation extends Location implements ahnc {
    public final long a;
    private final DeviceLocation b;
    private boolean c;

    private QuantizedDeviceLocation(DeviceLocation deviceLocation, long j) {
        super(deviceLocation.getProvider());
        this.c = false;
        this.b = deviceLocation;
        this.a = j;
    }

    public static QuantizedDeviceLocation e(DeviceLocation deviceLocation, int i, long j) {
        double latitude = deviceLocation.getLatitude();
        double longitude = deviceLocation.getLongitude();
        dcve dcveVar = new dcve(dcvf.c(dcvs.b(latitude, longitude)).p(Math.min(12, i)));
        dcvs dcvsVar = new dcvs(dcwa.f(dcveVar.d.d()));
        drsn drsnVar = new drsn(dcvsVar.g(), dcvsVar.i(), 0.5d * Math.max(dcveVar.a(0).k(dcveVar.a(2)), dcveVar.a(1).k(dcveVar.a(3))) * 6367000.0d);
        QuantizedDeviceLocation quantizedDeviceLocation = new QuantizedDeviceLocation(deviceLocation, j);
        quantizedDeviceLocation.setLatitude(drsnVar.a);
        quantizedDeviceLocation.setLongitude(drsnVar.b);
        quantizedDeviceLocation.setAccuracy((float) drsnVar.c);
        if (deviceLocation.c) {
            quantizedDeviceLocation.setTime(deviceLocation.getTime());
        }
        return quantizedDeviceLocation;
    }

    @Override // defpackage.ahnc
    public final dtaq a() {
        dtap a = ahmq.a(this);
        if (a.c) {
            a.bF();
            a.c = false;
        }
        dtaq dtaqVar = (dtaq) a.b;
        dtaq dtaqVar2 = dtaq.m;
        dtaqVar.b = 1;
        dtaqVar.a = 1 | dtaqVar.a;
        dtaq dtaqVar3 = (dtaq) a.b;
        dtaqVar3.c = 62;
        dtaqVar3.a |= 2;
        if (this.c) {
            long micros = TimeUnit.MILLISECONDS.toMicros(getTime());
            if (a.c) {
                a.bF();
                a.c = false;
            }
            dtaq dtaqVar4 = (dtaq) a.b;
            dtaqVar4.a |= 4;
            dtaqVar4.d = micros;
        }
        return a.bK();
    }

    @Override // defpackage.ahnc
    public final long b() {
        return this.b.b();
    }

    @Override // defpackage.ahnc
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.ahnc
    public final boolean d() {
        return this.b.d;
    }

    @Override // android.location.Location
    public final void setTime(long j) {
        this.c = true;
        super.setTime(j);
    }
}
