package defpackage;

import com.google.android.apps.gmm.car.api.CarWheelSpeedEvent;
import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
/* compiled from: PG */
/* renamed from: ahqa  reason: default package */
/* loaded from: classes2.dex */
public final class ahqa<T> extends btrh<T> {
    private final int d;

    public ahqa(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        ahsd ahsdVar;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                ((ahpz) this.a).a = ((alhq) obj).a;
                return;
            }
            ahpz ahpzVar = (ahpz) this.a;
            GmmCarProjectionStateEvent gmmCarProjectionStateEvent = (GmmCarProjectionStateEvent) obj;
            if (gmmCarProjectionStateEvent.isInProjectedMode() == ahpzVar.n) {
                return;
            }
            ahpzVar.m = false;
            ahpzVar.n = gmmCarProjectionStateEvent.isInProjectedMode();
            return;
        }
        ahpz ahpzVar2 = (ahpz) this.a;
        CarWheelSpeedEvent carWheelSpeedEvent = (CarWheelSpeedEvent) obj;
        if (ahpzVar2.a) {
            return;
        }
        long e = ahpzVar2.b.e();
        long j = e - ahpzVar2.e;
        ahpzVar2.e = e;
        float wheelSpeedMetersPerSecond = carWheelSpeedEvent.getWheelSpeedMetersPerSecond();
        ahpzVar2.d = wheelSpeedMetersPerSecond;
        if (wheelSpeedMetersPerSecond != 0.0f) {
            ahpzVar2.m = true;
        }
        ahpzVar2.i = true;
        if (ahpzVar2.j < 20) {
            ahsdVar = new ahsd(ahpzVar2.e, wheelSpeedMetersPerSecond, (float) ahqc.a);
        } else {
            float c = dece.c(ahpzVar2.l / ahpzVar2.k, 0.8f, 1.2f);
            ahsdVar = new ahsd(ahpzVar2.e, ahpzVar2.d * c, c * ((float) ahqc.c));
        }
        ahpzVar2.c.b(ahsdVar);
        long j2 = 1000;
        if (Math.abs(ahpzVar2.f - ahpzVar2.g) > j) {
            j2 = 1000 - j;
        }
        if (e <= (ahpzVar2.f + j2) - (j / 2)) {
            float f = ahpzVar2.d;
            return;
        }
        bvrj.LOCATION_DISPATCHER.c();
        ahqd ahqdVar = ahpzVar2.h;
        if (ahqdVar == null || !ahpzVar2.m) {
            return;
        }
        long j3 = ahsdVar.a;
        ahpzVar2.f = j3;
        ahqdVar.r(new ahqm(j3, ahsdVar.b, ahsdVar.c));
    }
}
