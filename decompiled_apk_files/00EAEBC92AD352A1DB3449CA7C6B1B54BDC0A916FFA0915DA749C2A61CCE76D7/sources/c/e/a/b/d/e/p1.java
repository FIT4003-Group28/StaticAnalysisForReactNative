package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class p1 implements Parcelable.Creator<l1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l1 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        com.google.firebase.auth.e eVar = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 != 2) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                eVar = (com.google.firebase.auth.e) com.google.android.gms.common.internal.x.b.a(parcel, a2, com.google.firebase.auth.e.CREATOR);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new l1(str, eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l1[] newArray(int i) {
        return new l1[i];
    }
}
