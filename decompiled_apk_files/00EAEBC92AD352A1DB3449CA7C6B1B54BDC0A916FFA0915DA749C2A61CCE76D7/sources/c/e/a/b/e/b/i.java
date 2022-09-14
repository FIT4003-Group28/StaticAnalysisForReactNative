package c.e.a.b.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t;
/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        int i = 0;
        t tVar = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                i = com.google.android.gms.common.internal.x.b.k(parcel, a2);
            } else if (a3 != 2) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                tVar = (t) com.google.android.gms.common.internal.x.b.a(parcel, a2, t.CREATOR);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new j(i, tVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i) {
        return new j[i];
    }
}
