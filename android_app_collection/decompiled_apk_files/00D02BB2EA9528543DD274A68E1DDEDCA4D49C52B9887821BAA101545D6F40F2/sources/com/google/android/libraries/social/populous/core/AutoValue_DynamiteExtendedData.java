package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.DynamiteExtendedData;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_DynamiteExtendedData extends C$AutoValue_DynamiteExtendedData implements Parcelable {
    public static final Parcelable.Creator<AutoValue_DynamiteExtendedData> CREATOR = new cycu();
    private static final ClassLoader i = AutoValue_DynamiteExtendedData.class.getClassLoader();

    public AutoValue_DynamiteExtendedData(Parcel parcel) {
        super(daxp.a(parcel.readInt()), daxr.a(parcel.readInt()), daxt.a(parcel.readInt()), parcel.readByte() == 1 ? Long.valueOf(parcel.readLong()) : null, parcel.readByte() == 1 ? parcel.readString() : null, parcel.readByte() == 1 ? parcel.readString() : null, parcel.readByte() == 1 ? parcel.readString() : null, parcel.readByte() == 1 ? (DynamiteExtendedData.OrganizationInfo) parcel.readParcelable(i) : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f - 1);
        parcel.writeInt(this.g - 1);
        parcel.writeInt(this.h - 1);
        byte b = 1;
        parcel.writeByte(this.a == null ? (byte) 0 : (byte) 1);
        Long l = this.a;
        if (l != null) {
            parcel.writeLong(l.longValue());
        }
        parcel.writeByte(this.b == null ? (byte) 0 : (byte) 1);
        String str = this.b;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeByte(this.c == null ? (byte) 0 : (byte) 1);
        String str2 = this.c;
        if (str2 != null) {
            parcel.writeString(str2);
        }
        parcel.writeByte(this.d == null ? (byte) 0 : (byte) 1);
        String str3 = this.d;
        if (str3 != null) {
            parcel.writeString(str3);
        }
        if (this.e == null) {
            b = 0;
        }
        parcel.writeByte(b);
        DynamiteExtendedData.OrganizationInfo organizationInfo = this.e;
        if (organizationInfo != null) {
            parcel.writeParcelable(organizationInfo, 0);
        }
    }

    public AutoValue_DynamiteExtendedData(int i2, int i3, int i4, Long l, String str, String str2, String str3, DynamiteExtendedData.OrganizationInfo organizationInfo) {
        super(i2, i3, i4, l, str, str2, str3, organizationInfo);
    }
}
