package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_Phone extends C$AutoValue_Phone implements Parcelable {
    public static final Parcelable.Creator<AutoValue_Phone> CREATOR = new cydl();
    private static final ClassLoader d = AutoValue_Phone.class.getClassLoader();

    public AutoValue_Phone(Parcel parcel) {
        super(parcel.readString(), parcel.readByte() == 1 ? parcel.readString() : null, (PersonFieldMetadata) parcel.readParcelable(d));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(((C$AutoValue_Phone) this).a.toString());
        parcel.writeByte(this.b == null ? (byte) 0 : (byte) 1);
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            parcel.writeString(charSequence.toString());
        }
        parcel.writeParcelable(this.c, 0);
    }

    public AutoValue_Phone(CharSequence charSequence, CharSequence charSequence2, PersonFieldMetadata personFieldMetadata) {
        super(charSequence, charSequence2, personFieldMetadata);
    }
}
