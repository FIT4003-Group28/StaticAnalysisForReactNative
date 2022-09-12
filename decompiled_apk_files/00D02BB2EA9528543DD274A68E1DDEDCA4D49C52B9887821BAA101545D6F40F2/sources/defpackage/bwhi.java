package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.sharing.sms.api.AutoValue_SmsController_GroupSmsMessage;
import com.google.android.apps.gmm.sharing.sms.api.SmsController$GroupSmsMessage;
/* compiled from: PG */
/* renamed from: bwhi  reason: default package */
/* loaded from: classes4.dex */
public final class bwhi implements Parcelable.Creator<AutoValue_SmsController_GroupSmsMessage> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_SmsController_GroupSmsMessage createFromParcel(Parcel parcel) {
        return new AutoValue_SmsController_GroupSmsMessage(parcel.readArrayList(SmsController$GroupSmsMessage.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_SmsController_GroupSmsMessage[] newArray(int i) {
        return new AutoValue_SmsController_GroupSmsMessage[i];
    }
}
