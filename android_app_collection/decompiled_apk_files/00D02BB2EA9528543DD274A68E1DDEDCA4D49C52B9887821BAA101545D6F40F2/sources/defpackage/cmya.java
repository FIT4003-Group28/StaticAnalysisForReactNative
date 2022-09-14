package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cmya  reason: default package */
/* loaded from: classes5.dex */
public final class cmya extends cla implements IInterface {
    public cmya(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarSensor");
    }

    public final int[] e() {
        Parcel Si = Si(1, a());
        int[] createIntArray = Si.createIntArray();
        Si.recycle();
        return createIntArray;
    }

    public final void f(int i, cmyc cmycVar) {
        Parcel a = a();
        a.writeInt(i);
        clc.f(a, cmycVar);
        Sk(4, a);
    }

    public final int g() {
        Parcel Si = Si(5, a());
        int readInt = Si.readInt();
        Si.recycle();
        return readInt;
    }

    public final boolean h(int i, cmyc cmycVar) {
        Parcel a = a();
        a.writeInt(i);
        a.writeInt(3);
        clc.f(a, cmycVar);
        Parcel Si = Si(2, a);
        boolean a2 = clc.a(Si);
        Si.recycle();
        return a2;
    }
}
