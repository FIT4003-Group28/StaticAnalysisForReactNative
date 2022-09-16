package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.personalized.PlaceAlias;
/* compiled from: PG */
/* renamed from: copy  reason: default package */
/* loaded from: classes5.dex */
public final class copy implements Parcelable.Creator<PlaceAlias> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceAlias createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 1) {
                cnwm.d(parcel, readInt);
            } else {
                str = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new PlaceAlias(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceAlias[] newArray(int i) {
        return new PlaceAlias[i];
    }
}
