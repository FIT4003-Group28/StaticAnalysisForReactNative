package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;
/* compiled from: PG */
/* renamed from: cobu  reason: default package */
/* loaded from: classes5.dex */
public final class cobu implements Parcelable.Creator<FacsCacheCallOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FacsCacheCallOptions createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        long j = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                j = cnwm.k(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new FacsCacheCallOptions(str, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FacsCacheCallOptions[] newArray(int i) {
        return new FacsCacheCallOptions[i];
    }
}
