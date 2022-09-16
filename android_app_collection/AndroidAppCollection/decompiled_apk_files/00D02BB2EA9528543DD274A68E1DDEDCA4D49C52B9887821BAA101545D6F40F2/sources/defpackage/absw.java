package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: absw  reason: default package */
/* loaded from: classes2.dex */
public class absw extends ibd implements abit {
    public static final /* synthetic */ int h = 0;
    private static final dcqe i = dcqe.c("absw");
    private static final cqtd m = cqrt.f(2131231314);
    public final absg g;
    private final dxio<axwy> j;
    private final cjqy k;
    @dzsi
    private final acwt l;
    private final dxio<brba> n;
    @dzsi
    private djrs o;
    private List<abis> p;
    private Integer q;
    private final abuo r;

    public absw(cqhn cqhnVar, dxio dxioVar, abuo abuoVar, cjqy cjqyVar, dxio dxioVar2, djrs djrsVar, acwt acwtVar, absg absgVar) {
        super(cqhnVar, cjqyVar);
        this.p = new ArrayList();
        this.q = 0;
        this.g = absgVar;
        this.j = dxioVar;
        this.r = abuoVar;
        this.k = cjqyVar;
        this.l = acwtVar;
        this.n = dxioVar2;
        o(djrsVar);
    }

    private final void n(cjqm cjqmVar) {
        acwt acwtVar = this.l;
        if (acwtVar != null) {
            acwtVar.a();
        }
        if (this.o != null && b().intValue() >= 0) {
            int intValue = b().intValue();
            djrs djrsVar = this.o;
            dbsk.s(djrsVar);
            if (intValue < djrsVar.a.size()) {
                djrs djrsVar2 = this.o;
                dbsk.s(djrsVar2);
                djrm djrmVar = djrsVar2.a.get(b().intValue());
                if ((djrmVar.a & 16384) == 0) {
                    axwy a = this.j.a();
                    djrs djrsVar3 = this.o;
                    dbsk.s(djrsVar3);
                    drco drcoVar = djrsVar3.a.get(b().intValue()).m;
                    if (drcoVar == null) {
                        drcoVar = drco.d;
                    }
                    a.E(drcoVar.c);
                    return;
                }
                dnqg bZ = dnqh.p.bZ();
                if (cjqmVar.a().a()) {
                    String b = cjqmVar.a().b();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnqh dnqhVar = (dnqh) bZ.b;
                    b.getClass();
                    dnqhVar.a |= 2;
                    dnqhVar.c = b;
                }
                brba a2 = this.n.a();
                dpvg dpvgVar = djrmVar.p;
                if (dpvgVar == null) {
                    dpvgVar = dpvg.d;
                }
                a2.n(dpvgVar, bZ.bK());
                return;
            }
        }
        bvoo.h("Unexpected selected tab index: %d", b());
    }

    private final boolean o(@dzsi djrs djrsVar) {
        absy.a(this.k, djrsVar);
        if (djrsVar != null) {
            if (!this.p.isEmpty() && p(this.o).equals(p(djrsVar))) {
                return false;
            }
            this.p = new ArrayList();
            this.q = 0;
            for (int i2 = 0; i2 < djrsVar.a.size(); i2++) {
                this.p.add(new absv(this, this.r, djrsVar.a.get(i2), this.l));
                this.q = Integer.valueOf(Math.max(this.q.intValue(), djrsVar.a.get(i2).e.size()));
            }
            this.o = djrsVar;
            return true;
        }
        this.p = new ArrayList();
        this.q = 0;
        this.o = null;
        return true;
    }

    @Override // defpackage.abit
    public boolean d(@dzsi djrs djrsVar) {
        boolean o = o(djrsVar);
        if (o) {
            cqkx.p(this);
        }
        return o;
    }

    @Override // defpackage.abit
    public String e() {
        djrs djrsVar = this.o;
        return djrsVar != null ? djrsVar.b : "";
    }

    @Override // defpackage.abit
    public List<abis> f() {
        return this.p;
    }

    @Override // defpackage.abit
    public Integer g() {
        return this.q;
    }

    @Override // defpackage.abit
    public cjtd h() {
        if (b().intValue() < 0 || b().intValue() >= this.p.size()) {
            return cjtd.b;
        }
        cjta b = cjtd.b();
        b.d = this.g == absg.AREA_EXPLORE ? dtxj.cc : dtxr.D;
        b.s(this.p.get(b().intValue()).b().k());
        return b.a();
    }

    @Override // defpackage.abit
    public cjtd i() {
        return cjtd.a(this.g == absg.AREA_EXPLORE ? dtxj.ca : dtxr.B);
    }

    @Override // defpackage.abit
    public cqkl j(cjqm cjqmVar) {
        n(cjqmVar);
        return cqkl.a;
    }

    @Override // defpackage.abit
    public cqkl k(cjqm cjqmVar) {
        n(cjqmVar);
        return cqkl.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
        if ((r0.a.get(0).a & 16384) != 0) goto L12;
     */
    @Override // defpackage.abit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean l() {
        /*
            r3 = this;
            djrs r0 = r3.o
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3a
            dsrj<djrm> r0 = r0.a
            int r0 = r0.size()
            if (r0 <= 0) goto L3a
            djrs r0 = r3.o
            dsrj<djrm> r0 = r0.a
            java.lang.Object r0 = r0.get(r2)
            djrm r0 = (defpackage.djrm) r0
            drco r0 = r0.m
            if (r0 != 0) goto L1e
            drco r0 = defpackage.drco.d
        L1e:
            java.lang.String r0 = r0.c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3b
            djrs r0 = r3.o
            defpackage.dbsk.s(r0)
            dsrj<djrm> r0 = r0.a
            java.lang.Object r0 = r0.get(r2)
            djrm r0 = (defpackage.djrm) r0
            int r0 = r0.a
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L3a
            goto L3b
        L3a:
            r1 = 0
        L3b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.absw.l():java.lang.Boolean");
    }

    @Override // defpackage.abit
    public cqtd m() {
        return m;
    }

    private static dcep<String> p(@dzsi djrs djrsVar) {
        if (djrsVar == null) {
            return dcmr.a;
        }
        return dcbg.b(djrsVar.a).s(abst.a).B();
    }
}
