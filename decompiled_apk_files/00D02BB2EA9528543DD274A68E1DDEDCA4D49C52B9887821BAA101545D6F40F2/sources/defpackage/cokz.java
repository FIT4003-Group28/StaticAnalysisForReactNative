package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.NetworkLocationStatus;
/* compiled from: PG */
/* renamed from: cokz  reason: default package */
/* loaded from: classes5.dex */
public final class cokz implements Parcelable.Creator<LocationAvailability> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        long j = 0;
        NetworkLocationStatus[] networkLocationStatusArr = null;
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b == 2) {
                i3 = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                j = cnwm.k(parcel, readInt);
            } else if (b == 4) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                networkLocationStatusArr = (NetworkLocationStatus[]) cnwm.z(parcel, readInt, NetworkLocationStatus.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new LocationAvailability(i, i2, i3, j, networkLocationStatusArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
