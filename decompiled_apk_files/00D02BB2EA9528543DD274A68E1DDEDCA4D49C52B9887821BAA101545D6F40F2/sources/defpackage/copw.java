package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.PlacesParams;
/* compiled from: PG */
/* renamed from: copw  reason: default package */
/* loaded from: classes5.dex */
public final class copw implements Parcelable.Creator<PlacesParams> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlacesParams createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 2) {
                str2 = cnwm.o(parcel, readInt);
            } else if (b == 3) {
                str3 = cnwm.o(parcel, readInt);
            } else if (b == 4) {
                str4 = cnwm.o(parcel, readInt);
            } else if (b == 6) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 7) {
                cnwm.d(parcel, readInt);
            } else {
                i2 = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new PlacesParams(str, str2, str3, str4, i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlacesParams[] newArray(int i) {
        return new PlacesParams[i];
    }
}
