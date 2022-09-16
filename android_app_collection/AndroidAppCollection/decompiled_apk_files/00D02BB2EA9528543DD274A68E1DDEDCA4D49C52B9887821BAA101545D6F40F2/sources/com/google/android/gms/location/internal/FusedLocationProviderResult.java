package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class FusedLocationProviderResult extends AbstractSafeParcelable implements cnom {
    public static final Parcelable.Creator<FusedLocationProviderResult> CREATOR;
    public final Status a;

    static {
        new FusedLocationProviderResult(Status.a);
        CREATOR = new coms();
    }

    public FusedLocationProviderResult(Status status) {
        this.a = status;
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 1, this.a, i);
        cnwn.c(parcel, d);
    }
}
