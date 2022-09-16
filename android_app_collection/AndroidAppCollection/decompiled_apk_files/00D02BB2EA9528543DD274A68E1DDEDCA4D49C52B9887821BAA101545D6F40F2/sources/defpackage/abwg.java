package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abwg  reason: default package */
/* loaded from: classes.dex */
public class abwg implements abrd {
    @dzsi
    private final acwt a;
    private final dxio<brba> c;
    private final abwe d;
    private final absg e;
    private final abuo i;
    private final List<abms> b = new ArrayList();
    private String g = "";
    private String h = "";
    private final cjta f = cjtd.b();

    public abwg(abuo abuoVar, dxio dxioVar, abwf abwfVar, acwt acwtVar, absg absgVar) {
        this.i = abuoVar;
        this.a = acwtVar;
        this.c = dxioVar;
        bnjv a = abwfVar.a.a();
        abwf.a(a, 1);
        dxio a2 = ((dxjh) abwfVar.b).a();
        abwf.a(a2, 2);
        Activity activity = (Activity) ((dxjd) abwfVar.c).a;
        abwf.a(activity, 3);
        bvpe a3 = abwfVar.d.a();
        abwf.a(a3, 4);
        huc a4 = abwfVar.e.a();
        abwf.a(a4, 5);
        ahjq a5 = abwfVar.f.a();
        abwf.a(a5, 6);
        bvsl a6 = abwfVar.g.a();
        abwf.a(a6, 7);
        abwb a7 = abwfVar.h.a();
        abwf.a(a7, 8);
        abwf.a(absgVar, 10);
        this.d = new abwe(a, a2, activity, a3, a4, a5, a6, a7, acwtVar, absgVar);
        this.e = absgVar;
        l(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dpvg j(String str) {
        dpvd bZ = dpvg.d.bZ();
        dpvf dpvfVar = dpvf.ICONIC_PLACES;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpvg dpvgVar = (dpvg) bZ.b;
        dpvgVar.b = dpvfVar.an;
        int i = dpvgVar.a | 1;
        dpvgVar.a = i;
        str.getClass();
        dpvgVar.a = i | 2;
        dpvgVar.c = str;
        return bZ.bK();
    }

    private final void k(cjqm cjqmVar) {
        this.a.a();
        brba a = this.c.a();
        dpvg j = j(this.h);
        dnqg bZ = dnqh.p.bZ();
        String b = cjqmVar.a().b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        b.getClass();
        dnqhVar.a |= 2;
        dnqhVar.c = b;
        a.n(j, bZ.bK());
    }

    private final void l(@dzsi djrm djrmVar) {
        if (djrmVar != null) {
            this.g = djrmVar.b;
            this.h = djrmVar.n;
            this.f.g(djrmVar.q);
            this.b.clear();
            this.d.k(djrmVar.e, djrmVar.f, djrmVar.n);
            for (dvyw dvywVar : djrmVar.e) {
                int i = dvywVar.a;
                if ((i & 1) != 0 || (i & 4) != 0) {
                    this.b.add(this.i.b(dvywVar, this.a, this.e == absg.AREA_EXPLORE ? dtxj.cY : dtxr.aV));
                }
            }
            return;
        }
        this.g = "";
        this.h = "";
        this.f.g(null);
        this.d.k(new ArrayList(), 0, this.h);
        this.b.clear();
    }

    @Override // defpackage.abrd
    public Boolean a(@dzsi djrm djrmVar) {
        l(djrmVar);
        cqkx.p(this);
        return true;
    }

    @Override // defpackage.abrd
    @dzsi
    public String b() {
        return this.g;
    }

    @Override // defpackage.abrd
    public List<abms> c() {
        return this.b;
    }

    @Override // defpackage.abrd
    public cjtd d() {
        return this.f.b(this.e == absg.AREA_EXPLORE ? dtxj.cX : dtxr.aU);
    }

    @Override // defpackage.abrd
    public cqkl e(cjqm cjqmVar) {
        k(cjqmVar);
        return cqkl.a;
    }

    @Override // defpackage.abrd
    public cjtd f() {
        return this.f.b(dtxr.aW);
    }

    @Override // defpackage.abrd
    public cqkl g(cjqm cjqmVar) {
        k(cjqmVar);
        return cqkl.a;
    }

    @Override // defpackage.abrd
    /* renamed from: i */
    public abwe h() {
        return this.d;
    }
}
