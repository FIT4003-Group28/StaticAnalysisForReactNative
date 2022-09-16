package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_Name extends C$AutoValue_Name implements Parcelable {
    public static final Parcelable.Creator<AutoValue_Name> CREATOR = new cydf();
    private static final ClassLoader f = AutoValue_Name.class.getClassLoader();

    public AutoValue_Name(Parcel parcel) {
        super(parcel.readString(), parcel.readByte() == 1 ? parcel.readString() : null, parcel.readByte() == 1 ? parcel.readString() : null, parcel.readString(), (PersonFieldMetadata) parcel.readParcelable(f));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.toString());
        byte b = 1;
        parcel.writeByte(this.b == null ? (byte) 0 : (byte) 1);
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            parcel.writeString(charSequence.toString());
        }
        if (this.c == null) {
            b = 0;
        }
        parcel.writeByte(b);
        CharSequence charSequence2 = this.c;
        if (charSequence2 != null) {
            parcel.writeString(charSequence2.toString());
        }
        parcel.writeString(this.d.toString());
        parcel.writeParcelable(this.e, 0);
    }

    public AutoValue_Name(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, PersonFieldMetadata personFieldMetadata) {
        super(charSequence, charSequence2, charSequence3, charSequence4, personFieldMetadata);
    }
}
