package defpackage;

import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import java.util.List;
/* compiled from: PG */
/* renamed from: cfsn  reason: default package */
/* loaded from: classes4.dex */
public class cfsn implements cfsm {
    private dcdc<cfta> a = dcdc.e();
    private dcdc<cfta> b = dcdc.e();
    private String c = "";
    private String d = "";
    private final cfsc e;
    private final cfum f;
    private final cfse g;
    private final cftf h;
    private final cfta i;
    private final cfta j;
    private final cfta k;
    private final cfta l;
    private final cfta m;
    private final cgcv n;

    public cfsn(cfsc cfscVar, cfum cfumVar, cfse cfseVar, cftf cftfVar, cfue cfueVar, cgcv cgcvVar, Runnable runnable) {
        this.e = cfscVar;
        this.f = cfumVar;
        this.g = cfseVar;
        this.h = cftfVar;
        dxio a = ((dxjh) cfscVar.a).a();
        cfsc.b(a, 1);
        akzh a2 = cfscVar.b.a();
        cfsc.b(a2, 2);
        Resources a3 = cfscVar.c.a();
        cfsc.b(a3, 3);
        this.i = new cfsb(a, a2, a3);
        cftt a4 = cfumVar.a.a();
        cfum.b(a4, 1);
        dxio a5 = ((dxjh) cfumVar.b).a();
        cfum.b(a5, 2);
        dxio a6 = ((dxjh) cfumVar.c).a();
        cfum.b(a6, 3);
        Resources a7 = cfumVar.d.a();
        cfum.b(a7, 4);
        this.j = new cful(a4, a5, a6, a7);
        dxio a8 = ((dxjh) cfseVar.a).a();
        cfse.b(a8, 1);
        Resources a9 = cfseVar.b.a();
        cfse.b(a9, 2);
        this.k = new cfsd(a8, a9);
        dxio a10 = ((dxjh) cftfVar.a).a();
        cftf.b(a10, 1);
        Resources a11 = cftfVar.b.a();
        cftf.b(a11, 2);
        this.l = new cfte(a10, a11);
        this.m = new cfud(runnable);
        this.n = cgcvVar;
    }

    @Override // defpackage.cfsm
    public cfta a() {
        return this.k;
    }

    @Override // defpackage.cfsm
    public cfta b() {
        return this.l;
    }

    @Override // defpackage.cfsm
    public cfta c() {
        return this.i;
    }

    @Override // defpackage.cfsm
    public cfta d() {
        return this.j;
    }

    @Override // defpackage.cfsm
    public cfta e() {
        return this.m;
    }

    @Override // defpackage.cfsm
    public List<cfta> f() {
        return this.a;
    }

    @Override // defpackage.cfsm
    public List<cfta> g() {
        return this.b;
    }

    @Override // defpackage.cfsm
    public void h(cgbt cgbtVar) {
        dccx dccxVar = new dccx();
        for (cgbs cgbsVar : cgbtVar.a) {
            String str = cgbsVar.c;
            String obj = Html.fromHtml(cgbsVar.d).toString();
            int a = cgbp.a(cgbsVar.b);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                dccxVar.g(this.h.a(str, obj));
            } else if (i == 2) {
                dccxVar.g(this.g.a(str, obj));
            } else if (i == 3) {
                dccxVar.g(this.f.a(str, obj));
            } else if (i == 4) {
                dccxVar.g(this.e.a(str, obj));
            }
        }
        this.a = dccxVar.f();
    }

    @Override // defpackage.cfsm
    public void i(cgcg cgcgVar) {
        this.c = cgcgVar.b;
        this.d = cgcgVar.c;
        dccx dccxVar = new dccx();
        for (cgcf cgcfVar : cgcgVar.d) {
            Spanned fromHtml = Html.fromHtml(cgcfVar.c);
            int a = cgbp.a(cgcfVar.b);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                dccxVar.g(this.h.a("", fromHtml));
            } else if (i == 2) {
                dccxVar.g(this.g.a("", fromHtml));
            } else if (i == 3) {
                dccxVar.g(this.f.a("", fromHtml));
            } else if (i == 4) {
                dccxVar.g(this.e.a("", fromHtml));
            }
        }
        this.b = dccxVar.f();
    }

    @Override // defpackage.cfsm
    public String j() {
        return this.c;
    }

    @Override // defpackage.cfsm
    public String k() {
        return this.d;
    }

    @Override // defpackage.cfsm
    public Boolean l() {
        return Boolean.valueOf(this.n.a());
    }
}
