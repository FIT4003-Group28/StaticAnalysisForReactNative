package defpackage;
/* compiled from: PG */
/* renamed from: cgae  reason: default package */
/* loaded from: classes4.dex */
public class cgae implements cfzw {
    public final cfza a;
    @dzsi
    public dwmk b;
    private final bmdv c;
    private final ges d;
    @dzsi
    private cjta e;

    public cgae(bmdv bmdvVar, cqhn cqhnVar, cfza cfzaVar, ges gesVar) {
        this.c = bmdvVar;
        this.a = cfzaVar;
        this.d = gesVar;
    }

    @Override // defpackage.cfzw
    public void a(@dzsi dwmk dwmkVar) {
        this.b = dwmkVar;
        if (dwmkVar != null) {
            cjta b = cjtd.b();
            dwmk dwmkVar2 = this.b;
            dbsk.s(dwmkVar2);
            b.g(dwmkVar2.b);
            this.e = b;
        } else {
            this.e = null;
        }
        cqkx.p(this);
    }

    @Override // defpackage.cfzw
    @dzsi
    public String b() {
        return (String) dbsg.j(this.b).h(cfzx.a).h(cfzy.a).f();
    }

    @Override // defpackage.cfzw
    @dzsi
    public String c() {
        dwmk dwmkVar = this.b;
        String str = null;
        if (dwmkVar == null) {
            return null;
        }
        dbrz j = dbrz.e(" · ").j();
        bmdv bmdvVar = this.c;
        if (!dwmkVar.o.isEmpty()) {
            str = dwmkVar.o;
        } else if (dwmkVar.m.size() == 0) {
            dwlh dwlhVar = dwmkVar.c;
            if (dwlhVar == null) {
                dwlhVar = dwlh.n;
            }
            dniu dniuVar = dwlhVar.b;
            if (dniuVar == null) {
                dniuVar = dniu.i;
            }
            String str2 = dniuVar.b;
        } else {
            str = bmdvVar.d(dwmkVar.m.get(0).b, "", true);
        }
        return j.i(str, dbsj.f(i()), new Object[0]);
    }

    @Override // defpackage.cfzw
    public Integer d() {
        return 0;
    }

    @Override // defpackage.cfzw
    public cqkl e() {
        gn gnVar = this.d.A;
        if (this.b == null || gnVar == null) {
            return cqkl.a;
        }
        chxq bZ = chxr.e.bZ();
        dwmk dwmkVar = this.b;
        dbsk.s(dwmkVar);
        dwlh dwlhVar = dwmkVar.c;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        dniu dniuVar = dwlhVar.b;
        if (dniuVar == null) {
            dniuVar = dniu.i;
        }
        String str = dniuVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chxr chxrVar = (chxr) bZ.b;
        str.getClass();
        chxrVar.b = 1;
        chxrVar.c = str;
        chxr bK = bZ.bK();
        dwmk dwmkVar2 = this.b;
        dbsk.s(dwmkVar2);
        String str2 = dwmkVar2.b;
        dwmk dwmkVar3 = this.b;
        dbsk.s(dwmkVar3);
        dwlh dwlhVar2 = dwmkVar3.c;
        if (dwlhVar2 == null) {
            dwlhVar2 = dwlh.n;
        }
        ciwj.aP(bK, str2, dwlhVar2, dcdc.i(chvd.CHANGE_PLACE, chvd.DISMISS_PLACE, chvd.REMOVE_FROM_TIMELINE, chvd.LEARN_MORE)).aJ(gnVar, this.d);
        return cqkl.a;
    }

    @Override // defpackage.cfzw
    public cqkl f() {
        dwmk dwmkVar = this.b;
        if (dwmkVar == null) {
            return cqkl.a;
        }
        cfza cfzaVar = this.a;
        begj begjVar = new begj();
        begjVar.b(cfzv.a(cfzaVar.a, dwmkVar, cfzaVar.c.e(dwmkVar)));
        begjVar.c = jjn.EXPANDED;
        begjVar.n = true;
        cfzaVar.d.a().n(begjVar, false, null);
        return cqkl.a;
    }

    @Override // defpackage.cfzw
    public jez g() {
        return new jez(this) { // from class: cgac
            private final cgae a;

            {
                this.a = this;
            }

            @Override // defpackage.jez
            public final void a(cjqm cjqmVar, float f) {
                cgae cgaeVar = this.a;
                dwmk dwmkVar = cgaeVar.b;
                if (dwmkVar == null) {
                    return;
                }
                cfza cfzaVar = cgaeVar.a;
                int i = (int) f;
                bqjf r = bqjh.r();
                dnqh c = bzwi.c(blpk.CONTRIBUTE_TAB_TODO_REVIEW_CARD);
                dsqp dsqpVar = (dsqp) c.cu(5);
                dsqpVar.bC(c);
                dnqg dnqgVar = (dnqg) dsqpVar;
                String str = dwmkVar.b;
                if (dnqgVar.c) {
                    dnqgVar.bF();
                    dnqgVar.c = false;
                }
                dnqh dnqhVar = (dnqh) dnqgVar.b;
                dnqh dnqhVar2 = dnqh.p;
                str.getClass();
                dnqhVar.a |= 8;
                dnqhVar.e = str;
                r.f(dnqgVar.bK());
                r.n(chbv.NEVER_SHOW);
                r.c(dhpj.TODO_LIST);
                r.j(i);
                ((bqir) r).a = dwmkVar.i;
                cfzaVar.b.a().b(bwrs.a(cfzv.a(cfzaVar.a, dwmkVar, cfzaVar.c.e(dwmkVar))), r.o());
            }
        };
    }

    @Override // defpackage.cfzw
    @dzsi
    public cjtd h(final ddho ddhoVar) {
        return (cjtd) dbsg.j(this.e).h(new dbrn(ddhoVar) { // from class: cgad
            private final ddho a;

            {
                this.a = ddhoVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cjta cjtaVar = (cjta) obj;
                cjtaVar.d = this.a;
                return cjtaVar.a();
            }
        }).f();
    }

    @dzsi
    public String i() {
        return (String) dbsg.j(this.b).h(cfzz.a).h(cgaa.a).h(cgab.a).f();
    }
}
