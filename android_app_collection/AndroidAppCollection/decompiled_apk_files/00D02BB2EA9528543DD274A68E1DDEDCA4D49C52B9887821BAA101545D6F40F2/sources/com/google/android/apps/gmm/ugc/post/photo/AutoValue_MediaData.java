package com.google.android.apps.gmm.ugc.post.photo;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_MediaData extends C$AutoValue_MediaData {
    public static final Parcelable.Creator<AutoValue_MediaData> CREATOR = new cduq();

    public AutoValue_MediaData(Uri uri, dbsg<String> dbsgVar, int i, dbsg<String> dbsgVar2, dbsg<Integer> dbsgVar3, dbsg<Integer> dbsgVar4, dbsg<Integer> dbsgVar5) {
        super(uri, dbsgVar, i, dbsgVar2, dbsgVar3, dbsgVar4, dbsgVar5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeSerializable(this.b);
        parcel.writeString(cdyg.a(this.g));
        parcel.writeSerializable(this.c);
        parcel.writeSerializable(this.d);
        parcel.writeSerializable(this.e);
        parcel.writeSerializable(this.f);
    }
}
