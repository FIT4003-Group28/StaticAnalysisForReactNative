package com.google.android.libraries.social.populous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.ContactMethodField;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_Autocompletion extends C$AutoValue_Autocompletion implements Parcelable {
    public static final Parcelable.Creator<AutoValue_Autocompletion> CREATOR = new cxxo();
    private static final ClassLoader e = AutoValue_Autocompletion.class.getClassLoader();

    public AutoValue_Autocompletion(Parcel parcel) {
        super(new int[]{1, 2, 3}[parcel.readInt()], dcdc.t((ContactMethodField[]) dcdc.t(parcel.readParcelableArray(ContactMethodField.class.getClassLoader())).toArray(new ContactMethodField[0])), parcel.readByte() == 1 ? (Person) parcel.readParcelable(e) : null, parcel.readByte() == 1 ? (Group) parcel.readParcelable(e) : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.d - 1);
        parcel.writeParcelableArray((Parcelable[]) ((C$AutoValue_Autocompletion) this).a.toArray(new Parcelable[0]), 0);
        byte b = 1;
        parcel.writeByte(this.b == null ? (byte) 0 : (byte) 1);
        Person person = this.b;
        if (person != null) {
            parcel.writeParcelable(person, 0);
        }
        if (this.c == null) {
            b = 0;
        }
        parcel.writeByte(b);
        Group group = this.c;
        if (group != null) {
            parcel.writeParcelable(group, 0);
        }
    }

    public AutoValue_Autocompletion(int i, dcdc<ContactMethodField> dcdcVar, Person person, Group group) {
        super(i, dcdcVar, person, group);
    }
}
