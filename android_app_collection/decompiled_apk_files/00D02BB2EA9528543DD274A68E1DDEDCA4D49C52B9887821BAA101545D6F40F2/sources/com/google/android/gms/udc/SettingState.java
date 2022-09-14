package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SettingState extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SettingState> CREATOR = new cpdl();
    public int a;
    public int b;

    public SettingState() {
    }

    public SettingState(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingState)) {
            return false;
        }
        SettingState settingState = (SettingState) obj;
        return cnvv.a(Integer.valueOf(this.a), Integer.valueOf(settingState.a)) && cnvv.a(Integer.valueOf(this.b), Integer.valueOf(settingState.b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.g(parcel, 3, this.b);
        cnwn.c(parcel, d);
    }
}
