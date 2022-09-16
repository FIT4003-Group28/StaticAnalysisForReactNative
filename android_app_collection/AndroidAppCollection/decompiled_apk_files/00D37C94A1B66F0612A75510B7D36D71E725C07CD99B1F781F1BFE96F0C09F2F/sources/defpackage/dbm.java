package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.facebook.litho.ComponentTree;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: dbm  reason: default package */
/* loaded from: classes3.dex */
public final class dbm {
    static final boolean a = "robolectric".equals(Build.FINGERPRINT);

    static cyr a(cyv cyvVar, cyr cyrVar, boolean z) {
        AtomicBoolean atomicBoolean = cyrVar.p;
        cyr j = (atomicBoolean != null && atomicBoolean.getAndSet(true)) ? cyrVar.j() : cyrVar;
        if (z) {
            j.m = cyrVar.m;
        }
        aflw aflwVar = cyvVar.m;
        j.au(aflwVar);
        j.t(cyvVar);
        cyv cyvVar2 = j.q;
        cyvVar2.m = j.at(cyvVar2, aflwVar);
        if (dfz.a) {
            czs czsVar = (czs) czt.a.get(czt.k(cyvVar2, j));
            if (czsVar != null) {
                czsVar.a();
                j.m();
                czsVar.c();
            }
        }
        return j;
    }

    public static dbk b(cyv cyvVar, cyr cyrVar) {
        return d(cyvVar, cyrVar, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dbk c(cyv cyvVar, cyr cyrVar, boolean z) {
        return d(cyvVar, cyrVar, z, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dbk d(cyv cyvVar, cyr cyrVar, boolean z, boolean z2) {
        cyr cyrVar2;
        dbk c;
        try {
            cyrVar = a(cyvVar, cyrVar, z2);
            cyv cyvVar2 = cyrVar.q;
            if (!cyr.A(cyvVar2, cyrVar) || z) {
                if (cyrVar.d()) {
                    c = (dbk) cyrVar.c(cyvVar2);
                } else if (cyr.y(cyrVar)) {
                    c = czu.E(cyvVar2);
                    c.bH(YogaFlexDirection.COLUMN);
                } else if (cyr.w(cyrVar)) {
                    try {
                        cyrVar2 = cyr.x(cyrVar) ? cyrVar.G(cyvVar2, cyvVar2.h, cyvVar2.i) : cyrVar.b(cyvVar2);
                    } catch (Exception e) {
                        czb.ak(e);
                        cyrVar2 = null;
                    }
                    if (cyrVar2 == null || cyrVar2.k <= 0) {
                        cyrVar2 = null;
                    }
                    if (cyrVar2 == cyrVar) {
                        c = (dbk) cyrVar2.c(cyvVar2);
                    } else {
                        c = cyrVar2 != null ? c(cyvVar2, cyrVar2, false) : null;
                    }
                } else {
                    String valueOf = String.valueOf(cyrVar.o());
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "component:".concat(valueOf) : new String("component:"));
                }
            } else {
                c = czu.E(cyvVar2);
                aflw aflwVar = cyvVar2.m;
                ((czz) c).ah().a = true;
                ((czz) c).ah().f = aflw.i(aflwVar);
            }
            if (c == null || c == cyv.a) {
                return cyv.a;
            }
            if (c.W() == null && ((cyrVar.Z() && cyr.y(cyrVar)) || (cyr.A(cyvVar2, cyrVar) && !z))) {
                c.aH(czb.t);
            }
            cyo cyoVar = cyrVar.s;
            if (cyoVar != null && ((!cyr.x(cyrVar) || !z) && c != cyv.a)) {
                dab dabVar = cyoVar.g;
                if (dabVar != null) {
                    dabVar.A(c.bc());
                }
                if ((cyoVar.a & 1) != 0) {
                    c.bg(cyoVar.c);
                }
                if ((cyoVar.a & 2) != 0) {
                    c.bx(cyoVar.d);
                }
                if (cyoVar.f || (cyoVar.a & 28) != 0) {
                    c.bF();
                }
                cym cymVar = cyoVar.h;
                if (cymVar != null) {
                    if ((cymVar.a & 1) != 0) {
                        c.A(cymVar.b);
                    }
                    if ((cymVar.a & 2) != 0) {
                        c.z(cymVar.c);
                    }
                    if ((cymVar.a & 4) != 0) {
                        c.t(cymVar.d);
                    }
                    if ((cymVar.a & 8) != 0) {
                        c.s(cymVar.e);
                    }
                    if ((cymVar.a & 16) != 0) {
                        c.p(cymVar.f);
                    }
                    if ((cymVar.a & 32) != 0) {
                        c.o(cymVar.g);
                    }
                    if ((cymVar.a & 64) != 0) {
                        c.ki(cymVar.h);
                    }
                    if ((cymVar.a & 128) != 0) {
                        c.kh(cymVar.i);
                    }
                    if ((cymVar.a & 256) != 0) {
                        c.r(cymVar.j);
                    }
                    if ((cymVar.a & 512) != 0) {
                        c.q(cymVar.k);
                    }
                    if ((cymVar.a & 1024) != 0) {
                        c.n(cymVar.l);
                    }
                    if ((cymVar.a & 2048) != 0) {
                        c.m(cymVar.m);
                    }
                    if ((cymVar.a & 4096) != 0) {
                        c.kj(cymVar.s);
                    }
                    if ((cymVar.a & 8192) != 0) {
                        c.ka(cymVar.t);
                    }
                    if ((cymVar.a & 16384) != 0) {
                        c.B();
                    }
                    if ((cymVar.a & 32768) != 0) {
                        c.kf(cymVar.n);
                    }
                    if ((cymVar.a & 65536) != 0) {
                        c.kg(cymVar.o);
                    }
                    if ((cymVar.a & 131072) != 0) {
                        c.ke(cymVar.p);
                    }
                    if ((cymVar.a & 262144) != 0) {
                        c.kd(cymVar.q);
                    }
                    if ((cymVar.a & 524288) != 0) {
                        c.kb(cymVar.r);
                    }
                    if ((cymVar.a & 1048576) != 0) {
                        c.y(cymVar.u);
                    }
                    if ((cymVar.a & 2097152) != 0) {
                        for (int i = 0; i < dam.a; i++) {
                            float b = cymVar.v.b(i);
                            if (!czu.M(b)) {
                                c.x(YogaEdge.a(i), (int) b);
                            }
                        }
                    }
                    if ((cymVar.a & 4194304) != 0) {
                        for (int i2 = 0; i2 < dam.a; i2++) {
                            float b2 = cymVar.A.b(i2);
                            if (!czu.M(b2)) {
                                c.w(YogaEdge.a(i2), b2);
                            }
                        }
                    }
                    if ((cymVar.a & 8388608) != 0) {
                        for (int i3 = 0; i3 < dam.a; i3++) {
                            float b3 = cymVar.y.b(i3);
                            if (!czu.M(b3)) {
                                c.v(YogaEdge.a(i3), (int) b3);
                            }
                        }
                    }
                    if ((cymVar.a & 16777216) != 0) {
                        for (int i4 = 0; i4 < dam.a; i4++) {
                            float b4 = cymVar.z.b(i4);
                            if (!czu.M(b4)) {
                                c.u(YogaEdge.a(i4), b4);
                            }
                        }
                    }
                    if ((cymVar.a & 33554432) != 0) {
                        for (int i5 = 0; i5 < dam.a; i5++) {
                            float b5 = cymVar.w.b(i5);
                            if (!czu.M(b5)) {
                                c.l(YogaEdge.a(i5), (int) b5);
                            }
                        }
                    }
                    if ((cymVar.a & 67108864) != 0) {
                        for (int i6 = 0; i6 < dam.a; i6++) {
                            float b6 = cymVar.x.b(i6);
                            if (!czu.M(b6)) {
                                c.k(YogaEdge.a(i6), b6);
                            }
                        }
                    }
                }
                cyn cynVar = cyoVar.b;
                if (cynVar != null) {
                    if ((1 & cynVar.a) != 0) {
                        c.bq(cynVar.e);
                    }
                    if ((cynVar.a & 2) != 0) {
                        c.bG();
                    }
                    if ((cynVar.a & 4) != 0) {
                        c.bI();
                    }
                    if ((cynVar.a & 1024) != 0) {
                        c.bF();
                    }
                    if ((cynVar.a & 8) != 0) {
                        c.bD(cynVar.b);
                    }
                    if ((cynVar.a & 1073741824) != 0) {
                        c.bt(cynVar.c);
                    }
                    if ((cynVar.a & 16) != 0) {
                        c.bk(null);
                    }
                    if ((cynVar.a & 32) != 0) {
                        c.bl(null);
                    }
                    if ((cynVar.a & 64) != 0) {
                        c.br(cynVar.d);
                    }
                    if ((cynVar.a & 128) != 0) {
                        c.bB(null);
                    }
                    if ((cynVar.a & 65536) != 0) {
                        c.bC(null);
                    }
                    if ((cynVar.a & 512) != 0) {
                        c.bz(cynVar.h, cynVar.g);
                    }
                    if ((cynVar.a & 131072) != 0) {
                        c.bA(cynVar.k);
                    }
                    if ((cynVar.a & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
                        c.ax(cynVar.i);
                    }
                    if ((cynVar.a & 256) != 0) {
                        for (int i7 = 0; i7 < dam.a; i7++) {
                            float b7 = cynVar.f.b(i7);
                            if (!czu.M(b7)) {
                                c.by(YogaEdge.a(i7), (int) b7);
                            }
                        }
                    }
                    if ((cynVar.a & 8192) != 0) {
                        c.bh(cynVar.j);
                    }
                    if ((cynVar.a & 16384) != 0) {
                        c.bv();
                    }
                    if ((cynVar.a & 32768) != 0) {
                        c.bw();
                    }
                }
            }
            c.az(cyrVar);
            k(cyvVar2);
            if (cyr.y(cyrVar)) {
                cyrVar.V(cyvVar2);
            }
            List list = cyrVar.j;
            if (list != null && !list.isEmpty()) {
                c.ay(cyrVar.j);
            }
            return c;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (r6 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dbk e(defpackage.cyv r12, defpackage.dbk r13, int r14, int r15) {
        /*
            cyr r0 = r13.W()
            dbk r1 = r13.aj()
            if (r0 == 0) goto Lc7
            if (r1 == 0) goto L24
            int r2 = r1.e()
            int r3 = r1.d()
            float r6 = r1.b()
            float r7 = r1.a()
            r4 = r14
            r5 = r15
            boolean r2 = l(r2, r3, r4, r5, r6, r7)
            if (r2 != 0) goto Laf
        L24:
            dbq r2 = r12.e()
            if (r2 == 0) goto Lb3
            dbk r3 = r2.d(r0)
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L64
            r2.j(r0)
            boolean r2 = r3.aV()
            if (r2 != 0) goto L48
            com.facebook.yoga.YogaDirection r2 = r3.L()
            com.facebook.yoga.YogaDirection r6 = r13.L()
            if (r2 != r6) goto L46
            goto L48
        L46:
            r2 = 0
            goto L49
        L48:
            r2 = 1
        L49:
            int r6 = r3.e()
            int r7 = r3.d()
            float r10 = r3.b()
            float r11 = r3.a()
            r8 = r14
            r9 = r15
            boolean r6 = l(r6, r7, r8, r9, r10, r11)
            if (r2 == 0) goto L64
            if (r6 == 0) goto L64
            goto L65
        L64:
            r3 = r4
        L65:
            if (r3 == 0) goto L69
            r1 = r3
            goto Lac
        L69:
            if (r1 == 0) goto L73
            boolean r1 = defpackage.dfz.h
            if (r1 == 0) goto L73
            int r1 = r12.h
            int r1 = r12.i
        L73:
            boolean r1 = defpackage.dbm.a
            if (r1 != 0) goto L79
            r1 = r12
            goto L7d
        L79:
            cyv r1 = r12.c()
        L7d:
            aflw r2 = r13.bN()
            r1.m = r2
            r1.h = r14
            r1.i = r15
            dbk r0 = d(r1, r0, r5, r5)
            r13.kc(r0)
            dae r1 = r13.Z()
            h(r12, r0, r14, r15, r1)
            r0.kn(r14)
            r0.kk(r15)
            int r12 = r0.C()
            float r12 = (float) r12
            r0.kl(r12)
            int r12 = r0.H()
            float r12 = (float) r12
            r0.km(r12)
            r1 = r0
        Lac:
            r13.aI(r1)
        Laf:
            r1.aB()
            return r1
        Lb3:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = r0.o()
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r14 = ": Trying to access the cached InternalNode for a component outside of a LayoutState calculation. If that is what you must do, see Component#measureMightNotCacheInternalNode."
            java.lang.String r13 = r13.concat(r14)
            r12.<init>(r13)
            throw r12
        Lc7:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "A component is required to resolve a nested tree."
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbm.e(cyv, dbk, int, int):dbk");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dbk f(cyv cyvVar, cyr cyrVar, int i, int i2, dbk dbkVar, dae daeVar, ddb ddbVar) {
        dbk am;
        dbq dbqVar;
        if (ddbVar != null) {
            ddbVar.b(dbkVar == null ? "start_create_layout" : "start_reconcile_layout");
        }
        cyvVar.h = i;
        cyvVar.i = i2;
        String str = "end_create_layout";
        if (dbkVar == null) {
            am = c(cyvVar, cyrVar, true);
            if (cyvVar.l()) {
                if (ddbVar != null) {
                    ddbVar.b(str);
                }
                return am;
            }
            dbp dbpVar = cyvVar.k;
            if (dbpVar != null && (dbqVar = dbpVar.a) != null) {
                dbqVar.w = false;
            }
        } else {
            am = dbkVar.am(cyvVar, a(cyvVar, cyrVar, true));
        }
        if (ddbVar != null) {
            if (dbkVar != null) {
                str = "end_reconcile_layout";
            }
            ddbVar.b(str);
        }
        if (ddbVar != null) {
            ddbVar.b("start_measure");
        }
        h(cyvVar, am, i, i2, daeVar);
        if (ddbVar != null) {
            ddbVar.b("end_measure");
        }
        return am;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void g(defpackage.dbk r5, defpackage.dae r6) {
        /*
            dbk r0 = r5.al()     // Catch: java.lang.Throwable -> L69
            cyr r1 = r5.W()     // Catch: java.lang.Throwable -> L69
            boolean r1 = defpackage.cyr.x(r1)     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L15
            if (r0 != 0) goto L11
            goto L15
        L11:
            r5.aG(r6)     // Catch: java.lang.Throwable -> L69
            return
        L15:
            if (r6 != 0) goto L18
            goto L68
        L18:
            cyr r0 = r5.W()     // Catch: java.lang.Throwable -> L69
            cyr r1 = r6.f()     // Catch: java.lang.Throwable -> L69
            boolean r0 = defpackage.czu.c(r0, r1)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L68
            r5.aG(r6)     // Catch: java.lang.Throwable -> L69
            int r0 = r5.c()     // Catch: java.lang.Throwable -> L69
            int r1 = r6.c()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L48
            if (r1 == 0) goto L48
            r2 = 0
        L36:
            if (r2 >= r0) goto L68
            if (r2 >= r1) goto L68
            dbk r3 = r5.ai(r2)     // Catch: java.lang.Throwable -> L69
            dae r4 = r6.g(r2)     // Catch: java.lang.Throwable -> L69
            g(r3, r4)     // Catch: java.lang.Throwable -> L69
            int r2 = r2 + 1
            goto L36
        L48:
            cyr r0 = r5.W()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L68
            cyr r1 = r6.f()     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.ah(r0, r1)     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L68
            cyr r0 = r5.W()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L65
            cyr r6 = r6.f()     // Catch: java.lang.Throwable -> L69
            r0.p(r6)     // Catch: java.lang.Throwable -> L69
        L65:
            r5.bu()     // Catch: java.lang.Throwable -> L69
        L68:
            return
        L69:
            r6 = move-exception
            cyr r5 = r5.W()
            if (r5 == 0) goto L76
            czm r0 = new czm
            r0.<init>(r5, r6)
            throw r0
        L76:
            goto L78
        L77:
            throw r6
        L78:
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbm.g(dbk, dae):void");
    }

    static void h(cyv cyvVar, dbk dbkVar, int i, int i2, dae daeVar) {
        if (dbkVar.an() == YogaDirection.INHERIT) {
            Context context = cyvVar.b;
            if ((context.getApplicationInfo().flags & 4194304) != 0 && context.getResources().getConfiguration().getLayoutDirection() == 1) {
                dbkVar.kj(YogaDirection.RTL);
            }
        }
        if (czu.M(dbkVar.O())) {
            dbkVar.aK(i);
        }
        if (czu.M(dbkVar.N())) {
            dbkVar.aJ(i2);
        }
        if (daeVar != null) {
            g(dbkVar, daeVar);
        }
        float f = Float.NaN;
        float size = View.MeasureSpec.getMode(i) == 0 ? Float.NaN : View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i2) != 0) {
            f = View.MeasureSpec.getSize(i2);
        }
        dbkVar.aD(size, f);
    }

    static void i(dbk dbkVar) {
        List aw = dbkVar.aw();
        if (aw != null) {
            int size = aw.size();
            for (int i = 0; i < size; i++) {
                dbkVar.bi((cyr) aw.get(i));
            }
            dbkVar.aw().clear();
        }
        int c = dbkVar.c();
        for (int i2 = 0; i2 < c; i2++) {
            i(dbkVar.ai(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(cyv cyvVar, dbk dbkVar, int i, int i2, dae daeVar, ddb ddbVar) {
        if (dbkVar == cyv.a) {
            return;
        }
        i(dbkVar);
        if (ddbVar != null) {
            ddbVar.b("start_measure");
        }
        h(cyvVar, dbkVar, i, i2, daeVar);
        if (ddbVar == null) {
            return;
        }
        ddbVar.b("end_measure");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean k(cyv cyvVar) {
        ComponentTree componentTree;
        return (cyvVar == null || (componentTree = cyvVar.j) == null) ? czu.x(null) : componentTree.c;
    }

    public static boolean l(int i, int i2, int i3, int i4, float f, float f2) {
        return czu.C(i, i3, (int) f) && czu.C(i2, i4, (int) f2);
    }
}
