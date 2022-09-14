package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
/* compiled from: PG */
/* renamed from: afgt  reason: default package */
/* loaded from: classes2.dex */
public final class afgt implements SensorEventListener {
    public final SensorManager a;
    public final Sensor b;
    public float c = -1.0f;
    public boolean d = false;
    public final float e;

    public afgt(Context context) {
        float f = -1.0f;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(8);
        this.b = defaultSensor;
        this.e = defaultSensor != null ? defaultSensor.getMaximumRange() : f;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.values == null || sensorEvent.values.length <= 0) {
            return;
        }
        this.c = sensorEvent.values[0];
    }
}
