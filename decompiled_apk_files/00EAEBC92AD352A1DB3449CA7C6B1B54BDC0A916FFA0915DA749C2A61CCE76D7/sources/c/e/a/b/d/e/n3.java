package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class n3 implements Parcelable.Creator<k3> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k3 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
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
                    str3 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 5:
                    str4 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 6:
                    str5 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 7:
                    str6 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 8:
                    str7 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 9:
                    str8 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 10:
                    z = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
                case 11:
                    z2 = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
                case 12:
                    str9 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 13:
                    str10 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 14:
                    str11 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 15:
                    str12 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 16:
                    z3 = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
                case 17:
                    str13 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                default:
                    com.google.android.gms.common.internal.x.b.o(parcel, a2);
                    break;
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new k3(str, str2, str3, str4, str5, str6, str7, str8, z, z2, str9, str10, str11, str12, z3, str13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k3[] newArray(int i) {
        return new k3[i];
    }
}
