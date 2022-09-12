package defpackage;

import com.google.android.apps.gmm.car.api.CarSatelliteStatusEvent;
import com.google.android.gms.car.CarSensorEvent;
import java.io.PrintWriter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kfh  reason: default package */
/* loaded from: classes7.dex */
public final class kfh implements kfm<CarSatelliteStatusEvent> {
    cmws a;

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.kfm
    public final int a() {
        return 17;
    }

    @Override // defpackage.kfm
    public final /* bridge */ /* synthetic */ CarSatelliteStatusEvent b(CarSensorEvent carSensorEvent) {
        cmws cmwsVar = this.a;
        carSensorEvent.a(17);
        if (cmwsVar == null) {
            cmwsVar = new cmws();
        }
        int length = carSensorEvent.d.length >> 2;
        byte[] bArr = carSensorEvent.e;
        cmwsVar.a = bArr[0];
        byte b = bArr[1];
        cmwsVar.b = b;
        if (b >= 0) {
            cmwsVar.c = new boolean[length];
            cmwsVar.d = new int[length];
            cmwsVar.e = new float[length];
            cmwsVar.f = new float[length];
            cmwsVar.g = new float[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 4;
                cmwsVar.c[i] = carSensorEvent.e[i + 2] != 0;
                cmwsVar.d[i] = Math.round(carSensorEvent.d[i2]);
                float[] fArr = cmwsVar.e;
                float[] fArr2 = carSensorEvent.d;
                fArr[i] = fArr2[i2 + 1];
                cmwsVar.f[i] = fArr2[i2 + 2];
                cmwsVar.g[i] = fArr2[i2 + 3];
            }
        }
        this.a = cmwsVar;
        cmws cmwsVar2 = this.a;
        return new CarSatelliteStatusEvent(cmwsVar2.a, cmwsVar2.b);
    }

    @Override // defpackage.kfm
    public final CarSatelliteStatusEvent d() {
        return null;
    }
}
