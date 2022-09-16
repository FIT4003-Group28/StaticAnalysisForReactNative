package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_ConversationId_GroupId extends C$AutoValue_ConversationId_GroupId {
    public static final Parcelable.Creator<AutoValue_ConversationId_GroupId> CREATOR = new cudh();

    public AutoValue_ConversationId_GroupId(String str, String str2) {
        super(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
