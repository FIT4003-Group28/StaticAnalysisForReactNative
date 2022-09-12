package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: clar  reason: default package */
/* loaded from: classes5.dex */
public final class clar extends cla implements IInterface {
    public clar(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.staticplugins.opa.morris2.btlatency.IBtLatencyService");
    }

    public final void e(int i, clat clatVar) {
        Parcel a = a();
        a.writeInt(i);
        clc.f(a, clatVar);
        Sk(1, a);
    }

    public final int f() {
        Parcel Si = Si(3, a());
        int readInt = Si.readInt();
        Si.recycle();
        return readInt;
    }
}
