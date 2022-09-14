package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.NetworkLocationStatus;
/* compiled from: PG */
/* renamed from: colm  reason: default package */
/* loaded from: classes5.dex */
public final class colm implements Parcelable.Creator<NetworkLocationStatus> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NetworkLocationStatus createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        long j = -1;
        long j2 = -1;
        int i = 1;
        int i2 = 1;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 2) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                j = cnwm.k(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                j2 = cnwm.k(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new NetworkLocationStatus(i, i2, j, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NetworkLocationStatus[] newArray(int i) {
        return new NetworkLocationStatus[i];
    }
}
