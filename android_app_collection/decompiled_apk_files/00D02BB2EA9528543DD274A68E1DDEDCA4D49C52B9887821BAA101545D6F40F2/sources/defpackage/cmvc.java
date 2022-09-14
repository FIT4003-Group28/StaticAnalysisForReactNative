package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
/* compiled from: PG */
/* renamed from: cmvc  reason: default package */
/* loaded from: classes5.dex */
public final class cmvc implements Parcelable.Creator<BeaconStateImpl.BeaconInfoImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BeaconStateImpl.BeaconInfoImpl createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 3) {
                str2 = cnwm.o(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                bArr = cnwm.s(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new BeaconStateImpl.BeaconInfoImpl(str, str2, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BeaconStateImpl.BeaconInfoImpl[] newArray(int i) {
        return new BeaconStateImpl.BeaconInfoImpl[i];
    }
}
