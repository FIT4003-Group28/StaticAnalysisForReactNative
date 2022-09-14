package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_ProfileId extends C$AutoValue_ProfileId implements Parcelable {
    public static final Parcelable.Creator<AutoValue_ProfileId> CREATOR = new cydn();
    private static final ClassLoader c = AutoValue_ProfileId.class.getClassLoader();

    public AutoValue_ProfileId(Parcel parcel) {
        super(parcel.readString(), (PersonFieldMetadata) parcel.readParcelable(c));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(((C$AutoValue_ProfileId) this).a.toString());
        parcel.writeParcelable(this.b, 0);
    }

    public AutoValue_ProfileId(CharSequence charSequence, PersonFieldMetadata personFieldMetadata) {
        super(charSequence, personFieldMetadata);
    }
}
