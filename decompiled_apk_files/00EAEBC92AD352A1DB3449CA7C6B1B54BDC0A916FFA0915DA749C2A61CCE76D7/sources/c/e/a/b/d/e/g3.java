package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class g3 implements Parcelable.Creator<f3> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f3 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        a3 a3Var = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 2) {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 == 3) {
                str2 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 == 4) {
                str3 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 != 5) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                a3Var = (a3) com.google.android.gms.common.internal.x.b.a(parcel, a2, a3.CREATOR);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new f3(str, str2, str3, a3Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f3[] newArray(int i) {
        return new f3[i];
    }
}
