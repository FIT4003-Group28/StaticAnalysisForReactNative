package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azko  reason: default package */
/* loaded from: classes2.dex */
public final class azko extends ayos {
    final Callable a;

    public azko(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.ayos
    protected final void X(ayot ayotVar) {
        try {
            ayov ayovVar = (ayov) this.a.call();
            ayrd.b(ayovVar, "The singleSupplier returned a null SingleSource");
            ayovVar.W(ayotVar);
        } catch (Throwable th) {
            bapv.j(th);
            ayqj.i(th, ayotVar);
        }
    }
}
