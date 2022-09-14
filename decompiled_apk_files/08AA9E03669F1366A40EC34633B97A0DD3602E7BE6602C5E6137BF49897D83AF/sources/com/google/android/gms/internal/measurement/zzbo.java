package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class zzbo implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator<zzbo> CREATOR = new zzbp();
    private String value;
    private String zzno;
    private String zzxu;

    @Deprecated
    public zzbo() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public zzbo(Parcel parcel) {
        this.zzno = parcel.readString();
        this.zzxu = parcel.readString();
        this.value = parcel.readString();
    }

    @Override // android.os.Parcelable
    @Deprecated
    public final int describeContents() {
        return 0;
    }

    public final String getId() {
        return this.zzno;
    }

    public final String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    @Deprecated
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzno);
        parcel.writeString(this.zzxu);
        parcel.writeString(this.value);
    }
}
