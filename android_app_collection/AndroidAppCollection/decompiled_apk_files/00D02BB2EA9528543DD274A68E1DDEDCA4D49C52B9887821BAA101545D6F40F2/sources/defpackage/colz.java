package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;
import java.util.List;
/* compiled from: PG */
/* renamed from: colz  reason: default package */
/* loaded from: classes5.dex */
public final class colz implements Parcelable.Creator<DeviceOrientationRequestInternal> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeviceOrientationRequestInternal createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        DeviceOrientationRequest deviceOrientationRequest = DeviceOrientationRequestInternal.b;
        List<ClientIdentity> list = DeviceOrientationRequestInternal.a;
        String str = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                deviceOrientationRequest = (DeviceOrientationRequest) cnwm.q(parcel, readInt, DeviceOrientationRequest.CREATOR);
            } else if (b == 2) {
                list = cnwm.A(parcel, readInt, ClientIdentity.CREATOR);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                str = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new DeviceOrientationRequestInternal(deviceOrientationRequest, list, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeviceOrientationRequestInternal[] newArray(int i) {
        return new DeviceOrientationRequestInternal[i];
    }
}
