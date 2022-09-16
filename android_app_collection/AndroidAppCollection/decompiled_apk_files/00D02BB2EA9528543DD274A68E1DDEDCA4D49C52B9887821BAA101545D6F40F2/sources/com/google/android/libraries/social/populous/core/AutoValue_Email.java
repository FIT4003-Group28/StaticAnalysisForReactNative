package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.Email;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_Email extends C$AutoValue_Email implements Parcelable {
    public static final Parcelable.Creator<AutoValue_Email> CREATOR = new cycw();
    private static final ClassLoader e = AutoValue_Email.class.getClassLoader();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AutoValue_Email(android.os.Parcel r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.readString()
            java.lang.ClassLoader r1 = com.google.android.libraries.social.populous.core.AutoValue_Email.e
            android.os.Parcelable r2 = r6.readParcelable(r1)
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r2 = (com.google.android.libraries.social.populous.core.PersonFieldMetadata) r2
            byte r3 = r6.readByte()
            r4 = 1
            if (r3 != r4) goto L1a
            android.os.Parcelable r1 = r6.readParcelable(r1)
            com.google.android.libraries.social.populous.core.Email$ExtendedData r1 = (com.google.android.libraries.social.populous.core.Email.ExtendedData) r1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            android.os.Parcelable$Creator<com.google.android.libraries.social.populous.core.AutoValue_Email_Certificate> r3 = com.google.android.libraries.social.populous.core.AutoValue_Email_Certificate.CREATOR
            java.lang.Object[] r6 = r6.createTypedArray(r3)
            com.google.android.libraries.social.populous.core.Email$Certificate[] r6 = (com.google.android.libraries.social.populous.core.Email.Certificate[]) r6
            dcdc r6 = defpackage.dcdc.t(r6)
            r5.<init>(r0, r2, r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.AutoValue_Email.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(((C$AutoValue_Email) this).a.toString());
        parcel.writeParcelable(this.b, 0);
        parcel.writeByte(this.c == null ? (byte) 0 : (byte) 1);
        Email.ExtendedData extendedData = this.c;
        if (extendedData != null) {
            parcel.writeParcelable(extendedData, 0);
        }
        parcel.writeTypedArray((AutoValue_Email_Certificate[]) this.d.toArray(new AutoValue_Email_Certificate[0]), 0);
    }

    public AutoValue_Email(CharSequence charSequence, PersonFieldMetadata personFieldMetadata, Email.ExtendedData extendedData, dcdc<Email.Certificate> dcdcVar) {
        super(charSequence, personFieldMetadata, extendedData, dcdcVar);
    }
}
