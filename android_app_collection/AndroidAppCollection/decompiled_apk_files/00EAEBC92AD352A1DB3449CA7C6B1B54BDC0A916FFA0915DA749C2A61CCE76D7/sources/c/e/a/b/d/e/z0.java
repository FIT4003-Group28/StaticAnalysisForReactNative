package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class z0 implements Parcelable.Creator<x0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ x0 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            if (com.google.android.gms.common.internal.x.b.a(a2) != 1) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new x0(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ x0[] newArray(int i) {
        return new x0[i];
    }
}
