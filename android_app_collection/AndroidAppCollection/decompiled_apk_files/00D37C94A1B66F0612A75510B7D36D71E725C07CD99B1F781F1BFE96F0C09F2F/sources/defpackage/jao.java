package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
/* compiled from: PG */
/* renamed from: jao  reason: default package */
/* loaded from: classes3.dex */
public final class jao extends jau {
    private final azqb a;

    public jao(azqb azqbVar) {
        this.a = azqbVar;
    }

    private final Map h() {
        return ((agrf) this.a.get()).a().g().f();
    }

    @Override // defpackage.jau
    protected final amvn a(agwh agwhVar) {
        amvl i = amvn.i();
        Map h = h();
        Collection<agqv> j = agwhVar.j();
        HashSet e = amyv.e();
        for (agqv agqvVar : j) {
            e.addAll(jfw.f(h, agqvVar.m()));
        }
        amzs it = amvn.p(e).iterator();
        while (it.hasNext()) {
            i.c(jjd.c((String) it.next()));
        }
        return i.g();
    }

    @Override // defpackage.jau
    protected final void b(aajs aajsVar, agqv agqvVar) {
        amvn f = jfw.f(h(), agqvVar.m());
        if (!f.isEmpty()) {
            amzs it = f.iterator();
            while (it.hasNext()) {
                aajsVar.j(jjd.c((String) it.next()));
            }
        }
    }
}
