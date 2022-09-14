package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class s1 implements Parcelable.Creator<q1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q1 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        i3 i3Var = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            if (com.google.android.gms.common.internal.x.b.a(a2) != 1) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                i3Var = (i3) com.google.android.gms.common.internal.x.b.a(parcel, a2, i3.CREATOR);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new q1(i3Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q1[] newArray(int i) {
        return new q1[i];
    }
}
