package defpackage;

import com.google.android.apps.gmm.car.api.CarCompassEvent;
import com.google.android.gms.car.CarSensorEvent;
import java.io.PrintWriter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kfg  reason: default package */
/* loaded from: classes7.dex */
public final class kfg implements kfm<CarCompassEvent> {
    private cmwq a;

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.kfm
    public final int a() {
        return 1;
    }

    @Override // defpackage.kfm
    public final /* bridge */ /* synthetic */ CarCompassEvent b(CarSensorEvent carSensorEvent) {
        cmwq cmwqVar = this.a;
        carSensorEvent.a(1);
        if (cmwqVar == null) {
            cmwqVar = new cmwq();
        }
        float[] fArr = carSensorEvent.d;
        cmwqVar.a = fArr[0];
        float f = fArr[1];
        float f2 = fArr[2];
        this.a = cmwqVar;
        return new CarCompassEvent(this.a.a);
    }

    @Override // defpackage.kfm
    public final CarCompassEvent d() {
        return null;
    }
}
