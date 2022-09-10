package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.apps.gmm.location.rawlocationevents.RotationVectorEvent;
/* compiled from: PG */
/* renamed from: ahss  reason: default package */
/* loaded from: classes2.dex */
public final class ahss implements SensorEventListener {
    private static final float l = (float) Math.toRadians(90.0d);
    public final SensorManager a;
    public final Sensor b;
    public final Sensor c;
    public final Sensor d;
    public final Sensor e;
    public long f;
    public boolean g;
    public boolean h;
    public float j;
    public float k;
    private float[] m;
    private long o;
    private long t;
    private final ahsq u;
    private final ahrn n = new ahrn();
    private final float[] p = new float[3];
    private final float[] q = new float[3];
    public boolean i = true;
    private final float[] r = new float[4];
    private final ahrn s = new ahrn();

    public ahss(ahsq ahsqVar, SensorManager sensorManager) {
        this.u = ahsqVar;
        this.a = sensorManager;
        this.b = sensorManager.getDefaultSensor(16);
        this.d = sensorManager.getDefaultSensor(9);
        this.c = sensorManager.getDefaultSensor(10);
        this.e = sensorManager.getDefaultSensor(14);
    }

    public final void a(long j) {
        float f = this.k;
        float f2 = l;
        float sqrt = f > f2 * f2 ? (float) Math.sqrt(f) : Float.NaN;
        float f3 = this.j;
        float sqrt2 = f3 > 9.0f ? (float) Math.sqrt(f3) : Float.NaN;
        this.k = 0.0f;
        this.j = 0.0f;
        if (this.i) {
            this.n.l(0.0f, 0.0f, 0.0f, 1.0f);
        }
        ahrn ahrnVar = this.n;
        ahrnVar.i(ahrnVar);
        this.u.a.a.b(new RotationVectorEvent(j, this.i ? 0L : this.o, this.n, this.p, this.h ? this.q : null, sqrt, sqrt2));
        this.i = false;
        b();
    }

    public final void b() {
        this.n.l(0.0f, 0.0f, 0.0f, 1.0f);
        this.o = 0L;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        int type = sensorEvent.sensor.getType();
        if (type == 9) {
            float[] fArr2 = this.p;
            fArr2[0] = fArr[0];
            fArr2[1] = fArr[1];
            fArr2[2] = fArr[2];
            this.g = true;
        } else if (type == 10) {
            float f = this.j;
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[2];
            this.j = Math.max(f, (f2 * f2) + (f3 * f3) + (f4 * f4));
        } else if (type == 14) {
            float[] fArr3 = this.q;
            fArr3[0] = fArr[0];
            fArr3[1] = fArr[1];
            fArr3[2] = fArr[2];
            this.h = true;
        } else if (type == 16) {
            float[] fArr4 = this.r;
            fArr4[0] = fArr[0];
            fArr4[1] = fArr[1];
            fArr4[2] = fArr[2];
            if (fArr.length >= 6 && this.m == null) {
                this.m = new float[]{fArr[3], fArr[4], fArr[5]};
            }
            float[] fArr5 = this.m;
            if (fArr5 != null) {
                fArr4[0] = fArr4[0] - fArr5[0];
                fArr4[1] = fArr4[1] - fArr5[1];
                fArr4[2] = fArr4[2] - fArr5[2];
            }
            float f5 = this.k;
            float f6 = fArr4[0];
            float f7 = fArr4[1];
            float f8 = fArr4[2];
            this.k = Math.max(f5, (f6 * f6) + (f7 * f7) + (f8 * f8));
            if (this.f != 0 && sensorEvent.timestamp > this.f) {
                long j = sensorEvent.timestamp - this.f;
                this.s.e(this.r, ((float) j) * 1.0E-9f);
                ahrn ahrnVar = this.n;
                ahrnVar.g(ahrnVar, this.s);
                this.o += j;
            }
            this.f = sensorEvent.timestamp;
        }
        if (sensorEvent.timestamp < this.t + 333000000 || !this.g) {
            return;
        }
        if (!this.i && this.o <= 0) {
            return;
        }
        a(this.f / 1000000);
        this.t = sensorEvent.timestamp;
    }
}
