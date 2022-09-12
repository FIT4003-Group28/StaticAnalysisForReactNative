package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.udc.UdcSettingDisplayInfoRequest;
/* compiled from: PG */
/* renamed from: cpdx  reason: default package */
/* loaded from: classes5.dex */
public final class cpdx implements Parcelable.Creator<UdcSettingDisplayInfoRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UdcSettingDisplayInfoRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b == 4) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                str2 = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new UdcSettingDisplayInfoRequest(i, i2, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UdcSettingDisplayInfoRequest[] newArray(int i) {
        return new UdcSettingDisplayInfoRequest[i];
    }
}
