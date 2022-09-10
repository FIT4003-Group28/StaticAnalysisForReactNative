package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vog  reason: default package */
/* loaded from: classes7.dex */
public final class vog {
    public static final dcqe a = dcqe.c("vog");
    public final Executor b;
    public final wuw c;
    public final wtq d;
    public final wto e;
    public final Set<vof> f = new HashSet();
    public final Map<amsy, voe> g = new WeakHashMap();
    @dzsi
    public dehn<Set<String>> h;
    private final wtm i;

    public vog(wuw wuwVar, wto wtoVar, wtq wtqVar, Executor executor) {
        this.c = wuwVar;
        this.b = executor;
        this.e = wtoVar;
        this.d = wtqVar;
        vny vnyVar = new vny(this);
        this.i = vnyVar;
        wtoVar.e(vnyVar);
    }

    public static void c(voe voeVar, Collection<wut> collection, int i) {
        for (wut wutVar : collection) {
            wuv d = voeVar.d(wutVar);
            dbsk.s(d);
            voeVar.a(d.C(i));
        }
    }

    public final void a() {
        wtq wtqVar = this.d;
        dzrn it = ((dzqr) ((dznt) wtqVar.b).values()).iterator();
        while (it.hasNext()) {
            ((dehn) it.next()).cancel(false);
        }
        wtqVar.b.clear();
        this.e.a();
    }

    public final voe b(amsy amsyVar) {
        voe voeVar = this.g.get(amsyVar);
        return voeVar != null ? voeVar : voe.b;
    }

    public final void d(final int i) {
        synchronized (this.f) {
            Iterator<vof> it = this.f.iterator();
            while (it.hasNext()) {
                final voi voiVar = (voi) it.next().get();
                if (voiVar == null) {
                    it.remove();
                } else {
                    this.b.execute(new Runnable(voiVar, i) { // from class: vnx
                        private final int a;
                        private final voi b;

                        {
                            this.b = voiVar;
                            this.a = i;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            wuv b;
                            voi voiVar2 = this.b;
                            int i2 = this.a;
                            vok vokVar = voiVar2.a;
                            zdy zdyVar = vokVar.i;
                            if (zdyVar != null) {
                                int i3 = i2 - 1;
                                if (i3 == 0) {
                                    vokVar.a();
                                } else if (i3 == 3 && (b = vokVar.b(vokVar.m)) != null && b.v() == 5) {
                                    vokVar.h();
                                }
                                cqkx.p(zdyVar);
                            }
                        }
                    });
                }
            }
        }
    }
}
