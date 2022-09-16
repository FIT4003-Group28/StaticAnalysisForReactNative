package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.Email;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_Email_Certificate extends C$AutoValue_Email_Certificate implements Parcelable {
    public static final Parcelable.Creator<AutoValue_Email_Certificate> CREATOR = new cycx();
    private static final ClassLoader d = AutoValue_Email_Certificate.class.getClassLoader();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AutoValue_Email_Certificate(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.ClassLoader r0 = com.google.android.libraries.social.populous.core.AutoValue_Email_Certificate.d
            android.os.Parcelable r1 = r3.readParcelable(r0)
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r1 = (com.google.android.libraries.social.populous.core.PersonFieldMetadata) r1
            android.os.Parcelable r0 = r3.readParcelable(r0)
            com.google.android.libraries.social.populous.core.Email$Certificate$CertificateStatus r0 = (com.google.android.libraries.social.populous.core.Email.Certificate.CertificateStatus) r0
            java.lang.String r3 = r3.readString()
            r2.<init>(r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.AutoValue_Email_Certificate.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeString(this.c);
    }

    public AutoValue_Email_Certificate(PersonFieldMetadata personFieldMetadata, Email.Certificate.CertificateStatus certificateStatus, String str) {
        super(personFieldMetadata, certificateStatus, str);
    }
}
