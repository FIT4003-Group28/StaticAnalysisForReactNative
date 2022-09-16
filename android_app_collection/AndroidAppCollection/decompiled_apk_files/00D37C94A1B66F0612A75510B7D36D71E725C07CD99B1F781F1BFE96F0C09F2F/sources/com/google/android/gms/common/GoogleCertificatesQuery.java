package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleCertificatesQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qpm(10);
    public final String a;
    public final boolean b;
    public final boolean c;
    private final qxn d;

    public GoogleCertificatesQuery(String str, IBinder iBinder, boolean z, boolean z2) {
        qxo qxmVar;
        this.a = str;
        qrx qrxVar = null;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (queryLocalInterface instanceof qxo) {
                    qxmVar = (qxo) queryLocalInterface;
                } else {
                    qxmVar = new qxm(iBinder);
                }
                rad f = qxmVar.f();
                byte[] bArr = f == null ? null : (byte[]) rac.b(f);
                if (bArr != null) {
                    qrxVar = new qrx(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.d = qrxVar;
        this.b = z;
        this.c = z2;
    }

    public GoogleCertificatesQuery(String str, qxn qxnVar, boolean z, boolean z2) {
        this.a = str;
        this.d = qxnVar;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 1, this.a);
        qxn qxnVar = this.d;
        if (qxnVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            qxnVar = null;
        }
        tqj.y(parcel, 2, qxnVar);
        tqj.o(parcel, 3, this.b);
        tqj.o(parcel, 4, this.c);
        tqj.n(parcel, m);
    }
}
