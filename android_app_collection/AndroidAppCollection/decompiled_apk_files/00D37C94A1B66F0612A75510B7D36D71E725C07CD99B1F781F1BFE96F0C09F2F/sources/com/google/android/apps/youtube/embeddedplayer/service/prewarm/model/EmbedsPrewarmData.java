package com.google.android.apps.youtube.embeddedplayer.service.prewarm.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.model.m;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class EmbedsPrewarmData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new m(3);

    public static a c() {
        return new a();
    }

    public abstract int a();

    public abstract String b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(a());
        parcel.writeString(b());
    }
}
