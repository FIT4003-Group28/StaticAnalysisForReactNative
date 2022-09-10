package defpackage;

import android.app.Application;
import android.hardware.SensorManager;
import android.os.Build;
import com.google.ar.core.ArCoreApk;
/* compiled from: PG */
/* renamed from: dec  reason: default package */
/* loaded from: classes6.dex */
public final class dec {
    private final Application a;
    private final btvo b;

    public dec(Application application, btvo btvoVar) {
        this.a = application;
        this.b = btvoVar;
    }

    private final boolean b(int i) {
        SensorManager sensorManager = (SensorManager) akm.g(this.a, SensorManager.class);
        dbsk.s(sensorManager);
        return sensorManager.getDefaultSensor(i) == null;
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        if (b(2) && b(14)) {
            return false;
        }
        dkgz dkgzVar = this.b.getAugmentedRealityParameters().c;
        if (dkgzVar == null) {
            dkgzVar = dkgz.d;
        }
        return !dkgzVar.c || !ArCoreApk.getInstance().checkAvailability(this.a).isUnsupported();
    }
}
