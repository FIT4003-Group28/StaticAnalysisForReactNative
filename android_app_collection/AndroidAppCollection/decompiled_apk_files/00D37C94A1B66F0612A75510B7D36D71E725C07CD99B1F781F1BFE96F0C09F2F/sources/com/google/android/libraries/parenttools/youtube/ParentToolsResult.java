package com.google.android.libraries.parenttools.youtube;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ParentToolsResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new rxi(12);

    public static usv c() {
        usv usvVar = new usv();
        usvVar.b(1);
        return usvVar;
    }

    public abstract byte[] a();

    public abstract int b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(a());
        parcel.writeInt(b() - 1);
    }
}
