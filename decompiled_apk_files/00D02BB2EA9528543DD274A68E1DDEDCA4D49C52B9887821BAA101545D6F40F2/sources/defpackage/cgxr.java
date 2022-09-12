package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cgxr  reason: default package */
/* loaded from: classes4.dex */
public class cgxr extends cgym {
    private final Activity c;
    private final cgyu d;

    public cgxr(Activity activity, btvo btvoVar, cgsk cgskVar, bwrs<ilo> bwrsVar, List<dwrg> list, dwql dwqlVar, chak chakVar, ges gesVar, cqkj cqkjVar, dxio<boxa> dxioVar, bbut bbutVar, cgum cgumVar) {
        super(activity.getResources(), cgskVar, bwrsVar, list, dwqlVar, chakVar, cgumVar);
        Activity activity2;
        bond bondVar;
        this.c = activity;
        bonr bonrVar = new bonr(activity, gesVar, cqkjVar, btvoVar, null, false);
        boolean al = btvoVar.getUgcParameters().al();
        if (btvoVar.getUgcParameters().s()) {
            activity2 = activity;
            bondVar = new bond(activity, new bokf(), dwyd.UGC_TASK_SETS, "", bbutVar, gesVar, true != al ? "business_hours_photo" : "business_hours_photo_gallery_default", al, dtyd.Y, dtyd.X, dtyd.U);
        } else {
            activity2 = activity;
            bondVar = null;
        }
        this.d = new cgyu(dxioVar, gesVar, bwrsVar, bonrVar, bondVar, activity2.getString(R.string.UGC_TASKS_SUGGEST_EDIT_BUSINESS_HOURS_PLACEHOLDER));
    }

    @Override // defpackage.chal, defpackage.cgwg
    public Boolean C() {
        return Boolean.valueOf(!this.d.c().booleanValue());
    }

    @Override // defpackage.cgwg
    public void E(Object obj) {
        dbsk.a(obj instanceof bosj);
        bosj bosjVar = (bosj) obj;
        this.d.l(bosjVar.b());
        this.d.m(bosjVar.d());
        cqkx.p(this.d);
        cqkx.p(this);
    }

    @Override // defpackage.chal, defpackage.cgwg
    public Boolean J() {
        return true;
    }

    @Override // defpackage.cgwg
    public void K() {
        this.d.f();
    }

    @Override // defpackage.chal, defpackage.cgwg
    public Boolean M() {
        return this.d.j();
    }

    @Override // defpackage.chal, defpackage.cgwg
    public cqkl N() {
        this.d.f();
        return cqkl.a;
    }

    @Override // defpackage.cgym
    public void a() {
        cgyu cgyuVar = this.d;
        ilo c = this.k.c();
        dbsk.s(c);
        cgyuVar.l(c.al());
        this.d.m(new bokf());
        cqkx.p(this.d);
        cqkx.p(this);
    }

    @Override // defpackage.cgym
    @dzsi
    public dnet c() {
        byee a;
        if (this.d.a().u().booleanValue()) {
            a = bonk.d(this.d.a().h(), "GMT");
        } else {
            a = bonk.a(this.d.a().g(), "GMT");
        }
        dgsl c = a.c();
        if (c == null || c.a.size() <= 0) {
            if (!this.d.e().booleanValue()) {
                return null;
            }
            dner bZ = dnet.h.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnet dnetVar = (dnet) bZ.b;
            int i = dnetVar.a | 1;
            dnetVar.a = i;
            dnetVar.b = 13;
            dnetVar.a = i | 16;
            dnetVar.f = "Uploading business hours photo(s).";
            return bZ.bK();
        }
        dner bZ2 = dnet.h.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnet dnetVar2 = (dnet) bZ2.b;
        dnetVar2.a |= 1;
        dnetVar2.b = 8;
        dneu bZ3 = dnfe.p.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnfe dnfeVar = (dnfe) bZ3.b;
        c.getClass();
        dnfeVar.l = c;
        dnfeVar.a |= 2048;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnet dnetVar3 = (dnet) bZ2.b;
        dnfe bK = bZ3.bK();
        bK.getClass();
        dnetVar3.d = bK;
        dnetVar3.a |= 4;
        return bZ2.bK();
    }

    @Override // defpackage.cgym
    protected final int d() {
        return 8;
    }

    @Override // defpackage.cgwg
    @dzsi
    /* renamed from: e */
    public bosj D() {
        byee a;
        ilo c = this.k.c();
        bokf bokfVar = null;
        if (!C().booleanValue() || c == null) {
            return null;
        }
        bond bondVar = this.d.a;
        if (bondVar != null) {
            bokfVar = bondVar.o();
        }
        bosi j = bosj.j();
        j.d(c.n());
        j.f(c.aT());
        if (this.d.a().u().booleanValue()) {
            a = bonk.d(this.d.a().h(), c.aT());
        } else {
            a = bonk.a(this.d.a().g(), c.aT());
        }
        ((bosg) j).a = a;
        if (bokfVar == null) {
            bokfVar = new bokf();
        }
        j.b(bokfVar);
        return j.a();
    }

    @Override // defpackage.cgvw
    public cqtd f() {
        return cqrt.f(2131231600);
    }

    @Override // defpackage.cgvw
    public String g() {
        return this.c.getString(R.string.BUSINESS_HOURS);
    }

    public void h(List<bbtm> list) {
        this.d.n(list);
        z(!this.d.c().booleanValue());
        cqkx.p(this.d);
    }

    public void i(bosj bosjVar) {
        this.d.m(bosjVar.d());
        byee b = bosjVar.b();
        if (b != null) {
            this.d.l(b);
        }
        z(!this.d.c().booleanValue());
        cqkx.p(this.d);
    }

    @Override // defpackage.cgvw
    public String j() {
        return this.c.getString(R.string.UGC_TASKS_SUGGEST_EDIT_BUSINESS_HOURS_DESCRIPTION);
    }

    @Override // defpackage.cgvw
    public cqkp k() {
        return this.d;
    }

    @Override // defpackage.cgvw
    public void l(List<dnet> list, Map<dqgh, cgvw> map) {
        dnet m = m();
        if (m != null) {
            list.add(m);
            int i = m.b;
            if (i == 8) {
                map.put(dqgh.BUSINESS_HOURS, this);
            } else if (i != 13) {
            } else {
                map.put(dqgh.OTHER, this);
            }
        }
    }

    @Override // defpackage.cgvw
    public void n(dneq dneqVar) {
    }

    @Override // defpackage.cgvw
    public Integer o() {
        bopv b = this.d.b();
        if (b != null) {
            return b.p();
        }
        return 0;
    }

    @Override // defpackage.cgvw
    @dzsi
    public List<bbtm> p() {
        if (this.d.e().booleanValue()) {
            return this.d.o();
        }
        return null;
    }

    @Override // defpackage.cgvw
    @dzsi
    public String q() {
        return "business_hours_photo";
    }

    @Override // defpackage.cgym, defpackage.chal, defpackage.cgwg
    public void u(cgwf cgwfVar) {
        super.u(cgwfVar);
        this.d.k(cgwfVar != cgwf.EDITABLE);
    }

    @Override // defpackage.cgwg
    public void y(cqiv cqivVar) {
        cqivVar.a(new cgjs(), this);
    }
}
