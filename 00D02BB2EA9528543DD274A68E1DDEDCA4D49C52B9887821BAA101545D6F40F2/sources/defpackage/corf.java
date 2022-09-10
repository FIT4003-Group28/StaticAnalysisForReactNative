package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
/* compiled from: PG */
/* renamed from: corf  reason: default package */
/* loaded from: classes5.dex */
public final class corf implements Parcelable.Creator<LatLngBounds> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LatLngBounds createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                latLng = (LatLng) cnwm.q(parcel, readInt, LatLng.CREATOR);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                latLng2 = (LatLng) cnwm.q(parcel, readInt, LatLng.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new LatLngBounds(latLng, latLng2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LatLngBounds[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
