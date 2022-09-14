package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bqks  reason: default package */
/* loaded from: classes4.dex */
public class bqks {
    public final bbvh a;
    public final bqkr b;
    public final boolean c;
    public final bbul d;
    public final bbtk e;
    public final dxio<akfa> f;
    public final Executor g;
    public final z<bqkr> h;
    public dcep<bqkl> i;
    public dcep<bqkl> j;
    public dcdc<bqkl> k;
    public final buzr l;
    private final dcbg<bqkl> m;
    private final buma n;

    public bqks(ilo iloVar, buma bumaVar, buzr buzrVar, bbul bbulVar, bbtk bbtkVar, dxio dxioVar, Executor executor) {
        z<bqkr> zVar = new z<>();
        this.h = zVar;
        this.i = dcmr.a;
        this.j = dcmr.a;
        this.k = dcdc.e();
        this.n = bumaVar;
        this.l = buzrVar;
        this.d = bbulVar;
        this.e = bbtkVar;
        this.f = dxioVar;
        this.g = executor;
        this.c = false;
        this.a = bbvh.e(iloVar).f(dgpu.LOCAL);
        bqkr bqkrVar = new bqkr(dcbg.b(iloVar.bq().B).o(bqjj.a).s(bqju.a));
        this.b = bqkrVar;
        this.m = bqkrVar.c().o(bqjz.a);
        zVar.g(bqkrVar);
    }

    public final dcdc<bbtm> a() {
        return b().b();
    }

    public final bqkr b() {
        if (this.h.h() == null) {
            return new bqkr(dcbg.i());
        }
        bqkr h = this.h.h();
        dbsk.s(h);
        return h;
    }

    public final void c() {
        if (this.i.isEmpty()) {
            return;
        }
        dcep B = dcbg.b(this.i).s(bqjx.a).B();
        buma bumaVar = this.n;
        dhuz bZ = dhva.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhva dhvaVar = (dhva) bZ.b;
        dhvaVar.b();
        dsod.bv(B, dhvaVar.b);
        bumaVar.b(bZ.bK(), new bqki(), this.g);
    }

    public final void d(Iterable<bbtm> iterable) {
        e(dcbg.b(iterable).s(bqkd.a));
    }

    public final void e(dcbg<bqkl> dcbgVar) {
        final bqkr bqkrVar = new bqkr(dcbgVar);
        this.i = this.m.o(dbst.a(new dbsl(bqkrVar) { // from class: bqjq
            private final bqkr a;

            {
                this.a = bqkrVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.a((bqkl) obj);
            }
        })).B();
        this.j = this.m.s(new dbrn(bqkrVar) { // from class: bqjr
            private final bqkr a;

            {
                this.a = bqkrVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bqkr bqkrVar2 = this.a;
                bqkl bqklVar = (bqkl) obj;
                if (!bqkrVar2.a(bqklVar)) {
                    return dbpy.a;
                }
                bqkl bqklVar2 = bqkrVar2.a.get(bqklVar.a());
                dbsk.s(bqklVar2);
                return bqklVar2.h().equals(bqklVar.h()) ? dbpy.a : dbsg.i(bqklVar2);
            }
        }).o(bqjs.a).s(bqjt.a).B();
        final bqkr bqkrVar2 = this.b;
        bqkrVar2.getClass();
        this.k = dcbgVar.o(dbst.a(new dbsl(bqkrVar2) { // from class: bqjv
            private final bqkr a;

            {
                this.a = bqkrVar2;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.a((bqkl) obj);
            }
        })).o(dbst.a(bqjw.a)).z();
        this.h.g(bqkrVar);
    }
}
