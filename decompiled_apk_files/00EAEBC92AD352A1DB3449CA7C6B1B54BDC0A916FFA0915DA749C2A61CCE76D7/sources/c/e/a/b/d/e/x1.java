package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class x1 implements Parcelable.Creator<u1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u1 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        k3 k3Var = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            if (com.google.android.gms.common.internal.x.b.a(a2) != 1) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                k3Var = (k3) com.google.android.gms.common.internal.x.b.a(parcel, a2, k3.CREATOR);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new u1(k3Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u1[] newArray(int i) {
        return new u1[i];
    }
}
