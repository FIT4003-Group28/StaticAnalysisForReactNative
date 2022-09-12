package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_Email_EmailSecurityData extends C$AutoValue_Email_EmailSecurityData implements Parcelable {
    public static final Parcelable.Creator<AutoValue_Email_EmailSecurityData> CREATOR = new cycz();
    private static final ClassLoader b = AutoValue_Email_EmailSecurityData.class.getClassLoader();

    public AutoValue_Email_EmailSecurityData(Parcel parcel) {
        super(((Boolean) parcel.readValue(b)).booleanValue());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(Boolean.valueOf(this.a));
    }

    public AutoValue_Email_EmailSecurityData(boolean z) {
        super(z);
    }
}
