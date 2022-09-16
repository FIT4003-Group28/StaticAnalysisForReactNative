package defpackage;

import com.google.android.apps.gmm.location.events.CarHeadingEvent;
import com.google.android.apps.gmm.location.navigation.InertialsMonitorJni;
import com.google.android.apps.gmm.location.rawlocationevents.RotationVectorEvent;
/* compiled from: PG */
/* renamed from: ahoe  reason: default package */
/* loaded from: classes2.dex */
public final class ahoe<T> extends btrh<T> {
    private final int d;

    public ahoe(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        btrm btrmVar;
        ahog ahogVar;
        int i = this.d;
        CarHeadingEvent carHeadingEvent = null;
        byte[] nativeOnInertialsSummary = null;
        if (i != 0) {
            if (i != 1) {
                ahsl ahslVar = (ahsl) obj;
                ((ahod) this.a).a();
                throw null;
            }
            ahod ahodVar = (ahod) this.a;
            ahsd ahsdVar = (ahsd) obj;
            bvrj.LOCATION_DISPATCHER.c();
            if (!ahodVar.e.a()) {
                return;
            }
            InertialsMonitorJni inertialsMonitorJni = ahodVar.e;
            long j = ahsdVar.a;
            float f = ahsdVar.b;
            if (!inertialsMonitorJni.a()) {
                bvoo.h("InertialsMonitorJni called onWheelSpeed() when stopped", new Object[0]);
                return;
            } else {
                inertialsMonitorJni.nativeOnWheelSpeed(inertialsMonitorJni.b, j, f);
                return;
            }
        }
        ahod ahodVar2 = (ahod) this.a;
        RotationVectorEvent rotationVectorEvent = (RotationVectorEvent) obj;
        long e = ahodVar2.a.e();
        bvrj.LOCATION_DISPATCHER.c();
        if (ahodVar2.e.a()) {
            InertialsMonitorJni inertialsMonitorJni2 = ahodVar2.e;
            long timestampMs = rotationVectorEvent.getTimestampMs();
            long deltaTNs = rotationVectorEvent.getDeltaTNs();
            float x = rotationVectorEvent.getX();
            float y = rotationVectorEvent.getY();
            float z = rotationVectorEvent.getZ();
            float w = rotationVectorEvent.getW();
            float gravityX = rotationVectorEvent.getGravityX();
            float gravityY = rotationVectorEvent.getGravityY();
            float gravityZ = rotationVectorEvent.getGravityZ();
            float magneticFieldX = rotationVectorEvent.getMagneticFieldX();
            float magneticFieldY = rotationVectorEvent.getMagneticFieldY();
            float magneticFieldZ = rotationVectorEvent.getMagneticFieldZ();
            float maxRateOfTurn = rotationVectorEvent.getMaxRateOfTurn();
            float maxAcceleration = rotationVectorEvent.getMaxAcceleration();
            if (!inertialsMonitorJni2.a()) {
                bvoo.h("InertialsMonitorJni called onInertialsSummary() when stopped", new Object[0]);
            } else {
                ahqd ahqdVar = inertialsMonitorJni2.c;
                long j2 = 0;
                if (ahqdVar != null && (ahogVar = ((ahos) ahqdVar).h) != null) {
                    j2 = ahogVar.s();
                }
                nativeOnInertialsSummary = inertialsMonitorJni2.nativeOnInertialsSummary(inertialsMonitorJni2.b, e, timestampMs, deltaTNs, x, y, z, w, gravityX, gravityY, gravityZ, magneticFieldX, magneticFieldY, magneticFieldZ, maxRateOfTurn, maxAcceleration, j2);
            }
            carHeadingEvent = ahod.b(nativeOnInertialsSummary, ahodVar2.c, ahodVar2.d);
        }
        if (carHeadingEvent == null || (btrmVar = ahodVar2.b) == null) {
            return;
        }
        btrmVar.b(carHeadingEvent);
    }
}
