package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: dbq  reason: default package */
/* loaded from: classes3.dex */
public final class dbq {
    private static Map B;
    private final boolean C;
    private final Map D = new HashMap();
    private List E;
    private int F;
    private int G;
    private final agb H;
    private dbr I;

    /* renamed from: J  reason: collision with root package name */
    private dae f172J;
    private int K;
    private int L;
    private int M;
    private long N;
    private int O;
    private boolean P;
    private int Q;
    private boolean R;
    private AccessibilityManager S;
    private boolean T;
    private ddm U;
    private def V;
    private dda W;
    private final Set X;
    private final int Y;
    private Map Z;
    public final cyv c;
    public cyr d;
    public final List e;
    public final List f;
    public final ArrayList g;
    public final ArrayList h;
    public final Map i;
    public final List j;
    dbk k;
    def l;
    String m;
    public int n;
    public int o;
    public int p;
    public final int q;
    public int r;
    public boolean s;
    public final Map t;
    public List u;
    public volatile boolean v;
    public volatile boolean w;
    public dez x;
    final boolean y;
    static final Comparator a = new wd(8);
    static final Comparator b = new wd(9);
    private static final AtomicInteger z = new AtomicInteger(1);
    private static final Object A = new Object();

    public dbq(cyv cyvVar) {
        new HashMap();
        this.e = new ArrayList(8);
        this.H = new agb(8);
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.M = 0;
        this.N = -1L;
        this.O = -1;
        this.P = true;
        this.Q = 0;
        this.R = false;
        this.p = -1;
        this.r = -1;
        this.T = false;
        this.t = new LinkedHashMap();
        this.X = new HashSet();
        this.w = true;
        boolean z2 = dfz.a;
        this.y = false;
        this.c = cyvVar;
        this.q = z.getAndIncrement();
        this.U = cyvVar.d;
        this.j = dfz.e ? new ArrayList(8) : null;
        this.Y = cyvVar.b().getConfiguration().orientation;
        this.i = new HashMap();
        this.E = new ArrayList();
        if (cyvVar.j != null) {
            this.C = false;
        } else {
            this.C = false;
        }
        this.f = new ArrayList(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
        if (r17.f(r7) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
        r23.k = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:8:0x0014, B:13:0x0024, B:14:0x0040, B:16:0x005b, B:18:0x005f, B:20:0x0089, B:22:0x008d, B:25:0x0094, B:27:0x0098, B:29:0x009e, B:31:0x00a6, B:33:0x00ac, B:46:0x00d0, B:50:0x00d9, B:52:0x00ed, B:53:0x00f3, B:55:0x0103, B:57:0x0107, B:60:0x010d, B:61:0x0112, B:63:0x011a, B:39:0x00b9, B:41:0x00c3, B:43:0x00c9, B:48:0x00d6), top: B:69:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:8:0x0014, B:13:0x0024, B:14:0x0040, B:16:0x005b, B:18:0x005f, B:20:0x0089, B:22:0x008d, B:25:0x0094, B:27:0x0098, B:29:0x009e, B:31:0x00a6, B:33:0x00ac, B:46:0x00d0, B:50:0x00d9, B:52:0x00ed, B:53:0x00f3, B:55:0x0103, B:57:0x0107, B:60:0x010d, B:61:0x0112, B:63:0x011a, B:39:0x00b9, B:41:0x00c3, B:43:0x00c9, B:48:0x00d6), top: B:69:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dbq n(defpackage.cyv r16, defpackage.cyr r17, defpackage.czi r18, int r19, int r20, int r21, boolean r22, defpackage.dbq r23, int r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbq.n(cyv, cyr, czi, int, int, int, boolean, dbq, int, java.lang.String):dbq");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void o(int i, dbq dbqVar) {
        cyv cyvVar = dbqVar.c;
        if (!dbqVar.v) {
            throw new IllegalStateException("Can not resume a finished LayoutState calculation");
        }
        ddb ddbVar = null;
        dbp dbpVar = new dbp(dbqVar, null);
        cyvVar.k = dbpVar;
        cyr cyrVar = dbqVar.d;
        int i2 = dbqVar.p;
        int i3 = dbqVar.F;
        int i4 = dbqVar.G;
        tha thaVar = cyvVar.l;
        if (thaVar != null) {
            try {
                ddbVar = czu.D(cyvVar, thaVar, thaVar.a(cyvVar, 19));
            } catch (Throwable th) {
                throw th;
            }
        }
        ddb ddbVar2 = ddbVar;
        if (ddbVar2 != null) {
            ddbVar2.a("component", cyrVar.o());
            ddbVar2.a("calculate_layout_state_source", q(i));
        }
        dbm.j(cyvVar, dbqVar.k, i3, i4, dbqVar.f172J, ddbVar2);
        v(cyvVar, dbqVar);
        dbpVar.a();
        if (ddbVar2 == null) {
            return;
        }
        tha.d(ddbVar2);
    }

    private static dbn p(cyr cyrVar, long j, dbq dbqVar, dbk dbkVar, boolean z2, int i, boolean z3, boolean z4) {
        int i2;
        int i3;
        int i4;
        deq deqVar;
        def defVar;
        int i5;
        boolean z5 = cyr.z(cyrVar);
        int i6 = dbqVar.O;
        if (i6 >= 0) {
            Rect rect = ((dmw) dbqVar.e.get(i6)).b;
            int i7 = rect.left;
            i3 = rect.top;
            i2 = i7;
        } else {
            i2 = 0;
            i3 = 0;
        }
        int I = dbqVar.K + dbkVar.I();
        int J2 = dbqVar.L + dbkVar.J();
        int H = dbkVar.H() + I;
        int C = dbkVar.C() + J2;
        int E = z2 ? dbkVar.E() : 0;
        int G = z2 ? dbkVar.G() : 0;
        int F = z2 ? dbkVar.F() : 0;
        int D = z2 ? dbkVar.D() : 0;
        dab bb = dbkVar.bb();
        if (z5) {
            deq deqVar2 = new deq();
            boolean z6 = dbqVar.y;
            if (z2 && dbkVar.M()) {
                if (deqVar2.b != null) {
                    throw new IllegalStateException("Padding already initialized for this ViewNodeInfo.");
                }
                deqVar2.b = new Rect();
                deqVar2.b.set(E, G, F, D);
            }
            deqVar2.d = dbkVar.L();
            int i8 = I - i2;
            int i9 = J2 - i3;
            int i10 = H - i2;
            int i11 = C - i3;
            if (dbkVar.aP()) {
                int S = dbkVar.S();
                int U = dbkVar.U();
                int T = dbkVar.T();
                int R = dbkVar.R();
                if (S == 0) {
                    if (U != 0) {
                        S = 0;
                    } else if (T != 0) {
                        S = 0;
                        U = 0;
                    } else if (R != 0) {
                        S = 0;
                        U = 0;
                        T = 0;
                    }
                }
                if (deqVar2.c != null) {
                    throw new IllegalStateException("ExpandedTouchBounds already initialized for this ViewNodeInfo.");
                }
                deqVar2.c = new Rect();
                deqVar2.c.set(i8 - S, i9 - U, i10 + T, i11 + R);
            }
            deqVar = deqVar2;
            i4 = 0;
        } else {
            I += E;
            J2 += G;
            H -= F;
            C -= D;
            i4 = (bb == null || bb.q != 2) ? 0 : 2;
            deqVar = null;
            bb = null;
        }
        Rect rect2 = new Rect(I, J2, H, C);
        if (z3) {
            i4 |= 1;
        }
        if (z4) {
            i5 = i4 | 4;
            defVar = null;
        } else {
            defVar = dbqVar.V;
            i5 = i4;
        }
        boolean z7 = dbqVar.y;
        return new dbn(bb, deqVar, cyrVar, rect2, i2, i3, i5, j, i, dbqVar.Y, defVar);
    }

    private static String q(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "measure" : "updateStateAsync" : "updateStateSync" : "setSizeSpecAsync" : "setSizeSpec" : "setRootAsync" : "setRoot";
    }

    private static void r(dbq dbqVar) {
        def defVar;
        String sb;
        char c;
        dda ddaVar = dbqVar.W;
        if (ddaVar == null || ddaVar.b == 0 || (defVar = dbqVar.V) == null) {
            return;
        }
        if (defVar.a == 3 || dfz.i) {
            if (!dbqVar.X.contains(defVar) && dbqVar.t.put(defVar, ddaVar) != null) {
                dbqVar.t.remove(defVar);
                dbqVar.X.add(defVar);
            }
        } else if (dbqVar.t.put(defVar, ddaVar) != null) {
            String valueOf = String.valueOf(defVar);
            dbk dbkVar = dbqVar.k;
            if (dbkVar == null) {
                sb = "null";
            } else {
                StringBuilder sb2 = new StringBuilder();
                LinkedList linkedList = new LinkedList();
                linkedList.addLast(null);
                linkedList.addLast(dbkVar);
                int i = 0;
                while (!linkedList.isEmpty()) {
                    dbk dbkVar2 = (dbk) linkedList.removeLast();
                    if (dbkVar2 == null) {
                        i--;
                    } else {
                        cyr W = dbkVar2.W();
                        if (W != null) {
                            if (dbkVar2 != dbkVar) {
                                sb2.append('\n');
                                Iterator it = linkedList.iterator();
                                it.next();
                                it.next();
                                for (int i2 = 0; i2 < i - 1; i2++) {
                                    if (it.next() != null) {
                                        do {
                                        } while (it.next() != null);
                                        c = "│";
                                    } else {
                                        c = ' ';
                                    }
                                    sb2.append(c);
                                    sb2.append(' ');
                                }
                                sb2.append(linkedList.getLast() == null ? "└╴" : "├╴");
                            }
                            sb2.append(W.o());
                            if (W.o || dbkVar2.aQ() || dbkVar2.aq() != null) {
                                sb2.append('[');
                                if (W.o) {
                                    sb2.append("manual.key=\"");
                                    sb2.append(W.n());
                                    sb2.append("\";");
                                }
                                if (dbkVar2.aQ()) {
                                    sb2.append("trans.key=\"");
                                    sb2.append(dbkVar2.ar());
                                    sb2.append("\";");
                                }
                                if (dbkVar2.aq() != null) {
                                    sb2.append("test.key=\"");
                                    sb2.append(dbkVar2.aq());
                                    sb2.append("\";");
                                }
                                sb2.append(']');
                            }
                            if (dbkVar2.c() != 0) {
                                linkedList.addLast(null);
                                int c2 = dbkVar2.c();
                                while (true) {
                                    c2--;
                                    if (c2 < 0) {
                                        break;
                                    }
                                    linkedList.addLast(dbkVar2.ai(c2));
                                }
                                i++;
                            }
                        }
                    }
                }
                sb = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 102 + String.valueOf(sb).length());
            sb3.append("The transitionId '");
            sb3.append(valueOf);
            sb3.append("' is defined multiple times in the same layout. TransitionIDs must be unique.\nTree:\n");
            sb3.append(sb);
            czq.a(3, "LayoutState:DuplicateTransitionIds", sb3.toString());
        }
        dbqVar.W = null;
        dbqVar.V = null;
    }

    private static void s(agb agbVar, dbn dbnVar, int i) {
        agbVar.k(dbnVar.j, Integer.valueOf(i));
    }

    private static void t(dbq dbqVar, dbn dbnVar, dmw dmwVar) {
        dbnVar.i = dbqVar.e.size();
        dmw b2 = dbn.b(dbnVar, dmwVar);
        if (dmwVar != null) {
            if (dmwVar.c == null) {
                dmwVar.c = new ArrayList(4);
            }
            dmwVar.c.add(b2);
        }
        dbqVar.e.add(b2);
        dbqVar.g.add(b2);
        dbqVar.h.add(b2);
    }

    private static void u(dda ddaVar, int i, dbn dbnVar) {
        if (ddaVar != null) {
            ddaVar.e(i, dbnVar);
        }
    }

    private static void v(cyv cyvVar, dbq dbqVar) {
        agb agbVar;
        if (cyvVar.k()) {
            return;
        }
        int i = dbqVar.F;
        int i2 = dbqVar.G;
        dbk dbkVar = dbqVar.k;
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            dbqVar.n = Math.min(dbkVar.H(), View.MeasureSpec.getSize(i));
        } else if (mode == 0) {
            dbqVar.n = dbkVar.H();
        } else if (mode == 1073741824) {
            dbqVar.n = View.MeasureSpec.getSize(i);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            dbqVar.o = Math.min(dbkVar.C(), View.MeasureSpec.getSize(i2));
        } else if (mode2 == 0) {
            dbqVar.o = dbkVar.C();
        } else if (mode2 == 1073741824) {
            dbqVar.o = View.MeasureSpec.getSize(i2);
        }
        dbr dbrVar = dbqVar.I;
        if (dbrVar != null && (agbVar = dbrVar.a) != null) {
            agbVar.j();
        }
        dbqVar.N = -1L;
        if (dbkVar == cyv.a) {
            return;
        }
        x(null, cyvVar, dbkVar, dbqVar, null);
        Collections.sort(dbqVar.g, a);
        Collections.sort(dbqVar.h, b);
        boolean z2 = dbqVar.C;
        if (cyvVar.j()) {
            return;
        }
        boolean z3 = dfz.a;
        if (dfz.a || dfz.e) {
            return;
        }
        dbqVar.k = null;
    }

    private final boolean w(dbk dbkVar) {
        return this.k.aW() ? dbkVar == this.k.aj() : dbkVar == this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x01cc, code lost:
        if (defpackage.cyr.z(r33.W()) == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03f5 A[LOOP:4: B:231:0x03f3->B:232:0x03f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void x(defpackage.dmw r31, defpackage.cyv r32, defpackage.dbk r33, defpackage.dbq r34, defpackage.dae r35) {
        /*
            Method dump skipped, instructions count: 1811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbq.x(dmw, cyv, dbk, dbq, dae):void");
    }

    private static dbn y(dmw dmwVar, dbk dbkVar, dbq dbqVar, dbn dbnVar, Drawable drawable, int i, boolean z2) {
        cyr dajVar = new daj(drawable);
        dajVar.q = cyv.d(dbkVar.X(), dajVar);
        boolean z3 = dbnVar != null ? !dajVar.ah(dbnVar.b, dajVar) : false;
        long j = dbnVar != null ? dbnVar.j : -1L;
        dajVar.Q(dbqVar.c, dbkVar);
        dbn p = p(dajVar, dbqVar.N, dbqVar, dbkVar, false, 2, dbqVar.P, z2);
        dbqVar.z(p, dbqVar.M, i, j, z3);
        t(dbqVar, p, dmwVar);
        s(dbqVar.H, p, dbqVar.e.size() - 1);
        u(dbqVar.W, i, p);
        return p;
    }

    private final void z(dbn dbnVar, int i, int i2, long j, boolean z2) {
        if (this.I == null) {
            this.I = new dbr();
        }
        dbr dbrVar = this.I;
        int i3 = 2;
        if (dbrVar.a == null) {
            dbrVar.a = new agb(2);
        }
        if (i < 0 || i > 255) {
            StringBuilder sb = new StringBuilder(75);
            sb.append("Level must be non-negative and no greater than 255 actual level ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        long j2 = (dbnVar.b.u << 27) | (i << 19) | (i2 << 16);
        int i4 = -1;
        if (j > 0 && ((int) ((j >> 19) & 255)) == i) {
            i4 = (int) (65535 & j);
        }
        int intValue = ((Integer) dbrVar.a.g(j2, 0)).intValue();
        if (i4 < intValue) {
            i4 = intValue + 1;
            i3 = 0;
        } else if (true == z2) {
            i3 = 1;
        }
        dbnVar.k = i3;
        if (i4 < 0 || i4 > 65535) {
            StringBuilder sb2 = new StringBuilder(83);
            sb2.append("Sequence must be non-negative and no greater than 65535 actual sequence ");
            sb2.append(i4);
            throw new IllegalArgumentException(sb2.toString());
        }
        dbnVar.j = i4 | j2;
        dbrVar.a.k(j2, Integer.valueOf(i4 + 1));
    }

    public final int a(long j) {
        return ((Integer) this.H.g(j, -1)).intValue();
    }

    public final int b() {
        return this.e.size();
    }

    public final int c() {
        return this.f.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbk d(cyr cyrVar) {
        return (dbk) this.i.get(Integer.valueOf(cyrVar.k));
    }

    public final ddm e() {
        ddm ddmVar = this.U;
        this.U = null;
        return ddmVar;
    }

    public final det f(int i) {
        return (det) this.f.get(i);
    }

    public final dmw g(int i) {
        return (dmw) this.e.get(i);
    }

    public final List h() {
        List list = this.E;
        this.E = null;
        return list;
    }

    public final Map i() {
        Map map = this.Z;
        this.Z = null;
        return map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(cyr cyrVar) {
        this.i.remove(Integer.valueOf(cyrVar.k));
    }

    public final boolean k() {
        return cyf.c(this.S) == this.T;
    }

    public final boolean l(int i, int i2) {
        return czu.C(this.F, i, this.n) && czu.C(this.G, i2, this.o);
    }

    public final boolean m(int i) {
        return this.d.k == i;
    }
}
