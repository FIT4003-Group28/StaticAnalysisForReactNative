package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.personalized.PlaceAlias;
import com.google.android.gms.location.places.personalized.PlaceUserData;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: coqa  reason: default package */
/* loaded from: classes5.dex */
public final class coqa implements Parcelable.Creator<PlaceUserData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceUserData createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 2) {
                str2 = cnwm.o(parcel, readInt);
            } else if (b != 6) {
                cnwm.d(parcel, readInt);
            } else {
                arrayList = cnwm.A(parcel, readInt, PlaceAlias.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new PlaceUserData(str, str2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceUserData[] newArray(int i) {
        return new PlaceUserData[i];
    }
}
