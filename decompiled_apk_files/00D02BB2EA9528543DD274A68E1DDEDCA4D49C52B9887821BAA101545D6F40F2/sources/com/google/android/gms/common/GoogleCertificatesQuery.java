package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GoogleCertificatesQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleCertificatesQuery> CREATOR = new cnnf();
    public final String a;
    public final boolean b;
    public final boolean c;
    @dzsi
    private final cnmx d;

    public GoogleCertificatesQuery(String str, @dzsi IBinder iBinder, boolean z, boolean z2) {
        cnvn cnvlVar;
        this.a = str;
        cnmy cnmyVar = null;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (queryLocalInterface instanceof cnvn) {
                    cnvlVar = (cnvn) queryLocalInterface;
                } else {
                    cnvlVar = new cnvl(iBinder);
                }
                coba d = cnvlVar.d();
                byte[] bArr = d == null ? null : (byte[]) cobb.c(d);
                if (bArr != null) {
                    cnmyVar = new cnmy(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.d = cnmyVar;
        this.b = z;
        this.c = z2;
    }

    public GoogleCertificatesQuery(String str, @dzsi cnmx cnmxVar, boolean z, boolean z2) {
        this.a = str;
        this.d = cnmxVar;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnmx cnmxVar = this.d;
        if (cnmxVar == null) {
            cnmxVar = null;
        }
        cnwn.p(parcel, 2, cnmxVar);
        cnwn.e(parcel, 3, this.b);
        cnwn.e(parcel, 4, this.c);
        cnwn.c(parcel, d);
    }
}
