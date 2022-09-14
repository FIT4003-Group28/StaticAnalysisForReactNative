package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public final class q2 implements Parcelable.Creator<n2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n2 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        Status status = null;
        com.google.firebase.auth.a1 a1Var = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                status = (Status) com.google.android.gms.common.internal.x.b.a(parcel, a2, Status.CREATOR);
            } else if (a3 == 2) {
                a1Var = (com.google.firebase.auth.a1) com.google.android.gms.common.internal.x.b.a(parcel, a2, com.google.firebase.auth.a1.CREATOR);
            } else if (a3 == 3) {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 != 4) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                str2 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new n2(status, a1Var, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n2[] newArray(int i) {
        return new n2[i];
    }
}
