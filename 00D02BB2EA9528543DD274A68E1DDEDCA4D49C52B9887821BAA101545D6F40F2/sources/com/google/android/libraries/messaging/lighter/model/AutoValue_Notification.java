package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.Notification;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_Notification extends C$AutoValue_Notification {
    public static final Parcelable.Creator<AutoValue_Notification> CREATOR = new cudz();

    public AutoValue_Notification(String str, Long l, NotificationMetadata notificationMetadata, Notification.OneOfType oneOfType) {
        super(str, l, notificationMetadata, oneOfType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b.longValue());
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }
}
