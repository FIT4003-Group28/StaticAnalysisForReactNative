package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.ContactId;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_ContactId extends C$AutoValue_ContactId {
    public static final Parcelable.Creator<AutoValue_ContactId> CREATOR = new cudb();

    public AutoValue_ContactId(String str, String str2, ContactId.ContactType contactType, dbsg<String> dbsgVar) {
        super(str, str2, contactType, dbsgVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(((C$AutoValue_ContactId) this).a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeSerializable(this.d);
    }
}
