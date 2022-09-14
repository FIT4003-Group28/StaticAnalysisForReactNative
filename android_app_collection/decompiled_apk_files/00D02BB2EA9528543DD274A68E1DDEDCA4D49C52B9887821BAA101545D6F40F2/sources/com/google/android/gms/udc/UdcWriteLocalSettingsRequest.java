package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class UdcWriteLocalSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UdcWriteLocalSettingsRequest> CREATOR = new cpdy();
    SettingChange[] a;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class SettingChange extends AbstractSafeParcelable {
        public static final Parcelable.Creator<SettingChange> CREATOR = new cpdj();
        int a;
        boolean b;

        public SettingChange(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int d = cnwn.d(parcel);
            cnwn.g(parcel, 2, this.a);
            cnwn.e(parcel, 3, this.b);
            cnwn.c(parcel, d);
        }
    }

    public UdcWriteLocalSettingsRequest(SettingChange[] settingChangeArr) {
        this.a = settingChangeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.x(parcel, 2, this.a, i);
        cnwn.c(parcel, d);
    }
}
