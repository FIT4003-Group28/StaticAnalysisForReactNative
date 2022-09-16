package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new cnut();
    public final int a;
    public final int b;
    public int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle g;
    public Account h;
    public Feature[] i;
    public Feature[] j;
    public boolean k;
    public int l;
    public boolean m;
    public final String n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cnut.a(this, parcel, i);
    }

    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                cnvj cnvjVar = queryLocalInterface instanceof cnvj ? (cnvj) queryLocalInterface : new cnvj(iBinder);
                if (cnvjVar != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = cnvjVar.e();
                    } catch (RemoteException unused) {
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.h = account2;
        } else {
            this.e = iBinder;
            this.h = account;
        }
        this.f = scopeArr;
        this.g = bundle;
        this.i = featureArr;
        this.j = featureArr2;
        this.k = z;
        this.l = i4;
        this.m = z2;
        this.n = str2;
    }

    public GetServiceRequest(int i, String str) {
        this.a = 6;
        this.c = cnmr.c;
        this.b = i;
        this.k = true;
        this.n = str;
    }
}
