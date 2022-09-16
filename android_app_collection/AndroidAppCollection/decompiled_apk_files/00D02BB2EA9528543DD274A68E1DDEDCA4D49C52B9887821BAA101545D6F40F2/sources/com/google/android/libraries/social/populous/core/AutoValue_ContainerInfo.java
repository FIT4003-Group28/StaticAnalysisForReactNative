package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_ContainerInfo extends C$AutoValue_ContainerInfo implements Parcelable {
    public static final Parcelable.Creator<AutoValue_ContainerInfo> CREATOR = new cyct();
    private static final ClassLoader d = AutoValue_ContainerInfo.class.getClassLoader();

    public AutoValue_ContainerInfo(Parcel parcel) {
        super(duej.b(parcel.readInt()), parcel.readString(), ((Boolean) parcel.readValue(d)).booleanValue());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.p);
        parcel.writeString(this.b);
        parcel.writeValue(Boolean.valueOf(this.c));
    }

    public AutoValue_ContainerInfo(duej duejVar, String str) {
        super(duejVar, str, false);
    }
}
