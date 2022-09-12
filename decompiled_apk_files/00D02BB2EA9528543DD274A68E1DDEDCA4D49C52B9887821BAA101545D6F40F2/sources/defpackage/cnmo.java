package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: cnmo  reason: default package */
/* loaded from: classes.dex */
public final class cnmo implements Parcelable.Creator<Feature> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Feature createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                j = cnwm.k(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new Feature(str, i, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Feature[] newArray(int i) {
        return new Feature[i];
    }
}
