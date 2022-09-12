package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_SourceIdentity extends C$AutoValue_SourceIdentity implements Parcelable {
    public static final Parcelable.Creator<AutoValue_SourceIdentity> CREATOR = new cydq();

    public AutoValue_SourceIdentity(Parcel parcel) {
        super(duej.b(parcel.readInt()), parcel.readByte() == 1 ? parcel.readString() : null, parcel.readByte() == 1 ? parcel.readString() : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.p);
        byte b = 0;
        parcel.writeByte(this.b == null ? (byte) 0 : (byte) 1);
        String str = this.b;
        if (str != null) {
            parcel.writeString(str);
        }
        if (this.c != null) {
            b = 1;
        }
        parcel.writeByte(b);
        String str2 = this.c;
        if (str2 != null) {
            parcel.writeString(str2);
        }
    }

    public AutoValue_SourceIdentity(duej duejVar, String str, String str2) {
        super(duejVar, str, str2);
    }
}
