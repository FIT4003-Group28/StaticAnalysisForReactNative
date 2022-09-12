package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: beqd  reason: default package */
/* loaded from: classes3.dex */
public class beqd implements bega, bnil {
    private static final dcqe a = dcqe.c("beqd");
    private final Activity b;
    private final Resources c;
    private final dxio<beqb> d;
    private final dxio<akfa> e;
    private final dxio<afha> f;
    private final btvo g;
    private cjtd h = cjtd.b;
    private boolean i;
    @dzsi
    private String j;
    @dzsi
    private String k;
    @dzsi
    private String l;
    @dzsi
    private acpa m;

    public beqd(Activity activity, btvo btvoVar, dxio<beqb> dxioVar, dxio<afha> dxioVar2, dxio<akfa> dxioVar3) {
        this.b = activity;
        this.c = activity.getResources();
        this.d = dxioVar;
        this.f = dxioVar2;
        this.e = dxioVar3;
        this.g = btvoVar;
    }

    private final boolean b() {
        String str = this.k;
        dbsk.s(str);
        return str.contains("sitemanager");
    }

    private final boolean c() {
        btlu j = this.e.a().j();
        return j != null && btlu.i(j).equals(btlt.GOOGLE) && j.u();
    }

    @Override // defpackage.bnil
    @dzsi
    public acpa a() {
        return this.m;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        return cqrt.g(2131232966, ibm.x());
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        String str = "1";
        if (!this.g.getMerchantParameters().e || this.l == null || b() || !c()) {
            String str2 = this.k;
            dbsk.s(str2);
            debv a2 = debv.a(str2);
            debx b = a2.b();
            if (true != c()) {
                str = "0";
            }
            b.n("lis", str);
            this.f.a().k(this.b, a2.toString(), 1);
        } else {
            String str3 = this.l;
            dbsk.s(str3);
            debv a3 = debv.a(str3);
            a3.b().n("lis", str);
            this.d.a().e(a3.toString());
        }
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    @dzsi
    public cjtd h() {
        return this.h;
    }

    @Override // defpackage.jbf
    @dzsi
    public CharSequence l() {
        return m();
    }

    @Override // defpackage.jbi
    @dzsi
    public CharSequence m() {
        return this.j;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        boolean z = false;
        if (bwrsVar == null) {
            bvoo.h("placemarkRef shouldn't be null.", new Object[0]);
            return;
        }
        ilo c = bwrsVar.c();
        if (c == null) {
            bvoo.h("placemark shouldn't be null.", new Object[0]);
            return;
        }
        if ((c.bf().a & 4194304) != 0) {
            z = true;
        }
        this.i = z;
        dnpq dnpqVar = c.bf().t;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        this.k = dnpqVar.c;
        if ((c.bf().a & 8388608) != 0) {
            dnpq dnpqVar2 = c.bf().u;
            if (dnpqVar2 == null) {
                dnpqVar2 = dnpq.g;
            }
            this.l = dnpqVar2.c;
        }
        if (b()) {
            this.j = this.c.getString(R.string.MANAGE_LOCATION_PROMPT);
            this.m = new acpc(this.c.getString(R.string.MANAGE_LOCATION_TOOLTIP), this.c.getString(R.string.MANAGE_LOCATION_TOOLTIP_BUTTON_CLICK));
            cjta c2 = cjtd.c(c.a());
            c2.d = dtxy.jO;
            this.h = c2.a();
            return;
        }
        this.j = this.c.getString(R.string.CLAIM_BUSINESS_PROMPT);
        cjta c3 = cjtd.c(c.a());
        c3.d = dtxy.kG;
        this.h = c3.a();
    }

    @Override // defpackage.bega
    public void u() {
        this.h = cjtd.b;
        this.i = false;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.i);
    }
}
