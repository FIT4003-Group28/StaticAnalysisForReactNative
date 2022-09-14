package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.apps.gmm.location.rawlocationevents.HardBrakeEvent;
/* compiled from: PG */
/* renamed from: ahsk  reason: default package */
/* loaded from: classes2.dex */
public final class ahsk implements SensorEventListener {
    public final SensorManager a;
    public final Sensor b;
    public final Sensor c;
    public final Sensor d;
    public final ahlu e;
    private final boolean[] f;
    private final boolean[] g;
    private boolean h;
    private final ahsh i;

    public ahsk(ahsh ahshVar, SensorManager sensorManager) {
        ahlu ahluVar = new ahlu();
        this.f = new boolean[]{false, false, false};
        this.g = new boolean[]{false, false, false};
        this.h = false;
        this.i = ahshVar;
        this.a = sensorManager;
        this.e = ahluVar;
        this.b = sensorManager.getDefaultSensor(4);
        this.d = sensorManager.getDefaultSensor(9);
        this.c = sensorManager.getDefaultSensor(10);
    }

    public final void a(HardBrakeEvent hardBrakeEvent) {
        this.i.a.a.b(hardBrakeEvent);
        this.e.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahsk.b():void");
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        if (type == 4) {
            ahlu ahluVar = this.e;
            long j = sensorEvent.timestamp;
            ahluVar.s.a(sensorEvent.values);
            if (j < ahluVar.r + ahluVar.d()) {
                return;
            }
            ahluVar.q.add(ahlv.c(j, ahluVar.s.b()));
            ahluVar.r = j;
            ahluVar.s.c();
        } else if (type != 10) {
        } else {
            ahlu ahluVar2 = this.e;
            long j2 = sensorEvent.timestamp;
            ahluVar2.k.a(sensorEvent.values);
            HardBrakeEvent hardBrakeEvent = null;
            if (j2 >= ahluVar2.g + ahluVar2.d()) {
                ahlv c = ahlv.c(j2, ahluVar2.k.b());
                ahluVar2.f.add(c);
                ahluVar2.g = j2;
                if (c.d() > ahluVar2.b) {
                    ahluVar2.b = c.d();
                    ahluVar2.c = ((ahls) c).a;
                }
                if (ahluVar2.f()) {
                    if (ahluVar2.g()) {
                        hardBrakeEvent = ahluVar2.a();
                    }
                    ahluVar2.e();
                }
                ahluVar2.k.c();
            }
            if (hardBrakeEvent != null) {
                a(hardBrakeEvent);
            }
            b();
        }
    }
}
