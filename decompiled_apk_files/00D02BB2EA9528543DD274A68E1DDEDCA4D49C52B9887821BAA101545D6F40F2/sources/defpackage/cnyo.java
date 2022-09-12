package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
/* compiled from: PG */
/* renamed from: cnyo  reason: default package */
/* loaded from: classes5.dex */
public final class cnyo implements Parcelable.Creator<FenceStateMapImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FenceStateMapImpl createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 2) {
                cnwm.d(parcel, readInt);
            } else {
                bundle = cnwm.r(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new FenceStateMapImpl(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FenceStateMapImpl[] newArray(int i) {
        return new FenceStateMapImpl[i];
    }
}
