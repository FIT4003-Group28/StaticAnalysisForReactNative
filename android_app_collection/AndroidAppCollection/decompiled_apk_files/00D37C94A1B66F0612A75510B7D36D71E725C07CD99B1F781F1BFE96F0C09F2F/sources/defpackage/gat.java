package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment$SavedState;
import android.util.SparseArray;
import com.google.android.apps.youtube.app.common.ui.navigation.Pane;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: PG */
/* renamed from: gat  reason: default package */
/* loaded from: classes3.dex */
public final class gat implements gbq {
    public int a;
    public SparseArray b;
    public final ind c;
    public final LinkedList d;
    private final eo e;
    private final axwo f;
    private gbo g;
    private final zhd h = zhd.a(fxm.g);
    private final zhd i = zhd.a(fxm.e);
    private final zhd j = zhd.a(fxm.f);
    private final zhd k;
    private final zhd l;
    private final azpx m;
    private final aafd n;
    private final axnm o;
    private final aadd p;
    private final axwt q;

    public gat(oa oaVar, aafd aafdVar, axnm axnmVar, aadd aaddVar, ind indVar, axwt axwtVar, axwo axwoVar) {
        zhd a = zhd.a(fxm.d);
        this.k = a;
        this.l = zhd.a(fxm.c);
        this.m = azpm.e().aO();
        oaVar.getClass();
        this.e = oaVar.getSupportFragmentManager();
        aafdVar.getClass();
        this.n = aafdVar;
        this.o = axnmVar;
        this.p = aaddVar;
        this.c = indVar;
        this.q = axwtVar;
        this.f = axwoVar;
        this.a = 0;
        oaVar.getSavedStateRegistry().b("pane_nav_controller", new bli() { // from class: gal
            @Override // defpackage.bli
            public final Bundle a() {
                gat gatVar = gat.this;
                Bundle bundle = new Bundle();
                bundle.putInt("activePaneKey", gatVar.a);
                bundle.putIntegerArrayList("tabBackStack", new ArrayList<>(gatVar.d));
                bundle.putSparseParcelableArray("panes", gatVar.b);
                return bundle;
            }
        });
        Bundle a2 = oaVar.getSavedStateRegistry().a("pane_nav_controller");
        if (a2 != null) {
            if (a2.containsKey("activePaneKey")) {
                this.a = a2.getInt("activePaneKey");
            }
            this.b = a2.getSparseParcelableArray("panes");
        }
        if (this.b == null) {
            this.b = new SparseArray();
        }
        oaVar.getSavedStateRegistry().b("back_handler", new bli() { // from class: gal
            @Override // defpackage.bli
            public final Bundle a() {
                gat gatVar = gat.this;
                Bundle bundle = new Bundle();
                bundle.putInt("activePaneKey", gatVar.a);
                bundle.putIntegerArrayList("tabBackStack", new ArrayList<>(gatVar.d));
                bundle.putSparseParcelableArray("panes", gatVar.b);
                return bundle;
            }
        });
        Bundle a3 = oaVar.getSavedStateRegistry().a("back_handler");
        ArrayList<Integer> integerArrayList = a3 != null ? a3.getIntegerArrayList("tabBackStack") : null;
        if (integerArrayList != null) {
            this.d = new LinkedList(integerArrayList);
        } else {
            this.d = new LinkedList();
        }
        j(new gbl() { // from class: gao
            @Override // defpackage.gbl
            public final void pr(int i, int i2) {
                gat gatVar = gat.this;
                if (i2 == 1) {
                    return;
                }
                gatVar.d.remove(Integer.valueOf(gatVar.a));
                gatVar.d.addFirst(Integer.valueOf(i));
            }
        });
        a.c(new gbm() { // from class: gap
            @Override // defpackage.gbm
            public final void mO() {
                gat.this.d.clear();
            }
        });
    }

    private final Pane I() {
        int i = this.a;
        Pane pane = (Pane) L(i).d(new avk(i, 2));
        this.b.put(i, pane);
        return pane;
    }

    private final ampq J() {
        return L(this.a);
    }

    private final ampq K() {
        return J().b(fuj.l);
    }

    private final ampq L(int i) {
        return ampq.i((Pane) this.b.get(i));
    }

    private final void M(PaneDescriptor paneDescriptor) {
        final String g;
        if (paneDescriptor == null || (g = paneDescriptor.g("search_cache_key")) == null) {
            return;
        }
        final abcc abccVar = ((gbt) this.o.get()).a;
        abccVar.c.execute(new Runnable() { // from class: abcb
            @Override // java.lang.Runnable
            public final void run() {
                abcc abccVar2 = abcc.this;
                abccVar2.a.e(g);
            }
        });
    }

    private final void N(PaneDescriptor paneDescriptor, gbd gbdVar, PaneDescriptor paneDescriptor2) {
        PaneDescriptor b = gbdVar != null ? PaneDescriptor.b(gbdVar) : null;
        if (b != null && paneDescriptor == null) {
            paneDescriptor = b;
        } else if (!PaneDescriptor.k(b, paneDescriptor, this.n)) {
            gbdVar = null;
        }
        this.i.b(gas.d(paneDescriptor, gbdVar, paneDescriptor2));
    }

    private final void O() {
        this.k.b(new Object());
    }

    private final void P() {
        Object obj;
        String str;
        gbd e = e();
        PaneDescriptor c = c();
        Fragment$SavedState fragment$SavedState = null;
        if (e == null || !PaneDescriptor.k(PaneDescriptor.b(e), c, this.n)) {
            obj = null;
            str = null;
        } else {
            fragment$SavedState = this.e.c(e);
            str = e.F;
            obj = e.aQ();
        }
        I().b.c(c, fragment$SavedState, obj, str);
    }

    private final void Q(PaneDescriptor paneDescriptor, Fragment$SavedState fragment$SavedState, Object obj, String str, int i, int i2) {
        gbd d = paneDescriptor.d();
        if (fragment$SavedState != null) {
            d.ag(fragment$SavedState);
        }
        if (obj != null) {
            d.aV(obj);
        }
        if (str == null) {
            str = "PaneFragment";
        }
        boolean z = !eog.w(this.p) && !Build.DEVICE.equals("generic_x86");
        ex l = this.e.l();
        if (true != z) {
            i = 0;
        }
        if (true != z) {
            i2 = 0;
        }
        l.z(i, i2);
        l.u(R.id.pane_fragment_container, d, str);
        if (((Boolean) this.f.a().y(false).aE().e(0).aw()).booleanValue()) {
            l.e();
        } else {
            l.k();
        }
        ampq j = paneDescriptor != null ? ampq.j(I()) : J();
        if (j.h()) {
            ((Pane) j.c()).c = paneDescriptor;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean S(defpackage.gbj r11) {
        /*
            r10 = this;
            com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r1 = r11.a
            r0 = 0
            if (r1 != 0) goto L6
            return r0
        L6:
            ampq r2 = r10.K()
            com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r3 = r10.c()
            com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r4 = r10.d()
            boolean r11 = r10.T(r11)
            r7 = 1
            if (r11 != 0) goto L23
            if (r3 == 0) goto L23
            boolean r11 = r10.U(r3, r1)
            if (r11 != 0) goto L23
            r11 = 1
            goto L24
        L23:
            r11 = 0
        L24:
            if (r11 == 0) goto L2b
            r10.P()
        L29:
            r6 = 0
            goto L73
        L2b:
            r10.M(r3)
            boolean r5 = r2.h()
            if (r5 == 0) goto L29
            java.lang.Object r5 = r2.c()
            com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack r5 = (com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack) r5
            r6 = 0
        L3b:
            boolean r8 = r5.d()
            if (r8 != 0) goto L73
            java.util.LinkedList r8 = r5.a
            int r8 = r8.size()
            if (r8 != r7) goto L58
            com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack$BackStackEntry r8 = r5.a()
            com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r8 = r8.a
            aafd r9 = r10.n
            boolean r8 = com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor.k(r8, r4, r9)
            if (r8 == 0) goto L58
            r6 = 1
        L58:
            com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack$BackStackEntry r8 = r5.a()
            com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r8 = r8.a
            boolean r8 = r10.U(r8, r1)
            if (r8 == 0) goto L73
            com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack$BackStackEntry r8 = r5.b()
            com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r8 = r8.a
            r10.M(r8)
            if (r6 == 0) goto L3b
            r10.z(r1)
            goto L3b
        L73:
            if (r11 != 0) goto L98
            if (r6 != 0) goto L98
            fuj r5 = defpackage.fuj.h
            ampq r2 = r2.b(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            java.lang.Object r2 = r2.e(r5)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L98
            if (r4 == 0) goto L95
            boolean r2 = r10.U(r4, r1)
            if (r2 == 0) goto L98
        L95:
            r10.z(r1)
        L98:
            gbd r2 = r10.e()
            r10.N(r3, r2, r1)
            if (r7 == r11) goto La3
            r5 = 0
            goto La9
        La3:
            r2 = 2130772043(0x7f01004b, float:1.7147193E38)
            r5 = 2130772043(0x7f01004b, float:1.7147193E38)
        La9:
            if (r7 == r11) goto Lad
            r6 = 0
            goto Lb3
        Lad:
            r11 = 2130772044(0x7f01004c, float:1.7147195E38)
            r6 = 2130772044(0x7f01004c, float:1.7147195E38)
        Lb3:
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r10
            r0.Q(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gat.S(gbj):boolean");
    }

    @Deprecated
    private final boolean T(gbj gbjVar) {
        if (gbjVar.c) {
            ampq K = K();
            if (K.h()) {
                ((PaneBackStack) K.c()).e();
            }
            z(gbjVar.a);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean U(com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r5, com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r6) {
        /*
            r4 = this;
            gbo r0 = r4.g
            r1 = 0
            if (r0 == 0) goto L9b
            ampt r2 = r6.c
            if (r2 == 0) goto Lf
            boolean r2 = r2.a(r5)
            if (r2 != 0) goto L99
        Lf:
            boolean r2 = r5.equals(r6)
            if (r2 == 0) goto L17
            goto L99
        L17:
            boolean r2 = r6.l()
            if (r2 != 0) goto L99
            ojl r0 = (defpackage.ojl) r0
            ind r2 = r0.e
            boolean r2 = r2.l(r6)
            if (r2 != 0) goto L99
            ise r2 = r0.k
            boolean r2 = r2.b(r5)
            if (r2 != 0) goto L99
            jsc r2 = r0.f
            boolean r2 = r2.d(r5)
            if (r2 == 0) goto L3f
            jsc r2 = r0.f
            boolean r2 = r2.d(r6)
            if (r2 != 0) goto L99
        L3f:
            ind r2 = r0.e
            boolean r2 = r2.g(r5)
            if (r2 == 0) goto L4f
            ind r2 = r0.e
            boolean r2 = r2.g(r6)
            if (r2 != 0) goto L99
        L4f:
            kwa r2 = r0.g
            boolean r2 = r2.b(r5)
            if (r2 == 0) goto L8f
            android.os.Bundle r2 = r6.b
            java.lang.String r3 = "preserve_search_nav_history"
            boolean r2 = r2.getBoolean(r3, r1)
            if (r2 == 0) goto L62
            goto L9b
        L62:
            apzg r2 = r5.e()
            if (r2 == 0) goto L78
            aopg r3 = com.google.protos.youtube.api.innertube.SearchEndpointOuterClass.searchEndpoint
            java.lang.Object r2 = r2.qm(r3)
            auoy r2 = (defpackage.auoy) r2
            java.lang.String r2 = r2.f
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L99
        L78:
            kwa r0 = r0.g
            boolean r0 = r0.b(r6)
            if (r0 == 0) goto L8f
            java.lang.String r0 = "search_query"
            java.lang.String r5 = r5.g(r0)
            java.lang.String r6 = r6.g(r0)
            boolean r5 = r5.equals(r6)
            goto L97
        L8f:
            android.os.Bundle r5 = r5.b
            java.lang.String r6 = "no_history"
            boolean r5 = r5.getBoolean(r6, r1)
        L97:
            if (r5 == 0) goto L9b
        L99:
            r5 = 1
            return r5
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gat.U(com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor, com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor):boolean");
    }

    @Override // defpackage.gbq
    public final void A(int i, int i2) {
        if (i >= 0) {
            int i3 = this.a;
            if (i == i3) {
                return;
            }
            PaneDescriptor c = c();
            if (c != null) {
                P();
            }
            this.a = i;
            ampq K = K();
            if (((Boolean) K.b(fuj.k).e(false)).booleanValue()) {
                PaneBackStack.BackStackEntry b = ((PaneBackStack) K.c()).b();
                N(c, e(), b.a);
                Q(b.a, b.b, b.c, b.d, 0, 0);
            } else if (d() != null) {
                PaneDescriptor d = d();
                N(c, e(), d);
                Q(d, null, null, null, 0, 0);
            }
            this.l.b(gar.c(i3, i2));
            return;
        }
        throw new IndexOutOfBoundsException("argument cannot be negative");
    }

    @Override // defpackage.gbk
    public final boolean B() {
        PaneDescriptor c = c();
        return ((Boolean) K().b(fuj.h).e(true)).booleanValue() && c != null && PaneDescriptor.k(c, d(), this.n) && (!(e() instanceof gbk) || ((gbk) e()).B());
    }

    @Override // defpackage.gbk
    public final boolean C() {
        gbi b = gbj.b();
        b.c(1);
        b.a = null;
        b.b(false);
        return R(b.a());
    }

    @Override // defpackage.gbk
    public final boolean D() {
        gbi b = gbj.b();
        b.c(2);
        b.a = null;
        b.b(false);
        return R(b.a());
    }

    @Override // defpackage.gbk
    public final boolean E(PaneDescriptor paneDescriptor) {
        gbi b = gbj.b();
        b.c(0);
        b.a = paneDescriptor;
        b.b(false);
        return R(b.a());
    }

    @Override // defpackage.gbq
    public final boolean F() {
        Boolean bool;
        gbd e;
        if (C()) {
            return true;
        }
        amvn i = i();
        while (!this.d.isEmpty()) {
            int intValue = ((Integer) this.d.pollFirst()).intValue();
            if (i.contains(Integer.valueOf(intValue))) {
                A(intValue, 1);
                return true;
            }
        }
        ampq ampqVar = (ampq) ayoi.Q(i).I(new ayqf() { // from class: gan
            @Override // defpackage.ayqf
            public final boolean a(Object obj) {
                gat gatVar = gat.this;
                ampq f = gatVar.f(((Integer) obj).intValue());
                final ind indVar = gatVar.c;
                return ((Boolean) f.b(new ampg() { // from class: gaq
                    @Override // defpackage.ampg
                    public final Object apply(Object obj2) {
                        return Boolean.valueOf(ind.this.i((PaneDescriptor) obj2));
                    }
                }).e(false)).booleanValue();
            }
        }).V(gam.a).ax(amon.a);
        if (!ampqVar.h() || this.a == ((Integer) ampqVar.c()).intValue()) {
            aqxe aqxeVar = this.q.a.b().C;
            if (aqxeVar == null) {
                aqxeVar = aqxe.a;
            }
            if (aqxeVar.a(45352462L)) {
                aoqp aoqpVar = aqxeVar.b;
                if (!aoqpVar.containsKey(45352462L)) {
                    throw new IllegalArgumentException();
                }
                aqxf aqxfVar = (aqxf) aoqpVar.get(45352462L);
                bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : false);
            } else {
                bool = false;
            }
            return bool.booleanValue() && (e = e()) != null && e.bb();
        }
        A(((Integer) ampqVar.c()).intValue(), 1);
        return true;
    }

    @Override // defpackage.gbk
    public final boolean G() {
        gbi b = gbj.b();
        b.c(4);
        b.a = null;
        b.b(false);
        return R(b.a());
    }

    @Override // defpackage.gbq
    public final void H(ojj ojjVar) {
        this.i.c(ojjVar);
    }

    @Override // defpackage.gbq
    public final int a() {
        return this.a;
    }

    @Override // defpackage.gbq
    public final int b() {
        gbo gboVar = this.g;
        if (gboVar != null) {
            PaneDescriptor c = c();
            ogl oglVar = ((ojl) gboVar).h;
            ampq i = ampq.i(jfw.g(c));
            if (!oglVar.d.B()) {
                return 1;
            }
            if (oglVar.a.isTaskRoot() || ((oiw) oglVar.b.get()).f) {
                if (c == null || oglVar.f.b(c) || oglVar.e.l(c) || c.l()) {
                    return 0;
                }
                okf okfVar = (okf) oglVar.c.get();
                okfVar.getClass();
                if (((Boolean) i.b(new ojk(okfVar, 1)).e(false)).booleanValue()) {
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }

    @Override // defpackage.gbq
    public final PaneDescriptor c() {
        return (PaneDescriptor) ((ampq) J().b(fuj.e).e(amon.a)).f();
    }

    public final PaneDescriptor d() {
        return (PaneDescriptor) ((ampq) J().b(fuj.f).e(amon.a)).f();
    }

    @Override // defpackage.gbq
    public final gbd e() {
        dp e = this.e.e(R.id.pane_fragment_container);
        if (e instanceof gbd) {
            return (gbd) e;
        }
        return null;
    }

    @Override // defpackage.gbq
    public final ampq f(int i) {
        return (ampq) L(i).b(fuj.g).e(amon.a);
    }

    @Override // defpackage.gbq
    /* renamed from: g */
    public final amvn i() {
        amvl i = amvn.i();
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            i.c(Integer.valueOf(this.b.keyAt(i2)));
        }
        return i.g();
    }

    @Override // defpackage.gbq
    public final ayoi h() {
        return this.m;
    }

    @Override // defpackage.gbq
    public final void j(gbl gblVar) {
        this.l.c(gblVar);
    }

    @Override // defpackage.gbq
    public final void k(gbn gbnVar) {
        this.j.c(gbnVar);
    }

    @Override // defpackage.gbq
    public final void l(gbp gbpVar) {
        this.h.c(gbpVar);
    }

    @Override // defpackage.gbq
    public final void m() {
        this.b.clear();
        this.a = 0;
        O();
    }

    @Override // defpackage.gbk
    public final void n() {
        if (e() != null) {
            e().aT();
        }
    }

    @Override // defpackage.gbq
    public final void o() {
        ampq J2 = J();
        this.b.clear();
        if (J2.h()) {
            this.b.put(((Pane) J2.c()).a, (Pane) J2.c());
        }
        O();
    }

    @Override // defpackage.gbq
    public final void p(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("argument cannot be negative");
        }
        if (this.b.get(i) == null) {
            return;
        }
        this.b.remove(i);
        O();
    }

    @Override // defpackage.gbq
    public final void q(PaneDescriptor paneDescriptor) {
        gbi b = gbj.b();
        b.c(3);
        b.a = paneDescriptor;
        b.b(false);
        R(b.a());
    }

    @Override // defpackage.gbq
    public final void r(gbd gbdVar) {
        this.j.b(gbdVar);
        this.m.c(gbdVar);
    }

    @Override // defpackage.gbq
    public final void s() {
        Fragment$SavedState fragment$SavedState;
        String str;
        PaneDescriptor c = c();
        gbd e = e();
        if (e == null) {
            return;
        }
        Object obj = null;
        if (PaneDescriptor.k(PaneDescriptor.b(e), c, this.n)) {
            fragment$SavedState = this.e.c(e);
            str = e.F;
            obj = e.aQ();
        } else {
            fragment$SavedState = null;
            str = null;
        }
        Q(c, fragment$SavedState, obj, str, 0, 0);
    }

    @Override // defpackage.gbq
    public final void t() {
        PaneDescriptor c = c();
        if (c == null) {
            return;
        }
        N(c, e(), c);
        Q(c, null, null, null, 0, 0);
    }

    @Override // defpackage.gbq
    public final void u() {
        gbd e = e();
        if (e == null) {
            return;
        }
        e.aU();
    }

    @Override // defpackage.gbq
    public final void v(gbp gbpVar) {
        this.h.d(gbpVar);
    }

    @Override // defpackage.gbq
    public final void w() {
        gbd e = e();
        if (e != null) {
            e.mT();
        }
    }

    @Override // defpackage.gbq
    public final void x(ClassLoader classLoader) {
        for (int i = 0; i < this.b.size(); i++) {
            Pane pane = (Pane) this.b.valueAt(i);
            Iterator it = pane.b.a.iterator();
            while (it.hasNext()) {
                ((PaneBackStack.BackStackEntry) it.next()).a.h(classLoader);
            }
            PaneDescriptor paneDescriptor = pane.c;
            if (paneDescriptor != null) {
                paneDescriptor.h(classLoader);
            }
            PaneDescriptor paneDescriptor2 = pane.d;
            if (paneDescriptor2 != null) {
                paneDescriptor2.h(classLoader);
            }
        }
    }

    @Override // defpackage.gbq
    public final void y(gbo gboVar) {
        this.g = gboVar;
    }

    public final void z(PaneDescriptor paneDescriptor) {
        ampq j = paneDescriptor != null ? ampq.j(I()) : J();
        if (j.h()) {
            ((Pane) j.c()).d = paneDescriptor;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean R(defpackage.gbj r17) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gat.R(gbj):boolean");
    }
}
