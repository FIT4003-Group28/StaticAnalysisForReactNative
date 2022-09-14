package com.facebook.react.b;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.TimeUnit;
/* compiled from: ShakeDetector.java */
/* loaded from: classes.dex */
public class g implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private static final long f3180a = TimeUnit.NANOSECONDS.convert(20, TimeUnit.MILLISECONDS);

    /* renamed from: b  reason: collision with root package name */
    private static final float f3181b = (float) TimeUnit.NANOSECONDS.convert(3, TimeUnit.SECONDS);

    /* renamed from: c  reason: collision with root package name */
    private float f3182c;

    /* renamed from: d  reason: collision with root package name */
    private float f3183d;
    private float e;
    private final a f;
    private long g;
    private int h;
    private long i;
    private int j;

    /* compiled from: ShakeDetector.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    private void a() {
        this.h = 0;
        this.f3182c = BitmapDescriptorFactory.HUE_RED;
        this.f3183d = BitmapDescriptorFactory.HUE_RED;
        this.e = BitmapDescriptorFactory.HUE_RED;
    }

    private boolean a(float f) {
        return Math.abs(f) > 13.042845f;
    }

    private void a(long j) {
        this.i = j;
        this.h++;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.timestamp - this.g < f3180a) {
            return;
        }
        float f = sensorEvent.values[0];
        float f2 = sensorEvent.values[1];
        float f3 = sensorEvent.values[2] - 9.80665f;
        this.g = sensorEvent.timestamp;
        if (a(f) && this.f3182c * f <= BitmapDescriptorFactory.HUE_RED) {
            a(sensorEvent.timestamp);
            this.f3182c = f;
        } else if (a(f2) && this.f3183d * f2 <= BitmapDescriptorFactory.HUE_RED) {
            a(sensorEvent.timestamp);
            this.f3183d = f2;
        } else if (a(f3) && this.e * f3 <= BitmapDescriptorFactory.HUE_RED) {
            a(sensorEvent.timestamp);
            this.e = f3;
        }
        b(sensorEvent.timestamp);
    }

    private void b(long j) {
        if (this.h >= this.j * 8) {
            a();
            this.f.a();
        }
        if (((float) (j - this.i)) > f3181b) {
            a();
        }
    }
}
