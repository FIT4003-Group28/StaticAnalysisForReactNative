package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: absv  reason: default package */
/* loaded from: classes2.dex */
class absv implements abis {
    final /* synthetic */ absw a;
    private final String b;
    private final List<abms> c;
    private final cjtd d;

    public absv(absw abswVar, final abuo abuoVar, djrm djrmVar, final acwt acwtVar) {
        this.a = abswVar;
        this.b = djrmVar.b;
        ddes bZ = ddet.D.bZ();
        ddzh bZ2 = ddzp.i.bZ();
        drco drcoVar = djrmVar.m;
        String str = (drcoVar == null ? drco.d : drcoVar).c;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddzp ddzpVar = (ddzp) bZ2.b;
        str.getClass();
        ddzpVar.a |= 1;
        ddzpVar.b = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddzp bK = bZ2.bK();
        bK.getClass();
        ddetVar.h = bK;
        ddetVar.a |= 32;
        final ddet bK2 = bZ.bK();
        this.c = dcbg.b(djrmVar.e).s(new dbrn(this, abuoVar, acwtVar, bK2) { // from class: absu
            private final absv a;
            private final acwt b;
            private final ddet c;
            private final abuo d;

            {
                this.a = this;
                this.d = abuoVar;
                this.b = acwtVar;
                this.c = bK2;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                absv absvVar = this.a;
                return this.d.a((dvyw) obj, this.b, absvVar.a.g == absg.AREA_EXPLORE ? dtxj.cb : dtxr.C, this.c);
            }
        }).z();
        cjta b = cjtd.b();
        b.d = abswVar.g == absg.AREA_EXPLORE ? dtxj.cd : dtxr.E;
        b.s(bK2);
        this.d = b.a();
    }

    @Override // defpackage.iao
    public cjtd b() {
        return this.d;
    }

    @Override // defpackage.iao
    public CharSequence c() {
        return ian.a(this);
    }

    @Override // defpackage.iao
    public Boolean d() {
        return ian.c();
    }

    @Override // defpackage.iao
    public hxy e() {
        return null;
    }

    @Override // defpackage.iao
    public Integer f() {
        return ian.b();
    }

    @Override // defpackage.abis
    public List<abms> g() {
        return this.c;
    }

    @Override // defpackage.iao
    /* renamed from: h */
    public String a() {
        return this.b;
    }
}
