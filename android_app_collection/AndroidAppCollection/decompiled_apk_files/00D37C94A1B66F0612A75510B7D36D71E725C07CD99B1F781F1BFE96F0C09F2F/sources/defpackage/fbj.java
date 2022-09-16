package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: fbj  reason: default package */
/* loaded from: classes3.dex */
public final class fbj implements ynl {
    public final Set a = new HashSet();
    public final Set b = new HashSet();
    private final azqb c;

    public fbj(azqb azqbVar) {
        this.c = azqbVar;
    }

    public final ayos a() {
        return ayos.D(amvn.p(this.a));
    }

    public final void b() {
        ((yni) this.c.get()).g(this);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                this.a.add(((jiy) obj).a);
                return null;
            } else if (i == 1) {
                this.a.remove(((jiz) obj).a);
                return null;
            } else if (i == 2) {
                this.b.remove(((agnn) obj).a);
                return null;
            } else if (i == 3) {
                this.b.add(((agno) obj).a);
                return null;
            } else if (i == 4) {
                this.a.remove(((agoa) obj).a);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{jiy.class, jiz.class, agnn.class, agno.class, agoa.class};
    }
}
