package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
/* compiled from: PG */
/* renamed from: colb  reason: default package */
/* loaded from: classes5.dex */
public final class colb implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f2 = 0.0f;
        boolean z2 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 2:
                    j = cnwm.k(parcel, readInt);
                    break;
                case 3:
                    j2 = cnwm.k(parcel, readInt);
                    break;
                case 4:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 5:
                    j3 = cnwm.k(parcel, readInt);
                    break;
                case 6:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 7:
                    f2 = cnwm.m(parcel, readInt);
                    break;
                case 8:
                    j4 = cnwm.k(parcel, readInt);
                    break;
                case 9:
                    z2 = cnwm.g(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new LocationRequest(i, j, j2, z, j3, i2, f2, j4, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest[] newArray(int i) {
        return new LocationRequest[i];
    }
}
