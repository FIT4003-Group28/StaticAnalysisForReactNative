package defpackage;

import com.google.android.apps.gmm.car.api.CarCompassEvent;
import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
/* compiled from: PG */
/* renamed from: ahnu  reason: default package */
/* loaded from: classes2.dex */
public final class ahnu<T> extends btrh<T> {
    private final int d;

    public ahnu(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        double d;
        String manufacturer;
        String model;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                ((ahnt) this.a).d = ((alhq) obj).a;
                return;
            }
            ahnt ahntVar = (ahnt) this.a;
            GmmCarProjectionStateEvent gmmCarProjectionStateEvent = (GmmCarProjectionStateEvent) obj;
            boolean isInProjectedMode = gmmCarProjectionStateEvent.isInProjectedMode();
            boolean z = ahntVar.f;
            if (isInProjectedMode != z) {
                ahntVar.e = false;
                ahntVar.l = dcyn.a;
                ahntVar.m = dcyn.a;
                ahntVar.k = 0;
                ahntVar.g = false;
                z = gmmCarProjectionStateEvent.isInProjectedMode();
                ahntVar.f = z;
            }
            if (!z || (manufacturer = gmmCarProjectionStateEvent.getManufacturer()) == null || (model = gmmCarProjectionStateEvent.getModel()) == null || !gmmCarProjectionStateEvent.hasHeadUnitSoftwareVersion()) {
                return;
            }
            String headUnitSoftwareVersion = gmmCarProjectionStateEvent.getHeadUnitSoftwareVersion();
            if (!manufacturer.equals("Audi") || !model.startsWith("37")) {
                return;
            }
            if (!headUnitSoftwareVersion.startsWith("CLU6_MCM_AU_NAR") && !headUnitSoftwareVersion.startsWith("CLU7_MCM_AU_NAR")) {
                return;
            }
            ahntVar.g = true;
            return;
        }
        ahnt ahntVar2 = (ahnt) this.a;
        CarCompassEvent carCompassEvent = (CarCompassEvent) obj;
        if (ahntVar2.d || ahntVar2.g) {
            return;
        }
        ahntVar2.i = ahntVar2.a.e();
        float yaw = carCompassEvent.getYaw();
        ahntVar2.h = yaw;
        if (yaw != 0.0f) {
            ahntVar2.e = true;
        }
        long j = ahntVar2.i - ahntVar2.c;
        if ((j <= 750 || !ahntVar2.j) && j <= 1250) {
            return;
        }
        bvrj.LOCATION_DISPATCHER.c();
        ahqd ahqdVar = ahntVar2.b;
        if (ahqdVar == null || !ahntVar2.e) {
            return;
        }
        ahntVar2.j = false;
        long j2 = ahntVar2.i;
        ahntVar2.c = j2;
        int i2 = ahntVar2.k;
        if (i2 < 20) {
            ahqdVar.r(new ahqi(j2, ahntVar2.h, 45.0d));
            return;
        }
        double d2 = i2;
        double d3 = ahntVar2.l;
        Double.isNaN(d2);
        float f = (float) (d3 / d2);
        double d4 = ahntVar2.m;
        Double.isNaN(d2);
        double d5 = d4 / d2;
        Double.isNaN(f * f);
        ahqdVar.r(new ahqi(ahntVar2.i, bvop.a(ahntVar2.h + f), ((float) Math.sqrt(d5 - d)) + 1.0f));
    }
}
