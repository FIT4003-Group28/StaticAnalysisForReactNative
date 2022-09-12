package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cohp  reason: default package */
/* loaded from: classes5.dex */
public final class cohp extends cla implements IInterface {
    public cohp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.IInAppExampleStoreProxy");
    }

    public final void e(coba cobaVar, coho cohoVar) {
        Parcel a = a();
        clc.f(a, cobaVar);
        clc.f(a, cohoVar);
        Sk(1, a);
    }

    public final void f() {
        Sk(2, a());
    }

    public final IBinder g(Intent intent) {
        Parcel a = a();
        clc.e(a, intent);
        Parcel Si = Si(3, a);
        IBinder readStrongBinder = Si.readStrongBinder();
        Si.recycle();
        return readStrongBinder;
    }

    public final void h(int i) {
        Parcel a = a();
        a.writeInt(i);
        Sk(4, a);
    }

    public final boolean i(Intent intent) {
        Parcel a = a();
        clc.e(a, intent);
        Parcel Si = Si(5, a);
        boolean a2 = clc.a(Si);
        Si.recycle();
        return a2;
    }

    public final void j(Intent intent) {
        Parcel a = a();
        clc.e(a, intent);
        Sk(6, a);
    }
}
