package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class l3 implements Parcelable.Creator<j3> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j3 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        int i = 0;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                i = com.google.android.gms.common.internal.x.b.k(parcel, a2);
            } else if (a3 != 2) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                arrayList = com.google.android.gms.common.internal.x.b.c(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new j3(i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j3[] newArray(int i) {
        return new j3[i];
    }
}
