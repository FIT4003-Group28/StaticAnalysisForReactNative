package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class h3 implements Parcelable.Creator<i3> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i3 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            switch (com.google.android.gms.common.internal.x.b.a(a2)) {
                case 1:
                    str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 2:
                    j = com.google.android.gms.common.internal.x.b.l(parcel, a2);
                    break;
                case 3:
                    z = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
                case 4:
                    str2 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 5:
                    str3 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 6:
                    str4 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                default:
                    com.google.android.gms.common.internal.x.b.o(parcel, a2);
                    break;
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new i3(str, j, z, str2, str3, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i3[] newArray(int i) {
        return new i3[i];
    }
}
