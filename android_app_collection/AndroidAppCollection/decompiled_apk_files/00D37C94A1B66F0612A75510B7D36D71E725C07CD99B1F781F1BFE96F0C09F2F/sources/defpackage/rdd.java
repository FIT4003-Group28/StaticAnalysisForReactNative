package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
/* compiled from: PG */
/* renamed from: rdd  reason: default package */
/* loaded from: classes4.dex */
public class rdd extends dvd implements IInterface {
    public rdd() {
        super("com.google.android.gms.gmscompliance.IGmsDeviceComplianceServiceCallback");
    }

    public void a(Status status, GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a((Status) dve.a(parcel, Status.CREATOR), (GmsDeviceComplianceResponse) dve.a(parcel, GmsDeviceComplianceResponse.CREATOR));
            return true;
        }
        return false;
    }
}
