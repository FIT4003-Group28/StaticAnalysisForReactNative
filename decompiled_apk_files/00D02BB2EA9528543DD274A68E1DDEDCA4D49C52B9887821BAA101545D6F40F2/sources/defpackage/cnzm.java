package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.internal.QueryFilterParameters;
/* compiled from: PG */
/* renamed from: cnzm  reason: default package */
/* loaded from: classes5.dex */
public final class cnzm implements Parcelable.Creator<QueryFilterParameters> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ QueryFilterParameters createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        int[] iArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                iArr = cnwm.u(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new QueryFilterParameters(i, i2, iArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ QueryFilterParameters[] newArray(int i) {
        return new QueryFilterParameters[i];
    }
}
