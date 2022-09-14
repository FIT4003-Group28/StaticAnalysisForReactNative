package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cgwz  reason: default package */
/* loaded from: classes4.dex */
public class cgwz extends cgym implements bxeq {
    private final Activity c;
    private final cgys d;

    public cgwz(Activity activity, cgsk cgskVar, bwrs<ilo> bwrsVar, List<dwrg> list, dwql dwqlVar, chak chakVar, bwqv bwqvVar, ges gesVar, cgum cgumVar) {
        super(activity.getResources(), cgskVar, bwrsVar, list, dwqlVar, chakVar, cgumVar);
        this.c = activity;
        this.d = new cgys(gesVar, dtyd.V, activity.getString(R.string.UGC_TASKS_SUGGEST_EDIT_CATEGORY_PLACEHOLDER), bwqvVar, new cgwy(this));
    }

    @Override // defpackage.chal, defpackage.cgwg
    public Boolean C() {
        dnfw RF = this.d.RF();
        boolean z = false;
        if (RF != null && !RF.equals(dnfw.d)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgwg
    public void E(Object obj) {
        dbsk.a(obj instanceof ArrayList);
        ArrayList arrayList = (ArrayList) obj;
        Object obj2 = arrayList.get(0);
        Object obj3 = arrayList.get(1);
        dbsk.a(obj2 instanceof String);
        dbsk.a(obj3 instanceof String);
        cgys cgysVar = this.d;
        dnfv bZ = dnfw.d.bZ();
        dbsk.s(obj2);
        String str = (String) obj2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnfw dnfwVar = (dnfw) bZ.b;
        str.getClass();
        dnfwVar.a |= 2;
        dnfwVar.c = str;
        dbsk.s(obj3);
        String str2 = (String) obj3;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnfw dnfwVar2 = (dnfw) bZ.b;
        str2.getClass();
        dnfwVar2.a |= 1;
        dnfwVar2.b = str2;
        cgysVar.b(bZ.bK());
    }

    @Override // defpackage.chal, defpackage.cgwg
    public Boolean J() {
        return true;
    }

    @Override // defpackage.cgwg
    public void K() {
        this.d.a();
    }

    @Override // defpackage.bxeq
    public void Pf(dwjb dwjbVar, dnqh dnqhVar) {
    }

    @Override // defpackage.cgym
    public void a() {
        this.d.b(dnfw.d);
        cqkx.p(this.d);
        cqkx.p(this);
    }

    @Override // defpackage.bxeq
    public void aK() {
    }

    @Override // defpackage.bxeq
    public void aL(String str) {
    }

    @Override // defpackage.bxeq
    public void aM(bxmh bxmhVar, List list) {
    }

    @Override // defpackage.bxeq
    public boolean aN() {
        return false;
    }

    @Override // defpackage.cgym
    @dzsi
    public dnet c() {
        dnfw RF = this.d.RF();
        if (RF != null) {
            dner bZ = dnet.h.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnet dnetVar = (dnet) bZ.b;
            dnetVar.a |= 1;
            dnetVar.b = 14;
            dneu bZ2 = dnfe.p.bZ();
            String str = RF.b;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnfe dnfeVar = (dnfe) bZ2.b;
            str.getClass();
            dnfeVar.a |= 2;
            dnfeVar.c = str;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnet dnetVar2 = (dnet) bZ.b;
            dnfe bK = bZ2.bK();
            bK.getClass();
            dnetVar2.d = bK;
            dnetVar2.a |= 4;
            return bZ.bK();
        }
        return null;
    }

    @Override // defpackage.cgym
    protected final int d() {
        return 14;
    }

    @Override // defpackage.cgwg
    @dzsi
    /* renamed from: e */
    public ArrayList<String> D() {
        dnfw RF = this.d.RF();
        if (RF == null || RF.equals(dnfw.d)) {
            return null;
        }
        return new ArrayList<>(Arrays.asList(RF.c, RF.b));
    }

    @Override // defpackage.cgvw
    public cqtd f() {
        return cqrt.f(2131231599);
    }

    @Override // defpackage.cgvw
    public String g() {
        return this.c.getString(R.string.RMI_CATEGORY_TITLE);
    }

    @Override // defpackage.bxeq
    public void h(bxmh bxmhVar, @dzsi bxmh bxmhVar2, dnqh dnqhVar, @dzsi bxkv bxkvVar, cjqm cjqmVar) {
        this.l.H(null);
        dnfv bZ = dnfw.d.bZ();
        String str = bxmhVar.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnfw dnfwVar = (dnfw) bZ.b;
        str.getClass();
        dnfwVar.a |= 1;
        dnfwVar.b = str;
        dwjj dwjjVar = bxmhVar.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        String str2 = dxbpVar.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnfw dnfwVar2 = (dnfw) bZ.b;
        str2.getClass();
        dnfwVar2.a |= 2;
        dnfwVar2.c = str2;
        this.d.b(bZ.bK());
        z(true);
    }

    @Override // defpackage.bxeq
    public void i(String str, dnqh dnqhVar) {
    }

    @Override // defpackage.cgvw
    public String j() {
        return this.c.getString(R.string.UGC_TASKS_SUGGEST_EDIT_CATEGORY_DESCRIPTION);
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
            map.put(dqgh.CATEGORY, this);
        }
    }

    @Override // defpackage.cgvw
    public void n(dneq dneqVar) {
        int a = dneo.a(dneqVar.b);
        if (a != 0 && a == 2) {
            this.d.d(true);
            this.d.e(this.c.getString(R.string.RAP_INVALID_CATEGORY));
            cqkx.p(this.d);
        }
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

    @Override // defpackage.cgym, defpackage.chal, defpackage.cgwg
    public void u(cgwf cgwfVar) {
        super.u(cgwfVar);
        this.d.r(cgwfVar != cgwf.EDITABLE);
    }

    @Override // defpackage.cgwg
    public void y(cqiv cqivVar) {
        cqivVar.a(new cgjs(), this);
    }
}
