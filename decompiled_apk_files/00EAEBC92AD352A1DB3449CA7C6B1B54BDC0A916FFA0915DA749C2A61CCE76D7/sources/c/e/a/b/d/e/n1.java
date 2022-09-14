package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class n1 implements Parcelable.Creator<j1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j1 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            if (com.google.android.gms.common.internal.x.b.a(a2) != 1) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new j1(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j1[] newArray(int i) {
        return new j1[i];
    }
}
