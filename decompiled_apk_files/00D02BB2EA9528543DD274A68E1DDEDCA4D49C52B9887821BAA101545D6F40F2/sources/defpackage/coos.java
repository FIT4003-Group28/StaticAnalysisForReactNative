package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.UserDataType;
/* compiled from: PG */
/* renamed from: coos  reason: default package */
/* loaded from: classes5.dex */
public final class coos implements Parcelable.Creator<UserDataType> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UserDataType createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new UserDataType(str, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UserDataType[] newArray(int i) {
        return new UserDataType[i];
    }
}
