package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class w0 implements Parcelable.Creator<t0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t0 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 == 2) {
                str2 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 != 3) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                str3 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new t0(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t0[] newArray(int i) {
        return new t0[i];
    }
}
