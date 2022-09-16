package defpackage;

import android.location.Location;
import android.os.SystemClock;
import com.google.android.apps.gmm.car.api.CarLocationEvent;
import com.google.android.gms.car.CarSensorEvent;
import java.io.PrintWriter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kff  reason: default package */
/* loaded from: classes7.dex */
public final class kff implements kfm<CarLocationEvent> {
    private Location a;

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.kfm
    public final int a() {
        return 10;
    }

    @Override // defpackage.kfm
    public final /* bridge */ /* synthetic */ CarLocationEvent b(CarSensorEvent carSensorEvent) {
        double d;
        Location location = this.a;
        carSensorEvent.a(10);
        if (location == null) {
            location = new Location(CarLocationEvent.PROVIDER);
        }
        byte[] bArr = carSensorEvent.e;
        byte b = bArr[0];
        if ((b & 1) != 0) {
            if (carSensorEvent.a >= 2) {
                double b2 = CarSensorEvent.b(bArr, 1);
                Double.isNaN(b2);
                d = b2 * 1.0E-7d;
            } else {
                d = carSensorEvent.d[0];
            }
            location.setLatitude(d);
        }
        if ((b & 2) != 0) {
            if (carSensorEvent.a >= 2) {
                double b3 = CarSensorEvent.b(carSensorEvent.e, 5);
                Double.isNaN(b3);
                location.setLongitude(b3 * 1.0E-7d);
            } else {
                location.setLongitude(carSensorEvent.d[1]);
            }
        }
        if ((b & 4) != 0) {
            location.setAccuracy(carSensorEvent.d[2]);
        }
        if ((b & 8) != 0) {
            location.setAltitude(carSensorEvent.d[3]);
        }
        if ((b & 16) != 0) {
            location.setSpeed(carSensorEvent.d[4]);
        }
        if ((b & 32) != 0) {
            location.setBearing(carSensorEvent.d[5]);
        }
        location.setElapsedRealtimeNanos(carSensorEvent.c);
        location.setTime(System.currentTimeMillis() - ((SystemClock.elapsedRealtimeNanos() - carSensorEvent.c) / 1000000));
        this.a = location;
        if (!location.getProvider().equals(CarLocationEvent.PROVIDER)) {
            this.a.setProvider(CarLocationEvent.PROVIDER);
        }
        return CarLocationEvent.fromLocation(this.a);
    }

    @Override // defpackage.kfm
    public final CarLocationEvent d() {
        return null;
    }
}
