package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationSettingsConfiguration;
/* compiled from: PG */
/* renamed from: colf  reason: default package */
/* loaded from: classes5.dex */
public final class colf implements Parcelable.Creator<LocationSettingsConfiguration> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsConfiguration createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                str2 = cnwm.o(parcel, readInt);
            } else if (b == 2) {
                str3 = cnwm.o(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                str = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new LocationSettingsConfiguration(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsConfiguration[] newArray(int i) {
        return new LocationSettingsConfiguration[i];
    }
}
