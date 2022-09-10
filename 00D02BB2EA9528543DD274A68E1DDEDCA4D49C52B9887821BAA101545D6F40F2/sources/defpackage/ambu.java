package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ambu  reason: default package */
/* loaded from: classes2.dex */
public final class ambu {
    static final long a = TimeUnit.MINUTES.toMillis(1);
    public static final akry b = akry.PERSONALIZED_SMARTMAPS;
    public final ckcw c;
    private boolean d;
    private final btnc<ambr, Boolean> e;
    private final List<ambr> f;
    private final List<ambr> g;
    private final ArrayDeque<ambs> h;
    private final cqat i;
    private final ambz j;
    private final akrw k;
    private final alyl l;
    private final akrz m;
    private final amad n;
    @dzsi
    private final btzp<dxcw, Object> o;
    @dzsi
    private final btzp<dmxh, dmxv> p;
    private final dehq q;
    private final dcdc<alzp> r;
    private final dzsj<akwu> s;
    private final amby t;

    public ambu(ambz ambzVar, akrw akrwVar, alyl alylVar, akrz akrzVar, amby ambyVar, amad amadVar, btmv btmvVar, cqat cqatVar, btzp btzpVar, btzp btzpVar2, dcdc dcdcVar, dzsj dzsjVar, dehq dehqVar, ckcw ckcwVar) {
        ambz ambzVar2;
        btzp btzpVar3;
        dbsk.b(btzpVar2 != null, "Only one of the mapPerTileRpcClient and paintTileRpcClient should be set");
        if (btzpVar2 != null) {
            ambzVar2 = ambzVar;
            btzpVar3 = btzpVar2;
        } else {
            dbsk.s(null);
            ambzVar2 = ambzVar;
            btzpVar3 = null;
        }
        this.j = ambzVar2;
        this.k = akrwVar;
        this.l = alylVar;
        this.m = akrzVar;
        this.d = true;
        this.t = ambyVar;
        this.n = amadVar;
        this.i = cqatVar;
        this.o = null;
        this.p = btzpVar3;
        this.r = dcdcVar;
        this.s = dzsjVar;
        this.q = dehqVar;
        this.c = ckcwVar;
        this.e = new btnc<>(cpnx.a, btmz.FETCHED_VIEWPORT, btmvVar);
        this.f = dchl.f(cpnx.a);
        this.g = dchl.f(2);
        this.h = new ArrayDeque<>();
    }

    private final synchronized void d(ambs ambsVar) {
        ambr ambrVar = ambsVar.b;
        this.f.add(ambrVar);
        this.e.Pz(ambrVar, true);
        this.g.add(ambrVar);
        e(ambsVar);
    }

    private final synchronized void e(ambs ambsVar) {
        try {
            dbsk.s(this.p);
            btzp<dmxh, dmxv> btzpVar = this.p;
            dmxh dmxhVar = ambsVar.g;
            if (dmxhVar != null) {
                dsqp dsqpVar = (dsqp) dmxhVar.cu(5);
                dsqpVar.bC(dmxhVar);
                dmxg dmxgVar = (dmxg) dsqpVar;
                ambr ambrVar = ambsVar.b;
                int i = ambrVar.b;
                dcvu f = akqg.d(ambrVar.a).f();
                dmyc bZ = dmyd.f.bZ();
                dmwm bZ2 = dmwn.e.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dmwn dmwnVar = (dmwn) bZ2.b;
                dmwnVar.a |= 1;
                dmwnVar.b = i;
                dgrm bZ3 = dgrn.d.bZ();
                int c = f.k().c();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dgrn dgrnVar = (dgrn) bZ3.b;
                dgrnVar.a |= 1;
                dgrnVar.b = c;
                int c2 = f.m().c();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dgrn dgrnVar2 = (dgrn) bZ3.b;
                dgrnVar2.a |= 2;
                dgrnVar2.c = c2;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dmwn dmwnVar2 = (dmwn) bZ2.b;
                dgrn bK = bZ3.bK();
                bK.getClass();
                dmwnVar2.c = bK;
                dmwnVar2.a |= 32;
                dgrm bZ4 = dgrn.d.bZ();
                int c3 = f.l().c();
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dgrn dgrnVar3 = (dgrn) bZ4.b;
                dgrnVar3.a |= 1;
                dgrnVar3.b = c3;
                int c4 = f.n().c();
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dgrn dgrnVar4 = (dgrn) bZ4.b;
                dgrnVar4.a |= 2;
                dgrnVar4.c = c4;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dmwn dmwnVar3 = (dmwn) bZ2.b;
                dgrn bK2 = bZ4.bK();
                bK2.getClass();
                dmwnVar3.d = bK2;
                dmwnVar3.a |= 64;
                dmwn bK3 = bZ2.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmyd dmydVar = (dmyd) bZ.b;
                bK3.getClass();
                dmydVar.c = bK3;
                dmydVar.a |= 16;
                dmxgVar.b(bZ.bK());
                dcdc<alzp> dcdcVar = ambsVar.h;
                int size = dcdcVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    dcdcVar.get(i2).a(null, dmxgVar);
                }
                btzpVar.b((dmxh) dmxgVar.bK(), new ambt(this, ambsVar), this.q);
            } else {
                String valueOf = String.valueOf(dmxl.GMM_SPOTLIGHT_PERSONALIZED_SMARTMAPS_PER_TILE);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
                sb.append("No PerTile paint request template found for template type: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        } catch (IllegalArgumentException e) {
            c(ambsVar, btzy.a(e));
        }
    }

    private final void f(ambs ambsVar) {
        if (this.h.size() >= 10) {
            ArrayList a2 = dchl.a();
            Iterator<ambs> it = this.h.iterator();
            while (it.hasNext()) {
                ambs next = it.next();
                if (g(next.b)) {
                    a2.add(next);
                }
            }
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                this.h.remove((ambs) a2.get(i));
            }
            if (a2.size() == 0) {
                this.h.removeFirst();
            }
        }
        this.h.addLast(ambsVar);
    }

    private final boolean g(ambr ambrVar) {
        return this.m.a(b, this.i) - ambrVar.c > a;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x000e A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized boolean h(defpackage.ambr r16, java.util.List<defpackage.alyh> r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ambu.h(ambr, java.util.List, boolean, boolean):boolean");
    }

    private final synchronized boolean i(ambs ambsVar) {
        int i;
        int i2;
        int i3;
        aksj aksjVar = ambsVar.b.a;
        for (int i4 = 0; i4 < this.g.size(); i4++) {
            aksj aksjVar2 = this.g.get(i4).a;
            int max = Math.max(aksjVar2.b.b, aksjVar.b.b);
            int min = Math.min(aksjVar2.c.b, aksjVar.c.b);
            double d = dcyn.a;
            if (min >= max) {
                boolean z = aksjVar2.e;
                if (z == aksjVar.e) {
                    i3 = Math.max(aksjVar2.b.a, aksjVar.b.a);
                    i2 = Math.min(aksjVar2.c.a, aksjVar.c.a);
                    if (!aksjVar2.e && !aksjVar.e && i3 > i2) {
                    }
                } else {
                    if (z) {
                        int[] k = aksj.k(aksjVar2, aksjVar);
                        i = k[0];
                        i2 = k[1];
                    } else {
                        int[] k2 = aksj.k(aksjVar, aksjVar2);
                        i = k2[0];
                        i2 = k2[1];
                    }
                    i3 = i;
                }
                double d2 = min - max;
                double d3 = ((i2 - i3) + 1073741824) % 1073741824;
                Double.isNaN(d2);
                Double.isNaN(d3);
                d = d2 * d3;
            }
            double e = aksjVar.e();
            Double.isNaN(e);
            double d4 = d / e;
            double d5 = aksjVar.d();
            Double.isNaN(d5);
            if (d4 / d5 > 0.5d) {
                return false;
            }
        }
        return true;
    }

    private final ambr j(aksj aksjVar, int i) {
        return new ambr(aksjVar, i, this.m.a(b, this.i));
    }

    private final synchronized void k(ambs ambsVar) {
        aksj aksjVar;
        ambr ambrVar = ambsVar.b;
        if (!this.f.contains(ambrVar)) {
            return;
        }
        this.g.remove(ambrVar);
        this.f.remove(ambrVar);
        this.e.o(ambrVar);
        List<dmxx> list = ambsVar.c;
        if (list != null) {
            for (dmxx dmxxVar : list) {
                drsu drsuVar = dmxxVar.a;
                if (drsuVar == null) {
                    drsuVar = drsu.e;
                }
                int size = dmxxVar.c.size();
                if (size > 0) {
                    int i = dmxxVar.b;
                    alyh alyhVar = new alyh(drsuVar.b, drsuVar.c, (drsuVar.d + (size / i)) - 1);
                    alyh alyhVar2 = new alyh(drsuVar.b, (drsuVar.c + i) - 1, drsuVar.d);
                    akra akraVar = new akra(alyhVar.e, alyhVar.f);
                    int i2 = 1073741824 >> alyhVar2.a;
                    aksjVar = aksj.c(new akrp(akraVar, new akra(alyhVar2.e + i2, alyhVar2.f + i2)));
                } else {
                    aksjVar = null;
                }
                if (aksjVar != null) {
                    drsu drsuVar2 = dmxxVar.a;
                    if (drsuVar2 == null) {
                        drsuVar2 = drsu.e;
                    }
                    ambr j = j(aksjVar, drsuVar2.b);
                    this.f.add(j);
                    this.e.Pz(j, true);
                }
            }
        }
    }

    private final synchronized void l() {
        if (2 - this.g.size() >= 2 && !this.h.isEmpty()) {
            ambs removeLast = this.h.removeLast();
            ambr ambrVar = removeLast.a;
            if (!g(ambrVar) && !h(ambrVar, removeLast.d, true, false)) {
                ambs m = m(removeLast.a, removeLast.e, removeLast.f, removeLast.d);
                if (i(removeLast)) {
                    d(m);
                } else {
                    f(m);
                }
            }
        }
    }

    private final ambs m(ambr ambrVar, akry akryVar, alyl alylVar, List<alyh> list) {
        return new ambs(ambrVar, j(ambrVar.a.l(1.5d, 1.5d), ambrVar.b), akryVar, alylVar, list, this.r, new alzq(this.s, alylVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(akry akryVar, alyl alylVar, aksj aksjVar, List<alyh> list) {
        boolean z;
        aksj c;
        if (list.isEmpty()) {
            return;
        }
        int i = list.get(0).a;
        int m = alyh.m(i);
        double d = aksjVar.d();
        double e = aksjVar.e();
        double d2 = m;
        Double.isNaN(e);
        Double.isNaN(d2);
        double d3 = (e * 256.0d) / d2;
        Double.isNaN(d);
        Double.isNaN(d2);
        if ((d * 256.0d) / d2 > 1194.6666666666667d) {
            Double.isNaN(d2);
            d = (d2 * 1194.6666666666667d) / 256.0d;
            z = true;
        } else {
            z = false;
        }
        if (d3 > 1194.6666666666667d) {
            Double.isNaN(d2);
            e = (d2 * 1194.6666666666667d) / 256.0d;
            z = true;
        }
        if (!z) {
            c = aksj.c(aksjVar.a);
        } else {
            c = aksjVar.m((int) (d / 2.0d), (int) (e / 2.0d));
        }
        ambr j = j(c, i);
        if (!this.d && h(j, list, false, true)) {
            return;
        }
        this.d = false;
        ambs m2 = m(j, akryVar, alylVar, list);
        if (this.g.size() >= 2 || !i(m2)) {
            f(m2);
        } else {
            d(m2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ambs ambsVar) {
        k(ambsVar);
        amco d = this.j.d(this.k, this.l);
        dbsk.m(d instanceof amaw, "tileStore must be of type DashServerTileStore");
        amaw amawVar = (amaw) d;
        amawVar.H(amawVar.t, new amam(amawVar, ambsVar));
        l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(ambs ambsVar, btzy btzyVar) {
        ambr ambrVar = ambsVar.b;
        this.g.remove(ambrVar);
        this.f.remove(ambrVar);
        this.e.o(ambrVar);
        if (btzyVar.equals(btzy.j) || btzyVar.equals(btzy.c) || btzyVar.equals(btzy.k)) {
            return;
        }
        l();
    }
}
