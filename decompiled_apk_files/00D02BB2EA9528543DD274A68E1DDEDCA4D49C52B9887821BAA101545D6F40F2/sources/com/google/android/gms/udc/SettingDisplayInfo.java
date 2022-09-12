package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SettingDisplayInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SettingDisplayInfo> CREATOR = new cpdk();
    public SettingState a;
    public String b;
    public String c;

    public SettingDisplayInfo() {
    }

    public SettingDisplayInfo(SettingState settingState, String str, String str2) {
        this.a = settingState;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingDisplayInfo)) {
            return false;
        }
        SettingDisplayInfo settingDisplayInfo = (SettingDisplayInfo) obj;
        return cnvv.a(this.b, settingDisplayInfo.b) && cnvv.a(this.c, settingDisplayInfo.c) && cnvv.a(this.a, settingDisplayInfo.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 2, this.a, i);
        cnwn.k(parcel, 3, this.b, false);
        cnwn.k(parcel, 4, this.c, false);
        cnwn.c(parcel, d);
    }
}
