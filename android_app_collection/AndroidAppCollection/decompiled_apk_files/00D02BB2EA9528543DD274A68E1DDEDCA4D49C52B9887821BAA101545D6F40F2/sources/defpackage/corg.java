package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
/* compiled from: PG */
/* renamed from: corg  reason: default package */
/* loaded from: classes5.dex */
public final class corg implements Parcelable.Creator<LatLng> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LatLng createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        double d = dcyn.a;
        double d2 = 0.0d;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                d = cnwm.n(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                d2 = cnwm.n(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new LatLng(d, d2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LatLng[] newArray(int i) {
        return new LatLng[i];
    }
}
