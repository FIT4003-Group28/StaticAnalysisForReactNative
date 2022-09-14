package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.udc.DeviceDataUploadOptInFlags;
/* compiled from: PG */
/* renamed from: cpdg  reason: default package */
/* loaded from: classes5.dex */
public final class cpdg implements Parcelable.Creator<DeviceDataUploadOptInFlags> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeviceDataUploadOptInFlags createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                z = cnwm.g(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                z2 = cnwm.g(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new DeviceDataUploadOptInFlags(z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeviceDataUploadOptInFlags[] newArray(int i) {
        return new DeviceDataUploadOptInFlags[i];
    }
}
