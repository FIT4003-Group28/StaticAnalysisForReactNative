package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cgyh  reason: default package */
/* loaded from: classes4.dex */
public class cgyh extends cgym implements cgvv, bmcm {
    private final dodm c;
    private final dodk d;
    private cgye e;
    private cgyf f;

    public cgyh(Resources resources, cgum cgumVar, cgsk cgskVar, bwrs<ilo> bwrsVar, List<dwrg> list, dwql dwqlVar, chak chakVar) {
        super(resources, cgskVar, bwrsVar, list, dwqlVar, chakVar, cgumVar);
        dodm dodmVar;
        dwqf dwqfVar = cgskVar.a().c;
        doqw doqwVar = (dwqfVar == null ? dwqf.g : dwqfVar).b;
        doqwVar = doqwVar == null ? doqw.c : doqwVar;
        if (doqwVar.a == 9) {
            dodmVar = (dodm) doqwVar.b;
        } else {
            dodmVar = dodm.d;
        }
        this.c = dodmVar;
        dodh bZ = dodk.c.bZ();
        dglr bZ2 = dgls.e.bZ();
        bZ2.a(dodmVar.c);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dodk dodkVar = (dodk) bZ.b;
        dgls bK = bZ2.bK();
        bK.getClass();
        dsrj<dgls> dsrjVar = dodkVar.a;
        if (!dsrjVar.a()) {
            dodkVar.a = dsqw.cl(dsrjVar);
        }
        dodkVar.a.add(bK);
        dodk bK2 = bZ.bK();
        this.d = bK2;
        this.e = new cgye(bK2, null);
    }

    private final dnet ac(dnfd dnfdVar) {
        dner bZ = dnet.h.bZ();
        dglu dgluVar = dnfdVar.c;
        if (dgluVar == null) {
            dgluVar = dglu.e;
        }
        if (ad(dgluVar)) {
            dneu bZ2 = dnfe.p.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnfe dnfeVar = (dnfe) bZ2.b;
            dnfdVar.getClass();
            dnfeVar.m = dnfdVar;
            dnfeVar.a |= 8192;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnet dnetVar = (dnet) bZ.b;
            dnfe bK = bZ2.bK();
            bK.getClass();
            dnetVar.d = bK;
            dnetVar.a |= 4;
        }
        dnfd c = this.e.c(dnfdVar.b);
        if (c != null) {
            dglu dgluVar2 = c.c;
            if (dgluVar2 == null) {
                dgluVar2 = dglu.e;
            }
            if (ad(dgluVar2)) {
                dneu bZ3 = dnfe.p.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dnfe dnfeVar2 = (dnfe) bZ3.b;
                c.getClass();
                dnfeVar2.m = c;
                dnfeVar2.a |= 8192;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnet dnetVar2 = (dnet) bZ.b;
                dnfe bK2 = bZ3.bK();
                bK2.getClass();
                dnetVar2.c = bK2;
                dnetVar2.a |= 2;
            }
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnet dnetVar3 = (dnet) bZ.b;
        dnetVar3.a |= 1;
        dnetVar3.b = 34;
        return bZ.bK();
    }

    private static boolean ad(dglu dgluVar) {
        int a = dglw.a(dgluVar.d);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        return i != 1 ? i != 2 ? i == 3 && dgluVar.b == 5 && ((dglm) dgluVar.c).a == 2 : dgluVar.b == 4 : dgluVar.b == 3;
    }

    private final boolean ae() {
        return this.n.a;
    }

    @Override // defpackage.chal, defpackage.cgwg
    public Boolean C() {
        return Boolean.valueOf(this.e.a().a.size() > 0);
    }

    @Override // defpackage.cgwg
    public void E(Object obj) {
        dbsk.a(obj instanceof dspd);
        bmcp bmcpVar = (bmcp) bvrs.c((dspd) obj, (dssr) bmcp.b.cu(7));
        if (bmcpVar != null) {
            this.e = new cgye(this.d, bmcpVar);
            this.f = new cgyf(this.e, this, this.b, ae(), this.m);
        }
        cqkx.p(this);
    }

    @Override // defpackage.cgwg
    public void K() {
    }

    @Override // defpackage.chal, defpackage.cgwg
    public Boolean O() {
        return Boolean.valueOf(ae());
    }

    @Override // defpackage.chal, defpackage.cgwg
    public Boolean P() {
        return false;
    }

    @Override // defpackage.cgvv
    public List<dnet> RB(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            dnfd b = this.e.b(str);
            if (b != null) {
                arrayList.add(ac(b));
            }
        }
        return arrayList;
    }

    @Override // defpackage.cgvv
    public void RC(String str, cgwf cgwfVar) {
        cgvu b = h().b(str);
        if (b != null) {
            b.b(cgwfVar);
        }
    }

    @Override // defpackage.bmcm
    public void RD(dnfd dnfdVar) {
        u(cgwf.EDITABLE);
        cgye cgyeVar = this.e;
        if ((dnfdVar.a & 2) == 0) {
            cgyeVar.b.remove(dnfdVar.b);
        } else {
            cgyeVar.b.put(dnfdVar.b, dnfdVar);
        }
        boolean z = true;
        z(this.e.a().a.size() > 0);
        chak chakVar = this.l;
        String str = dnfdVar.b;
        if ((dnfdVar.a & 2) == 0) {
            z = false;
        }
        chakVar.J(this, str, z);
        cqkx.p(h());
        cqkx.p(this);
    }

    @Override // defpackage.cgym
    public void a() {
        this.e = new cgye(this.d, null);
        this.f = new cgyf(this.e, this, this.b, ae(), this.m);
        cqkx.p(this);
    }

    @Override // defpackage.cgvv
    public List<dnet> b() {
        cgvt cgvtVar;
        ArrayList arrayList = new ArrayList();
        cgye cgyeVar = this.e;
        bmco bZ = bmcp.b.bZ();
        int i = 0;
        while (true) {
            aim<String, dnfd> aimVar = cgyeVar.b;
            if (i >= aimVar.j) {
                break;
            }
            dnfd j = aimVar.j(i);
            dnfd c = cgyeVar.c(j.b);
            dglu dgluVar = j.c;
            if (dgluVar == null) {
                dgluVar = dglu.e;
            }
            cgvt e = cgye.e(dgluVar);
            if (c != null) {
                dglu dgluVar2 = c.c;
                if (dgluVar2 == null) {
                    dgluVar2 = dglu.e;
                }
                cgvtVar = cgye.e(dgluVar2);
            } else {
                cgvtVar = null;
            }
            if (e != cgvtVar) {
                bZ.a(j);
            }
            i++;
        }
        bmcp bK = bZ.bK();
        if (bK.a.size() > 0) {
            for (dnfd dnfdVar : bK.a) {
                arrayList.add(ac(dnfdVar));
            }
        }
        return arrayList;
    }

    @Override // defpackage.cgym
    public dnet c() {
        String canonicalName = getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 191);
        sb.append("getAttributeReportForSuggestEditTask method should not be called by ");
        sb.append(canonicalName);
        sb.append(" because we support per attribute submission instead of per task submission. Use getAttributeReports(List<String>) instead.");
        throw new UnsupportedOperationException(sb.toString());
    }

    @Override // defpackage.cgym
    protected final int d() {
        return 34;
    }

    @Override // defpackage.cgvv
    public void e(String str) {
        cgvu b = h().b(str);
        if (b != null) {
            b.d();
        }
        cqkx.p(h());
        cqkx.p(this);
    }

    @Override // defpackage.cgvw
    public cqtd f() {
        return cqrt.f(2131232861);
    }

    @Override // defpackage.cgvw
    public String g() {
        return this.c.a;
    }

    public cgyf h() {
        if (this.f == null) {
            this.f = new cgyf(this.e, this, this.b, ae(), this.m);
        }
        return this.f;
    }

    @Override // defpackage.cgwg
    @dzsi
    /* renamed from: i */
    public dspd D() {
        if (C().booleanValue()) {
            return this.e.a().bR();
        }
        return null;
    }

    @Override // defpackage.cgvw
    public String j() {
        return this.c.b;
    }

    @Override // defpackage.cgvw
    public cqkp k() {
        return h();
    }

    @Override // defpackage.cgvw
    public void l(List<dnet> list, Map<dqgh, cgvw> map) {
        String canonicalName = getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 167);
        sb.append("addAttributeReport method should not be called by ");
        sb.append(canonicalName);
        sb.append(" because there may be more than one Scalable Attribute task which won't be properly preserved in the attributeTypeMap");
        throw new UnsupportedOperationException(sb.toString());
    }

    @Override // defpackage.cgvw
    public void n(dneq dneqVar) {
    }

    @Override // defpackage.cgvw
    public Integer o() {
        return 0;
    }

    @Override // defpackage.cgvw
    @dzsi
    public List<bbtm> p() {
        return null;
    }

    @Override // defpackage.cgvw
    @dzsi
    public String q() {
        return null;
    }

    @Override // defpackage.cgym, defpackage.cgvw
    public Boolean r() {
        return false;
    }

    @Override // defpackage.chal, defpackage.cgwg
    public Boolean w() {
        for (cgvu cgvuVar : h().a()) {
            if (cgvuVar.a().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cgwg
    public void y(cqiv cqivVar) {
        cqivVar.a(new cgjs(), this);
    }
}
