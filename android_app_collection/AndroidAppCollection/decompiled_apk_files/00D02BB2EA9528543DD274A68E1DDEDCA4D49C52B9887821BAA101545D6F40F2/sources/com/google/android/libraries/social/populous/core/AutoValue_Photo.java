package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_Photo extends C$AutoValue_Photo implements Parcelable {
    public static final Parcelable.Creator<AutoValue_Photo> CREATOR = new cydm();
    private static final ClassLoader e = AutoValue_Photo.class.getClassLoader();

    public AutoValue_Photo(int i, String str, PersonFieldMetadata personFieldMetadata, boolean z) {
        super(i, str, personFieldMetadata, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeValue(Boolean.valueOf(this.d));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AutoValue_Photo(android.os.Parcel r5) {
        /*
            r4 = this;
            int r0 = r5.readInt()
            java.lang.String r1 = r5.readString()
            java.lang.ClassLoader r2 = com.google.android.libraries.social.populous.core.AutoValue_Photo.e
            android.os.Parcelable r3 = r5.readParcelable(r2)
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r3 = (com.google.android.libraries.social.populous.core.PersonFieldMetadata) r3
            java.lang.Object r5 = r5.readValue(r2)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r4.<init>(r0, r1, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.AutoValue_Photo.<init>(android.os.Parcel):void");
    }
}
