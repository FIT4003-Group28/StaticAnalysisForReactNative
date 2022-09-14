package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.sharing.sms.api.AutoValue_SmsController_SmsResult;
import com.google.android.apps.gmm.sharing.sms.api.SmsController$SmsMessage;
import com.google.android.apps.gmm.sharing.sms.api.SmsController$SmsResult;
/* compiled from: PG */
/* renamed from: bwhk  reason: default package */
/* loaded from: classes4.dex */
public final class bwhk implements Parcelable.Creator<AutoValue_SmsController_SmsResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_SmsController_SmsResult createFromParcel(Parcel parcel) {
        return new AutoValue_SmsController_SmsResult((SmsController$SmsMessage) parcel.readParcelable(SmsController$SmsResult.class.getClassLoader()), parcel.readInt(), (dbsg) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_SmsController_SmsResult[] newArray(int i) {
        return new AutoValue_SmsController_SmsResult[i];
    }
}
