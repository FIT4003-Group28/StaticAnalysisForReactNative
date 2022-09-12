package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.apps.gmm.location.motionsensors.MotionSensorEvent;
/* compiled from: PG */
/* renamed from: ahnh  reason: default package */
/* loaded from: classes2.dex */
public final class ahnh implements SensorEventListener {
    public final btrm a;
    public final SensorManager b;
    public Sensor c;
    public boolean d = false;
    private final cqat e;
    private final ahnf f;

    public ahnh(Context context, cqat cqatVar, btrm btrmVar, ahnf ahnfVar) {
        this.e = cqatVar;
        this.a = btrmVar;
        this.f = ahnfVar;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.b = sensorManager;
        if (sensorManager != null) {
            this.c = sensorManager.getDefaultSensor(18);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        ahnf ahnfVar = this.f;
        ahnfVar.a.b(new MotionSensorEvent(18, this.e.e(), 1.0f));
    }
}
