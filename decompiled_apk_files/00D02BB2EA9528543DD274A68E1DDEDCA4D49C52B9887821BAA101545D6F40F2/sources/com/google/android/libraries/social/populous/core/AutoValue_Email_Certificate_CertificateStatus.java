package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_Email_Certificate_CertificateStatus extends C$AutoValue_Email_Certificate_CertificateStatus implements Parcelable {
    public static final Parcelable.Creator<AutoValue_Email_Certificate_CertificateStatus> CREATOR = new cycy();

    public AutoValue_Email_Certificate_CertificateStatus(double d, int i) {
        super(d, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.a);
        parcel.writeInt(this.b - 1);
    }

    public AutoValue_Email_Certificate_CertificateStatus(Parcel parcel) {
        super(parcel.readDouble(), dueq.a(parcel.readInt()));
    }
}
