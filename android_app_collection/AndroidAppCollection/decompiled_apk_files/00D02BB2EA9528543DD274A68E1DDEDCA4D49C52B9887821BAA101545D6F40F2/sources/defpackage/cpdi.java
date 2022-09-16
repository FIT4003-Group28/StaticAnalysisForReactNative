package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.udc.UdcCacheResponse;
/* compiled from: PG */
/* renamed from: cpdi  reason: default package */
/* loaded from: classes5.dex */
public final class cpdi implements Parcelable.Creator<UdcCacheResponse.SettingAvailability> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UdcCacheResponse.SettingAvailability createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        boolean z = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 2) {
                cnwm.d(parcel, readInt);
            } else {
                z = cnwm.g(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new UdcCacheResponse.SettingAvailability(z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UdcCacheResponse.SettingAvailability[] newArray(int i) {
        return new UdcCacheResponse.SettingAvailability[i];
    }
}
