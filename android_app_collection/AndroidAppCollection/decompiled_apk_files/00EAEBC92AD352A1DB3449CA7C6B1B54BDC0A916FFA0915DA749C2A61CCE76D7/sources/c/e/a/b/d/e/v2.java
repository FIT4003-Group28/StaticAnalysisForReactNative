package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class v2 implements Parcelable.Creator<u2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u2 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        e3 e3Var = null;
        String str5 = null;
        String str6 = null;
        com.google.firebase.auth.a1 a1Var = null;
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            switch (com.google.android.gms.common.internal.x.b.a(a2)) {
                case 2:
                    str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 3:
                    str2 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 4:
                    z = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
                case 5:
                    str3 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 6:
                    str4 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 7:
                    e3Var = (e3) com.google.android.gms.common.internal.x.b.a(parcel, a2, e3.CREATOR);
                    break;
                case 8:
                    str5 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 9:
                    str6 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 10:
                    j = com.google.android.gms.common.internal.x.b.l(parcel, a2);
                    break;
                case 11:
                    j2 = com.google.android.gms.common.internal.x.b.l(parcel, a2);
                    break;
                case 12:
                    z2 = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
                case 13:
                    a1Var = (com.google.firebase.auth.a1) com.google.android.gms.common.internal.x.b.a(parcel, a2, com.google.firebase.auth.a1.CREATOR);
                    break;
                case 14:
                    arrayList = com.google.android.gms.common.internal.x.b.c(parcel, a2, a3.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.x.b.o(parcel, a2);
                    break;
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new u2(str, str2, z, str3, str4, e3Var, str5, str6, j, j2, z2, a1Var, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u2[] newArray(int i) {
        return new u2[i];
    }
}
