package defpackage;

import android.os.Handler;
import com.google.android.gms.car.CarSensorEvent;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: cnii  reason: default package */
/* loaded from: classes5.dex */
final class cnii extends cmyb {
    private final WeakReference<cnik> a;

    public cnii(cnik cnikVar) {
        this.a = new WeakReference<>(cnikVar);
    }

    @Override // defpackage.cmyc
    public final void b(CarSensorEvent carSensorEvent) {
        cnik cnikVar = this.a.get();
        if (cnikVar != null) {
            Handler handler = cnikVar.c;
            handler.sendMessage(handler.obtainMessage(0, carSensorEvent));
        }
    }
}
