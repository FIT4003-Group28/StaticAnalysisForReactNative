package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_MessageReceivedNotification extends C$AutoValue_MessageReceivedNotification {
    public static final Parcelable.Creator<AutoValue_MessageReceivedNotification> CREATOR = new cudu();

    public AutoValue_MessageReceivedNotification(ConversationId conversationId, String str, ContactId contactId, String str2, String str3, String str4, String str5, String str6, boolean z) {
        super(conversationId, str, contactId, str2, str3, str4, str5, str6, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
