package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class d3 implements Parcelable.Creator<e3> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e3 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            if (com.google.android.gms.common.internal.x.b.a(a2) != 2) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                arrayList = com.google.android.gms.common.internal.x.b.c(parcel, a2, c3.CREATOR);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new e3(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e3[] newArray(int i) {
        return new e3[i];
    }
}
