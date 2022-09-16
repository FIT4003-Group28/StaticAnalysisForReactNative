package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.hardware.SensorManager;
import android.location.LocationManager;
import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: ahkr  reason: default package */
/* loaded from: classes.dex */
public final class ahkr implements Runnable {
    final /* synthetic */ ahot a;
    final /* synthetic */ btpc b;
    final /* synthetic */ ahkv c;

    public ahkr(ahkv ahkvVar, ahot ahotVar, btpc btpcVar) {
        this.c = ahkvVar;
        this.a = ahotVar;
        this.b = btpcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ahkv ahkvVar = this.c;
        ahot ahotVar = this.a;
        btpc btpcVar = this.b;
        bvrj.LOCATION_SENSORS.c();
        LocationManager locationManager = (LocationManager) ahkvVar.a.getSystemService("location");
        if (locationManager != null) {
            ahkvVar.p = new ahkx(ahkvVar.a, ahkvVar.b, btpcVar, ahkvVar.c);
            ahkx ahkxVar = ahkvVar.p;
            ahkxVar.f = locationManager;
            ahkxVar.d = ahkxVar.b.getPackageManager().resolveActivity(new Intent("com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"), ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != null;
            ahkvVar.k = new ahsf(ahkvVar.a, ahkvVar, ahkvVar.c);
            ahkvVar.g.add(ahkvVar.k);
            ahkvVar.g.add(new ahrx(ahkvVar.c, locationManager, ahkvVar.q));
        }
        SensorManager sensorManager = (SensorManager) ahkvVar.a.getSystemService("sensor");
        if (sensorManager != null) {
            ahkvVar.l = new ahsr(ahkvVar.c, sensorManager);
            ahkvVar.n = new ahry(ahkvVar.c, sensorManager, ahkvVar.q);
            ahkvVar.o = new ahsi(ahkvVar.c, sensorManager, ahkvVar.q);
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                ahkvVar.m = new ahsb(ahkvVar.a, ahkvVar.i, ahkvVar.c, defaultAdapter);
            }
        }
        Context a = ahotVar.a.a();
        ahot.a(a, 1);
        ahot.a(ahkvVar, 2);
        ahot.a(ahkvVar, 3);
        btvo a2 = ahotVar.b.a();
        ahot.a(a2, 4);
        bqyp a3 = ahotVar.c.a();
        ahot.a(a3, 5);
        bwsa a4 = ahotVar.d.a();
        ahot.a(a4, 6);
        btrm a5 = ahotVar.e.a();
        ahot.a(a5, 7);
        cqat a6 = ahotVar.f.a();
        ahot.a(a6, 8);
        bvrb a7 = ahotVar.g.a();
        ahot.a(a7, 9);
        dehq a8 = ahotVar.h.a();
        ahot.a(a8, 10);
        ckcw a9 = ahotVar.i.a();
        ahot.a(a9, 11);
        cjqy a10 = ahotVar.j.a();
        ahot.a(a10, 12);
        buqb a11 = ahotVar.k.a();
        ahot.a(a11, 13);
        ahot.a(ahotVar.l.a(), 14);
        ahot.a(ahotVar.m.a(), 15);
        bttf a12 = ahotVar.n.a();
        ahot.a(a12, 16);
        ahot.a(ahotVar.o.a(), 17);
        ahjw a13 = ahotVar.p.a();
        ahot.a(a13, 18);
        ahkvVar.f = new ahos(a, ahkvVar, ahkvVar, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13);
        btrm btrmVar = ahkvVar.c;
        dceq a14 = dcet.a();
        a14.b(ahjy.class, new ahkw(0, ahjy.class, ahkvVar, bvrj.LOCATION_SENSORS));
        a14.b(crhp.class, new ahkw(1, crhp.class, ahkvVar, bvrj.LOCATION_SENSORS));
        a14.b(byze.class, new ahkw(2, byze.class, ahkvVar, bvrj.LOCATION_SENSORS));
        a14.b(GmmCarProjectionStateEvent.class, new ahkw(3, GmmCarProjectionStateEvent.class, ahkvVar, bvrj.LOCATION_SENSORS));
        a14.b(crmj.class, new ahkw(4, crmj.class, ahkvVar, bvrj.LOCATION_SENSORS));
        a14.b(crhb.class, new ahkw(5, crhb.class, ahkvVar, bvrj.LOCATION_SENSORS));
        a14.b(btvr.class, new ahkw(6, btvr.class, ahkvVar, bvrj.LOCATION_SENSORS));
        a14.b(gdx.class, new ahkw(7, gdx.class, ahkvVar, bvrj.LOCATION_SENSORS));
        btrmVar.g(ahkvVar, a14.a());
        ahkvVar.H = true;
        ahkvVar.w();
    }
}
