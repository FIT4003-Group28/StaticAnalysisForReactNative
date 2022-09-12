package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: chbo  reason: default package */
/* loaded from: classes4.dex */
public class chbo extends cgym {
    private final Activity c;
    private final chai d;

    public chbo(Activity activity, cgsk cgskVar, bwrs<ilo> bwrsVar, List<dwrg> list, dwql dwqlVar, chak chakVar, cjqy cjqyVar, cgum cgumVar) {
        super(activity.getResources(), cgskVar, bwrsVar, list, dwqlVar, chakVar, cgumVar);
        this.c = activity;
        this.d = new chai(activity, activity.getString(R.string.UGC_TASKS_SUGGEST_EDIT_PHONE_PLACEHOLDER), 3, dtyd.Z, this.m, true, cqjg.a(), true, new chbn(this), cjqyVar, true, 1);
    }

    @Override // defpackage.cgwg
    public void E(Object obj) {
        dbsk.a(obj instanceof String);
        this.d.s().a((String) obj);
        cqkx.p(this);
    }

    @Override // defpackage.cgwg
    public void K() {
        this.d.v(true);
    }

    @Override // defpackage.cgym
    public void a() {
        this.d.z();
        cqkx.p(this.d);
        cqkx.p(this);
    }

    @Override // defpackage.cgym
    @dzsi
    public dnet c() {
        if (!this.d.l().booleanValue()) {
            return null;
        }
        String trim = this.d.m().trim();
        dner bZ = dnet.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnet dnetVar = (dnet) bZ.b;
        dnetVar.a |= 1;
        dnetVar.b = 3;
        dneu bZ2 = dnfe.p.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnfe dnfeVar = (dnfe) bZ2.b;
        trim.getClass();
        dnfeVar.a |= 2;
        dnfeVar.c = trim;
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

    @Override // defpackage.cgym
    protected final int d() {
        return 3;
    }

    @Override // defpackage.cgwg
    @dzsi
    /* renamed from: e */
    public String D() {
        if (this.d.l().booleanValue()) {
            return this.d.m();
        }
        return null;
    }

    @Override // defpackage.cgvw
    public cqtd f() {
        return cqrt.f(2131231713);
    }

    @Override // defpackage.cgvw
    public String g() {
        return this.c.getString(R.string.PLACE_PHONE);
    }

    @Override // defpackage.cgvw
    public String j() {
        return this.c.getString(R.string.UGC_TASKS_SUGGEST_EDIT_PHONE_DESCRIPTION);
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
            map.put(dqgh.PHONE_NUMBER, this);
        }
    }

    @Override // defpackage.cgvw
    public void n(dneq dneqVar) {
        int a = dneo.a(dneqVar.b);
        if (a != 0 && a == 2) {
            this.d.x(true);
            this.d.y(this.c.getString(R.string.RAP_INVALID_PHONE));
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

    @Override // defpackage.cgym, defpackage.chal, defpackage.cgwg
    public void u(cgwf cgwfVar) {
        super.u(cgwfVar);
        this.d.a(cgwfVar != cgwf.EDITABLE);
        cqkx.p(this.d);
    }

    @Override // defpackage.cgwg
    public void y(cqiv cqivVar) {
        cqivVar.a(new cgjs(), this);
    }
}
