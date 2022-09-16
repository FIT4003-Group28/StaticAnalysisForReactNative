package com.google.android.libraries.social.populous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.GroupMetadata;
import com.google.android.libraries.social.populous.core.GroupOrigin;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_Group extends C$AutoValue_Group implements Parcelable {
    public static final Parcelable.Creator<AutoValue_Group> CREATOR = new cxxp();
    private static final ClassLoader f = AutoValue_Group.class.getClassLoader();

    public AutoValue_Group(Parcel parcel) {
        super(parcel.readString(), parcel.readString(), (GroupMetadata) parcel.readParcelable(f), dcdc.t((GroupOrigin[]) dcdc.t(parcel.readParcelableArray(GroupOrigin.class.getClassLoader())).toArray(new GroupOrigin[0])), dcdc.t((GroupMember[]) parcel.createTypedArray(AutoValue_GroupMember.CREATOR)));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelableArray((Parcelable[]) this.d.toArray(new Parcelable[0]), 0);
        parcel.writeTypedArray((AutoValue_GroupMember[]) this.e.toArray(new AutoValue_GroupMember[0]), 0);
    }

    public AutoValue_Group(String str, String str2, GroupMetadata groupMetadata, dcdc<GroupOrigin> dcdcVar, dcdc<GroupMember> dcdcVar2) {
        super(str, str2, groupMetadata, dcdcVar, dcdcVar2);
    }
}
