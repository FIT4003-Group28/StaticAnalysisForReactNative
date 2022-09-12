package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_InAppNotificationTarget extends C$AutoValue_InAppNotificationTarget implements Parcelable {
    public static final Parcelable.Creator<AutoValue_InAppNotificationTarget> CREATOR = new cydd();
    private static final ClassLoader h = AutoValue_InAppNotificationTarget.class.getClassLoader();

    public AutoValue_InAppNotificationTarget(Parcel parcel) {
        super(cyep.values()[parcel.readInt()], (PersonFieldMetadata) parcel.readParcelable(h), parcel.readByte() == 1 ? duff.a(parcel.readInt()) : 0, dcdc.t((ContactMethodField[]) dcdc.t(parcel.readParcelableArray(ContactMethodField.class.getClassLoader())).toArray(new ContactMethodField[0])), parcel.readByte() == 1 ? parcel.readString() : null, parcel.readString());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(((C$AutoValue_InAppNotificationTarget) this).a.ordinal());
        byte b = 0;
        parcel.writeParcelable(this.b, 0);
        parcel.writeByte(this.f == 0 ? (byte) 0 : (byte) 1);
        int i2 = this.f;
        if (i2 != 0) {
            parcel.writeInt(i2 - 1);
        }
        parcel.writeParcelableArray((Parcelable[]) this.c.toArray(new Parcelable[0]), 0);
        if (this.d != null) {
            b = 1;
        }
        parcel.writeByte(b);
        String str = this.d;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeString(this.e.toString());
    }

    public AutoValue_InAppNotificationTarget(cyep cyepVar, PersonFieldMetadata personFieldMetadata, int i, dcdc<ContactMethodField> dcdcVar, String str, CharSequence charSequence) {
        super(cyepVar, personFieldMetadata, i, dcdcVar, str, charSequence);
    }
}
