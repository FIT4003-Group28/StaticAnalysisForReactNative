package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class z2 implements Parcelable.Creator<a3> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a3 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 == 2) {
                str2 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 == 3) {
                str3 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 != 4) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                j = com.google.android.gms.common.internal.x.b.l(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new a3(str, str2, str3, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a3[] newArray(int i) {
        return new a3[i];
    }
}
