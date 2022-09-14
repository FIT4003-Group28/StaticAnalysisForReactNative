package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.apps.gmm.location.rawlocationevents.AtmosphericPressureEvent;
/* compiled from: PG */
/* renamed from: ahry  reason: default package */
/* loaded from: classes2.dex */
public final class ahry implements SensorEventListener {
    public final SensorManager a;
    public final Sensor b;
    private final btrm c;
    private final cqat d;
    private long e = 0;

    public ahry(btrm btrmVar, SensorManager sensorManager, cqat cqatVar) {
        this.c = btrmVar;
        this.d = cqatVar;
        this.a = sensorManager;
        this.b = sensorManager.getDefaultSensor(6);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (sensorEvent.sensor.getType() != 6 || fArr.length <= 0 || sensorEvent.timestamp - this.e < 9.0E8d) {
            return;
        }
        this.e = sensorEvent.timestamp;
        long e = this.d.e();
        long j = sensorEvent.timestamp / 1000000;
        long j2 = e - 500;
        if (j < j2) {
            j = j2;
        }
        this.c.b(new AtmosphericPressureEvent(j, fArr[0] * 100.0f));
    }
}
