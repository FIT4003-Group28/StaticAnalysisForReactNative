package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azgd  reason: default package */
/* loaded from: classes2.dex */
public final class azgd extends ayoi implements Callable {
    final Callable a;

    public azgd(Callable callable) {
        this.a = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object call = this.a.call();
        ayrd.b(call, "The callable returned a null value");
        return call;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        ayrw ayrwVar = new ayrw(ayomVar);
        ayomVar.sj(ayrwVar);
        if (ayrwVar.e()) {
            return;
        }
        try {
            Object call = this.a.call();
            ayrd.b(call, "Callable returned null");
            ayrwVar.f(call);
        } catch (Throwable th) {
            bapv.j(th);
            if (!ayrwVar.e()) {
                ayomVar.b(th);
            } else {
                azqc.d(th);
            }
        }
    }
}
