package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: ifa  reason: default package */
/* loaded from: classes6.dex */
public final class ifa extends iej {
    private static final cqrp d = cqrp.f(108.0d);
    private static final cqrp e = cqrp.f(126.0d);
    private static final cqrp f = cqrp.f(18.0d);
    private static final cqrp g = cqrp.d(6.0d);
    public final boolean c;
    private final cqtv h;
    private final cqnf<jba> i;
    private final cqtv j;
    private final int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifa(cqtv cqtvVar, int i, boolean z, cqtv cqtvVar2) {
        super(cqtvVar2, cqtvVar, Integer.valueOf(i), Boolean.valueOf(z));
        int i2 = 4;
        this.h = h(cqtvVar, i, z);
        this.i = cqgr.ce(cqtvVar2);
        this.j = cqtvVar;
        this.k = i == 4 ? 3 : i2;
        this.c = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<jba> a() {
        Float valueOf = Float.valueOf(1.0f);
        cqmj<jba> d2 = d(cqkz.a(this.j));
        aeqc aeqcVar = new aeqc();
        cqlc cqlcVar = ieu.a;
        cqmp[] cqmpVarArr = {cqgr.bY(cqjd.n(d2), cqjd.f())};
        cqjd[] cqjdVarArr = {cqjd.l(d2), cqjd.e()};
        cqrp cqrpVar = g;
        cqmp[] cqmpVarArr2 = {d2, cqgr.fR(aeqcVar, cqlcVar, cqmpVarArr), aeom.a(cqic.f(iev.a, new cqmp[0]), cqgr.bY(cqjdVarArr), cqgr.bR(cqrpVar), cqgr.bV(cqrpVar)), cqgr.fR(new aeoq(), iew.a, cqgr.bY(cqjd.l(d2), cqjd.e()))};
        cqmp[] cqmpVarArr3 = {cqgr.cB(2)};
        cqrp d3 = cqrp.d(2.0d);
        cqmp[] cqmpVarArr4 = {cqgr.cd(-1), cqgr.bp(-2), cqgr.ca(valueOf), jgb.b(Integer.valueOf(this.k)), jgb.d(2), f(cqmpVarArr3), cqgr.gd(cqic.c(iee.a, new cqmp[0]), cqgr.dr(0), cqgr.aJ(16), cqgr.gq(cqgr.aW(2), cqgr.bG(d3), ibq.o(), ibq.y(), cqgr.eM(ief.a)), jfb.a(cqgr.bG(d3), jfb.c(ieg.a), jfb.f(jfo.d)), iue.f(ibq.o(), ibq.y(), cqgr.eM(ieh.a), cqgr.V(iei.a))), cqgr.gq(cqic.c(cqjv.x(iey.a), new cqmp[0]), ibq.o(), ibq.y(), cqgr.ar(TextUtils.TruncateAt.END), cqgr.aJ(8388611), cqgr.eN(5), cqgr.eM(iez.a))};
        cqmj<jba> e2 = e(ibq.o(), ibq.y());
        e2.g(cqic.c(new cqlc(this) { // from class: iex
            private final ifa a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                jba jbaVar = (jba) cqkpVar;
                boolean z = true;
                if (this.a.c && !cqjv.v(jbaVar.t()).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, new cqmp[0]));
        return iue.g(cqgr.bq(this.h), this.i, cqgr.ca(valueOf), iue.c(ies.a), cqgr.cW(acly.a(iet.a)), cqgr.gj(cqmpVarArr2), iue.g(cqgr.cd(-1), cqgr.bp(-2), cqgr.ca(valueOf), cqgr.dz(a, b, a, b), jgb.a(cqmpVarArr4), e2));
    }

    public static cqtv h(cqtv cqtvVar, int i, boolean z) {
        cqtv[] cqtvVarArr = new cqtv[2];
        cqtvVarArr[0] = i == 4 ? d : e;
        cqtvVarArr[1] = cqtvVar;
        cqtv d2 = cqsg.d(cqtvVarArr);
        return z ? cqsg.d(f, d2) : d2;
    }
}
