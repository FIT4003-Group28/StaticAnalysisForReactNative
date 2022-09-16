package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azbh  reason: default package */
/* loaded from: classes2.dex */
public final class azbh extends ayoc implements Callable {
    final Callable a;

    public azbh(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.ayoc
    protected final void Y(ayod ayodVar) {
        aypg m = banl.m();
        ayodVar.sj(m);
        if (!m.e()) {
            try {
                Object call = this.a.call();
                if (m.e()) {
                    return;
                }
                if (call == null) {
                    ayodVar.sm();
                } else {
                    ayodVar.sh(call);
                }
            } catch (Throwable th) {
                bapv.j(th);
                if (!m.e()) {
                    ayodVar.b(th);
                } else {
                    azqc.d(th);
                }
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.call();
    }
}
