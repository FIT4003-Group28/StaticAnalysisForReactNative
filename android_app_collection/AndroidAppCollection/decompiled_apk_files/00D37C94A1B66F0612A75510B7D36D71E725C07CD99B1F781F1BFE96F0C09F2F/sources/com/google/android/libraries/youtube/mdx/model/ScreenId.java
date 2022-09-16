package com.google.android.libraries.youtube.mdx.model;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class ScreenId extends adit implements Parcelable {
    public static final Parcelable.Creator CREATOR = new abjw(11);

    public ScreenId(String str) {
        super(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
    }
}
