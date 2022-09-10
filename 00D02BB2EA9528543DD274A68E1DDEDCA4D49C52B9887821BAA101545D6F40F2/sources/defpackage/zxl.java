package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: zxl  reason: default package */
/* loaded from: classes7.dex */
final class zxl extends cqlh<zxn> implements jke, jkf, jkh, jkd {
    public final zxm a;
    private final View d;
    private final zxh e;
    @dzsi
    private Integer l;
    private jkc o;
    @dzsi
    private Object p;
    private boolean q;
    private final Set<jkh> f = dcnm.m();
    private final Set<jkd> g = dcnm.m();
    private final Map<Object, ExpandingScrollView> h = new HashMap();
    private final Set<View> i = dcnm.m();
    private final LinkedList<zxk> j = new LinkedList<>();
    private int k = -1;
    private final FrameLayout.LayoutParams m = new FrameLayout.LayoutParams(-1, -1);
    private jkc n = jkc.c;

    public zxl(zxm zxmVar, View view) {
        this.d = view;
        this.a = zxmVar;
        this.e = new zxh(view);
        this.o = btpf.c(view.getContext()).e ? jkc.q : jkc.l;
    }

    private final jjn C() {
        if (zxo.J(this.d.getContext())) {
            return jjn.FULLY_EXPANDED;
        }
        return jjn.COLLAPSED;
    }

    private final jkj D() {
        ExpandingScrollView u = u();
        return u != null ? u : this.e;
    }

    private final jkf E() {
        ExpandingScrollView u = u();
        return u != null ? u : this.e;
    }

    private static boolean J(Object obj) {
        return (obj instanceof zxn) && ((zxn) obj).j().booleanValue();
    }

    private final void K(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        for (jkh jkhVar : this.f) {
            jkhVar.L(jkjVar, jjnVar, jjnVar2, jkgVar);
        }
    }

    private final void Q(jjn jjnVar, float f) {
        for (jkh jkhVar : this.f) {
            jkhVar.P(D(), jjnVar, f);
        }
    }

    @Override // defpackage.jkf
    public final void B(jjn jjnVar) {
        setExpandingState(jjnVar, true);
    }

    @Override // defpackage.jke
    public final void F(jkh jkhVar) {
        this.f.add(jkhVar);
        if (this.q) {
            jkhVar.M(D(), D().L());
        }
    }

    @Override // defpackage.jke
    public final boolean G(jkh jkhVar) {
        if (this.q) {
            jkhVar.N(D(), D().L());
        }
        return this.f.remove(jkhVar);
    }

    @Override // defpackage.jke
    public final void H(jkd jkdVar) {
        this.g.add(jkdVar);
    }

    @Override // defpackage.jke
    public final boolean I(jkd jkdVar) {
        return this.g.remove(jkdVar);
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        if (jjnVar2 != jjn.FULLY_EXPANDED) {
            this.a.a(jkjVar.j());
        }
        K(D(), jjnVar, jjnVar2, jkgVar);
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
        this.q = true;
        for (jkh jkhVar : this.f) {
            jkhVar.M(D(), jjnVar);
        }
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
        for (jkh jkhVar : this.f) {
            jkhVar.N(D(), jjnVar);
        }
        this.q = false;
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        Q(jjnVar, f);
    }

    @Override // defpackage.jkd
    public final boolean a() {
        return false;
    }

    @Override // defpackage.jkd
    public final void b(boolean z) {
        for (jkd jkdVar : this.g) {
            jkdVar.b(z);
        }
    }

    @Override // defpackage.bas
    public final void e(ViewGroup viewGroup, int i, Object obj) {
        ExpandingScrollView u = u();
        this.p = obj;
        ExpandingScrollView u2 = u();
        if (u2 != u) {
            jjn C = C();
            jjn C2 = C();
            if (u != null) {
                u.I(this);
                u.G(this);
                C = u.f;
            }
            if (u2 != null) {
                u2.H(this);
                u2.F(this);
                C2 = u2.f;
            }
            if (C == C2) {
                return;
            }
            K(D(), C, C2, jkg.AUTOMATED);
            if (u2 != null) {
                u2.scrollTo(0, u2.getScrollY());
            } else {
                Q(C2, 0.0f);
            }
        }
    }

    @Override // defpackage.jke
    public final void g() {
    }

    @Override // defpackage.jke
    public final View h() {
        return this.d;
    }

    @Override // defpackage.jke
    public final View i() {
        return this.d;
    }

    @Override // defpackage.jke
    public final int k() {
        ExpandingScrollView u = u();
        if (u != null) {
            return u.k();
        }
        return 0;
    }

    @Override // defpackage.jkf
    public final jkj l() {
        return D();
    }

    @Override // defpackage.jke
    public final jkf m() {
        return this;
    }

    @Override // defpackage.cqlh
    protected final View s(View view) {
        if (view instanceof ExpandingScrollView) {
            return ((ExpandingScrollView) view).m;
        }
        return ((ViewGroup) view).getChildAt(0);
    }

    @Override // defpackage.jkf
    public final void setExpandingState(jjn jjnVar, boolean z) {
        if (J(this.p)) {
            E().setExpandingState(jjnVar, z);
        }
    }

    @Override // defpackage.jkf
    public final void setExpandingStateTransition(jkc jkcVar, jkc jkcVar2, boolean z) {
        this.n = jkcVar;
        this.o = jkcVar2;
        for (ExpandingScrollView expandingScrollView : this.h.values()) {
            expandingScrollView.setExpandingStateTransition(jkcVar, jkcVar2, z);
        }
    }

    @Override // defpackage.jkf
    public final void setHidden(boolean z) {
        E().setHidden(true);
    }

    @Override // defpackage.jke
    public final void setInitialScroll(int i) {
        Object obj = this.p;
        if (obj == null || J(obj)) {
            this.k = i;
            y();
            return;
        }
        this.k = -1;
    }

    @Override // defpackage.jke
    public final void setTwoThirdsHeight(int i) {
        this.l = Integer.valueOf(i);
        for (ExpandingScrollView expandingScrollView : this.h.values()) {
            expandingScrollView.setTwoThirdsHeight(i);
        }
    }

    @Override // defpackage.cqlh
    public final void t(View view) {
        cqkj g = cqjz.g(this.d).g.g();
        if (view instanceof zxk) {
            zxk zxkVar = (zxk) view;
            Iterator<Object> it = this.h.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (this.h.get(next) == zxkVar) {
                    jkh k = ((zxn) next).k();
                    if (k != null) {
                        zxkVar.G(k);
                    }
                    this.h.remove(next);
                }
            }
            zxkVar.setVisibility(8);
            View view2 = zxkVar.m;
            zxkVar.k.clear();
            zxkVar.l.clear();
            zxkVar.setContent(null);
            zxkVar.scrollTo(0, 0);
            zxkVar.setViewHeaderHeightCallableForSizingCollapsedState(null);
            zxkVar.setHiddenHeightCallable(null);
            zxkVar.setExpandedHeightCallable(null);
            zxkVar.n();
            zxkVar.r = 0;
            ((ExpandingScrollView) zxkVar).b = 0;
            zxkVar.q = null;
            ((ExpandingScrollView) zxkVar).c = jkc.c;
            ((ExpandingScrollView) zxkVar).d = jkc.c;
            zxkVar.e = jkc.l;
            zxkVar.f = jjn.HIDDEN;
            zxkVar.g = null;
            zxkVar.h = null;
            zxkVar.i = null;
            zxkVar.j = false;
            zxkVar.N();
            this.j.addFirst(zxkVar);
            g.h(view2);
            return;
        }
        g.h(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final ExpandingScrollView u() {
        Object obj = this.p;
        if (obj != null) {
            return this.h.get(obj);
        }
        return null;
    }

    @Override // defpackage.jkf
    public final void v() {
        E().v();
    }

    @Override // defpackage.jkf
    public final boolean w() {
        return E().w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x(int i) {
        if (i != this.m.topMargin) {
            this.m.setMargins(0, i, 0, 0);
            for (View view : this.i) {
                view.setLayoutParams(this.m);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y() {
        ExpandingScrollView u;
        if (this.k < 0 || (u = u()) == null) {
            return;
        }
        u.setInitialScroll(this.k);
        this.k = -1;
    }

    @Override // defpackage.cqlh
    protected final /* bridge */ /* synthetic */ View z(zxn zxnVar) {
        zxn zxnVar2 = zxnVar;
        View c = this.a.c(cqjz.g(this.d).g.g());
        if (!J(zxnVar2)) {
            FrameLayout frameLayout = new FrameLayout(this.d.getContext());
            frameLayout.addView(c, this.m);
            this.i.add(c);
            return frameLayout;
        }
        zxk removeFirst = !this.j.isEmpty() ? this.j.removeFirst() : new zxk(c.getContext());
        removeFirst.setShouldUseRoundedCornersShadow(true);
        this.h.put(zxnVar2, removeFirst);
        jkh k = zxnVar2.k();
        if (k != null) {
            removeFirst.F(k);
        }
        removeFirst.setContent(c, null);
        Integer num = this.l;
        if (num != null) {
            removeFirst.setTwoThirdsHeight(num.intValue());
        }
        removeFirst.setExpandingStateTransition(this.n, this.o, false);
        removeFirst.setExpandingState(C(), false);
        removeFirst.setVisibility(0);
        removeFirst.setViewHeaderHeightCallableForSizingCollapsedState(new zxj(this, removeFirst, zxnVar2));
        removeFirst.C = true;
        return removeFirst;
    }
}
