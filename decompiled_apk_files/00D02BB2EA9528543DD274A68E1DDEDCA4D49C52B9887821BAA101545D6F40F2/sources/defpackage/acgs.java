package defpackage;

import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: PG */
/* renamed from: acgs  reason: default package */
/* loaded from: classes2.dex */
public final class acgs implements SensorEventListener {
    public final SensorManager a;
    private final btnh<acfc> b;
    private final btrm e;
    private final cqat f;
    private final acfb c = acfb.a();
    private final LinkedList<acfc> d = dchl.h();
    private final float[] g = new float[3];

    public acgs(Application application, btmv btmvVar, btrm btrmVar, cqat cqatVar) {
        SensorManager sensorManager = (SensorManager) application.getSystemService("sensor");
        dbsk.s(sensorManager);
        this.a = sensorManager;
        this.b = new acgr(btmvVar, btng.SHAKE_GESTURE_RECOGNIZER_IMPL);
        this.e = btrmVar;
        this.f = cqatVar;
    }

    public final Sensor a() {
        return this.a.getDefaultSensor(1);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.g;
        boolean z = false;
        fArr2[0] = (fArr2[0] * 0.8f) + (fArr[0] * 0.19999999f);
        fArr2[1] = (fArr2[1] * 0.8f) + (fArr[1] * 0.19999999f);
        fArr2[2] = (fArr2[2] * 0.8f) + (fArr[2] * 0.19999999f);
        fArr[0] = fArr[0] - fArr2[0];
        fArr[1] = fArr[1] - fArr2[1];
        fArr[2] = fArr[2] - fArr2[2];
        this.c.b(fArr);
        if (this.c.b > anac.a) {
            long e = this.f.e();
            acfc d = this.b.d();
            float[] fArr3 = this.g;
            d.a.b(fArr);
            d.b.b(fArr3);
            d.c = e;
            this.d.add(d);
            long j = e - 1000;
            Iterator<acfc> it = this.d.iterator();
            while (it.hasNext()) {
                acfc next = it.next();
                if (next.c < j) {
                    it.remove();
                    this.b.h(next);
                }
            }
            if (this.d.size() < 5) {
                return;
            }
            acfb acfbVar = this.d.getFirst().b;
            acfb acfbVar2 = this.d.getLast().b;
            dbsk.z(2, acfbVar.a.length);
            float[] fArr4 = acfbVar.a;
            float[] fArr5 = acfbVar2.a;
            double d2 = (fArr4[0] * fArr5[0]) + (fArr4[1] * fArr5[1]) + (fArr4[2] * fArr5[2]);
            Double.isNaN(d2);
            if (d2 / (acfbVar.b * acfbVar2.b) < 0.6000000238418579d) {
                z = true;
            }
            this.d.clear();
            if (!(!z)) {
                return;
            }
            this.e.b(new acgq());
        }
    }
}
