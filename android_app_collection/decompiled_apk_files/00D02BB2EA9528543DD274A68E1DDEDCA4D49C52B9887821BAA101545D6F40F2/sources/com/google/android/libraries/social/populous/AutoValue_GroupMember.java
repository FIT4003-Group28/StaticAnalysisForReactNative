package com.google.android.libraries.social.populous;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_GroupMember extends C$AutoValue_GroupMember implements Parcelable {
    public static final Parcelable.Creator<AutoValue_GroupMember> CREATOR = new cxxq();
    private static final ClassLoader c = AutoValue_GroupMember.class.getClassLoader();

    public AutoValue_GroupMember(Parcel parcel) {
        super(new int[]{1, 2}[parcel.readInt()], parcel.readByte() == 1 ? (Person) parcel.readParcelable(c) : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b - 1);
        parcel.writeByte(this.a == null ? (byte) 0 : (byte) 1);
        Person person = this.a;
        if (person != null) {
            parcel.writeParcelable(person, 0);
        }
    }

    public AutoValue_GroupMember(int i, Person person) {
        super(i, person);
    }
}
