package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;
/* compiled from: PG */
/* renamed from: cpdy  reason: default package */
/* loaded from: classes5.dex */
public final class cpdy implements Parcelable.Creator<UdcWriteLocalSettingsRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UdcWriteLocalSettingsRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        UdcWriteLocalSettingsRequest.SettingChange[] settingChangeArr = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 2) {
                cnwm.d(parcel, readInt);
            } else {
                settingChangeArr = (UdcWriteLocalSettingsRequest.SettingChange[]) cnwm.z(parcel, readInt, UdcWriteLocalSettingsRequest.SettingChange.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new UdcWriteLocalSettingsRequest(settingChangeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UdcWriteLocalSettingsRequest[] newArray(int i) {
        return new UdcWriteLocalSettingsRequest[i];
    }
}
