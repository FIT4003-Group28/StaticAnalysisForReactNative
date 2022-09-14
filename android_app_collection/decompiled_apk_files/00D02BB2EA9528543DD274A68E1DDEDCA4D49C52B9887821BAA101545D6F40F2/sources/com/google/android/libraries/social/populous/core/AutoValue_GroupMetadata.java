package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_GroupMetadata extends C$AutoValue_GroupMetadata implements Parcelable {
    public static final Parcelable.Creator<AutoValue_GroupMetadata> CREATOR = new cydb();
    private static final ClassLoader g = AutoValue_GroupMetadata.class.getClassLoader();

    public AutoValue_GroupMetadata(int i, boolean z, long j, String str, PeopleApiAffinity peopleApiAffinity, int i2) {
        super(i, z, j, str, peopleApiAffinity, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeValue(Boolean.valueOf(this.b));
        parcel.writeLong(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, 0);
        parcel.writeInt(this.f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AutoValue_GroupMetadata(android.os.Parcel r9) {
        /*
            r8 = this;
            int r1 = r9.readInt()
            java.lang.ClassLoader r0 = com.google.android.libraries.social.populous.core.AutoValue_GroupMetadata.g
            java.lang.Object r2 = r9.readValue(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            long r3 = r9.readLong()
            java.lang.String r5 = r9.readString()
            android.os.Parcelable r0 = r9.readParcelable(r0)
            r6 = r0
            com.google.android.libraries.social.populous.core.PeopleApiAffinity r6 = (com.google.android.libraries.social.populous.core.PeopleApiAffinity) r6
            int r7 = r9.readInt()
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.AutoValue_GroupMetadata.<init>(android.os.Parcel):void");
    }
}
