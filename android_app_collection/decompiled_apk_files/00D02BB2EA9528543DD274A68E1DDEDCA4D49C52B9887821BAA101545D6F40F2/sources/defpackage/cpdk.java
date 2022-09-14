package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.udc.SettingDisplayInfo;
import com.google.android.gms.udc.SettingState;
/* compiled from: PG */
/* renamed from: cpdk  reason: default package */
/* loaded from: classes5.dex */
public final class cpdk implements Parcelable.Creator<SettingDisplayInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SettingDisplayInfo createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        SettingState settingState = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                settingState = (SettingState) cnwm.q(parcel, readInt, SettingState.CREATOR);
            } else if (b == 3) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                str2 = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new SettingDisplayInfo(settingState, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SettingDisplayInfo[] newArray(int i) {
        return new SettingDisplayInfo[i];
    }
}
