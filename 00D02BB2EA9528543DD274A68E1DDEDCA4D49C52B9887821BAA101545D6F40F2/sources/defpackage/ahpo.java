package defpackage;

import com.google.android.apps.gmm.location.model.QuantizedDeviceLocation;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: ahpo  reason: default package */
/* loaded from: classes2.dex */
public final class ahpo implements ahkb {
    private final btvo a;

    public ahpo(btvo btvoVar) {
        this.a = btvoVar;
    }

    @Override // defpackage.ahkb
    @dzsi
    public final GmmLocation a(@dzsi GmmLocation gmmLocation) {
        QuantizedDeviceLocation e = QuantizedDeviceLocation.e(gmmLocation, this.a.getLocationParameters().i, this.a.getLocationParameters().j * 60000);
        amvs A = gmmLocation.A();
        A.h = e;
        return A.d();
    }
}
