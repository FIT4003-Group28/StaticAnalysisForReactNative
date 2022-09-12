package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: coih  reason: default package */
/* loaded from: classes5.dex */
public final class coih extends cla implements coii {
    public coih(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IInAppTrainingService");
    }

    @Override // defpackage.coii
    public final void e(coba cobaVar) {
        Parcel a = a();
        clc.f(a, cobaVar);
        Sk(1, a);
    }

    @Override // defpackage.coii
    public final void f() {
        Sk(2, a());
    }

    @Override // defpackage.coii
    public final IBinder g(Intent intent) {
        Parcel a = a();
        clc.e(a, intent);
        Parcel Si = Si(3, a);
        IBinder readStrongBinder = Si.readStrongBinder();
        Si.recycle();
        return readStrongBinder;
    }

    @Override // defpackage.coii
    public final void h(int i) {
        Parcel a = a();
        a.writeInt(i);
        Sk(4, a);
    }

    @Override // defpackage.coii
    public final int i(Intent intent, int i, int i2) {
        Parcel a = a();
        clc.e(a, intent);
        a.writeInt(i);
        a.writeInt(i2);
        Parcel Si = Si(5, a);
        int readInt = Si.readInt();
        Si.recycle();
        return readInt;
    }

    @Override // defpackage.coii
    public final boolean j(Intent intent) {
        Parcel a = a();
        clc.e(a, intent);
        Parcel Si = Si(6, a);
        boolean a2 = clc.a(Si);
        Si.recycle();
        return a2;
    }

    @Override // defpackage.coii
    public final void k(Intent intent) {
        Parcel a = a();
        clc.e(a, intent);
        Sk(7, a);
    }

    @Override // defpackage.coii
    public final void l(cohw cohwVar) {
        Parcel a = a();
        clc.f(a, cohwVar);
        Sk(8, a);
    }
}
