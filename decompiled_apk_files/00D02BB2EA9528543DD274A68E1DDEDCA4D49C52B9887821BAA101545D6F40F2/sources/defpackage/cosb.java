package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.measurement.api.internal.InitializationParams;
/* compiled from: PG */
/* renamed from: cosb  reason: default package */
/* loaded from: classes5.dex */
public final class cosb extends cla implements IInterface {
    public cosb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void e(coba cobaVar, InitializationParams initializationParams, long j) {
        Parcel a = a();
        clc.f(a, cobaVar);
        clc.e(a, initializationParams);
        a.writeLong(j);
        Sk(1, a);
    }

    public final void f(coba cobaVar, String str, String str2, long j) {
        Parcel a = a();
        clc.f(a, cobaVar);
        a.writeString(str);
        a.writeString(str2);
        a.writeLong(j);
        Sk(15, a);
    }

    public final void g(coba cobaVar, long j) {
        Parcel a = a();
        clc.f(a, cobaVar);
        a.writeLong(j);
        Sk(25, a);
    }

    public final void h(coba cobaVar, long j) {
        Parcel a = a();
        clc.f(a, cobaVar);
        a.writeLong(j);
        Sk(26, a);
    }

    public final void i(coba cobaVar, Bundle bundle, long j) {
        Parcel a = a();
        clc.f(a, cobaVar);
        clc.e(a, bundle);
        a.writeLong(j);
        Sk(27, a);
    }

    public final void j(coba cobaVar, long j) {
        Parcel a = a();
        clc.f(a, cobaVar);
        a.writeLong(j);
        Sk(28, a);
    }

    public final void k(coba cobaVar, long j) {
        Parcel a = a();
        clc.f(a, cobaVar);
        a.writeLong(j);
        Sk(29, a);
    }

    public final void l(coba cobaVar, long j) {
        Parcel a = a();
        clc.f(a, cobaVar);
        a.writeLong(j);
        Sk(30, a);
    }

    public final void m(coba cobaVar, cosd cosdVar, long j) {
        Parcel a = a();
        clc.f(a, cobaVar);
        clc.f(a, cosdVar);
        a.writeLong(j);
        Sk(31, a);
    }

    public final void n(String str, String str2, Bundle bundle, boolean z, long j) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        clc.e(a, bundle);
        a.writeInt(z ? 1 : 0);
        a.writeInt(1);
        a.writeLong(j);
        Sk(2, a);
    }

    public final void o(coba cobaVar, coba cobaVar2, coba cobaVar3) {
        Parcel a = a();
        a.writeInt(5);
        a.writeString("Error with data collection. Data lost.");
        clc.f(a, cobaVar);
        clc.f(a, cobaVar2);
        clc.f(a, cobaVar3);
        Sk(33, a);
    }

    public final void p(coba cobaVar, long j) {
        Parcel a = a();
        a.writeString("fcm");
        a.writeString("_ln");
        clc.f(a, cobaVar);
        a.writeInt(1);
        a.writeLong(j);
        Sk(4, a);
    }
}
