package com.google.android.apps.youtube.app.extensions.reel.common;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment$SavedState;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ReelWatchBackstack$BackstackEntry implements Parcelable {
    public static final Parcelable.Creator CREATOR = new gta(2);
    public final apzg a;
    public final Bundle b;
    public final Fragment$SavedState c;
    public final Object d;

    public ReelWatchBackstack$BackstackEntry(Parcel parcel) {
        this.a = aafr.c(parcel.createByteArray());
        this.b = parcel.readBundle(getClass().getClassLoader());
        this.c = (Fragment$SavedState) parcel.readParcelable(Fragment$SavedState.class.getClassLoader());
        this.d = null;
    }

    private ReelWatchBackstack$BackstackEntry(apzg apzgVar, Bundle bundle, Fragment$SavedState fragment$SavedState, Object obj) {
        this.a = apzgVar;
        this.b = bundle;
        this.c = fragment$SavedState;
        this.d = obj;
    }

    public static ReelWatchBackstack$BackstackEntry a(apzg apzgVar, Bundle bundle, Fragment$SavedState fragment$SavedState, Object obj) {
        return new ReelWatchBackstack$BackstackEntry(apzgVar, bundle, fragment$SavedState, obj);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a.toByteArray());
        parcel.writeBundle(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
