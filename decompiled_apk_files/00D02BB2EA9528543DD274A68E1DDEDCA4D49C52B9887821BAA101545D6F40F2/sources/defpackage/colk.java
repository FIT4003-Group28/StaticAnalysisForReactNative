package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationSettingsStates;
/* compiled from: PG */
/* renamed from: colk  reason: default package */
/* loaded from: classes5.dex */
public final class colk implements Parcelable.Creator<LocationSettingsStates> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsStates createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 2:
                    z2 = cnwm.g(parcel, readInt);
                    break;
                case 3:
                    z3 = cnwm.g(parcel, readInt);
                    break;
                case 4:
                    z4 = cnwm.g(parcel, readInt);
                    break;
                case 5:
                    z5 = cnwm.g(parcel, readInt);
                    break;
                case 6:
                    z6 = cnwm.g(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new LocationSettingsStates(z, z2, z3, z4, z5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsStates[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}
