package defpackage;

import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: coid  reason: default package */
/* loaded from: classes5.dex */
public final class coid extends cla implements coie {
    public coid(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IInAppJobService");
    }

    @Override // defpackage.coie
    public final void e() {
        Sk(2, a());
    }

    @Override // defpackage.coie
    public final void f(int i) {
        Parcel a = a();
        a.writeInt(i);
        Sk(3, a);
    }

    @Override // defpackage.coie
    public final int g(Intent intent, int i, int i2) {
        Parcel a = a();
        clc.e(a, intent);
        a.writeInt(i);
        a.writeInt(i2);
        Parcel Si = Si(4, a);
        int readInt = Si.readInt();
        Si.recycle();
        return readInt;
    }

    @Override // defpackage.coie
    public final boolean h(Intent intent) {
        Parcel a = a();
        clc.e(a, intent);
        Parcel Si = Si(5, a);
        boolean a2 = clc.a(Si);
        Si.recycle();
        return a2;
    }

    @Override // defpackage.coie
    public final void i(Intent intent) {
        Parcel a = a();
        clc.e(a, intent);
        Sk(6, a);
    }

    @Override // defpackage.coie
    public final boolean j(JobParameters jobParameters) {
        Parcel a = a();
        clc.e(a, jobParameters);
        Parcel Si = Si(7, a);
        boolean a2 = clc.a(Si);
        Si.recycle();
        return a2;
    }

    @Override // defpackage.coie
    public final boolean k(JobParameters jobParameters) {
        Parcel a = a();
        clc.e(a, jobParameters);
        Parcel Si = Si(8, a);
        boolean a2 = clc.a(Si);
        Si.recycle();
        return a2;
    }

    @Override // defpackage.coie
    public final boolean l(coba cobaVar, coba cobaVar2) {
        Parcel a = a();
        clc.f(a, cobaVar);
        clc.f(a, cobaVar2);
        Parcel Si = Si(9, a);
        boolean a2 = clc.a(Si);
        Si.recycle();
        return a2;
    }
}
