package defpackage;

import defpackage.czv;
import defpackage.dnh;
import java.util.EnumMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: dnf  reason: default package */
/* loaded from: classes6.dex */
public class dnf<S extends dnh, W extends czv> implements czt {
    public final dol a;
    @dzsi
    public S c;
    private final dng<S> d;
    private final dne<S, W> e;
    @dzsi
    private String g;
    public final Object b = new Object();
    private final EnumMap<czs, AtomicInteger> f = new EnumMap<>(czs.class);

    public dnf(dng<S> dngVar, dne<S, W> dneVar, dol dolVar) {
        for (czs czsVar : czs.values()) {
            this.f.put((EnumMap<czs, AtomicInteger>) czsVar, (czs) new AtomicInteger(0));
        }
        this.d = dngVar;
        this.e = dneVar;
        this.a = dolVar;
    }

    @Override // defpackage.czt
    public final W a(czh czhVar, final czs czsVar) {
        W a;
        synchronized (this.b) {
            if (c(czs.NONE).getAndIncrement() == 0) {
                dbsk.l(this.c == null);
                S a2 = this.d.a(czhVar);
                this.c = a2;
                this.g = a2.c();
                this.a.d();
            }
            S s = this.c;
            dbsk.s(s);
            if (czsVar.a(czs.INERTIAL_BACKGROUND) && c(czs.INERTIAL_BACKGROUND).getAndIncrement() == 0) {
                s.a(czs.INERTIAL_BACKGROUND);
                this.g = s.c();
                this.a.d();
            }
            if (czsVar.a(czs.INERTIAL_FOREGROUND) && c(czs.INERTIAL_FOREGROUND).getAndIncrement() == 0) {
                s.a(czs.INERTIAL_FOREGROUND);
            }
            if (czsVar.a(czs.CAMERA) && c(czs.CAMERA).getAndIncrement() == 0) {
                s.a(czs.CAMERA);
            }
            a = this.e.a(s, new Runnable(this, czsVar) { // from class: dnd
                private final dnf a;
                private final czs b;

                {
                    this.a = this;
                    this.b = czsVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dnf dnfVar = this.a;
                    czs czsVar2 = this.b;
                    synchronized (dnfVar.b) {
                        dbsk.l(dnfVar.c(czsVar2).get() > 0);
                        S s2 = dnfVar.c;
                        dbsk.s(s2);
                        if (czsVar2.a(czs.CAMERA) && dnfVar.c(czs.CAMERA).decrementAndGet() == 0) {
                            s2.a(czs.INERTIAL_FOREGROUND);
                        }
                        if (czsVar2.a(czs.INERTIAL_FOREGROUND) && dnfVar.c(czs.INERTIAL_FOREGROUND).decrementAndGet() == 0) {
                            s2.a(czs.INERTIAL_BACKGROUND);
                        }
                        if (czsVar2.a(czs.INERTIAL_BACKGROUND) && dnfVar.c(czs.INERTIAL_BACKGROUND).decrementAndGet() == 0) {
                            s2.a(czs.NONE);
                            dnfVar.a.d();
                        }
                        if (dnfVar.c(czs.NONE).decrementAndGet() == 0) {
                            s2.b();
                            dnfVar.c = null;
                            dnfVar.a.d();
                        }
                    }
                }
            });
        }
        return a;
    }

    @Override // defpackage.czt
    @dzsi
    public final String b() {
        String str;
        synchronized (this.b) {
            str = this.g;
        }
        return str;
    }

    public final AtomicInteger c(czs czsVar) {
        AtomicInteger atomicInteger;
        synchronized (this.b) {
            atomicInteger = this.f.get(czsVar);
            dbsk.s(atomicInteger);
        }
        return atomicInteger;
    }
}
