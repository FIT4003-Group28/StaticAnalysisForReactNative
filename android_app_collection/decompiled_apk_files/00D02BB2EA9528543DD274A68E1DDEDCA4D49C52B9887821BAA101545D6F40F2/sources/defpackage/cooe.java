package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.UserDataType;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cooe  reason: default package */
/* loaded from: classes5.dex */
public final class cooe implements Parcelable.Creator<PlaceFilter> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceFilter createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ArrayList<Integer> arrayList = null;
        ArrayList<String> arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                arrayList = cnwm.x(parcel, readInt);
            } else if (b == 6) {
                arrayList2 = cnwm.y(parcel, readInt);
            } else if (b == 3) {
                z = cnwm.g(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                arrayList3 = cnwm.A(parcel, readInt, UserDataType.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new PlaceFilter(arrayList, z, arrayList2, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceFilter[] newArray(int i) {
        return new PlaceFilter[i];
    }
}
