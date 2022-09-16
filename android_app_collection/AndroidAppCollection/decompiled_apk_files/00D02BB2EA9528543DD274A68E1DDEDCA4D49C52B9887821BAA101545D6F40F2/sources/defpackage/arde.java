package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: arde  reason: default package */
/* loaded from: classes.dex */
public final class arde implements arcs {
    private static final akra u = new akra();
    public final arcr a;
    public final arcd b;
    public final Set<arcb> c;
    public ardy d;
    public final arcq e;
    public final arcq f;
    private final btrm g;
    private final Executor h;
    private final btpa i;
    private final Resources j;
    private final duwy k;
    private final arcq l;
    private boolean m;
    private final arcq n;
    private final ardd o;
    private final ardd p;
    @dzsi
    private final arcq q;
    private final float r;
    private boolean s = true;
    private volatile boolean t = true;

    public arde(duwy duwyVar, btrm btrmVar, Resources resources, arcr arcrVar, boolean z, int i, btpa btpaVar, bvjj bvjjVar, ardy ardyVar, Executor executor) {
        this.m = false;
        this.g = btrmVar;
        this.a = arcrVar;
        this.i = btpaVar;
        this.j = resources;
        this.d = ardyVar;
        this.k = duwyVar;
        this.h = executor;
        arcd arcdVar = new arcd(btrmVar, arcrVar, bvjjVar, new arcc(arcrVar, z, i, ardyVar.q));
        this.b = arcdVar;
        HashSet f = dcnm.f(13);
        this.c = f;
        ardd f2 = arcrVar.a.f(ardyVar.s, false, bntn.CLIENT_INJECTED_AREAS_ABOVE_LABELS_AND_CALLOUTS, 5);
        this.o = f2;
        ardd f3 = arcrVar.a.f(ardyVar.t, true, bntn.CLIENT_INJECTED_AREAS_ABOVE_LABELS_AND_CALLOUTS, 6);
        this.p = f3;
        arcq d = arcrVar.a.d("MyLocation dot picker", 15);
        this.l = d;
        arcq e = arcrVar.a.e(ardyVar.r, "Throbbing effect under the blue dot", 8);
        this.n = e;
        arcq e2 = arcrVar.a.e(ardyVar.k, ardyVar.l, 9);
        this.e = e2;
        arcq e3 = arcrVar.a.e(ardyVar.n, ardyVar.o, 12);
        this.f = e3;
        this.r = resources.getDimensionPixelSize(R.dimen.mylocation_blue_dot_desired_width_dp) / e2.c();
        this.m = false;
        f.add(f3);
        f.add(f2);
        f.add(e);
        f.add(e2);
        f.add(arcdVar.d);
        arcq arcqVar = arcdVar.f;
        if (arcqVar != null) {
            f.add(arcqVar);
        }
        f.add(e3);
        f.add(d);
        if (!f()) {
            this.q = null;
            return;
        }
        arcq e4 = arcrVar.a.e(R.drawable.blue_dot_pulsate, "Pulsating Dot", 10);
        this.q = e4;
        f.add(e4);
    }

    private final boolean f() {
        duwo duwoVar = this.k.h;
        if (duwoVar == null) {
            duwoVar = duwo.c;
        }
        return duwoVar.a;
    }

    private final void g(boolean z, @dzsi akra akraVar) {
        Float f;
        if (!this.m) {
            this.m = true;
            f = Float.valueOf((this.r * this.e.c()) / 4.0f);
            this.l.d(alhz.INSTANCE, this.g, this.h);
        } else {
            f = null;
        }
        this.l.a(z);
        this.l.e(akraVar, f, null, null);
    }

    private final void h(@dzsi akra akraVar, float f, @dzsi akra akraVar2, float f2, float f3, akra akraVar3, float f4, float f5, float f6) {
        boolean z;
        Float valueOf = Float.valueOf(-f5);
        akra akraVar4 = u;
        boolean z2 = true;
        if (akraVar == akraVar4) {
            i(this.f);
            this.s = false;
            z = false;
            z2 = false;
        } else {
            this.f.a(this.t);
            this.f.e(akraVar, Float.valueOf(f), valueOf, null);
            g(this.t, akraVar);
            z = this.t;
            this.s = true;
        }
        this.i.l(z2);
        if (akraVar2 == akraVar4) {
            i(this.e);
            i(this.n);
            i(this.q);
            i(null);
        } else {
            this.e.a(this.t);
            arcq arcqVar = this.e;
            Float valueOf2 = Float.valueOf(f2);
            arcqVar.e(akraVar2, valueOf2, valueOf, null);
            g(this.t, akraVar2);
            z |= this.t;
            if (f3 == 0.0f) {
                i(this.n);
            } else {
                this.n.a(this.t);
                this.n.e(akraVar2, valueOf2, null, Float.valueOf(f3));
            }
            if (f()) {
                dbsk.s(this.q);
                if (ardy.DEFAULT_WHITE_DOT.l.equals(this.e.f)) {
                    this.q.a(this.t);
                    this.q.e(akraVar2, Float.valueOf(f2 * f6 * 0.5f), null, null);
                } else {
                    i(this.q);
                }
            }
        }
        if (!z) {
            i(this.l);
        }
        if (akraVar3 == akraVar4) {
            this.o.a(false);
            this.p.a(false);
            return;
        }
        this.o.a(this.t);
        this.o.c(akraVar3, f4);
        this.p.a(this.t);
        this.p.c(akraVar3, f4);
    }

    private static void i(@dzsi arcb arcbVar) {
        if (arcbVar != null) {
            arcbVar.a(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
        if (r0 != false) goto L26;
     */
    @Override // defpackage.arci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.area r14, defpackage.akzh r15) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arde.a(area, akzh):void");
    }

    @Override // defpackage.arci
    public final void b(boolean z) {
        this.t = z;
        this.b.g = z;
    }

    @Override // defpackage.arci
    public final void c() {
        for (arcb arcbVar : this.c) {
            arcbVar.a(false);
        }
    }

    @Override // defpackage.arcs
    public final synchronized ddho d() {
        if (this.s) {
            return this.d.p;
        }
        return this.d.m;
    }

    public final synchronized ardz e() {
        return this.d.j;
    }
}
