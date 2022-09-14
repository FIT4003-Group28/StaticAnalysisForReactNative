package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cmvd  reason: default package */
/* loaded from: classes5.dex */
public final class cmvd implements Parcelable.Creator<BeaconStateImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BeaconStateImpl createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 2) {
                cnwm.d(parcel, readInt);
            } else {
                arrayList = cnwm.A(parcel, readInt, BeaconStateImpl.BeaconInfoImpl.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new BeaconStateImpl(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BeaconStateImpl[] newArray(int i) {
        return new BeaconStateImpl[i];
    }
}
