package c.e.a.b.e.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator<c> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                i = com.google.android.gms.common.internal.x.b.k(parcel, a2);
            } else if (a3 == 2) {
                i2 = com.google.android.gms.common.internal.x.b.k(parcel, a2);
            } else if (a3 != 3) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                intent = (Intent) com.google.android.gms.common.internal.x.b.a(parcel, a2, Intent.CREATOR);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new c(i, i2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c[] newArray(int i) {
        return new c[i];
    }
}
