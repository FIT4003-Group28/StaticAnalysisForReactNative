package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class e1 implements Parcelable.Creator<b1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b1 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 != 2) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                str2 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new b1(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b1[] newArray(int i) {
        return new b1[i];
    }
}
