package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.m0;
/* loaded from: classes.dex */
public final class y extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<y> CREATOR = new z();

    /* renamed from: b  reason: collision with root package name */
    private final String f7122b;

    /* renamed from: c  reason: collision with root package name */
    private final s f7123c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f7124d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f7125e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(String str, IBinder iBinder, boolean z, boolean z2) {
        this.f7122b = str;
        this.f7123c = a(iBinder);
        this.f7124d = z;
        this.f7125e = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(String str, s sVar, boolean z, boolean z2) {
        this.f7122b = str;
        this.f7123c = sVar;
        this.f7124d = z;
        this.f7125e = z2;
    }

    private static s a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            c.e.a.b.c.a j = m0.a(iBinder).j();
            byte[] bArr = j == null ? null : (byte[]) c.e.a.b.c.b.a(j);
            if (bArr != null) {
                return new t(bArr);
            }
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (RemoteException e2) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e2);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f7122b, false);
        s sVar = this.f7123c;
        if (sVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            sVar = null;
        } else {
            sVar.asBinder();
        }
        com.google.android.gms.common.internal.x.c.a(parcel, 2, (IBinder) sVar, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f7124d);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, this.f7125e);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
