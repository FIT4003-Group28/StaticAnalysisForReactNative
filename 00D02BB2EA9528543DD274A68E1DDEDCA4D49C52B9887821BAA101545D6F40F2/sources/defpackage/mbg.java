package defpackage;

import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: mbg  reason: default package */
/* loaded from: classes7.dex */
final class mbg {
    final /* synthetic */ mbp a;

    public mbg(mbp mbpVar) {
        this.a = mbpVar;
    }

    public final void a(mco mcoVar) {
        final mbp mbpVar = this.a;
        dcdc<mck> a = mcoVar.a();
        bsjm c = mcoVar.c();
        boolean b = mcoVar.b();
        int size = a.size();
        dccx G = dcdc.G(size);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (mck mckVar : a) {
            String n = mbp.n(mckVar);
            dbsk.s(n);
            if (!hashSet.add(n)) {
                hashSet2.add(n);
            }
        }
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (mck mckVar2 : a) {
            dbsi<String, String> o = mbp.o(mckVar2);
            if (!hashSet3.add(o)) {
                hashSet4.add(o);
            }
        }
        final int i = 0;
        while (i < size) {
            mck mckVar3 = a.get(i);
            Runnable runnable = new Runnable(mbpVar, i) { // from class: mbc
                private final mbp a;
                private final int b;

                {
                    this.a = mbpVar;
                    this.b = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    mbp mbpVar2 = this.a;
                    mbpVar2.x.e(this.b);
                }
            };
            boolean contains = hashSet2.contains(mbp.n(mckVar3));
            HashSet hashSet5 = hashSet2;
            int i2 = i;
            HashSet hashSet6 = hashSet4;
            bsjm bsjmVar = c;
            dccx dccxVar = G;
            int i3 = size;
            mfk mfkVar = new mfk(mbpVar.c.d, mbpVar.d, mbpVar.a, mbpVar.f, mbpVar.A, mckVar3.a, mbpVar.k, mckVar3.b, i2, mbpVar.n, i3, mbpVar.z, mbpVar.o, runnable, contains, contains && hashSet4.contains(mbp.o(mckVar3)));
            dccxVar.g(mfkVar);
            if (mfkVar.k().booleanValue() || mfkVar.l() != null) {
                mbpVar.r.a(2);
            } else if (mfkVar.j().booleanValue()) {
                mbpVar.r.a(1);
            } else {
                mbpVar.r.a(0);
            }
            i = i2 + 1;
            size = i3;
            G = dccxVar;
            hashSet4 = hashSet6;
            hashSet2 = hashSet5;
            c = bsjmVar;
        }
        bsjm bsjmVar2 = c;
        dcdc f = G.f();
        int size2 = f.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                break;
            }
            int i5 = i4 + 1;
            if (((mfd) f.get(i4)).d() != null) {
                f = f.subList(0, Math.min(f.size(), 6));
                break;
            }
            i4 = i5;
        }
        mbpVar.p.a(a.size());
        if (a.isEmpty()) {
            if (mbpVar.f.g()) {
                mbpVar.q.a(1);
            } else if (b) {
                mbpVar.q.a(2);
            } else {
                mbpVar.q.a(0);
            }
        } else if (a.size() > 1 && mbpVar.k()) {
            cjqy cjqyVar = mbpVar.e;
            cjsx i6 = cjsy.i();
            i6.b(ddda.br);
            cjqyVar.k(i6.a());
        }
        final kow kowVar = mbpVar.s;
        kowVar.a();
        if (bsjmVar2 != null) {
            if (bsjmVar2.r()) {
                if (!kowVar.a.m(bvjk.ka, false)) {
                    kowVar.a.S(bvjk.ka, true);
                    kowVar.g = kowVar.c.d(new kpb(kowVar.d.e(), R.string.CAR_EVCP_IN_SEARCH_APPLIED_TEXT, cjtd.a(dtxm.dN)), kowVar.e, false);
                } else {
                    cjqp cjqpVar = kowVar.h;
                    if (cjqpVar != null) {
                        cjta b2 = cjtd.b();
                        b2.d = dtxm.dN;
                        b2.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
                        cjqpVar.d(b2.a());
                    }
                }
            } else if (bsjmVar2.s()) {
                kowVar.g = kowVar.c.d(new kpb(kowVar.d.e(), R.string.CAR_EVCP_IN_SEARCH_NOT_APPLIED_TEXT, cjtd.a(dtxm.dO)), kowVar.e, false);
            }
            if (kowVar.g != null) {
                kowVar.g.e(new kpd(new Runnable(kowVar) { // from class: kou
                    private final kow a;

                    {
                        this.a = kowVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a();
                    }
                }));
                cqkf<kpc> cqkfVar = kowVar.g;
                dbsk.s(cqkfVar);
                View c2 = cqkfVar.c();
                kowVar.e.addView(c2);
                ViewGroup viewGroup = kowVar.e;
                if (viewGroup instanceof ConstraintLayout) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup;
                    ds dsVar = new ds();
                    dsVar.c(constraintLayout);
                    dsVar.g(c2.getId(), 3, 0, 3);
                    dsVar.g(c2.getId(), 6, 0, 6);
                    dsVar.d(constraintLayout);
                }
            }
        }
        mez<mfd> mezVar = mbpVar.x;
        mezVar.b();
        mezVar.a.addAll(f);
        mbpVar.y.B();
        if (f.isEmpty()) {
            mbpVar.v.i();
        } else {
            cjqp u = mbpVar.u();
            int size3 = f.size();
            for (int i7 = 0; i7 < size3; i7++) {
                mfd mfdVar = (mfd) f.get(i7);
                if (u != null) {
                    mfdVar.C(u);
                }
            }
            if (b) {
                mbpVar.y.y(new men(), f, new mdh(), new mfi(mbpVar.C, mbpVar.d.h()));
            } else {
                mbpVar.y.b(new men(), f);
            }
            mbpVar.v.j();
            cov covVar = (cov) mbpVar.w;
            covVar.b.g = true;
            covVar.a(0);
            ckmd ckmdVar = mbpVar.t;
            ckmdVar.b();
            ckmdVar.a.p(ckoh.c);
            nol.b(mbpVar.w);
            if (f.size() == 1) {
                mbpVar.x.e(0);
            }
        }
        mcb mcbVar = this.a.i;
        dbsk.s(mcbVar);
        mcbVar.d(mcoVar.a());
    }
}
