package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdwp  reason: default package */
/* loaded from: classes3.dex */
public final class bdwp extends RelativeLayout implements begb, bwrr {
    private static final dcqe m = dcqe.c("bdwp");
    private static final dcdc<cqjg> n = dcdc.h(bfka.a, bfzt.j, bfzt.n);
    private boolean A;
    public cpv a;
    public cqkj b;
    public btrm c;
    public dxio<glj> d;
    public bwqv e;
    public bfib f;
    public beeu g;
    public bego h;
    @dzsi
    public bnjo i;
    @dzsi
    public bfia j;
    boolean k;
    public final cqkf<bnih> l;
    @dzsi
    private bwrs<ilo> o;
    @dzsi
    private jkl p;
    @dzsi
    private jkl q;
    @dzsi
    private jkl r;
    @dzsi
    private jkl s;
    @dzsi
    private jkl t;
    @dzsi
    private jkl u;
    @dzsi
    private beet v;
    private int w;
    private iln x;
    private jjn y;
    private boolean z;

    public bdwp(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = jjn.COLLAPSED;
        this.k = false;
        this.A = false;
        ((bdwq) bttc.a(bdwq.class, this)).xm(this);
        dbsk.s(this.h);
        this.l = this.b.a(new bgdg(this.h.g()), this);
    }

    private final boolean h(MotionEvent motionEvent, bvrp<View, MotionEvent, Boolean> bvrpVar) {
        dcdc<cqjg> dcdcVar = n;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            cqjz<?> b = cqhu.b(this, dcdcVar.get(i));
            if (b != null) {
                View view = b.c;
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                float f = iArr[0] - iArr2[0];
                float f2 = iArr[1] - iArr2[1];
                motionEvent.offsetLocation(f, f2);
                boolean booleanValue = bvrpVar.a(view, motionEvent).booleanValue();
                motionEvent.offsetLocation(-f, -f2);
                if (booleanValue) {
                    return true;
                }
            }
        }
        return false;
    }

    @dzsi
    private final cqjz<?> i() {
        bnjo bnjoVar = this.i;
        if (bnjoVar == null) {
            return null;
        }
        if (bnjoVar.af().booleanValue()) {
            return cqhu.b(this, bfzt.c);
        }
        if (this.i.ag().booleanValue()) {
            return cqhu.b(this, bfzt.b);
        }
        return cqhu.b(this, bfzt.d);
    }

    private final void k() {
        ilo iloVar;
        String n2;
        cqjz<?> i = i();
        if (i == null || (iloVar = (ilo) bwrs.b(this.o)) == null || this.x == iln.MY_MAPS_FEATURE) {
            return;
        }
        int i2 = this.x == iln.GEOCODE ? R.string.COPY_ADDRESS : R.string.COPY_PLACE_NAME;
        if (this.x == iln.GEOCODE) {
            n2 = iloVar.B();
        } else {
            n2 = iloVar.n();
        }
        View view = i.c;
        view.setOnLongClickListener(new bdvt(view, n2, i2));
    }

    private final void m(@dzsi jkh jkhVar) {
        if (jkhVar != null) {
            this.d.a().e(jkhVar);
        }
    }

    private final void n(@dzsi jkh jkhVar) {
        if (jkhVar != null) {
            this.d.a().j(jkhVar);
        }
    }

    @Override // defpackage.bwrr
    public final /* bridge */ /* synthetic */ void PV(@dzsi Object obj) {
        ilo iloVar = (ilo) obj;
        bwrs<ilo> bwrsVar = this.o;
        if (bwrsVar == null) {
            return;
        }
        if (!d() || iloVar == null || !iloVar.i()) {
            j(bwrsVar, false);
        } else {
            bwrsVar.d(iloVar.g);
        }
    }

    @Override // defpackage.egd
    public final int a() {
        cqjz<?> b;
        int measuredHeight;
        bnjo bnjoVar = this.i;
        if (bnjoVar == null) {
            b = null;
        } else if (bnjoVar.af().booleanValue()) {
            b = cqhu.b(this, bfzt.g);
        } else if (this.i.ag().booleanValue()) {
            b = cqhu.b(this, bfzt.b);
        } else {
            b = cqhu.b(this, bfzt.e);
        }
        if (b != null && (measuredHeight = b.c.getMeasuredHeight()) > 0) {
            this.w = measuredHeight;
        }
        return this.w;
    }

    @Override // defpackage.begb
    public final void b(jjn jjnVar) {
        this.y = jjnVar;
        bnjo bnjoVar = this.i;
        if (bnjoVar == null) {
            return;
        }
        bnjoVar.f(jjnVar);
        cqjz<?> i = i();
        if (i == null) {
            return;
        }
        i.j();
        bnjo bnjoVar2 = this.i;
        dbsk.s(bnjoVar2);
        if (!bnjoVar2.Y().booleanValue()) {
            bnjo bnjoVar3 = this.i;
            dbsk.s(bnjoVar3);
            bnjoVar3.an(jjnVar);
        }
        bnjo bnjoVar4 = this.i;
        dbsk.s(bnjoVar4);
        if (bnjoVar4.u().booleanValue()) {
            i.c.performAccessibilityAction(128, null);
        }
        k();
    }

    @Override // defpackage.begb
    public final void c() {
        jmw.f(cqkx.d(this, bfzt.a));
    }

    @Override // defpackage.jki
    public final boolean d() {
        return !this.y.b();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (!super.dispatchGenericMotionEvent(motionEvent)) {
            return h(motionEvent, bdwo.a);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!super.dispatchTouchEvent(motionEvent)) {
            return h(motionEvent, bdwn.a);
        }
        return true;
    }

    @Override // defpackage.begb
    public final void e(View view, jjn jjnVar, jjn jjnVar2) {
        boolean a = this.h.a((ilo) bwrs.b(this.o));
        if (this.z || !a || jjnVar != jjn.HIDDEN || jjnVar2 != jjn.COLLAPSED) {
            bnjo bnjoVar = this.i;
            CharSequence p = bnjoVar == null ? null : bnjoVar.p();
            this.a.g(view, jjnVar, jjnVar2, getContext().getString(R.string.ACCESSIBILITY_PLACE_CARD_COLLAPSED), p == null ? null : getContext().getString(R.string.ACCESSIBILITY_PLACE_CARD_EXPANDED, p), a);
            return;
        }
        this.z = true;
    }

    public final void f(bwrs<ilo> bwrsVar) {
        g(bwrsVar, false);
    }

    public final void g(bwrs<ilo> bwrsVar, boolean z) {
        bnjo bnjoVar = this.i;
        if (bnjoVar != null) {
            bnjoVar.T(true);
        }
        j(bwrsVar, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bnjo bnjoVar = this.i;
        if (bnjoVar != null) {
            bnjoVar.A(this.c);
        }
        bfia bfiaVar = this.j;
        if (bfiaVar != null) {
            bfiaVar.d();
        }
        m(this.p);
        m(this.q);
        m(this.r);
        m(this.s);
        m(this.t);
        m(this.u);
        m(this.v);
        bwrs<ilo> bwrsVar = this.o;
        if (bwrsVar != null) {
            this.e.g(bwrsVar, this);
        }
        this.k = true;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bnjo bnjoVar = this.i;
        if (bnjoVar != null) {
            bnjoVar.F();
        }
        bfia bfiaVar = this.j;
        if (bfiaVar != null) {
            bfiaVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bnjo bnjoVar = this.i;
        if (bnjoVar != null) {
            bnjoVar.B(this.c);
        }
        bfia bfiaVar = this.j;
        if (bfiaVar != null) {
            bfiaVar.e();
        }
        n(this.p);
        n(this.q);
        n(this.r);
        n(this.s);
        n(this.t);
        n(this.u);
        n(this.v);
        bwrs<ilo> bwrsVar = this.o;
        if (bwrsVar != null) {
            bwqv.t(bwrsVar, this);
        }
        this.k = false;
    }

    public void setRedrawSuspended(boolean z) {
        bnjo bnjoVar;
        this.A = z;
        if (z || (bnjoVar = this.i) == null) {
            return;
        }
        cqkx.p(bnjoVar);
    }

    public void setViewModel(bnjo bnjoVar, iln ilnVar) {
        setViewModel(bnjoVar, ilnVar, null);
    }

    private final void j(bwrs<ilo> bwrsVar, boolean z) {
        bwrs<ilo> bwrsVar2;
        bnjo bnjoVar;
        bnjo bnjoVar2 = this.i;
        if (bnjoVar2 != null) {
            if (!this.k || (bwrsVar2 = this.o) == bwrsVar || bwrsVar2 == null) {
                this.o = bwrsVar;
                if (!z) {
                    bnjoVar2.z(getContext(), bwrsVar);
                }
            } else {
                bwqv.t(bwrsVar2, this);
                bnjo bnjoVar3 = this.i;
                if (bnjoVar3 != null) {
                    bnjoVar3.B(this.c);
                }
                this.o = bwrsVar;
                if (!z && (bnjoVar = this.i) != null) {
                    bnjoVar.z(getContext(), bwrsVar);
                }
                this.e.g(bwrsVar, this);
                bnjo bnjoVar4 = this.i;
                if (bnjoVar4 != null) {
                    bnjoVar4.A(this.c);
                }
            }
            ilo c = bwrsVar.c();
            if (c != null) {
                this.x = c.be();
            } else {
                bvoo.h("setPlacemarkRef() called with a reference to null", new Object[0]);
            }
            if (!this.A) {
                bnjo bnjoVar5 = this.i;
                dbsk.s(bnjoVar5);
                cqkx.p(bnjoVar5);
                k();
            }
            bfia bfiaVar = this.j;
            dbsk.s(bfiaVar);
            bfiaVar.a();
        }
    }

    public void setViewModel(bnjo bnjoVar, iln ilnVar, @dzsi begc begcVar) {
        this.i = bnjoVar;
        bfib bfibVar = this.f;
        Activity activity = (Activity) ((dxjd) bfibVar.a).a;
        bfib.a(activity, 1);
        eeu a = bfibVar.b.a();
        bfib.a(a, 2);
        dzsj<glj> dzsjVar = bfibVar.c;
        jkf a2 = bfibVar.d.a();
        bfib.a(a2, 4);
        bfib.a(bfibVar.e.a(), 5);
        bfib.a(bfibVar.f.a(), 6);
        bfib.a(this, 7);
        bfib.a(bnjoVar, 8);
        this.j = new bfia(activity, a, dzsjVar, a2, new dbty(this) { // from class: bfhy
            private final View a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                View view = this.a;
                int i = bfia.c;
                return view;
            }
        }, bnjoVar.o(), bnjoVar.ad(), bnjoVar, begcVar);
        bnhy O = bnjoVar.O();
        if ((ilnVar == iln.BUSINESS || ilnVar == iln.UNRESOLVED) && O != null && O.g() != null) {
            this.p = new jkl((blxc) O.g());
        }
        if (bnjoVar.Q() != null) {
            this.q = new jkl((bniw) bnjoVar.Q());
        }
        if (bnjoVar.q() != null) {
            bfdf bfdfVar = (bfdf) bnjoVar.q();
            dbsk.s(bfdfVar);
            this.r = new jkl(bfdfVar);
        }
        if (bnjoVar.r() != null) {
            bfda bfdaVar = (bfda) bnjoVar.r();
            dbsk.s(bfdaVar);
            this.s = new jkl(bfdaVar);
        }
        if (O != null && O.h() != null) {
            bhjf bhjfVar = (bhjf) O.h();
            dbsk.s(bhjfVar);
            this.t = new jkl(bhjfVar);
        }
        if (O != null && O.f() != null) {
            bkgw bkgwVar = (bkgw) O.f();
            dbsk.s(bkgwVar);
            this.u = new jkl(bkgwVar);
        }
        if (bnjoVar.aa() != null) {
            bees aa = bnjoVar.aa();
            dbsk.s(aa);
            if (!aa.h().booleanValue()) {
                return;
            }
            beeu beeuVar = this.g;
            beev beevVar = (beev) bnjoVar.aa();
            dbsk.s(beevVar);
            beeu.a(beeuVar.a.a(), 1);
            beeu.a(beevVar, 2);
            this.v = new beet(beevVar);
        }
    }
}
