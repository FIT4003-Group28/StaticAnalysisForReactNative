package defpackage;

import android.content.res.Configuration;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
@Deprecated
/* renamed from: fqd  reason: default package */
/* loaded from: classes3.dex */
public final class fqd {
    public Set a;
    public boolean b = false;
    private final azqb c;
    private Set d;
    private Set e;

    public fqd(azqb azqbVar) {
        this.c = azqbVar;
    }

    public final void a() {
        for (fqc fqcVar : (Set) this.c.get()) {
            g(fqcVar);
        }
    }

    public final void b() {
        this.b = false;
        Set<fqc> set = this.d;
        if (set == null) {
            return;
        }
        for (fqc fqcVar : set) {
            fqcVar.a();
        }
    }

    public final void c(Configuration configuration) {
        Set<fqb> set = this.e;
        if (set == null) {
            return;
        }
        for (fqb fqbVar : set) {
            fqbVar.g(configuration);
        }
    }

    public final void d() {
        Set<nfx> set = this.a;
        if (set != null) {
            for (nfx nfxVar : set) {
                nfz nfzVar = nfxVar.a;
                foz fozVar = nfzVar.d;
                if (fozVar != null) {
                    nfzVar.a.f(fozVar);
                }
                foz fozVar2 = nfzVar.e;
                if (fozVar2 != null) {
                    nfzVar.a.f(fozVar2);
                }
                foz fozVar3 = nfzVar.f;
                if (fozVar3 != null) {
                    nfzVar.a.f(fozVar3);
                }
                foz fozVar4 = nfzVar.g;
                if (fozVar4 != null) {
                    nfzVar.a.f(fozVar4);
                }
                foz fozVar5 = nfzVar.h;
                if (fozVar5 != null) {
                    nfzVar.a.f(fozVar5);
                }
                nfzVar.a.f(nfzVar.b);
                ggi ggiVar = nfzVar.c;
                if (ggiVar != null) {
                    nfzVar.a.f(ggiVar);
                }
            }
        }
        this.a = null;
        this.e = null;
        this.d = null;
    }

    public final void e() {
        this.b = true;
        Set<fqc> set = this.d;
        if (set == null) {
            return;
        }
        for (fqc fqcVar : set) {
            fqcVar.b();
        }
    }

    public final void f(fqb fqbVar) {
        if (this.e == null) {
            this.e = Collections.newSetFromMap(new ConcurrentHashMap());
        }
        this.e.add(fqbVar);
    }

    public final void g(fqc fqcVar) {
        if (this.d == null) {
            this.d = Collections.newSetFromMap(new ConcurrentHashMap());
        }
        this.d.add(fqcVar);
    }

    public final void h(fqb fqbVar) {
        Set set = this.e;
        if (set != null) {
            set.remove(fqbVar);
        }
    }

    public final void i(fqc fqcVar) {
        Set set = this.d;
        if (set != null) {
            set.remove(fqcVar);
        }
    }
}
