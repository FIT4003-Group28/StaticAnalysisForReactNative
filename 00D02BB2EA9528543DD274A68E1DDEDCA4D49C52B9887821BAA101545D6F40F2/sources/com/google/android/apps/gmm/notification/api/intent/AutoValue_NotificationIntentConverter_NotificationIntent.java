package com.google.android.apps.gmm.notification.api.intent;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_NotificationIntentConverter_NotificationIntent extends C$AutoValue_NotificationIntentConverter_NotificationIntent {
    public static final Parcelable.Creator<AutoValue_NotificationIntentConverter_NotificationIntent> CREATOR = new auhu();

    public AutoValue_NotificationIntentConverter_NotificationIntent(dbsg<Integer> dbsgVar, auhw auhwVar, Intent intent, dbsg<String> dbsgVar2, dbsg<String> dbsgVar3, dbsg<String> dbsgVar4) {
        super(dbsgVar, auhwVar, intent, dbsgVar2, dbsgVar3, dbsgVar4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeString(this.b.name());
        parcel.writeParcelable(this.c, i);
        parcel.writeSerializable(this.d);
        parcel.writeSerializable(this.e);
        parcel.writeSerializable(this.f);
    }
}
