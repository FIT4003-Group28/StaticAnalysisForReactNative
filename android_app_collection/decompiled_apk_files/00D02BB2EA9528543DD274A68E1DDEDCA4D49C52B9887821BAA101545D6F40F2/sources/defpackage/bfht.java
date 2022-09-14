package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ViewAnimator;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bfht  reason: default package */
/* loaded from: classes3.dex */
public class bfht implements bfgu, brux, bega {
    @dzsi
    private String A;
    @dzsi
    private izl C;
    public final bfcz a;
    @dzsi
    public bwrs<ilo> b;
    @dzsi
    public bruz c;
    @dzsi
    public Runnable e;
    private final Activity f;
    private final btvo g;
    private final bmfg h;
    private final bmgu i;
    private final bexz j;
    private final bwqv k;
    private final bfgv l;
    private final iqs m;
    private final bfha o;
    private final bmef p;
    private final bego q;
    private final bfgq r;
    private boolean s;
    private final boolean t;
    @dzsi
    private bmgs v;
    @dzsi
    private bnhz w;
    @dzsi
    private final View.OnClickListener x;
    @dzsi
    private String z;
    private jjn y = jjn.COLLAPSED;
    private Boolean B = false;
    private dbsg<bfgz> D = dbpy.a;
    final bwrr<ilo> d = new bfhr(this);
    private cjtd u = cjtd.b;
    private final boolean n = bmfg.a();

    public bfht(boolean z, boolean z2, @dzsi View.OnClickListener onClickListener, Activity activity, btvo btvoVar, cqhn cqhnVar, cqhu cqhuVar, bmfg bmfgVar, bmgu bmguVar, beya beyaVar, bfcz bfczVar, iqs iqsVar, bwqv bwqvVar, bfhx bfhxVar, bfha bfhaVar, bmef bmefVar, bego begoVar, bfgq bfgqVar) {
        this.g = btvoVar;
        this.f = activity;
        this.h = bmfgVar;
        this.i = bmguVar;
        this.j = beyaVar.a(null);
        this.a = bfczVar;
        this.k = bwqvVar;
        this.m = iqsVar;
        this.l = bfhxVar;
        this.x = onClickListener;
        this.o = bfhaVar;
        this.p = bmefVar;
        this.q = begoVar;
        this.r = bfgqVar;
        this.t = z2;
    }

    @Override // defpackage.bfgu
    @dzsi
    public izl A() {
        return this.C;
    }

    @Override // defpackage.bfgu
    public Boolean B() {
        return Boolean.valueOf(this.s);
    }

    @Override // defpackage.bfgu
    @dzsi
    public bmgs C() {
        return this.v;
    }

    @Override // defpackage.bfgu
    public Boolean D() {
        ilo iloVar = (ilo) bwrs.b(this.b);
        boolean z = false;
        if (iloVar != null && iloVar.cB()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgu
    public Boolean E() {
        return this.B;
    }

    @Override // defpackage.bfgu
    public Boolean F() {
        ilo iloVar = (ilo) bwrs.b(this.b);
        boolean z = false;
        if (iloVar != null && iloVar.f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgu
    public bfgv G() {
        return this.l;
    }

    @Override // defpackage.bfgu
    public bfcf H() {
        return this.a;
    }

    @Override // defpackage.bfgu
    public Boolean I() {
        boolean z = false;
        if (this.j.a() && this.a.w().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgu
    public Boolean J() {
        return Boolean.valueOf(this.q.a((ilo) bwrs.b(this.b)));
    }

    @Override // defpackage.bfgu
    @dzsi
    public bruz K() {
        return this.c;
    }

    @Override // defpackage.bfgu
    public Boolean L() {
        return Boolean.valueOf(this.t);
    }

    public void M() {
        bwrs<ilo> bwrsVar = this.b;
        if (bwrsVar != null) {
            this.k.g(bwrsVar, this.d);
        }
    }

    public void N() {
        bwrs<ilo> bwrsVar = this.b;
        if (bwrsVar != null) {
            bwqv.t(bwrsVar, this.d);
        }
        S();
    }

    public void O(boolean z) {
        this.B = Boolean.valueOf(z);
    }

    @Override // defpackage.brux
    @dzsi
    public String P() {
        ilo iloVar = (ilo) bwrs.b(this.b);
        if (iloVar != null && !iloVar.H().isEmpty()) {
            dvvy dvvyVar = iloVar.h().as;
            if (dvvyVar == null) {
                dvvyVar = dvvy.d;
            }
            if ((dvvyVar.a & 1) == 0) {
                dcdc<ilo> H = iloVar.H();
                ArrayList arrayList = new ArrayList();
                int size = H.size();
                for (int i = 0; i < size; i++) {
                    ilo iloVar2 = H.get(i);
                    if (!dbsj.d(iloVar2.n())) {
                        arrayList.add(iloVar2.n());
                    }
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                String valueOf = String.valueOf(dbrz.e(", ").g(arrayList));
                return valueOf.length() != 0 ? " ".concat(valueOf) : new String(" ");
            }
        }
        return null;
    }

    public bfch Q() {
        return this.a.o();
    }

    @Override // defpackage.bfgu
    public void QT(View view) {
        this.r.a(view);
    }

    @Override // defpackage.bfgu
    @dzsi
    public View.OnClickListener QU() {
        return this.r.e(this.x);
    }

    @Override // defpackage.bfgu
    public Boolean QV() {
        return false;
    }

    public bfch R() {
        return this.a.p();
    }

    public final void S() {
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
            this.e = null;
        }
    }

    public void T(@dzsi bruz bruzVar) {
        this.c = bruzVar;
    }

    public void a(bnhz bnhzVar) {
        this.w = bnhzVar;
    }

    public void b(izl izlVar) {
        this.C = izlVar;
    }

    @Override // defpackage.brux
    public cjtd c() {
        return this.u;
    }

    @Override // defpackage.bfgu
    @dzsi
    public CharSequence d() {
        ilo iloVar = (ilo) bwrs.b(this.b);
        if (iloVar != null) {
            return this.o.d(iloVar);
        }
        return null;
    }

    @Override // defpackage.bfgu
    public String e() {
        ilo iloVar = (ilo) bwrs.b(this.b);
        return (iloVar == null || iloVar.u().booleanValue() || dbsj.d(iloVar.s())) ? "" : iloVar.s();
    }

    @Override // defpackage.bfgu
    @dzsi
    public CharSequence f() {
        return this.z;
    }

    @Override // defpackage.bfgu
    @dzsi
    public CharSequence g() {
        return this.A;
    }

    @Override // defpackage.bfgu
    public Boolean h() {
        return Boolean.valueOf(!dbsj.d(this.z));
    }

    @Override // defpackage.bfgu
    public Boolean i() {
        return true;
    }

    @Override // defpackage.bfgu
    @dzsi
    public String j() {
        bnhz bnhzVar = this.w;
        if (bnhzVar != null) {
            return bfha.b(bnhzVar, this.g);
        }
        return null;
    }

    @Override // defpackage.bfgu
    @dzsi
    public cqtd k() {
        bnhz bnhzVar = this.w;
        if (bnhzVar != null) {
            return bfha.c(bnhzVar, this.g);
        }
        return null;
    }

    @Override // defpackage.bfgu
    public Boolean l() {
        return Boolean.valueOf(this.y.b());
    }

    public void m(final jjn jjnVar) {
        View o;
        ViewAnimator viewAnimator;
        this.y = jjnVar;
        if (l().booleanValue() && this.e == null && (o = cqkx.o(this)) != null && (viewAnimator = (ViewAnimator) cqkx.e(o, bfzt.c, ViewAnimator.class)) != null) {
            final Animation inAnimation = viewAnimator.getInAnimation();
            this.e = new Runnable(inAnimation) { // from class: bfhq
                private final Animation a;

                {
                    this.a = inAnimation;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.setAnimationListener(null);
                }
            };
            inAnimation.setAnimationListener(new bfhs(this, viewAnimator));
        }
        bvor.a(this.D, new mw(jjnVar) { // from class: bfho
            private final jjn a;

            {
                this.a = jjnVar;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                ((bfgz) obj).b(this.a);
            }
        });
        if (jjnVar != jjn.HIDDEN) {
            this.r.d();
        }
    }

    @Override // defpackage.bfgu
    public Boolean n() {
        return bfha.e(this.y);
    }

    @Override // defpackage.bfgu
    public Boolean o() {
        ilo iloVar = (ilo) bwrs.b(this.b);
        boolean z = false;
        if (iloVar != null && iloVar.o()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgu
    public Boolean p() {
        ilo iloVar = (ilo) bwrs.b(this.b);
        boolean z = false;
        if (iloVar != null && !iloVar.u().booleanValue() && !dbsj.d(iloVar.s())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgu
    public Boolean q() {
        ilo iloVar = (ilo) bwrs.b(this.b);
        boolean z = false;
        if (iloVar != null && iloVar.m) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgu
    @dzsi
    public cjtd r() {
        return (cjtd) this.D.h(bfhp.a).f();
    }

    @Override // defpackage.bfgu
    public cjtd s() {
        return this.r.d;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.b = bwrsVar;
        if (bwrsVar != null) {
            this.a.t(bwrsVar);
        }
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        dbsk.s(iloVar);
        this.o.a(iloVar);
        this.z = this.p.a(iloVar, new begh()).a(this.f.getString(R.string.ADDRESS_SEPARATOR));
        this.A = this.p.a(iloVar, new begh()).a("\n");
        this.l.c(iloVar);
        this.D = dbsg.i(bfha.f(iloVar));
        this.m.e(bwrsVar);
        this.r.b(iloVar);
        if (this.n) {
            cjta c = cjtd.c(iloVar.bZ());
            c.d = dtxy.ir;
            boolean c2 = this.h.c(iloVar, 1);
            this.s = c2;
            if (c2) {
                this.v = this.i.a(bwrsVar, bmfa.PLACE, c.a());
            }
        }
        cjta c3 = cjtd.c(iloVar.bZ());
        c3.d = dtxl.ag;
        this.u = c3.a();
    }

    @Override // defpackage.bega
    public void u() {
        this.b = null;
        this.z = null;
        this.A = null;
        this.a.u();
        iqs iqsVar = this.m;
        iqsVar.d = null;
        iqsVar.e = -1;
        this.r.c();
        this.D = dbpy.a;
        this.s = false;
        this.v = null;
        this.u = cjtd.b;
    }

    @Override // defpackage.bfgu
    @dzsi
    public cqtd v() {
        return null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return true;
    }

    @Override // defpackage.bfgu
    public Boolean x() {
        return false;
    }

    @Override // defpackage.bfgu
    public Boolean y() {
        ilo iloVar = (ilo) bwrs.b(this.b);
        boolean z = false;
        if (iloVar != null && iloVar.j()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgu
    public Boolean z() {
        ilo iloVar = (ilo) bwrs.b(this.b);
        boolean z = false;
        if (iloVar != null && iloVar.h && iloVar.j()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
