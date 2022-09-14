package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: glh  reason: default package */
/* loaded from: classes.dex */
public final class glh {
    public final gkj<ExpandingScrollView> b;
    public final gkj<FrameLayout> c;
    public final cqhu d;
    @dzsi
    public jke f;
    @dzsi
    public cqjg g;
    public boolean h;
    public final Set<jkh> a = new CopyOnWriteArraySet();
    private final Set<jkd> i = new CopyOnWriteArraySet();
    public final jjm e = new jjm();

    public glh(gkj<ExpandingScrollView> gkjVar, gkj<FrameLayout> gkjVar2, cqhu cqhuVar) {
        this.b = gkjVar;
        this.c = gkjVar2;
        this.d = cqhuVar;
    }

    public final jkj a() {
        return this.e.l();
    }

    @dzsi
    public final jke b() {
        jke jkeVar = this.f;
        if (jkeVar != null) {
            return jkeVar;
        }
        gkj<ExpandingScrollView> gkjVar = this.b;
        if (gkjVar == null) {
            return null;
        }
        return gkjVar.b;
    }

    public final boolean c() {
        return this.g == gwu.a;
    }

    public final boolean d(@dzsi egu eguVar) {
        ExpandingScrollView expandingScrollView;
        gkj<ExpandingScrollView> gkjVar = this.b;
        if (gkjVar != null && eguVar != null) {
            if (eguVar.n != null) {
                expandingScrollView = gkjVar.b;
            } else {
                expandingScrollView = eguVar.p;
                if (expandingScrollView == null) {
                    expandingScrollView = null;
                }
            }
            if (expandingScrollView == null) {
                return false;
            }
            jkj l = expandingScrollView.m().l();
            if (l.C(l.L()) > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        ExpandingScrollView expandingScrollView;
        if (this.f == null) {
            gkj<ExpandingScrollView> gkjVar = this.b;
            return gkjVar == null || (expandingScrollView = gkjVar.b) == null || expandingScrollView.m == null;
        }
        return false;
    }

    @dzsi
    public final View f() {
        gkj<? extends View> j = j();
        if (j != null) {
            return j.b;
        }
        return null;
    }

    public final void g() {
        this.g = null;
        gkj<ExpandingScrollView> gkjVar = this.b;
        if (gkjVar != null) {
            gkjVar.b.setContent(null, null);
            this.b.b.setViewHeaderHeightCallableForSizingCollapsedState(null);
        }
    }

    public final void h(jkd jkdVar) {
        this.i.add(jkdVar);
        jke b = b();
        dbsk.s(b);
        b.H(jkdVar);
    }

    public final void i() {
        jke jkeVar = this.f;
        if (jkeVar != null) {
            this.e.a = jkeVar.m();
            return;
        }
        this.e.a = this.b.b;
    }

    public final gkj<? extends View> j() {
        return this.f != null ? this.c : this.b;
    }

    public final void k(@dzsi jke jkeVar) {
        jke b = b();
        this.f = jkeVar;
        jke b2 = b();
        if (b == b2) {
            return;
        }
        i();
        View view = null;
        if (jkeVar != null && b2 != null) {
            view = b2.h();
        }
        FrameLayout frameLayout = this.c.b;
        frameLayout.removeAllViews();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            frameLayout.addView(view, new LinearLayout.LayoutParams(-1, -1));
        }
        if (b != null && b2 != null) {
            for (jkh jkhVar : this.a) {
                b.G(jkhVar);
                b2.F(jkhVar);
                jjn L = b.m().l().L();
                jjn L2 = b2.m().l().L();
                if (L != L2) {
                    jkhVar.P(b2.m().l(), L2, 0.0f);
                    jkhVar.L(b2.m().l(), L, L2, jkg.AUTOMATED);
                }
            }
            for (jkd jkdVar : this.i) {
                b.I(jkdVar);
                b2.H(jkdVar);
            }
        }
        if (b == null || b2 == null) {
            return;
        }
        b2.setInitialScroll(b.m().l().U());
    }

    public final void l(jkd jkdVar) {
        this.i.remove(jkdVar);
        jke b = b();
        dbsk.s(b);
        b.I(jkdVar);
    }
}
