package com.google.android.apps.gmm.notification.log.api;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_NotificationLogger_IntentMetadata extends C$AutoValue_NotificationLogger_IntentMetadata {
    public static final Parcelable.Creator<AutoValue_NotificationLogger_IntentMetadata> CREATOR = new ausm();

    public AutoValue_NotificationLogger_IntentMetadata(auhv auhvVar, boolean z) {
        super(auhvVar, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeInt(this.b ? 1 : 0);
    }
}
