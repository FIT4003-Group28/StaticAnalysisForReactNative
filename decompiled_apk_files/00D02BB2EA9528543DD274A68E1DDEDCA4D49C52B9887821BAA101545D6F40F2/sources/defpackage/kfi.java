package defpackage;

import com.google.android.apps.gmm.car.api.CarWheelSpeedEvent;
import com.google.android.gms.car.CarSensorEvent;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: kfi  reason: default package */
/* loaded from: classes7.dex */
public final class kfi implements kfm<CarWheelSpeedEvent> {
    private cmwp a;
    private long b = 0;
    private long c = 0;
    private double d = dcyn.a;

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.kfm
    public final int a() {
        return 2;
    }

    @Override // defpackage.kfm
    @dzsi
    public final /* bridge */ /* synthetic */ CarWheelSpeedEvent b(CarSensorEvent carSensorEvent) {
        cmwp cmwpVar = this.a;
        carSensorEvent.a(2);
        if (cmwpVar == null) {
            cmwpVar = new cmwp();
        }
        cmwpVar.a = carSensorEvent.c;
        float[] fArr = carSensorEvent.d;
        cmwpVar.b = fArr[0];
        if (carSensorEvent.a >= 3) {
            byte b = carSensorEvent.e[0];
            float f = fArr[1];
        }
        this.a = cmwpVar;
        float f2 = cmwpVar.b;
        long j = cmwpVar.a;
        long j2 = j - this.c;
        if (j2 >= 200000000) {
            this.d = dcyn.a;
            this.b = j;
            this.c = j;
            return new CarWheelSpeedEvent(f2);
        }
        double d = this.d;
        double d2 = f2 * ((float) j2);
        Double.isNaN(d2);
        double d3 = d + d2;
        this.d = d3;
        this.c = j;
        long j3 = j - this.b;
        if (j3 < 200000000) {
            return null;
        }
        this.d = dcyn.a;
        this.b = j;
        double d4 = j3;
        Double.isNaN(d4);
        return new CarWheelSpeedEvent((float) (d3 / d4));
    }

    @Override // defpackage.kfm
    public final CarWheelSpeedEvent d() {
        return null;
    }
}
