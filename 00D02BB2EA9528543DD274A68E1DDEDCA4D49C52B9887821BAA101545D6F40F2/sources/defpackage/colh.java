package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsConfiguration;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: colh  reason: default package */
/* loaded from: classes5.dex */
public final class colh implements Parcelable.Creator<LocationSettingsRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        LocationSettingsConfiguration locationSettingsConfiguration = null;
        boolean z2 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                arrayList = cnwm.A(parcel, readInt, LocationRequest.CREATOR);
            } else if (b == 2) {
                z = cnwm.g(parcel, readInt);
            } else if (b == 3) {
                z2 = cnwm.g(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                locationSettingsConfiguration = (LocationSettingsConfiguration) cnwm.q(parcel, readInt, LocationSettingsConfiguration.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new LocationSettingsRequest(arrayList, z, z2, locationSettingsConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsRequest[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }
}
