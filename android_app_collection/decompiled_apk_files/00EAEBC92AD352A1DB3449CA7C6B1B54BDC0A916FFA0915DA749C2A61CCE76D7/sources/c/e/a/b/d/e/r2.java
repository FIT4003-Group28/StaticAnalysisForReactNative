package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class r2 implements Parcelable.Creator<p2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p2 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        ArrayList arrayList = null;
        com.google.firebase.auth.a1 a1Var = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 == 2) {
                arrayList = com.google.android.gms.common.internal.x.b.c(parcel, a2, a3.CREATOR);
            } else if (a3 != 3) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                a1Var = (com.google.firebase.auth.a1) com.google.android.gms.common.internal.x.b.a(parcel, a2, com.google.firebase.auth.a1.CREATOR);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new p2(str, arrayList, a1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p2[] newArray(int i) {
        return new p2[i];
    }
}
