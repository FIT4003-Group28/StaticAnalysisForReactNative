package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.learning.internal.secagg.PRFInputVectorSpecification;
/* compiled from: PG */
/* renamed from: coia  reason: default package */
/* loaded from: classes5.dex */
public final class coia implements Parcelable.Creator<PRFInputVectorSpecification> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PRFInputVectorSpecification createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 2) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                str = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new PRFInputVectorSpecification(i, i2, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PRFInputVectorSpecification[] newArray(int i) {
        return new PRFInputVectorSpecification[i];
    }
}
