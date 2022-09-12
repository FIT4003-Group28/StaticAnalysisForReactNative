package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.sharing.sms.api.AutoValue_SmsController_SmsMessage;
/* compiled from: PG */
/* renamed from: bwhj  reason: default package */
/* loaded from: classes4.dex */
public final class bwhj implements Parcelable.Creator<AutoValue_SmsController_SmsMessage> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_SmsController_SmsMessage createFromParcel(Parcel parcel) {
        return new AutoValue_SmsController_SmsMessage(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_SmsController_SmsMessage[] newArray(int i) {
        return new AutoValue_SmsController_SmsMessage[i];
    }
}
