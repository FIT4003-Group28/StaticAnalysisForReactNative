package c.e.a.b.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.u;
/* loaded from: classes.dex */
public final class k implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        com.google.android.gms.common.b bVar = null;
        int i = 0;
        u uVar = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                i = com.google.android.gms.common.internal.x.b.k(parcel, a2);
            } else if (a3 == 2) {
                bVar = (com.google.android.gms.common.b) com.google.android.gms.common.internal.x.b.a(parcel, a2, com.google.android.gms.common.b.CREATOR);
            } else if (a3 != 3) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                uVar = (u) com.google.android.gms.common.internal.x.b.a(parcel, a2, u.CREATOR);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new l(i, bVar, uVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l[] newArray(int i) {
        return new l[i];
    }
}
