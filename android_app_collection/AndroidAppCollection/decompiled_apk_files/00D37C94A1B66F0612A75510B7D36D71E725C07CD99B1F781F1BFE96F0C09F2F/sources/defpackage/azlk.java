package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azlk  reason: default package */
/* loaded from: classes2.dex */
public final class azlk extends ayos {
    final Callable a;

    public azlk(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.ayos
    protected final void X(ayot ayotVar) {
        aypg m = banl.m();
        ayotVar.sj(m);
        if (m.e()) {
            return;
        }
        try {
            Object call = this.a.call();
            ayrd.b(call, "The callable returned a null value");
            if (m.e()) {
                return;
            }
            ayotVar.sh(call);
        } catch (Throwable th) {
            bapv.j(th);
            if (!m.e()) {
                ayotVar.b(th);
            } else {
                azqc.d(th);
            }
        }
    }
}
