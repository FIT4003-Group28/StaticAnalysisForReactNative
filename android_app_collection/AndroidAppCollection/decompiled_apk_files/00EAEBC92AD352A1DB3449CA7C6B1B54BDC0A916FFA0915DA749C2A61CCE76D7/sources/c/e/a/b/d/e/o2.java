package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class o2 implements Parcelable.Creator<l2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l2 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        String str2 = null;
        com.google.firebase.auth.e eVar = null;
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
                eVar = (com.google.firebase.auth.e) com.google.android.gms.common.internal.x.b.a(parcel, a2, com.google.firebase.auth.e.CREATOR);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new l2(str, str2, eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l2[] newArray(int i) {
        return new l2[i];
    }
}
