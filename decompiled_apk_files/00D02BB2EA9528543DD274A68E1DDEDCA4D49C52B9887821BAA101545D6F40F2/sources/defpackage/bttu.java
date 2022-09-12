package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
@Deprecated
/* renamed from: bttu  reason: default package */
/* loaded from: classes4.dex */
public class bttu {
    private static final cqat c = new cqaz();
    private btts a;
    @dzsi
    public btlu i;
    public final cqat h = c;
    private final List<bttt> b = dchl.a();

    /* JADX INFO: Access modifiers changed from: protected */
    public bttu() {
        p(btts.INITIALIZED);
    }

    protected void a(@dzsi bttq bttqVar) {
        throw null;
    }

    public synchronized void i() {
        p(btts.CANCELED);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dbsb k() {
        String name;
        if (!dbsj.d(getClass().getSimpleName())) {
            name = getClass().getSimpleName();
        } else if (!dbsj.d(getClass().getCanonicalName())) {
            name = getClass().getCanonicalName();
        } else {
            name = getClass().getName();
        }
        dbsb d = dbsc.d(name);
        d.b("currentState", this.a);
        StringBuilder sb = new StringBuilder("[");
        Iterator<bttt> it = this.b.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
        sb.append("]");
        d.b("stateHistory", sb.toString());
        return d;
    }

    public final synchronized boolean n() {
        btts bttsVar;
        synchronized (this.b) {
            bttsVar = this.a;
        }
        return bttsVar == btts.CANCELED;
    }

    public final synchronized void o(@dzsi bttq bttqVar) {
        if (n()) {
            toString();
            return;
        }
        p(btts.RESPONSE_PROCESSING);
        a(bttqVar);
        if (bttqVar == null) {
            p(btts.COMPLETED);
            return;
        }
        btts bttsVar = btts.FAILED;
        bttqVar.toString();
        p(bttsVar);
    }

    public final void p(btts bttsVar) {
        dbsk.s(bttsVar);
        synchronized (this.b) {
            this.a = bttsVar;
        }
    }

    public final String toString() {
        return k().toString();
    }
}
