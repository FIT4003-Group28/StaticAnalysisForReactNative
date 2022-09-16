package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetRecentContextCall$Response extends AbstractSafeParcelable implements qte {
    public static final Parcelable.Creator CREATOR = new qhh(5);
    public Status a;
    public List b;
    @Deprecated
    public String[] c;

    public GetRecentContextCall$Response() {
    }

    public GetRecentContextCall$Response(Status status, List list, String[] strArr) {
        this.a = status;
        this.b = list;
        this.c = strArr;
    }

    @Override // defpackage.qte
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.E(parcel, 1, this.a, i);
        tqj.J(parcel, 2, this.b);
        tqj.G(parcel, 3, this.c);
        tqj.n(parcel, m);
    }
}
