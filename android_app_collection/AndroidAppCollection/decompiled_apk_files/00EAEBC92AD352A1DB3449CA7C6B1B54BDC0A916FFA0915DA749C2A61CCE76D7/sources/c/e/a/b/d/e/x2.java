package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class x2 implements Parcelable.Creator<y2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y2 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        Long l2 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 2) {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 == 3) {
                str2 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 == 4) {
                l = com.google.android.gms.common.internal.x.b.m(parcel, a2);
            } else if (a3 == 5) {
                str3 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 != 6) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                l2 = com.google.android.gms.common.internal.x.b.m(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new y2(str, str2, l, str3, l2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y2[] newArray(int i) {
        return new y2[i];
    }
}
