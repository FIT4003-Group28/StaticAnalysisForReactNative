package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cmxu  reason: default package */
/* loaded from: classes5.dex */
public final class cmxu extends cla implements IInterface {
    public cmxu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarMessage");
    }

    public final void e(cmxw cmxwVar) {
        Parcel a = a();
        clc.f(a, cmxwVar);
        Sk(1, a);
    }

    public final void f(cmxw cmxwVar) {
        Parcel a = a();
        clc.f(a, cmxwVar);
        Sk(2, a);
    }

    public final boolean g(cmxw cmxwVar) {
        Parcel a = a();
        clc.f(a, cmxwVar);
        a.writeInt(1);
        Parcel Si = Si(3, a);
        boolean a2 = clc.a(Si);
        Si.recycle();
        return a2;
    }

    public final void h(cmxw cmxwVar) {
        Parcel a = a();
        clc.f(a, cmxwVar);
        a.writeInt(1);
        Sk(6, a);
    }

    public final void i(cmxw cmxwVar, int i) {
        Parcel a = a();
        clc.f(a, cmxwVar);
        a.writeInt(1);
        a.writeInt(0);
        a.writeInt(i);
        Sk(4, a);
    }
}
