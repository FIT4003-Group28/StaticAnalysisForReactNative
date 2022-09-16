package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class e2 implements Parcelable.Creator<c2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c2 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        com.google.firebase.auth.m0 m0Var = null;
        String str = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                m0Var = (com.google.firebase.auth.m0) com.google.android.gms.common.internal.x.b.a(parcel, a2, com.google.firebase.auth.m0.CREATOR);
            } else if (a3 != 2) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new c2(m0Var, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c2[] newArray(int i) {
        return new c2[i];
    }
}
