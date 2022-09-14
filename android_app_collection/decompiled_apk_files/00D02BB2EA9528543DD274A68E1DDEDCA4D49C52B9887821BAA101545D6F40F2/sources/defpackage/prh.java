package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.PopupWindow;
import defpackage.bzns;
/* compiled from: PG */
/* renamed from: prh  reason: default package */
/* loaded from: classes7.dex */
public abstract class prh<T extends bzns> implements bzml {
    public final cjqy a;
    @dzsi
    jdi b;
    @dzsi
    protected vnk c;
    @dzsi
    protected ges d;
    @dzsi
    public final cjtd e;
    @dzsi
    public cjql f;
    protected final View.OnLayoutChangeListener g;
    private final bzmm h;
    private final cjqq i;
    @dzsi
    private View j;
    @dzsi
    private jjn k;
    @dzsi
    private final bzmi l;
    private final bzmn m;
    @dzsi
    private int n;

    public prh(jdj jdjVar, cjqy cjqyVar, cjqq cjqqVar, bzmm bzmmVar) {
        this(cjqyVar, cjqqVar, bzmmVar, null, null);
    }

    @Override // defpackage.bzml
    public abstract dqkc a();

    @Override // defpackage.bzml
    public bzmk e() {
        return this.h.b(a()) == bzmk.VISIBLE ? bzmk.NONE : bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public boolean f(bzmk bzmkVar) {
        ges gesVar;
        View l;
        if (bzmkVar == bzmk.REPRESSED) {
            ddho i = i();
            if (i == null) {
                return false;
            }
            cjqp g = this.i.g();
            cjta b = cjtd.b();
            b.d = i;
            b.w(ddhj.f);
            g.d(b.a());
            return true;
        }
        bzmi bzmiVar = this.l;
        if ((bzmiVar != null && bzmiVar.b()) || (gesVar = this.d) == null) {
            return false;
        }
        gga ggaVar = gesVar.aE;
        View view = this.j;
        if (view == null || ggaVar == null || (l = l(view)) == null) {
            return false;
        }
        if (i() != null) {
            cjqp g2 = this.i.g();
            ddho i2 = i();
            dbsk.s(i2);
            this.f = g2.d(cjtd.a(i2));
        }
        final cqkf<T> g3 = g();
        View c = g3.c();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        l.getLocationOnScreen(iArr2);
        iArr[0] = iArr2[0] + (l.getWidth() / 2);
        if (k() == jdo.TOP) {
            iArr[1] = iArr2[1] + l.getHeight() + jmj.a(ggaVar, j());
        } else if (k() == jdo.BOTTOM) {
            iArr[1] = iArr2[1] - jmj.a(ggaVar, j());
        }
        jdi a = jdj.a(ggaVar, k(), new PopupWindow.OnDismissListener(this, g3) { // from class: pre
            private final prh a;
            private final cqkf b;

            {
                this.a = this;
                this.b = g3;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.a.p(this.b);
            }
        });
        this.b = a;
        dbsk.s(a);
        g3.e(h(a));
        jdi jdiVar = this.b;
        dbsk.s(jdiVar);
        bzmi bzmiVar2 = this.l;
        if (bzmiVar2 != null) {
            bzmiVar2.e(new bznh(), new bzno(jdiVar, this.e), dcdc.f(l), this.m);
            jdiVar.a.setOutsideTouchable(false);
        }
        if (k() == jdo.BOTTOM) {
            jdi jdiVar2 = this.b;
            dbsk.s(jdiVar2);
            jdiVar2.e = jmj.a(ggaVar, q(ggaVar));
        }
        jdi jdiVar3 = this.b;
        dbsk.s(jdiVar3);
        jdiVar3.c(c);
        jdi jdiVar4 = this.b;
        dbsk.s(jdiVar4);
        jdiVar4.d(l, iArr[0], iArr[1]);
        l.addOnLayoutChangeListener(this.g);
        return true;
    }

    protected abstract cqkf<T> g();

    protected abstract T h(jdi jdiVar);

    @dzsi
    protected abstract ddho i();

    protected abstract int j();

    protected abstract jdo k();

    @dzsi
    protected abstract View l(View view);

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public final amub m() {
        gga ggaVar;
        vnk vnkVar;
        ges gesVar = this.d;
        if (gesVar == null || (ggaVar = gesVar.aE) == null || (vnkVar = this.c) == null) {
            return null;
        }
        return vnkVar.aU(ggaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean n() {
        vnk vnkVar;
        View view;
        ges gesVar = this.d;
        if (gesVar == null || !gesVar.aD || (vnkVar = this.c) == null || !r(vnkVar, this.n, this.k)) {
            return false;
        }
        ges gesVar2 = this.d;
        dbsk.s(gesVar2);
        gga ggaVar = gesVar2.aE;
        return (vnkVar.l().d().a() || ggaVar == null || vnkVar.aV(ggaVar) == null || (view = this.j) == null || l(view) == null) ? false : true;
    }

    public final void o() {
        jdi jdiVar;
        if (this.d == null || (jdiVar = this.b) == null) {
            return;
        }
        jdiVar.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(cqkf<T> cqkfVar) {
        this.b = null;
        cqkfVar.e(null);
        this.h.f(a());
        bzmi bzmiVar = this.l;
        if (bzmiVar != null) {
            bzmiVar.a();
        }
    }

    protected int q(gga ggaVar) {
        DisplayMetrics displayMetrics = ggaVar.getResources().getDisplayMetrics();
        return ((int) (((float) displayMetrics.widthPixels) / displayMetrics.density)) >= 411 ? 134 : 154;
    }

    protected abstract boolean r(vnk vnkVar, @dzsi int i, @dzsi jjn jjnVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void s(ges gesVar, vnk vnkVar, @dzsi int i, @dzsi jjn jjnVar, View view) {
        this.k = jjnVar;
        this.d = gesVar;
        this.c = vnkVar;
        this.n = i;
        this.j = view;
    }

    public prh(cjqy cjqyVar, cjqq cjqqVar, bzmm bzmmVar, @dzsi bzmi bzmiVar, @dzsi cjtd cjtdVar) {
        this.g = new prf(this);
        this.m = new prg(this);
        this.h = bzmmVar;
        this.a = cjqyVar;
        this.i = cjqqVar;
        this.l = bzmiVar;
        this.e = cjtdVar;
    }
}
