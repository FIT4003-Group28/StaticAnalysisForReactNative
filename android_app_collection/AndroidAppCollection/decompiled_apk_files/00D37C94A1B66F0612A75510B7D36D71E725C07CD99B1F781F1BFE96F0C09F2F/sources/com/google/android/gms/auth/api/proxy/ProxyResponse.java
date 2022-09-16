package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qhh(15);
    final int a;
    public final int b;
    public final PendingIntent c;
    public final int d;
    final Bundle e;
    public final byte[] f;

    public ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.e = bundle;
        this.f = bArr;
        this.c = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.b);
        tqj.E(parcel, 2, this.c, i);
        tqj.s(parcel, 3, this.d);
        tqj.v(parcel, 4, this.e);
        tqj.w(parcel, 5, this.f);
        tqj.s(parcel, 1000, this.a);
        tqj.n(parcel, m);
    }
}
