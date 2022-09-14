package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_ClientVersion extends C$AutoValue_ClientVersion implements Parcelable {
    public static final Parcelable.Creator<AutoValue_ClientVersion> CREATOR = new cycs();

    public AutoValue_ClientVersion(Parcel parcel) {
        super(parcel.readString(), parcel.readString(), parcel.readByte() == 1 ? parcel.readString() : null, cygj.a()[parcel.readInt()]);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeByte(this.c == null ? (byte) 0 : (byte) 1);
        String str = this.c;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeInt(this.d - 1);
    }

    public AutoValue_ClientVersion(String str, String str2, String str3, int i) {
        super(str, str2, str3, i);
    }
}
