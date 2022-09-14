package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ambm  reason: default package */
/* loaded from: classes.dex */
public final class ambm implements alwc {
    public final dehq c;
    private final Object i;
    private final dzsj<akwu> j;
    private final Runnable k;
    private final dxio<amfg> l;
    private final dxio<ckcw> m;
    private final dxio<bvjj> n;
    private alwa s;
    private final dxio<amay> u;
    private alwn v;
    private final AtomicBoolean x;
    public static final dcqe a = dcqe.c("ambm");
    private static final String h = alwc.class.getSimpleName();
    public static final alwn[] b = {null, null, null, null, alwn.NAVIGATION, alwn.NAVIGATION_LOW_LIGHT, alwn.NAVIGATION_SATELLITE, null, alwn.ROADMAP, null, null, alwn.ROADMAP_SATELLITE, alwn.TERRAIN, null, null, alwn.ROADMAP_AMBIACTIVE, alwn.ROADMAP_AMBIACTIVE_LOW_BIT, null, alwn.TRANSIT_FOCUSED, alwn.BASEMAP_EDITING, alwn.ROUTE_OVERVIEW, null, alwn.NAVIGATION_EMBEDDED_AUTO, alwn.NAVIGATION_EMBEDDED_AUTO_LOW_LIGHT, null, alwn.BASEMAP_EDITING_SATELLITE, alwn.RESULTS_FOCUSED, alwn.ROADMAP_DARK, alwn.ROUTE_OVERVIEW_DARK, alwn.TERRAIN_DARK, alwn.TRANSIT_FOCUSED_DARK, alwn.SAFETY, alwn.SAFETY_DARK, alwn.RESULTS_FOCUSED_DARK, null, alwn.ROADMAP_INFO_LAYER, alwn.ROADMAP_INFO_LAYER_DARK};
    private int o = -1;
    private final AtomicInteger p = new AtomicInteger(-1);
    private final Object q = new Object();
    private final Set<alwb> r = dcnm.c();
    private final Object t = new Object();
    public final Object d = new Object();
    public final Map<Integer, ambk> e = dcjz.j();
    public final Map<Integer, alvy> f = Collections.synchronizedMap(new HashMap());
    public final Map<Integer, alvy> g = Collections.synchronizedMap(new HashMap());
    private boolean w = true;

    public ambm(Object obj, Runnable runnable, dzsj<akwu> dzsjVar, dxio<amfg> dxioVar, dxio<ckcw> dxioVar2, dehq dehqVar, dxio<bvjj> dxioVar3, dxio<amay> dxioVar4, boolean z) {
        new AtomicInteger(0);
        this.x = new AtomicBoolean(true);
        this.i = obj;
        this.k = runnable;
        this.j = dzsjVar;
        this.l = dxioVar;
        this.m = dxioVar2;
        this.c = dehqVar;
        this.n = dxioVar3;
        this.u = dxioVar4;
        this.v = z ? alwn.ROADMAP_DARK : alwn.ROADMAP;
    }

    private final synchronized void r(dmwc dmwcVar) {
        int i = dmwcVar.a;
        if (i > 0) {
            synchronized (this.t) {
                if (this.o != i) {
                    this.o = i;
                    this.u.a().e(i);
                } else {
                    ambk t = t(i);
                    if (t != null) {
                        int i2 = t.g;
                        int i3 = dmwcVar.bC;
                        if (i3 == 0) {
                            i3 = dsst.a.b(dmwcVar).c(dmwcVar);
                            dmwcVar.bC = i3;
                        }
                        if (i2 == i3) {
                            ambk ambkVar = this.e.get(Integer.valueOf(i));
                            if (ambkVar != null && ambkVar.e && ambkVar.f) {
                                p(i);
                                return;
                            }
                        }
                    }
                }
            }
            s(dmwcVar);
        }
    }

    private final void s(final dmwc dmwcVar) {
        final int i = dmwcVar.a;
        ambk ambkVar = new ambk(dmwcVar);
        Map<Integer, ambk> map = this.e;
        Integer valueOf = Integer.valueOf(i);
        map.put(valueOf, ambkVar);
        if (!this.w) {
            dmwb b2 = dmwb.b(dmwcVar.c);
            if (b2 == null) {
                b2 = dmwb.MULTIZOOM_STYLE_TABLE;
            }
            ambl amblVar = new ambl(this);
            this.f.put(valueOf, amblVar);
            v(this.u.a().i(ambkVar, i, b2, amblVar));
            ambj ambjVar = new ambj(this);
            this.g.put(valueOf, ambjVar);
            this.u.a().g(ambkVar, i, ambjVar);
        }
        this.c.execute(new Runnable(this, i, dmwcVar) { // from class: ambf
            private final ambm a;
            private final int b;
            private final dmwc c;

            {
                this.a = this;
                this.b = i;
                this.c = dmwcVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.q(this.b, this.c);
            }
        });
    }

    private final ambk t(int i) {
        ambk ambkVar = this.e.get(Integer.valueOf(i));
        if (ambkVar == null) {
            dmwc u = u(i);
            if (u == null) {
                try {
                    dxio<amfg> dxioVar = this.l;
                    if (dxioVar != null && dxioVar.a() != null) {
                        StringBuilder sb = new StringBuilder(34);
                        sb.append("paint-parameters-epoch-");
                        sb.append(i);
                        byte[] a2 = this.l.a().a(sb.toString());
                        if (a2.length != 0) {
                            u = ((dmxf) dsqw.cq(dmxf.g, a2)).c;
                            if (u == null) {
                                u = dmwc.f;
                            }
                        }
                    }
                } catch (IOException e) {
                    bvoo.h("Error reading offline epoch resources %s", e);
                }
                u = null;
            }
            if (u == null) {
                return ambkVar;
            }
            ambk ambkVar2 = new ambk(u);
            this.e.put(Integer.valueOf(i), ambkVar2);
            return ambkVar2;
        }
        return ambkVar;
    }

    private final synchronized dmwc u(int i) {
        StringBuilder sb = new StringBuilder(30);
        sb.append("st_epoch_resources_");
        sb.append(i);
        byte[] a2 = this.n.a().e().a(sb.toString());
        if (a2 != null) {
            try {
                return (dmwc) dsqw.cq(dmwc.f, a2);
            } catch (IOException e) {
                bvoo.j(e);
            }
        }
        return null;
    }

    private final void v(int i) {
        this.m.a().b(ckgx.GLOBAL_STYLE_TABLE_STATUS, new ambi(i));
    }

    @Override // defpackage.alwc
    public final synchronized void a() {
        if (this.p.get() != -1) {
            v(5);
        }
        if (this.w) {
            this.w = false;
            if (this.j.a() != null) {
                n();
            }
        }
    }

    @Override // defpackage.alwc
    public final synchronized void b() {
        for (alxs alxsVar : this.u.a().b()) {
            ((ckcp) this.m.a().a(ckgh.aG)).a(alxsVar.c());
        }
    }

    @Override // defpackage.alwc
    public final synchronized void c() {
        if (!this.w) {
            this.w = true;
        }
    }

    @Override // defpackage.alwc
    public final void d(alwb alwbVar) {
        alwa alwaVar;
        synchronized (this.q) {
            this.r.add(alwbVar);
            alwaVar = this.s;
        }
        if (alwaVar != null) {
            alwbVar.e(alwaVar);
        }
    }

    @Override // defpackage.alwc
    public final void e(alwb alwbVar) {
        synchronized (this.q) {
            this.r.remove(alwbVar);
        }
    }

    @Override // defpackage.alwc
    public final boolean f(int i, alwn alwnVar) {
        ambk t = t(i);
        if (t == null) {
            return false;
        }
        String str = t.a.get(alwnVar);
        if (str == null) {
            String str2 = alwnVar.y;
            return false;
        } else if (!this.u.a().c(str, i, alwnVar)) {
            return false;
        } else {
            this.x.set(true);
            return true;
        }
    }

    @Override // defpackage.alwc
    public final boolean g(int i) {
        String str;
        ambk t = t(i);
        if (t == null || (str = t.b) == null || !this.u.a().d(str)) {
            return false;
        }
        this.x.set(true);
        return true;
    }

    @Override // defpackage.alwc
    public final alxs h(int i, alwn alwnVar) {
        String str;
        ambk t = t(i);
        if (t == null) {
            bvoo.h("Epoch urls not found (getTableUrl) for epoch = %s, legend = %s", Integer.valueOf(i), alwnVar);
            str = null;
        } else {
            str = t.a.get(alwnVar);
        }
        dbsk.s(str);
        ambk t2 = t(i);
        dbsk.s(t2);
        return this.u.a().h(str, alwnVar, t2.h);
    }

    @Override // defpackage.alwc
    public final alwz i(int i) {
        String str;
        ambk t = t(i);
        if (t == null) {
            bvoo.h("Epoch urls not found (getCommonStyleDataUrl) for epoch = %s", Integer.valueOf(i));
            str = null;
        } else {
            str = t.b;
        }
        dbsk.s(str);
        return this.u.a().a(str, i);
    }

    @Override // defpackage.alwc
    public final decj j(int i) {
        ambk t = t(i);
        return t != null ? t.c : decj.a;
    }

    @Override // defpackage.alwc
    public final dcdn<Integer, Integer> k(int i) {
        ambk t = t(i);
        return t != null ? t.d : dcmn.a;
    }

    @Override // defpackage.alwc
    public final synchronized alwn l() {
        return this.v;
    }

    @Override // defpackage.alwc
    public final synchronized void m(alwn alwnVar) {
        this.v = alwnVar;
        this.u.a().f(alwnVar);
    }

    @Override // defpackage.alwc
    public final synchronized void n() {
        if (!this.w) {
            dmwc dmwcVar = this.j.a().e().c;
            if (dmwcVar == null) {
                dmwcVar = dmwc.f;
            }
            r(dmwcVar);
        }
    }

    @Override // defpackage.alwc
    public final void o(int i, alwn alwnVar) {
        int i2;
        synchronized (this.t) {
            i2 = this.o;
        }
        if (i2 != i) {
            if (!this.x.compareAndSet(true, false)) {
                return;
            }
            alwnVar.name();
            this.p.get();
            this.k.run();
            return;
        }
        synchronized (this) {
            dmwc dmwcVar = this.j.a().e().c;
            if (dmwcVar == null) {
                dmwcVar = dmwc.f;
            }
            s(dmwcVar);
        }
    }

    public final void p(int i) {
        dcep K;
        this.p.set(i);
        alwa alwaVar = new alwa(this.i, i);
        synchronized (this.q) {
            K = dcep.K(this.r);
            this.s = alwaVar;
        }
        dcpd it = K.iterator();
        while (it.hasNext()) {
            ((alwb) it.next()).e(alwaVar);
        }
    }

    public final synchronized void q(int i, dmwc dmwcVar) {
        byte[] bS = dmwcVar.bS();
        StringBuilder sb = new StringBuilder(30);
        sb.append("st_epoch_resources_");
        sb.append(i);
        this.n.a().e().d(bS, sb.toString());
    }
}
