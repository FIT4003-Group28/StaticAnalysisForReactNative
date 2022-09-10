package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import java.util.List;
/* compiled from: PG */
/* renamed from: ihx  reason: default package */
/* loaded from: classes.dex */
public final class ihx extends cqiw<iib> {
    public static final cqjg b = cqjg.a();
    public final int a;
    private final iif c;
    private final cqjb<iib, cqtv> d;
    private final cqjb<iib, cqtv> e;
    private final cqjb<iib, cqtv> f;
    private final cqjb<iib, cqtv> g;
    private final cqjb<iib, abp> h;

    public ihx() {
        this(iif.r());
    }

    private final iif e(iib iibVar) {
        iif c = iibVar.c();
        return c != null ? c : this.c;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, iib iibVar, Context context, cqiv cqivVar) {
        iib iibVar2 = iibVar;
        List<cqix<? extends igw>> a = iibVar2.a();
        for (int i2 = 0; i2 < a.size(); i2++) {
            cqix<? extends igw> cqixVar = a.get(i2);
            if (i == 1) {
                cqivVar.c(new ihs(cqixVar, e(iibVar2)));
            } else {
                if (i == 2) {
                    cqivVar.a(new ihr(cqixVar.a(), e(iibVar2)), cqixVar.b());
                } else if (i != 1) {
                }
            }
            if (i2 < a.size() - 1) {
                cqivVar.a(new hsd(), hsd.d(e(iibVar2).i()));
            }
        }
        cqix<?> b2 = iibVar2.b();
        if (a.size() <= this.a || b2 == null) {
            return;
        }
        cqivVar.g(dcdc.f(b2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<iib> a() {
        cqmj aw;
        cqmp[] cqmpVarArr = new cqmp[4];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = cqgr.bp(-2);
        cqmp[] cqmpVarArr2 = {cqic.c(new cqlc(this) { // from class: ihh
            private final ihx a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return Boolean.valueOf(((iib) cqkpVar).a().size() > this.a.a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, new cqmp[0])};
        cqmj gd = cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), cqgr.dW(this.d), cqgr.dS(this.e), cqgr.dH(this.f), cqgr.dD(this.g), cqgr.ck(D(1)), iue.c(ihk.a));
        gd.f(cqmpVarArr2);
        cqmpVarArr[2] = cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.fR(new igp(), ihj.a, new cqmp[0]), gd);
        cqmp[] cqmpVarArr3 = {cqic.f(new cqlc(this) { // from class: ihi
            private final ihx a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return Boolean.valueOf(((iib) cqkpVar).a().size() > this.a.a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, new cqmp[0])};
        cqmp[] cqmpVarArr4 = new cqmp[6];
        cqmpVarArr4[0] = cqgr.cd(-1);
        cqmpVarArr4[1] = cqgr.bp(-2);
        cqmpVarArr4[2] = cqgr.dr(1);
        cqmpVarArr4[3] = cqgr.fR(new igp(), ihl.a, new cqmp[0]);
        dccx dccxVar = new dccx();
        dccxVar.g(cqgr.cd(-1));
        dccxVar.g(cqgr.bp(-2));
        dccxVar.g(cqqx.K(this.h));
        dccxVar.g(cqqx.G());
        dccxVar.g(cqgr.dW(this.d));
        dccxVar.g(cqgr.dS(this.e));
        dccxVar.g(cqgr.dH(this.f));
        dccxVar.g(cqgr.dD(this.g));
        dccxVar.g(cqqx.v(iha.a));
        dccxVar.g(cqgr.P(false));
        dccxVar.g(cqgr.ep(false));
        dccxVar.g(iue.c(ihb.a));
        dccxVar.g(cqgr.dk(ihc.a));
        dccxVar.g(cqgr.aT(b));
        if (this.c.k()) {
            dccxVar.g(cqqx.J());
        }
        if (B().i() != null) {
            dccxVar.g(cqqx.q(igz.a));
            aw = jih.a(D(2), new cqmp[0]);
            aw.e(dccxVar.f());
        } else {
            dccxVar.g(cqqx.p(null));
            aw = GmmRecyclerView.aw(D(2), new cqmp[0]);
            aw.e(dccxVar.f());
        }
        cqmpVarArr4[4] = aw;
        cqmpVarArr4[5] = cqgr.fR(new ihw(), igy.a, new cqmp[0]);
        cqmj gd2 = cqgr.gd(cqmpVarArr4);
        gd2.f(cqmpVarArr3);
        cqmpVarArr[3] = gd2;
        return cqgr.fY(cqmpVarArr);
    }

    public ihx(final iif iifVar) {
        super(iifVar);
        this.c = iifVar;
        this.a = iifVar.a();
        this.d = new cqjb(iifVar) { // from class: igx
            private final iif a;

            {
                this.a = iifVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                iif iifVar2 = this.a;
                cqjg cqjgVar = ihx.b;
                iif c = ((iib) cqkpVar).c();
                if (c != null) {
                    iifVar2 = c;
                }
                return iifVar2.b();
            }
        };
        this.e = new cqjb(iifVar) { // from class: ihd
            private final iif a;

            {
                this.a = iifVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                iif iifVar2 = this.a;
                cqjg cqjgVar = ihx.b;
                iif c = ((iib) cqkpVar).c();
                if (c != null) {
                    iifVar2 = c;
                }
                return iifVar2.c();
            }
        };
        this.f = new cqjb(iifVar) { // from class: ihe
            private final iif a;

            {
                this.a = iifVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                iif iifVar2 = this.a;
                cqjg cqjgVar = ihx.b;
                iif c = ((iib) cqkpVar).c();
                if (c != null) {
                    iifVar2 = c;
                }
                return iifVar2.d();
            }
        };
        this.g = new cqjb(iifVar) { // from class: ihf
            private final iif a;

            {
                this.a = iifVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                iif iifVar2 = this.a;
                cqjg cqjgVar = ihx.b;
                iif c = ((iib) cqkpVar).c();
                if (c != null) {
                    iifVar2 = c;
                }
                return iifVar2.e();
            }
        };
        this.h = new cqjb(iifVar) { // from class: ihg
            private final iif a;

            {
                this.a = iifVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return new ihm((iib) cqkpVar, this.a, context);
            }
        };
    }
}
