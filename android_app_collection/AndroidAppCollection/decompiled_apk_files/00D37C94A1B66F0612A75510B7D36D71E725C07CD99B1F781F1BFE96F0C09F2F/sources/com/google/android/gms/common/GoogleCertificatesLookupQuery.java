package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleCertificatesLookupQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qpm(8);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private final Context e;

    public GoogleCertificatesLookupQuery(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        rad rabVar;
        this.a = str;
        this.b = z;
        this.c = z2;
        if (iBinder == null) {
            rabVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof rad) {
                rabVar = (rad) queryLocalInterface;
            } else {
                rabVar = new rab(iBinder);
            }
        }
        this.e = (Context) rac.b(rabVar);
        this.d = z3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [rad, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 1, this.a);
        tqj.o(parcel, 2, this.b);
        tqj.o(parcel, 3, this.c);
        tqj.y(parcel, 4, rac.a(this.e));
        tqj.o(parcel, 5, this.d);
        tqj.n(parcel, m);
    }
}
