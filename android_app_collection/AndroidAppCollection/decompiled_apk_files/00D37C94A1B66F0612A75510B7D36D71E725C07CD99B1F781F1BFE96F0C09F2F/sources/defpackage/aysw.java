package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: aysw  reason: default package */
/* loaded from: classes2.dex */
public final class aysw extends aynr {
    final Callable a;

    public aysw(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.aynr
    protected final void V(ayns aynsVar) {
        aypg m = banl.m();
        aynsVar.sj(m);
        try {
            this.a.call();
            if (m.e()) {
                return;
            }
            aynsVar.sm();
        } catch (Throwable th) {
            bapv.j(th);
            if (!m.e()) {
                aynsVar.b(th);
            } else {
                azqc.d(th);
            }
        }
    }
}
