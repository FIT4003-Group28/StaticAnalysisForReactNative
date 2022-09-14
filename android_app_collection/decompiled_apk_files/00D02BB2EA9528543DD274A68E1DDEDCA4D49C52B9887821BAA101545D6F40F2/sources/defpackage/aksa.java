package defpackage;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aksa  reason: default package */
/* loaded from: classes.dex */
public final class aksa implements akrz {
    static final long a = TimeUnit.MINUTES.toMillis(1);
    private final dzsj<akwu> b;

    public aksa(dzsj<akwu> dzsjVar) {
        this.b = dzsjVar;
    }

    @Override // defpackage.akrz
    public final long a(akry akryVar, cqat cqatVar) {
        long b = cqatVar.b();
        if (akryVar.d()) {
            long d = d(akryVar);
            if (d != -1) {
                return cqatVar.e() + ((b + d) - cqatVar.b());
            }
        }
        return -1L;
    }

    @Override // defpackage.akrz
    public final long b(long j, cqat cqatVar) {
        long millis = TimeUnit.MINUTES.toMillis(this.b.a().c().i());
        if (millis == -1) {
            return -1L;
        }
        return cqatVar.e() + ((j + millis) - cqatVar.b());
    }

    @Override // defpackage.akrz
    public final long c(akry akryVar, cqat cqatVar) {
        if (akryVar.d()) {
            long d = d(akryVar);
            if (d != -1) {
                return cqatVar.b() + d;
            }
            return -1L;
        }
        return -1L;
    }

    @Override // defpackage.akrz
    public final long d(akry akryVar) {
        dmxp dmxpVar = this.b.a().e().b;
        if (dmxpVar == null) {
            dmxpVar = dmxp.c;
        }
        for (dmxj dmxjVar : dmxpVar.b) {
            if ((dmxjVar.a & 16) != 0) {
                dmxl b = dmxl.b(dmxjVar.b);
                if (b == null) {
                    b = dmxl.UNKNOWN;
                }
                if (b == akryVar.H) {
                    if (dmxjVar.h != -1) {
                        return TimeUnit.SECONDS.toMillis(dmxjVar.h);
                    }
                    return -1L;
                }
            }
        }
        if (!akryVar.d()) {
            return -1L;
        }
        if (akry.PERSONALIZED_SMARTMAPS.equals(akryVar)) {
            return TimeUnit.MINUTES.toMillis(this.b.a().c().g());
        }
        if (akryVar.c()) {
            return j(akryVar);
        }
        return TimeUnit.MINUTES.toMillis(this.b.a().c().h());
    }

    @Override // defpackage.akrz
    public final long e(akry akryVar, cqat cqatVar) {
        return f(akryVar, ((bvnv) cqatVar).a, cqatVar);
    }

    @Override // defpackage.akrz
    public final long f(akry akryVar, long j, cqat cqatVar) {
        long i = i(akryVar);
        if (i == -1) {
            return -1L;
        }
        return cqatVar.e() + ((j + i) - cqatVar.b());
    }

    @Override // defpackage.akrz
    public final long g(akry akryVar, cqat cqatVar) {
        long i = i(akryVar);
        if (i == -1) {
            return -1L;
        }
        return cqatVar.b() + i;
    }

    @Override // defpackage.akrz
    public final boolean h(akry akryVar) {
        dmxp dmxpVar = this.b.a().e().b;
        if (dmxpVar == null) {
            dmxpVar = dmxp.c;
        }
        Iterator<dmxj> it = dmxpVar.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dmxj next = it.next();
            dmxl b = dmxl.b(next.b);
            if (b == null) {
                b = dmxl.UNKNOWN;
            }
            if (b == akryVar.H) {
                if ((next.a & 32) != 0) {
                    dmwp dmwpVar = next.i;
                    if (dmwpVar == null) {
                        dmwpVar = dmwp.b;
                    }
                    if (dmwpVar.a) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final long i(akry akryVar) {
        long j = j(akryVar);
        return akryVar.c() ? j + a : j;
    }

    protected final long j(akry akryVar) {
        dmxp dmxpVar = this.b.a().e().b;
        if (dmxpVar == null) {
            dmxpVar = dmxp.c;
        }
        for (dmxj dmxjVar : dmxpVar.b) {
            if ((dmxjVar.a & 8) != 0) {
                dmxl b = dmxl.b(dmxjVar.b);
                if (b == null) {
                    b = dmxl.UNKNOWN;
                }
                if (b == akryVar.H) {
                    if (dmxjVar.g != -1) {
                        return TimeUnit.SECONDS.toMillis(dmxjVar.g);
                    }
                    return -1L;
                }
            }
        }
        dwkm f = this.b.a().c().f();
        if (!new dsrh(f.b, dwkm.c).contains(akryVar.I)) {
            for (dunr dunrVar : f.d) {
                if (new dsrh(dunrVar.b, dunr.c).contains(akryVar.I)) {
                    return TimeUnit.SECONDS.toMillis(dunrVar.a);
                }
            }
            return TimeUnit.SECONDS.toMillis(f.a);
        }
        return -1L;
    }
}
