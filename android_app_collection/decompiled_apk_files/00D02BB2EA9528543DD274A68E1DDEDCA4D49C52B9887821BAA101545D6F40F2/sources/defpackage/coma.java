package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;
import com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData;
/* compiled from: PG */
/* renamed from: coma  reason: default package */
/* loaded from: classes5.dex */
public final class coma implements Parcelable.Creator<DeviceOrientationRequestUpdateData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeviceOrientationRequestUpdateData createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        DeviceOrientationRequestInternal deviceOrientationRequestInternal = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i = 1;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 2) {
                deviceOrientationRequestInternal = (DeviceOrientationRequestInternal) cnwm.q(parcel, readInt, DeviceOrientationRequestInternal.CREATOR);
            } else if (b == 3) {
                iBinder = cnwm.p(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                iBinder2 = cnwm.p(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new DeviceOrientationRequestUpdateData(i, deviceOrientationRequestInternal, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeviceOrientationRequestUpdateData[] newArray(int i) {
        return new DeviceOrientationRequestUpdateData[i];
    }
}
