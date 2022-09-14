package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.udc.UdcCacheResponse;
/* compiled from: PG */
/* renamed from: cpdw  reason: default package */
/* loaded from: classes5.dex */
public final class cpdw implements Parcelable.Creator<UdcCacheResponse.UdcSetting> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UdcCacheResponse.UdcSetting createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        UdcCacheResponse.SettingAvailability settingAvailability = null;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                settingAvailability = (UdcCacheResponse.SettingAvailability) cnwm.q(parcel, readInt, UdcCacheResponse.SettingAvailability.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new UdcCacheResponse.UdcSetting(i, i2, settingAvailability);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UdcCacheResponse.UdcSetting[] newArray(int i) {
        return new UdcCacheResponse.UdcSetting[i];
    }
}
