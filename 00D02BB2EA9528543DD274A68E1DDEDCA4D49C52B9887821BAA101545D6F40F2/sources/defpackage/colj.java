package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
/* compiled from: PG */
/* renamed from: colj  reason: default package */
/* loaded from: classes5.dex */
public final class colj implements Parcelable.Creator<LocationSettingsResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsResult createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                status = (Status) cnwm.q(parcel, readInt, Status.CREATOR);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                locationSettingsStates = (LocationSettingsStates) cnwm.q(parcel, readInt, LocationSettingsStates.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsResult[] newArray(int i) {
        return new LocationSettingsResult[i];
    }
}
