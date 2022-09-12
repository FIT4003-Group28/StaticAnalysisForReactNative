package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GoogleCertificatesLookupQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleCertificatesLookupQuery> CREATOR = new cnnc();
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private final Context e;

    public GoogleCertificatesLookupQuery(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        coba coayVar;
        this.a = str;
        this.b = z;
        this.c = z2;
        if (iBinder == null) {
            coayVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof coba) {
                coayVar = (coba) queryLocalInterface;
            } else {
                coayVar = new coay(iBinder);
            }
        }
        this.e = (Context) cobb.c(coayVar);
        this.d = z3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [coba, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnwn.e(parcel, 2, this.b);
        cnwn.e(parcel, 3, this.c);
        cnwn.p(parcel, 4, cobb.b(this.e));
        cnwn.e(parcel, 5, this.d);
        cnwn.c(parcel, d);
    }
}
