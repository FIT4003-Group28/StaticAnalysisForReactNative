package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_GroupOrigin extends C$AutoValue_GroupOrigin implements Parcelable {
    public static final Parcelable.Creator<AutoValue_GroupOrigin> CREATOR = new cydc();
    private static final ClassLoader d = AutoValue_GroupOrigin.class.getClassLoader();

    public AutoValue_GroupOrigin(Parcel parcel) {
        super(parcel.readByte() == 1 ? parcel.readString() : null, parcel.readByte() == 1 ? (Name) parcel.readParcelable(d) : null, parcel.readByte() == 1 ? (Photo) parcel.readParcelable(d) : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte b = 1;
        parcel.writeByte(this.a == null ? (byte) 0 : (byte) 1);
        String str = this.a;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeByte(this.b == null ? (byte) 0 : (byte) 1);
        Name name = this.b;
        if (name != null) {
            parcel.writeParcelable(name, 0);
        }
        if (this.c == null) {
            b = 0;
        }
        parcel.writeByte(b);
        Photo photo = this.c;
        if (photo != null) {
            parcel.writeParcelable(photo, 0);
        }
    }

    public AutoValue_GroupOrigin(String str, Name name, Photo photo) {
        super(str, name, photo);
    }
}
