package com.google.android.apps.gmm.sharing.sms.api;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_SmsController_SmsResult extends C$AutoValue_SmsController_SmsResult {
    public static final Parcelable.Creator<AutoValue_SmsController_SmsResult> CREATOR = new bwhk();

    public AutoValue_SmsController_SmsResult(SmsController$SmsMessage smsController$SmsMessage, int i, dbsg<Integer> dbsgVar) {
        super(smsController$SmsMessage, i, dbsgVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeSerializable(this.c);
    }
}
