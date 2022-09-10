package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
/* compiled from: PG */
/* renamed from: dnk  reason: default package */
/* loaded from: classes6.dex */
final class dnk implements SensorEventListener {
    final /* synthetic */ dnl a;

    public dnk(dnl dnlVar) {
        this.a = dnlVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 15) {
            dnl dnlVar = this.a;
            SensorManager.getRotationMatrixFromVector(dnlVar.b, sensorEvent.values);
            SensorManager.getOrientation(dnlVar.b, dnlVar.c);
            float[] fArr = dnlVar.c;
            if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
                return;
            }
            float f = -((float) Math.toDegrees(fArr[1]));
            float f2 = dnlVar.d;
            if (f2 != -1000.0f) {
                if (f > 50.0f && f2 <= 50.0f) {
                    dnlVar.a.c(dam.UP);
                } else if (f <= 25.0f && f2 > 25.0f) {
                    dnlVar.a.c(dam.DOWN);
                }
            }
            dnlVar.d = f;
        }
    }
}
