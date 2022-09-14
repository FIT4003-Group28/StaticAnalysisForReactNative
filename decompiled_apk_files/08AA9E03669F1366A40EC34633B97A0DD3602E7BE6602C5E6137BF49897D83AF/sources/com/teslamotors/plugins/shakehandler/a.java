package com.teslamotors.plugins.shakehandler;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.facebook.react.b.g;
/* compiled from: ShakeDetector.java */
/* loaded from: classes.dex */
public class a implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5413a = "a";

    /* renamed from: b  reason: collision with root package name */
    private final g.a f5414b;

    /* renamed from: c  reason: collision with root package name */
    private SensorManager f5415c;

    /* renamed from: d  reason: collision with root package name */
    private long f5416d;
    private int e;
    private double[] f;
    private long[] g;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public a(g.a aVar) {
        this.f5414b = aVar;
    }

    public void a(SensorManager sensorManager) {
        com.facebook.j.a.a.b(sensorManager);
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        if (defaultSensor != null) {
            this.f5415c = sensorManager;
            this.f5416d = -1L;
            this.e = 0;
            this.f = new double[25];
            this.g = new long[25];
            this.f5415c.registerListener(this, defaultSensor, 2);
        }
    }

    public void a() {
        if (this.f5415c != null) {
            this.f5415c.unregisterListener(this);
            this.f5415c = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long j = (long) (sensorEvent.timestamp / 1000000.0d);
        if (j - this.f5416d < 20) {
            return;
        }
        com.facebook.j.a.a.b(this.g);
        com.facebook.j.a.a.b(this.f);
        float f = sensorEvent.values[0];
        float f2 = sensorEvent.values[1];
        float f3 = sensorEvent.values[2];
        this.f5416d = j;
        this.g[this.e] = j;
        this.f[this.e] = Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
        a(j);
        this.e = (this.e + 1) % 25;
    }

    private void a(long j) {
        com.facebook.j.a.a.b(this.g);
        com.facebook.j.a.a.b(this.f);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 25; i3++) {
            int i4 = ((this.e - i3) + 25) % 25;
            if (j - this.g[i4] < 500) {
                i2++;
                if (this.f[i4] >= 25.0d) {
                    i++;
                }
            }
        }
        if (i / i2 > 0.5d) {
            this.f5414b.a();
        }
    }
}
