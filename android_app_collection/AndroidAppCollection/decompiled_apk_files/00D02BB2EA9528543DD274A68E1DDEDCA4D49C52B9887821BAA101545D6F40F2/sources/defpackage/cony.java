package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.NearbyAlertFilter;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cony  reason: default package */
/* loaded from: classes5.dex */
public final class cony implements Parcelable.Creator<NearbyAlertFilter> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NearbyAlertFilter createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ArrayList<String> arrayList = null;
        ArrayList<Integer> arrayList2 = null;
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                arrayList = cnwm.y(parcel, readInt);
            } else if (b == 2) {
                arrayList2 = cnwm.x(parcel, readInt);
            } else if (b == 4) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                z = cnwm.g(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new NearbyAlertFilter(arrayList, arrayList2, str, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NearbyAlertFilter[] newArray(int i) {
        return new NearbyAlertFilter[i];
    }
}
