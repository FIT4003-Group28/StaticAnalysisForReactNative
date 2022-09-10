package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_ConversationId extends C$AutoValue_ConversationId {
    public static final Parcelable.Creator<AutoValue_ConversationId> CREATOR = new cude();

    public AutoValue_ConversationId(ContactId contactId, ConversationId.OneOfId oneOfId) {
        super(contactId, oneOfId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
