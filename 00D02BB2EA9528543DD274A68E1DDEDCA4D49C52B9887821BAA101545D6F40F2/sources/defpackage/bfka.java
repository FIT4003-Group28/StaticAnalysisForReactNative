package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import java.util.List;
/* compiled from: PG */
/* renamed from: bfka  reason: default package */
/* loaded from: classes3.dex */
public final class bfka extends cqiw<bfkm> {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();
    private static final cqtv f = cqrp.d(6.0d);
    private static final cqtv g = cqrp.d(2.0d);
    public final cqjb<jbs, Integer> c;
    public final boolean d;
    public final boolean e;
    private final cqjb<bfkm, Integer> h;

    public bfka(cqjb<jbs, Integer> cqjbVar, cqjb<bfkm, Integer> cqjbVar2, boolean z, boolean z2) {
        super(cqjbVar, cqjbVar2, Boolean.valueOf(z), Boolean.valueOf(z2));
        this.c = cqjbVar;
        this.h = cqjbVar2;
        this.d = z;
        this.e = z2;
    }

    public static bfka e(int i, int i2, boolean z) {
        return new bfka(h(i), h(i2), z, false);
    }

    public static bfka f() {
        return e(248, 152, true);
    }

    public static bfka g() {
        return e(238, 152, false);
    }

    private static <T extends cqkp> cqjb<T, Integer> h(final int i) {
        return new cqjb(i) { // from class: bfiy
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return Integer.valueOf(jmj.a(context, this.a));
            }
        };
    }

    private static cqmp<bfkm> i() {
        return cqmn.a(cqgr.M(true), cqgr.O(bfje.a));
    }

    private final cqmn<bfkm> j(cqlc<bfkm, Boolean> cqlcVar) {
        return cqjv.n(cqlcVar, cqmn.a(cqgr.br(this.h), cqgr.bw(16)), cqmn.a(cqgr.bp(-1), cqgr.bw(0)));
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bfkm bfkmVar, Context context, cqiv cqivVar) {
        List<jbs> A = bfkmVar.A();
        if (A.isEmpty()) {
            return;
        }
        if (this.d) {
            cqivVar.f(new bfjz(this), A);
            return;
        }
        int size = A.size() - 1;
        cqivVar.f(new hgk(this.c, 4), A.subList(0, size));
        cqivVar.a(new hgk(this.c, 0), A.get(size));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bfkm> a() {
        cqmp aI;
        cqmp aI2;
        cqnm cqnmVar;
        cqmp aI3;
        cqmp cqmpVar;
        final cqlc cqlcVar = bfjj.a;
        final cqlc cqlcVar2 = bfjq.a;
        final cqlc cqlcVar3 = bfjr.a;
        cqlc cqlcVar4 = new cqlc(this, cqlcVar2, cqlcVar3) { // from class: bfjs
            private final bfka a;
            private final cqlc b;
            private final cqlc c;

            {
                this.a = this;
                this.b = cqlcVar2;
                this.c = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                bfka bfkaVar = this.a;
                cqlc cqlcVar5 = this.b;
                cqlc cqlcVar6 = this.c;
                bfkm bfkmVar = (bfkm) cqkpVar;
                boolean z = false;
                if (((Boolean) cqlcVar5.a(bfkmVar)).booleanValue() && ((Boolean) cqlcVar6.a(bfkmVar)).booleanValue() && bfkaVar.d) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        cqlc cqlcVar5 = new cqlc(this, cqlcVar2, cqlcVar3) { // from class: bfjt
            private final bfka a;
            private final cqlc b;
            private final cqlc c;

            {
                this.a = this;
                this.b = cqlcVar2;
                this.c = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                bfka bfkaVar = this.a;
                cqlc cqlcVar6 = this.b;
                cqlc cqlcVar7 = this.c;
                bfkm bfkmVar = (bfkm) cqkpVar;
                boolean z = false;
                if (((Boolean) cqlcVar6.a(bfkmVar)).booleanValue() && ((Boolean) cqlcVar7.a(bfkmVar)).booleanValue() && !bfkaVar.d) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        final cqlc cqlcVar6 = bfju.a;
        boolean ae = ((btvq) btsr.a(btvq.class)).rp().getPlaceSheetParameters().ae();
        cqmm fR = cqgr.fR(new hgk(), bfjh.a, cqgr.cd(-1), j(new cqlc(this) { // from class: bfji
            private final bfka a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                bfkm bfkmVar = (bfkm) cqkpVar;
                boolean z = false;
                if (this.a.e && !bfkmVar.y().booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }));
        cqmp[] cqmpVarArr = new cqmp[8];
        cqmpVarArr[0] = cqgr.aT(a);
        cqmpVarArr[1] = cqgr.aI(new cqlc(cqlcVar, cqlcVar2, cqlcVar6) { // from class: bfjv
            private final cqlc a;
            private final cqlc b;
            private final cqlc c;

            {
                this.a = cqlcVar;
                this.b = cqlcVar2;
                this.c = cqlcVar6;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar7 = this.a;
                cqlc cqlcVar8 = this.b;
                cqlc cqlcVar9 = this.c;
                bfkm bfkmVar = (bfkm) cqkpVar;
                cqjg cqjgVar = bfka.a;
                boolean z = true;
                if (!((Boolean) cqlcVar7.a(bfkmVar)).booleanValue() && !((Boolean) cqlcVar8.a(bfkmVar)).booleanValue() && !((Boolean) cqlcVar9.a(bfkmVar)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr[2] = cqgr.cd(-1);
        cqmpVarArr[3] = cqjv.l(new cqlc(this) { // from class: bfjw
            private final bfka a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                bfka bfkaVar = this.a;
                bfkm bfkmVar = (bfkm) cqkpVar;
                boolean z = false;
                if (bfkaVar.e && !bfkmVar.y().booleanValue() && !bfkaVar.d) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, cqgr.bs(bfjx.a), cqgr.br(this.h));
        cqmpVarArr[4] = itj.p(bfiz.a);
        cqmpVarArr[5] = cqgr.L(false);
        cqmpVarArr[6] = bfzu.e(i(), bfja.a, bfjb.a);
        cqmp[] cqmpVarArr2 = new cqmp[7];
        cqmpVarArr2[0] = cqgr.cd(-1);
        cqmpVarArr2[1] = cqgr.bp(-1);
        cqmpVarArr2[2] = i();
        cqmpVarArr2[3] = cqgr.B(new cqlc(cqlcVar6) { // from class: bfjc
            private final cqlc a;

            {
                this.a = cqlcVar6;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqjg cqjgVar = bfka.a;
                return ((Boolean) this.a.a((bfkm) cqkpVar)).booleanValue() ? ibm.b() : ibm.a();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr2[4] = cqgr.L(true);
        cqmp[] cqmpVarArr3 = new cqmp[4];
        cqmj gc = cqgr.gc(cqgr.cd(-1), j(new cqlc(this) { // from class: bfjf
            private final bfka a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                bfka bfkaVar = this.a;
                bfkm bfkmVar = (bfkm) cqkpVar;
                boolean z = false;
                if (bfkaVar.e && !bfkmVar.y().booleanValue() && !bfkaVar.d) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.ei(ImageView.ScaleType.CENTER_CROP), cqgr.eG(bfjg.a));
        cqmp[] cqmpVarArr4 = new cqmp[1];
        if (ae) {
            aI = cqic.f(cqlcVar, new cqmp[0]);
        } else {
            aI = cqgr.aI(cqlcVar);
        }
        cqmpVarArr4[0] = aI;
        gc.f(cqmpVarArr4);
        cqmpVarArr3[0] = gc;
        cqmj a2 = jgn.a(cqgr.bp(-1), cqgr.cd(-1), cqgr.bV(ibn.d()), cqgr.bG(ibn.f()), cqgr.bR(ibn.f()), jgn.b(ibn.k()), cqgr.fR(new hgk(), bfjk.a, new cqmp[0]));
        cqmp[] cqmpVarArr5 = new cqmp[1];
        if (ae) {
            aI2 = cqic.f(cqlcVar4, new cqmp[0]);
        } else {
            aI2 = cqgr.aI(cqlcVar4);
        }
        cqmpVarArr5[0] = aI2;
        a2.f(cqmpVarArr5);
        cqmpVarArr3[1] = a2;
        if (ae) {
            cqnmVar = cqgr.fY(fR, cqic.f(cqlcVar5, new cqmp[0]));
        } else {
            fR.a(cqgr.aI(cqlcVar5));
            cqnmVar = fR;
        }
        cqmpVarArr3[2] = cqnmVar;
        cqmj aw = GmmRecyclerView.aw(C(), cqgr.aT(b), cqgr.cd(-1), j(new cqlc(this) { // from class: bfjn
            private final bfka a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                bfka bfkaVar = this.a;
                bfkm bfkmVar = (bfkm) cqkpVar;
                boolean z = false;
                if (bfkaVar.e && !bfkmVar.y().booleanValue() && !bfkaVar.d) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqjv.k(Boolean.valueOf(this.d), cqgr.bV(ibn.d()), cqgr.bU(0)), cqjv.k(Boolean.valueOf(this.d), cqgr.dF(ibn.d()), cqgr.dG(0)), cqjv.k(Boolean.valueOf(this.d), cqgr.dQ(ibn.f()), cqgr.dR(0)), cqgr.P(false), cqqx.G(), cqqx.p(null), cqgr.ep(false), iue.c(bfjo.a), cqgr.dk(bfjp.a));
        cqmp[] cqmpVarArr6 = new cqmp[1];
        if (ae) {
            aI3 = cqic.f(cqlcVar6, new cqmp[0]);
        } else {
            aI3 = cqgr.aI(cqlcVar6);
        }
        cqmpVarArr6[0] = aI3;
        aw.f(cqmpVarArr6);
        cqmpVarArr3[3] = aw;
        cqmpVarArr2[5] = cqgr.fY(cqmpVarArr3);
        cqmp[] cqmpVarArr7 = new cqmp[2];
        if (ae) {
            cqmpVar = cqic.c(cqjv.x(bfjd.a), new cqmp[0]);
        } else {
            cqmpVar = cqmp.e;
        }
        cqmpVarArr7[0] = cqmpVar;
        cqmpVarArr7[1] = cqgr.fY(cqgr.cd(-2), cqgr.bp(-2), cqgr.bD(f), cqgr.bG(cqrp.d(3.0d)), cqgr.ap(g), cqgr.bY(cqjd.f(), cqjd.j()), cqgr.aF(cqjv.x(bfjl.a)), cqgr.fR(new aeoy(true), bfjm.a, new cqmp[0]));
        cqmpVarArr2[6] = cqgr.gj(cqmpVarArr7);
        cqmpVarArr[7] = cqgr.fY(cqmpVarArr2);
        return cqgr.fY(cqmpVarArr);
    }
}
