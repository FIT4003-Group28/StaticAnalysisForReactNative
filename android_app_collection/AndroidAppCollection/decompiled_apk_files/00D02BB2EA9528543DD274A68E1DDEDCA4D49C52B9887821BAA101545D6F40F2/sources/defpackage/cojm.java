package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.DeviceOrientationRequest;
/* compiled from: PG */
/* renamed from: cojm  reason: default package */
/* loaded from: classes5.dex */
public final class cojm implements Parcelable.Creator<DeviceOrientationRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeviceOrientationRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        long j = 50;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        float f2 = 0.0f;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                z = cnwm.g(parcel, readInt);
            } else if (b == 2) {
                j = cnwm.k(parcel, readInt);
            } else if (b == 3) {
                f2 = cnwm.m(parcel, readInt);
            } else if (b == 4) {
                j2 = cnwm.k(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new DeviceOrientationRequest(z, j, f2, j2, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeviceOrientationRequest[] newArray(int i) {
        return new DeviceOrientationRequest[i];
    }
}
