package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: jeh  reason: default package */
/* loaded from: classes3.dex */
public final class jeh implements ynl {
    public final Executor a;
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    public Future c;
    private final azqb d;
    private final jnw e;

    public jeh(azqb azqbVar, Executor executor, jnw jnwVar) {
        this.d = azqbVar;
        this.a = executor;
        this.e = jnwVar;
    }

    public final void a() {
        if (((ahdn) this.d.get()).a() != 1) {
            return;
        }
        Future future = this.c;
        if (future != null) {
            future.cancel(false);
            this.c = null;
        }
        jnw jnwVar = this.e;
        this.c = jnwVar.d.submit(new jnr(jnwVar, new jeg(this), 1));
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                agnk agnkVar = (agnk) obj;
                a();
                return null;
            } else if (i == 1) {
                agnn agnnVar = (agnn) obj;
                a();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{agnk.class, agnn.class};
    }
}
