package defpackage;

import com.google.android.apps.gmm.location.model.DeviceLocation;
import com.google.android.apps.gmm.location.model.QuantizedDeviceLocation;
/* compiled from: PG */
/* renamed from: buhy  reason: default package */
/* loaded from: classes4.dex */
public final class buhy<T> extends btrh<T> {
    private final int d;

    public buhy(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        QuantizedDeviceLocation quantizedDeviceLocation;
        if (this.d != 0) {
            buhx buhxVar = (buhx) this.a;
            QuantizedDeviceLocation quantizedDeviceLocation2 = (QuantizedDeviceLocation) ((ahms) obj).a;
            if (quantizedDeviceLocation2 == null) {
                return;
            }
            buhxVar.c(quantizedDeviceLocation2);
            return;
        }
        buhx buhxVar2 = (buhx) this.a;
        DeviceLocation a = ((ahmo) obj).a();
        if (a == null || (quantizedDeviceLocation = a.e) == null) {
            return;
        }
        buhxVar2.c(quantizedDeviceLocation);
    }
}
