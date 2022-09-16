package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: aaxn  reason: default package */
/* loaded from: classes2.dex */
public class aaxn implements aawr {
    private final Activity a;
    private final ahjq b;
    private final bvsl c;
    private final begg d;
    private final jkf e;
    private final aahf f;
    private final abbl g;
    @dzsi
    private jic h;
    @dzsi
    private Integer j;
    @dzsi
    private Float k;
    private boolean q;
    private String i = "";
    private String l = "";
    private String m = "";
    private String n = "";
    private String o = "";
    private String p = "";
    private String r = "";

    public aaxn(Activity activity, ahjq ahjqVar, bvsl bvslVar, begg beggVar, jkf jkfVar, abbl abblVar, aahf aahfVar) {
        this.a = activity;
        this.b = ahjqVar;
        this.c = bvslVar;
        this.d = beggVar;
        this.e = jkfVar;
        this.g = abblVar;
        this.f = aahfVar;
    }

    private final void s(jjn jjnVar) {
        if (dbsj.d(this.i)) {
            return;
        }
        ily ilyVar = new ily();
        ilyVar.k(this.i);
        dvyx bZ = dvyy.e.bZ();
        Float f = this.k;
        if (f != null) {
            float floatValue = f.floatValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvyy dvyyVar = (dvyy) bZ.b;
            dvyyVar.a |= 1;
            dvyyVar.b = floatValue;
        }
        Integer num = this.j;
        if (num != null) {
            int intValue = num.intValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvyy dvyyVar2 = (dvyy) bZ.b;
            dvyyVar2.a |= 16;
            dvyyVar2.d = intValue;
        }
        ilyVar.F(this.l);
        dvya bZ2 = dvyw.bv.bZ();
        bZ2.c(this.n);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvyw dvywVar = (dvyw) bZ2.b;
        dvyy bK = bZ.bK();
        bK.getClass();
        dvywVar.aT = bK;
        dvywVar.c |= 1073741824;
        ilyVar.E(bZ2.bK());
        begg beggVar = this.d;
        begj begjVar = new begj();
        begjVar.b(ilyVar.d());
        begjVar.n = true;
        begjVar.c = jjnVar;
        beggVar.o(begjVar, false, null);
    }

    @Override // defpackage.aawr
    public cqkl a() {
        if (this.q) {
            s(jjn.COLLAPSED);
        } else {
            this.e.w();
            this.g.e();
        }
        return cqkl.a;
    }

    @Override // defpackage.aawr
    public cqkl b() {
        s(jjn.EXPANDED);
        return cqkl.a;
    }

    @Override // defpackage.aakt
    public Boolean c() {
        return Boolean.valueOf(this.h != null);
    }

    @Override // defpackage.aawr
    @dzsi
    public jic d() {
        return this.h;
    }

    @Override // defpackage.aawr
    public String e() {
        return this.l;
    }

    @Override // defpackage.aawr
    public String f() {
        return this.k != null ? String.format(Locale.getDefault(), "%.1f", this.k) : "";
    }

    @Override // defpackage.aawr
    @dzsi
    public Float g() {
        return this.k;
    }

    @Override // defpackage.aawr
    public String h() {
        return this.m;
    }

    @Override // defpackage.aawr
    public String i() {
        return this.n;
    }

    @Override // defpackage.aawr
    public Boolean j() {
        return this.f.a();
    }

    @Override // defpackage.aawr
    public cqkl k() {
        this.f.b();
        return cqkl.a;
    }

    @Override // defpackage.aawr
    public Boolean l() {
        return Boolean.valueOf(this.q);
    }

    @Override // defpackage.aawr
    public String m() {
        return this.o;
    }

    @Override // defpackage.aawr
    public String n() {
        return this.p;
    }

    @Override // defpackage.aawr
    public cjtd o() {
        cjta b = cjtd.b();
        b.d = dtxo.bM;
        if (!this.r.isEmpty()) {
            b.g(this.r);
        }
        return b.a();
    }

    @Override // defpackage.aawr
    public cjtd p() {
        cjta b = cjtd.b();
        b.d = dtxo.bK;
        if (!this.r.isEmpty()) {
            b.g(this.r);
        }
        return b.a();
    }

    @Override // defpackage.aawr
    public cjtd q() {
        cjta b = cjtd.b();
        b.d = dtxo.bL;
        if (!this.r.isEmpty()) {
            b.g(this.r);
        }
        return b.a();
    }

    public void r(diwb diwbVar) {
        String string;
        String str = diwbVar.K;
        this.h = dbsj.d(str) ? null : new jic(str, ckqc.FULLY_QUALIFIED, 0, 0);
        divc divcVar = diwbVar.L;
        if (divcVar == null) {
            divcVar = divc.c;
        }
        dsrj<diuy> dsrjVar = divcVar.a;
        if (!dsrjVar.isEmpty()) {
            this.o = this.a.getResources().getQuantityString(R.plurals.EXPERIENCE_SHEET_MAP_ATTRIBUTION_SOURCE, dsrjVar.size(), TextUtils.join(", ", dcbg.b(dsrjVar).s(aaxm.a)));
        }
        divc divcVar2 = diwbVar.L;
        if (divcVar2 == null) {
            divcVar2 = divc.c;
        }
        dsrj<diva> dsrjVar2 = divcVar2.b;
        this.p = dsrjVar2.isEmpty() ? "" : dsrjVar2.get(0).a;
        this.q = diwbVar.x.size() == 1 && !aahv.c(diwbVar).isEmpty();
        this.l = aahv.a(diwbVar);
        this.i = aahv.c(diwbVar);
        if (diwbVar.x.size() <= 0) {
            this.k = null;
            this.j = null;
            this.m = "";
        } else {
            dvyy dvyyVar = diwbVar.x.get(0).c;
            if (dvyyVar == null) {
                dvyyVar = dvyy.e;
            }
            int i = dvyyVar.a & 1;
            this.k = i != 0 ? Float.valueOf(dvyyVar.b) : null;
            if ((dvyyVar.a & 16) != 0) {
                Integer valueOf = Integer.valueOf(dvyyVar.d);
                this.j = valueOf;
                int intValue = valueOf.intValue();
                int i2 = 1 != i ? R.plurals.REVIEW_COUNT_LONG : R.plurals.REVIEW_COUNT_SHORT;
                if (intValue > 0) {
                    string = this.a.getResources().getQuantityString(i2, intValue, Integer.valueOf(intValue));
                } else {
                    string = this.a.getString(R.string.REVIEW_COUNT_ZERO);
                }
                this.m = string;
            } else {
                this.j = null;
                this.m = "";
            }
        }
        ArrayList a = dchl.a();
        if (diwbVar.x.size() > 0) {
            String str2 = diwbVar.x.get(0).d;
            if (!dbsj.d(str2)) {
                a.add(str2);
            }
            dvyy dvyyVar2 = diwbVar.x.get(0).c;
            if (dvyyVar2 == null) {
                dvyyVar2 = dvyy.e;
            }
            String str3 = dvyyVar2.c;
            if (!dbsj.d(str3)) {
                a.add(str3);
            }
        }
        ditt dittVar = diwbVar.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        if ((dittVar.a & 1024) != 0) {
            GmmLocation a2 = this.b.a();
            ditt dittVar2 = diwbVar.e;
            if (dittVar2 == null) {
                dittVar2 = ditt.n;
            }
            dpum dpumVar = dittVar2.l;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            String a3 = isl.a(a2, akqq.f(dpumVar), this.c);
            if (!dbsj.d(a3)) {
                a.add(a3);
            }
        }
        if (a.isEmpty()) {
            this.n = "";
        } else {
            this.n = dbrz.e(" · ").g(a);
        }
        this.f.d(diwbVar);
        ditt dittVar3 = diwbVar.e;
        if (dittVar3 == null) {
            dittVar3 = ditt.n;
        }
        this.r = dittVar3.b;
    }
}
