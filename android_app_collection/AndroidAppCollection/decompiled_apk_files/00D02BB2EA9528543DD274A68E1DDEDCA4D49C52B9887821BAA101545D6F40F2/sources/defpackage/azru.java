package defpackage;

import android.os.Bundle;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: azru  reason: default package */
/* loaded from: classes3.dex */
public abstract class azru {
    public abstract azrv a();

    protected abstract void b(@dzsi byte[] bArr);

    public abstract void c(dndr dndrVar);

    public abstract void d(boolean z);

    public abstract void e(boolean z);

    public abstract void f(String str);

    public abstract void g(boolean z);

    public abstract void h(@dzsi anee aneeVar);

    public abstract void i(boolean z);

    public abstract void j(boolean z);

    public abstract void k(boolean z);

    public abstract void l(boolean z);

    public abstract void m(@dzsi akqq akqqVar);

    public final void n(@dzsi axuc axucVar, bwqv bwqvVar) {
        if (axucVar == null) {
            b(null);
            return;
        }
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "serializableAliasFlowData", axucVar);
        Parcel obtain = Parcel.obtain();
        bundle.writeToParcel(obtain, 0);
        b(obtain.marshall());
    }
}
