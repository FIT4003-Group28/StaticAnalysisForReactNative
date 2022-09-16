package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azdy  reason: default package */
/* loaded from: classes2.dex */
public final class azdy extends ayos implements ayrh {
    final ayok a;
    final Callable b;
    final aypw c;

    public azdy(ayok ayokVar, Callable callable, aypw aypwVar) {
        this.a = ayokVar;
        this.b = callable;
        this.c = aypwVar;
    }

    @Override // defpackage.ayos
    protected final void X(ayot ayotVar) {
        try {
            Object call = this.b.call();
            ayrd.b(call, "The initialSupplier returned a null value");
            this.a.az(new azdx(ayotVar, call, this.c));
        } catch (Throwable th) {
            ayqj.i(th, ayotVar);
        }
    }

    @Override // defpackage.ayrh
    public final ayoi a() {
        azdw azdwVar = new azdw(this.a, this.b, this.c);
        azqc.i();
        return azdwVar;
    }
}
