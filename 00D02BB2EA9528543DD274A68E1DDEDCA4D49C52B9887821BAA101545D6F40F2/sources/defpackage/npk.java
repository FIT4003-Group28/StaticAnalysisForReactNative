package defpackage;

import android.animation.LayoutTransition;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
/* compiled from: PG */
/* renamed from: npk  reason: default package */
/* loaded from: classes7.dex */
public final class npk implements nou {
    public final nst g;
    public final ViewGroup h;
    public final ConstraintLayout i;
    public final ViewGroup j;
    public final noz k;
    public final now l;
    public npi m;
    public final crzp<noi> n;
    @dzsi
    public View o;
    @dzsi
    public View p;
    @dzsi
    public View q;
    public final crzm<noi> r;
    private final Object t;
    private final kcv u;
    private final ViewGroup v;
    private final ViewGroup w;
    private final ksi x;
    private final nss y;
    private static final LayoutTransition s = nod.a();
    static final int a = cqir.a();
    public static final int b = cqir.a();
    static final int c = cqir.a();
    static final int d = cqir.a();
    static final int e = cqir.a();
    public static final int f = cqir.a();

    public npk(ViewGroup viewGroup, cqkj cqkjVar, kcv kcvVar, final crzm<noi> crzmVar) {
        npe npeVar = new npe();
        this.t = npeVar;
        this.n = new npf(this);
        nph nphVar = new nph(this);
        this.y = nphVar;
        this.j = viewGroup;
        this.u = kcvVar;
        ksi ksiVar = new ksi(cqkjVar.d);
        this.x = ksiVar;
        cqkf d2 = cqkjVar.d(new npj(), viewGroup, false);
        d2.e(new npg());
        ViewGroup viewGroup2 = (ViewGroup) d2.c();
        this.v = viewGroup2;
        int i = a;
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(i);
        this.h = viewGroup3;
        int i2 = b;
        ViewGroup viewGroup4 = (ViewGroup) viewGroup2.findViewById(i2);
        this.w = viewGroup4;
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup2.findViewById(c);
        this.i = constraintLayout;
        nst nstVar = (nst) viewGroup2.findViewById(d);
        this.g = nstVar;
        nstVar.setDefaultViewProvider(nphVar);
        constraintLayout.setFitsSystemWindows(true);
        this.m = npi.STANDARD_NEW;
        this.r = crzmVar;
        this.l = new now(ksiVar, viewGroup2.findViewById(e), constraintLayout, i, i2, new dbty(this) { // from class: npc
            private final npk a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.m;
            }
        }, new dbty(crzmVar) { // from class: npd
            private final crzm a;

            {
                this.a = crzmVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                crzm crzmVar2 = this.a;
                int i3 = npk.b;
                noi noiVar = (noi) crzmVar2.l();
                dbsk.s(noiVar);
                return noiVar;
            }
        });
        this.k = new noz(viewGroup2, viewGroup3, viewGroup4, constraintLayout, kcvVar, npeVar);
    }

    public static void b(ViewGroup viewGroup) {
        viewGroup.setLayoutTransition(null);
    }

    private static void d(ViewGroup viewGroup, View view) {
        view.setAlpha(1.0f);
        if (view.getParent() != viewGroup) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            viewGroup.addView(view);
        }
    }

    public final void a(View view, View view2, npi npiVar) {
        this.j.setLayoutTransition(s);
        ViewParent parent = this.v.getParent();
        ViewGroup viewGroup = this.j;
        if (parent != viewGroup) {
            viewGroup.addView(this.v);
        }
        d(this.h, view);
        npi npiVar2 = npi.STANDARD_NEW;
        int ordinal = npiVar.ordinal();
        if (ordinal == 0) {
            d(this.w, view2);
            this.l.a();
            this.u.h(this.t);
        } else if (ordinal == 1) {
            d(this.i, view2);
            this.l.a();
            this.u.i(this.t);
        } else {
            String valueOf = String.valueOf(npiVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("Unrecognized value for mode: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // defpackage.nou
    public final void c() {
        View view = this.o;
        if (view != null) {
            this.h.removeView(view);
            this.o = null;
            b(this.h);
        }
        View view2 = this.p;
        if (view2 != null) {
            this.w.removeView(view2);
            this.p = null;
        }
        View view3 = this.q;
        if (view3 != null) {
            this.i.removeView(view3);
            this.q = null;
            b(this.i);
        }
        ViewParent parent = this.v.getParent();
        ViewGroup viewGroup = this.j;
        if (parent == viewGroup) {
            viewGroup.removeView(this.v);
        }
        this.u.h(this.t);
    }
}
