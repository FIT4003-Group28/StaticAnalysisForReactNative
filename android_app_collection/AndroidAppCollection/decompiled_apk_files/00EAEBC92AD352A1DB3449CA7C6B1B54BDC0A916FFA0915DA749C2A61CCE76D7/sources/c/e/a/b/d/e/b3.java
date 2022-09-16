package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class b3 implements Parcelable.Creator<c3> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c3 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
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
                default:
                    com.google.android.gms.common.internal.x.b.o(parcel, a2);
                    break;
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new c3(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c3[] newArray(int i) {
        return new c3[i];
    }
}
