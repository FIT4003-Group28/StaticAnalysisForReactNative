package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afjs  reason: default package */
/* loaded from: classes.dex */
public final class afjs implements SensorEventListener, afjj {
    public static afjj a;
    public static final int b = (int) TimeUnit.SECONDS.toMicros(1);
    public final SensorManager d;
    public Sensor e;
    public Handler g;
    public Thread h;
    public float f = -1.0f;
    public final HashSet c = new HashSet();

    public afjs(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.d = sensorManager;
        if (sensorManager != null) {
            this.e = sensorManager.getDefaultSensor(5);
        }
    }

    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (((afji) it.next()) instanceof afmu) {
                it.remove();
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f = sensorEvent.values[0];
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((afji) it.next()).d();
        }
    }
}
