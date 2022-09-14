package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.ParcelableGeofence;
/* compiled from: PG */
/* renamed from: conu  reason: default package */
/* loaded from: classes5.dex */
public final class conu implements Parcelable.Creator<ParcelableGeofence> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ParcelableGeofence createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        String str = null;
        long j = 0;
        int i = 0;
        short s = 0;
        float f2 = 0.0f;
        int i2 = 0;
        int i3 = -1;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 2:
                    j = cnwm.k(parcel, readInt);
                    break;
                case 3:
                    cnwm.e(parcel, readInt, 4);
                    s = (short) parcel.readInt();
                    break;
                case 4:
                    d = cnwm.n(parcel, readInt);
                    break;
                case 5:
                    d2 = cnwm.n(parcel, readInt);
                    break;
                case 6:
                    f2 = cnwm.m(parcel, readInt);
                    break;
                case 7:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 8:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 9:
                    i3 = cnwm.i(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new ParcelableGeofence(str, i, s, d, d2, f2, j, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ParcelableGeofence[] newArray(int i) {
        return new ParcelableGeofence[i];
    }
}
