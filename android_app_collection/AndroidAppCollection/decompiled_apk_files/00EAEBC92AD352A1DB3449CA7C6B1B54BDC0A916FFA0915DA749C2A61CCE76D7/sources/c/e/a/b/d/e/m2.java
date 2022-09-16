package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class m2 implements Parcelable.Creator<j2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j2 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        com.google.firebase.auth.u0 u0Var = null;
        String str = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                u0Var = (com.google.firebase.auth.u0) com.google.android.gms.common.internal.x.b.a(parcel, a2, com.google.firebase.auth.u0.CREATOR);
            } else if (a3 != 2) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new j2(u0Var, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j2[] newArray(int i) {
        return new j2[i];
    }
}
