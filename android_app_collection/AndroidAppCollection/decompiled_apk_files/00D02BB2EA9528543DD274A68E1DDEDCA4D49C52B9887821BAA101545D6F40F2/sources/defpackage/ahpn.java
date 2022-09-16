package defpackage;

import com.google.android.apps.gmm.location.rawlocationevents.SatelliteStatusEvent;
/* compiled from: PG */
/* renamed from: ahpn  reason: default package */
/* loaded from: classes2.dex */
public final class ahpn<T> extends btrh<T> {
    public ahpn(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        SatelliteStatusEvent satelliteStatusEvent = (SatelliteStatusEvent) obj;
        ((ahpm) this.a).a(satelliteStatusEvent.getNumUsedInFix(), -1, satelliteStatusEvent.getMightBeDeadReckoned());
    }
}
