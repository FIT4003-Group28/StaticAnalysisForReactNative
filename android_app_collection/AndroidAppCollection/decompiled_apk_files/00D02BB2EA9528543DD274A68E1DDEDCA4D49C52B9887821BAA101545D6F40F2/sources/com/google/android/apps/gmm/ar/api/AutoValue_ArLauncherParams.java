package com.google.android.apps.gmm.ar.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_ArLauncherParams extends C$AutoValue_ArLauncherParams {
    public static final Parcelable.Creator<AutoValue_ArLauncherParams> CREATOR = new dab();

    public AutoValue_ArLauncherParams(czh czhVar, Iterable<dcvs> iterable, dcdc<czq> dcdcVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, doi doiVar, @dzsi ImageView.ScaleType scaleType, dcdn<czq, String> dcdnVar, dcdn<czq, String> dcdnVar2, dcdn<czq, String> dcdnVar3) {
        super(czhVar, iterable, dcdcVar, z, z2, z3, z4, z5, z6, doiVar, scaleType, dcdnVar, dcdnVar2, dcdnVar3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        dcdc q = dcdc.q(this.b);
        parcel.writeInt(q.size());
        int size = q.size();
        for (int i2 = 0; i2 < size; i2++) {
            dcvs dcvsVar = (dcvs) q.get(i2);
            parcel.writeDouble(dcvsVar.b);
            parcel.writeDouble(dcvsVar.c);
        }
        parcel.writeList(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeString(this.j.name());
        if (this.k == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            ImageView.ScaleType scaleType = this.k;
            if (scaleType == null) {
                parcel.writeInt(-1);
            } else {
                parcel.writeInt(scaleType.ordinal());
            }
        }
        czr.b(this.l, parcel);
        czr.b(this.m, parcel);
        czr.b(this.n, parcel);
    }
}
