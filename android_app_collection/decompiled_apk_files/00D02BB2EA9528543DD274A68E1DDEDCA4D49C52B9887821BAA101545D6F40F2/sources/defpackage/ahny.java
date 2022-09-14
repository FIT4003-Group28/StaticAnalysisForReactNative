package defpackage;

import com.google.android.apps.gmm.car.api.CarGyroscopeEvent;
import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
/* compiled from: PG */
/* renamed from: ahny  reason: default package */
/* loaded from: classes2.dex */
public final class ahny<T> extends btrh<T> {
    private final int d;

    public ahny(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                ((ahnx) this.a).d = ((alhq) obj).a;
                return;
            }
            ahnx ahnxVar = (ahnx) this.a;
            GmmCarProjectionStateEvent gmmCarProjectionStateEvent = (GmmCarProjectionStateEvent) obj;
            boolean isInProjectedMode = gmmCarProjectionStateEvent.isInProjectedMode();
            boolean z2 = ahnxVar.f;
            if (isInProjectedMode != z2) {
                ahnxVar.e = false;
                z2 = gmmCarProjectionStateEvent.isInProjectedMode();
                ahnxVar.f = z2;
            }
            boolean z3 = z2 && "Pioneer".equals(gmmCarProjectionStateEvent.getManufacturer()) && "Car Navigation".equals(gmmCarProjectionStateEvent.getModel()) && "1.01".equals(gmmCarProjectionStateEvent.getHeadUnitSoftwareVersion());
            ahnxVar.g = z3;
            if (!z3 || !"Pioneer".equals(gmmCarProjectionStateEvent.getManufacturer()) || !"Car Navigation".equals(gmmCarProjectionStateEvent.getModel()) || !"1.01".equals(gmmCarProjectionStateEvent.getHeadUnitSoftwareVersion())) {
                z = false;
            }
            ahnxVar.h = z;
            boolean z4 = ahnxVar.g;
            return;
        }
        ahnx ahnxVar2 = (ahnx) this.a;
        CarGyroscopeEvent carGyroscopeEvent = (CarGyroscopeEvent) obj;
        if (ahnxVar2.d || !ahnxVar2.g || !carGyroscopeEvent.hasZ()) {
            return;
        }
        ahnxVar2.j = ahnxVar2.a.e();
        float degrees = (float) Math.toDegrees(carGyroscopeEvent.getZ());
        ahnxVar2.i = degrees;
        if (ahnxVar2.h) {
            degrees = -degrees;
            ahnxVar2.i = degrees;
        }
        if (degrees != 0.0f) {
            ahnxVar2.e = true;
        }
        bvrj.LOCATION_DISPATCHER.c();
        ahqd ahqdVar = ahnxVar2.b;
        if (ahqdVar == null) {
            return;
        }
        long j = ahnxVar2.j;
        if (j - ahnxVar2.c < 950 || !ahnxVar2.e) {
            return;
        }
        ahqdVar.r(new ahqk(j, ahnxVar2.i, 5.0d));
        ahnxVar2.c = ahnxVar2.j;
    }
}
