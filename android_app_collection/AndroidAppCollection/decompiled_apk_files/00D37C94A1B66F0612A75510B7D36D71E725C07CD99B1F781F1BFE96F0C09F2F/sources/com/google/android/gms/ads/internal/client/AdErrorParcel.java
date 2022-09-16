package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AdErrorParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pva(9);
    public final int a;
    public final String b;
    public final String c;
    public AdErrorParcel d;
    public IBinder e;

    public AdErrorParcel(int i, String str, String str2, AdErrorParcel adErrorParcel, IBinder iBinder) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = adErrorParcel;
        this.e = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.F(parcel, 2, this.b);
        tqj.F(parcel, 3, this.c);
        tqj.E(parcel, 4, this.d, i);
        tqj.y(parcel, 5, this.e);
        tqj.n(parcel, m);
    }

    public final pyw a() {
        AdErrorParcel adErrorParcel = this.d;
        return new pyw(this.a, this.b, this.c, adErrorParcel == null ? null : new pyw(adErrorParcel.a, adErrorParcel.b, adErrorParcel.c));
    }

    public final pzg b() {
        qcd qcdVar;
        AdErrorParcel adErrorParcel = this.d;
        pzi pziVar = null;
        pyw pywVar = adErrorParcel == null ? null : new pyw(adErrorParcel.a, adErrorParcel.b, adErrorParcel.c);
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        IBinder iBinder = this.e;
        if (iBinder == null) {
            qcdVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if (queryLocalInterface instanceof qcd) {
                qcdVar = (qcd) queryLocalInterface;
            } else {
                qcdVar = new qcd(iBinder);
            }
        }
        if (qcdVar != null) {
            pziVar = new pzi(qcdVar);
        }
        return new pzg(i, str, str2, pywVar, pziVar);
    }
}
