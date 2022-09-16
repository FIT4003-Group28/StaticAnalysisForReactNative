package com.google.android.apps.youtube.embeddedplayer.service.innertube.model;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ProtoWrapper implements Parcelable {
    public final aopi a;

    public ProtoWrapper(aopi aopiVar) {
        this.a = aopiVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zgd.K(this.a, parcel);
    }
}
