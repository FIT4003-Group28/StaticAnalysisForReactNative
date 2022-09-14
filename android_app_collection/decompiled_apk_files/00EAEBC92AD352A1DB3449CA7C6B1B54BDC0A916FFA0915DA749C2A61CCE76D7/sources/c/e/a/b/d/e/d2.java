package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class d2 implements Parcelable.Creator<a2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a2 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        com.google.firebase.auth.j jVar = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            if (com.google.android.gms.common.internal.x.b.a(a2) != 1) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                jVar = (com.google.firebase.auth.j) com.google.android.gms.common.internal.x.b.a(parcel, a2, com.google.firebase.auth.j.CREATOR);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new a2(jVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a2[] newArray(int i) {
        return new a2[i];
    }
}
