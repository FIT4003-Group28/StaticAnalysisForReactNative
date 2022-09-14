package c.e.a.b.d.g;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            switch (com.google.android.gms.common.internal.x.b.a(a2)) {
                case 1:
                    j = com.google.android.gms.common.internal.x.b.l(parcel, a2);
                    break;
                case 2:
                    j2 = com.google.android.gms.common.internal.x.b.l(parcel, a2);
                    break;
                case 3:
                    z = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
                case 4:
                    str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 5:
                    str2 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 6:
                    str3 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 7:
                    bundle = com.google.android.gms.common.internal.x.b.a(parcel, a2);
                    break;
                default:
                    com.google.android.gms.common.internal.x.b.o(parcel, a2);
                    break;
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new f(j, j2, z, str, str2, str3, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int i) {
        return new f[i];
    }
}
