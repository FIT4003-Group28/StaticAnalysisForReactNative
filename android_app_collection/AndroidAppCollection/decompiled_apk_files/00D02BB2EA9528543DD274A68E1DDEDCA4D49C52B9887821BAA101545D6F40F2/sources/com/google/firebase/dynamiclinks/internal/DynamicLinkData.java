package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DynamicLinkData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DynamicLinkData> CREATOR = new depu();
    public String a;
    public String b;
    public int c;
    public long d;
    public Uri e;
    private Bundle f;

    public DynamicLinkData(String str, String str2, int i, long j, Bundle bundle, Uri uri) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.f = bundle;
        this.e = uri;
    }

    public final Bundle a() {
        Bundle bundle = this.f;
        return bundle == null ? new Bundle() : bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.g(parcel, 3, this.c);
        cnwn.h(parcel, 4, this.d);
        cnwn.m(parcel, 5, a());
        cnwn.u(parcel, 6, this.e, i);
        cnwn.c(parcel, d);
    }
}
