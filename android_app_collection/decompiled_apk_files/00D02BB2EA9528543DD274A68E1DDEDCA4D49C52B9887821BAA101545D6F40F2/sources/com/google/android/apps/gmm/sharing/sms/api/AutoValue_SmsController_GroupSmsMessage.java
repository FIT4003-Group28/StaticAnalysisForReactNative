package com.google.android.apps.gmm.sharing.sms.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_SmsController_GroupSmsMessage extends C$AutoValue_SmsController_GroupSmsMessage {
    public static final Parcelable.Creator<AutoValue_SmsController_GroupSmsMessage> CREATOR = new bwhi();

    public AutoValue_SmsController_GroupSmsMessage(List<String> list, String str, String str2, String str3, boolean z) {
        super(list, str, str2, str3, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
        parcel.writeString(this.b);
        if (this.c == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.c);
        }
        if (this.d == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.d);
        }
        parcel.writeInt(this.e ? 1 : 0);
    }
}
