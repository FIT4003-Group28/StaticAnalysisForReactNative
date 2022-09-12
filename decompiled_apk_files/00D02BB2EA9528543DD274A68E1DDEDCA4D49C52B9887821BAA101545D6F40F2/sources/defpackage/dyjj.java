package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dyjj  reason: default package */
/* loaded from: classes6.dex */
final class dyjj extends dyfn {
    private static final Logger b = Logger.getLogger(dyjj.class.getName());
    static final ThreadLocal<dyfo> a = new ThreadLocal<>();

    @Override // defpackage.dyfn
    public final dyfo a(dyfo dyfoVar) {
        dyfo c = c();
        a.set(dyfoVar);
        return c;
    }

    @Override // defpackage.dyfn
    public final void b(dyfo dyfoVar, dyfo dyfoVar2) {
        if (c() != dyfoVar) {
            b.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (dyfoVar2 != dyfo.b) {
            a.set(dyfoVar2);
        } else {
            a.set(null);
        }
    }

    @Override // defpackage.dyfn
    public final dyfo c() {
        dyfo dyfoVar = a.get();
        return dyfoVar == null ? dyfo.b : dyfoVar;
    }
}
