package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: ayby  reason: default package */
/* loaded from: classes2.dex */
final class ayby extends axyw {
    private static final Logger b = Logger.getLogger(ayby.class.getName());
    static final ThreadLocal a = new ThreadLocal();

    @Override // defpackage.axyw
    public final axyx a() {
        axyx axyxVar = (axyx) a.get();
        return axyxVar == null ? axyx.b : axyxVar;
    }

    @Override // defpackage.axyw
    public final axyx b(axyx axyxVar) {
        axyx a2 = a();
        a.set(axyxVar);
        return a2;
    }

    @Override // defpackage.axyw
    public final void c(axyx axyxVar, axyx axyxVar2) {
        if (a() != axyxVar) {
            b.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (axyxVar2 != axyx.b) {
            a.set(axyxVar2);
        } else {
            a.set(null);
        }
    }
}
