package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class i1 implements Parcelable.Creator<f1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f1 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        k3 k3Var = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 != 2) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                k3Var = (k3) com.google.android.gms.common.internal.x.b.a(parcel, a2, k3.CREATOR);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new f1(str, k3Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f1[] newArray(int i) {
        return new f1[i];
    }
}
