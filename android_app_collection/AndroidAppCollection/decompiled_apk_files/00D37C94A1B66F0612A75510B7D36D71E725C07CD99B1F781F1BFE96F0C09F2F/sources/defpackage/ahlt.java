package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.google.vr.sdk.base.sensors.internal.Vector3d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahlt  reason: default package */
/* loaded from: classes.dex */
public final class ahlt implements SensorEventListener {
    final /* synthetic */ ahlv a;

    public ahlt(ahlv ahlvVar) {
        this.a = ahlvVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        ahlv ahlvVar = this.a;
        if (sensorEvent.sensor.getType() == 1) {
            ahlvVar.q.set(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
            synchronized (ahlvVar.n) {
                ahlvVar.o.processAccelerometer(ahlvVar.q, sensorEvent.timestamp);
            }
        } else if (sensorEvent.sensor.getType() == 4 || sensorEvent.sensor.getType() == 16) {
            if (sensorEvent.sensor.getType() == 16) {
                if (ahlvVar.p == null && sensorEvent.values.length == 6) {
                    ahlvVar.p = new float[]{sensorEvent.values[3], sensorEvent.values[4], sensorEvent.values[5]};
                }
                if (ahlvVar.p != null) {
                    ahlvVar.r.set(sensorEvent.values[0] - ahlvVar.p[0], sensorEvent.values[1] - ahlvVar.p[1], sensorEvent.values[2] - ahlvVar.p[2]);
                } else {
                    ahlvVar.r.set(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
                }
            } else {
                ahlvVar.r.set(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
            }
            synchronized (ahlvVar.n) {
                ahlvVar.o.processGyroscope(ahlvVar.r, sensorEvent.timestamp);
                ahlvVar.o.getGyroBias(ahlvVar.s);
                Vector3d vector3d = ahlvVar.r;
                Vector3d.sub(vector3d, ahlvVar.s, vector3d);
            }
            if (ahlvVar.k != -1) {
                double d = ahlvVar.h == 0 ? ahlvVar.r.x : ahlvVar.r.y;
                long j = sensorEvent.timestamp;
                long j2 = ahlvVar.k;
                float f = ahlvVar.f;
                float f2 = ahlvVar.i;
                double d2 = (float) d;
                double d3 = ((float) (j - j2)) * 1.0E-9f;
                Double.isNaN(d2);
                Double.isNaN(d3);
                ahlvVar.f = f + (f2 * almu.z((float) (d2 * d3), -0.1f, 0.1f));
            }
            ahlvVar.k = sensorEvent.timestamp;
        } else if (sensorEvent.sensor.getType() != 9) {
        } else {
            float f3 = sensorEvent.values[0];
            float f4 = sensorEvent.values[1];
            float f5 = sensorEvent.values[2];
            ahlvVar.h = Math.abs(f3) > Math.abs(f4) ? 0 : 1;
            int rotation = ahlvVar.m.getRotation();
            ahlvVar.g = ((rotation == 0 || rotation == 2) ? 0.0f : rotation == 1 ? 1.5707964f : -1.5707964f) + ((float) Math.atan2(-f3, f4));
            ahlvVar.i = ahlvVar.h == 0 ? f3 < 0.0f ? ahlvVar.l[1] : ahlvVar.l[0] : f4 > 0.0f ? ahlvVar.l[0] : ahlvVar.l[1];
            ahlvVar.e = (f5 * 1.5707964f) / 9.80665f;
        }
    }
}
