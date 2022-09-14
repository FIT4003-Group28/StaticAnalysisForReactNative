package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class t3 extends c.e.a.b.d.g.a implements r3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final List<oa> a(String str, String str2, fa faVar) {
        Parcel e2 = e();
        e2.writeString(str);
        e2.writeString(str2);
        c.e.a.b.d.g.b0.a(e2, faVar);
        Parcel a2 = a(16, e2);
        ArrayList createTypedArrayList = a2.createTypedArrayList(oa.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final List<oa> a(String str, String str2, String str3) {
        Parcel e2 = e();
        e2.writeString(str);
        e2.writeString(str2);
        e2.writeString(str3);
        Parcel a2 = a(17, e2);
        ArrayList createTypedArrayList = a2.createTypedArrayList(oa.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final List<y9> a(String str, String str2, String str3, boolean z) {
        Parcel e2 = e();
        e2.writeString(str);
        e2.writeString(str2);
        e2.writeString(str3);
        c.e.a.b.d.g.b0.a(e2, z);
        Parcel a2 = a(15, e2);
        ArrayList createTypedArrayList = a2.createTypedArrayList(y9.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final List<y9> a(String str, String str2, boolean z, fa faVar) {
        Parcel e2 = e();
        e2.writeString(str);
        e2.writeString(str2);
        c.e.a.b.d.g.b0.a(e2, z);
        c.e.a.b.d.g.b0.a(e2, faVar);
        Parcel a2 = a(14, e2);
        ArrayList createTypedArrayList = a2.createTypedArrayList(y9.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void a(long j, String str, String str2, String str3) {
        Parcel e2 = e();
        e2.writeLong(j);
        e2.writeString(str);
        e2.writeString(str2);
        e2.writeString(str3);
        b(10, e2);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void a(Bundle bundle, fa faVar) {
        Parcel e2 = e();
        c.e.a.b.d.g.b0.a(e2, bundle);
        c.e.a.b.d.g.b0.a(e2, faVar);
        b(19, e2);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void a(fa faVar) {
        Parcel e2 = e();
        c.e.a.b.d.g.b0.a(e2, faVar);
        b(4, e2);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void a(oa oaVar) {
        Parcel e2 = e();
        c.e.a.b.d.g.b0.a(e2, oaVar);
        b(13, e2);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void a(oa oaVar, fa faVar) {
        Parcel e2 = e();
        c.e.a.b.d.g.b0.a(e2, oaVar);
        c.e.a.b.d.g.b0.a(e2, faVar);
        b(12, e2);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void a(p pVar, fa faVar) {
        Parcel e2 = e();
        c.e.a.b.d.g.b0.a(e2, pVar);
        c.e.a.b.d.g.b0.a(e2, faVar);
        b(1, e2);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void a(p pVar, String str, String str2) {
        Parcel e2 = e();
        c.e.a.b.d.g.b0.a(e2, pVar);
        e2.writeString(str);
        e2.writeString(str2);
        b(5, e2);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void a(y9 y9Var, fa faVar) {
        Parcel e2 = e();
        c.e.a.b.d.g.b0.a(e2, y9Var);
        c.e.a.b.d.g.b0.a(e2, faVar);
        b(2, e2);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final byte[] a(p pVar, String str) {
        Parcel e2 = e();
        c.e.a.b.d.g.b0.a(e2, pVar);
        e2.writeString(str);
        Parcel a2 = a(9, e2);
        byte[] createByteArray = a2.createByteArray();
        a2.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void b(fa faVar) {
        Parcel e2 = e();
        c.e.a.b.d.g.b0.a(e2, faVar);
        b(6, e2);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final String c(fa faVar) {
        Parcel e2 = e();
        c.e.a.b.d.g.b0.a(e2, faVar);
        Parcel a2 = a(11, e2);
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void d(fa faVar) {
        Parcel e2 = e();
        c.e.a.b.d.g.b0.a(e2, faVar);
        b(18, e2);
    }
}
