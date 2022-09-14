package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class RecordConsentByConsentResultResponse extends AbstractSafeParcelable implements cnom {
    public static final Parcelable.Creator<RecordConsentByConsentResultResponse> CREATOR = new cozh();
    public final List<String> a;
    public final String b;

    public RecordConsentByConsentResultResponse(List<String> list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.b != null ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.w(parcel, 1, this.a);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.c(parcel, d);
    }
}
