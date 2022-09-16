package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class RecordConsentByConsentResultResponse extends AbstractSafeParcelable implements qte {
    public static final Parcelable.Creator CREATOR = new ruc();
    public final List a;
    public final String b;

    public RecordConsentByConsentResultResponse(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // defpackage.qte
    public final Status a() {
        return this.b != null ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.H(parcel, 1, this.a);
        tqj.F(parcel, 2, this.b);
        tqj.n(parcel, m);
    }
}
