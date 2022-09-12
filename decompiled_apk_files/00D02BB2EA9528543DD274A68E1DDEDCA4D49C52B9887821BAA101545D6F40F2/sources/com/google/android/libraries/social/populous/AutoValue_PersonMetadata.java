package com.google.android.libraries.social.populous;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_PersonMetadata extends C$AutoValue_PersonMetadata implements Parcelable {
    public static final Parcelable.Creator<AutoValue_PersonMetadata> CREATOR = new cxxx();
    private static final ClassLoader d = AutoValue_PersonMetadata.class.getClassLoader();

    public AutoValue_PersonMetadata(Parcel parcel) {
        super(parcel.readByte() == 1 ? parcel.readString() : null, parcel.readByte() == 1 ? (IdentityInfo) parcel.readParcelable(d) : null, new int[]{1, 2, 3}[parcel.readInt()]);
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
        if (this.b == null) {
            b = 0;
        }
        parcel.writeByte(b);
        IdentityInfo identityInfo = this.b;
        if (identityInfo != null) {
            parcel.writeParcelable(identityInfo, 0);
        }
        parcel.writeInt(this.c - 1);
    }

    public AutoValue_PersonMetadata(String str, IdentityInfo identityInfo, int i) {
        super(str, identityInfo, i);
    }
}
