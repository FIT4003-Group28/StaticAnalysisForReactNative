package com.google.android.apps.gmm.mapsactivity.webview;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_TransparentWebViewConfig extends C$AutoValue_TransparentWebViewConfig {
    public static final Parcelable.Creator<AutoValue_TransparentWebViewConfig> CREATOR = new apli();

    public AutoValue_TransparentWebViewConfig(String str, dszg dszgVar, dbsg<gfs> dbsgVar, boolean z, boolean z2, boolean z3, dbsg<ckpa> dbsgVar2, int i) {
        super(str, dszgVar, dbsgVar, z, z2, z3, dbsgVar2, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
        parcel.writeSerializable(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeSerializable(this.g);
        parcel.writeInt(this.h);
    }
}
