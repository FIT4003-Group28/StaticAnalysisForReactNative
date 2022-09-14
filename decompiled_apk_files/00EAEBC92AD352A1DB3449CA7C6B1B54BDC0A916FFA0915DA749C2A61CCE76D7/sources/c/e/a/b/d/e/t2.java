package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class t2 implements Parcelable.Creator<s2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s2 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        String str2 = null;
        j3 j3Var = null;
        ArrayList<String> arrayList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            switch (com.google.android.gms.common.internal.x.b.a(a2)) {
                case 2:
                    str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 3:
                    z = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
                case 4:
                    str2 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 5:
                    z2 = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
                case 6:
                    j3Var = (j3) com.google.android.gms.common.internal.x.b.a(parcel, a2, j3.CREATOR);
                    break;
                case 7:
                    arrayList = com.google.android.gms.common.internal.x.b.c(parcel, a2);
                    break;
                default:
                    com.google.android.gms.common.internal.x.b.o(parcel, a2);
                    break;
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new s2(str, z, str2, z2, j3Var, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s2[] newArray(int i) {
        return new s2[i];
    }
}
