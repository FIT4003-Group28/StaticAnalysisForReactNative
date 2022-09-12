package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.NetworkStateImpl;
/* compiled from: PG */
/* renamed from: cmvf  reason: default package */
/* loaded from: classes5.dex */
public final class cmvf implements Parcelable.Creator<NetworkStateImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NetworkStateImpl createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                i2 = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new NetworkStateImpl(i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NetworkStateImpl[] newArray(int i) {
        return new NetworkStateImpl[i];
    }
}
