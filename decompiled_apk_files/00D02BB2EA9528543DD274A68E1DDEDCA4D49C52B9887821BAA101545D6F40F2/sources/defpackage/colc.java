package defpackage;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationResult;
import java.util.List;
/* compiled from: PG */
/* renamed from: colc  reason: default package */
/* loaded from: classes5.dex */
public final class colc implements Parcelable.Creator<LocationResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationResult createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        List<Location> list = LocationResult.a;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 1) {
                cnwm.d(parcel, readInt);
            } else {
                list = cnwm.A(parcel, readInt, Location.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new LocationResult(list);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationResult[] newArray(int i) {
        return new LocationResult[i];
    }
}
