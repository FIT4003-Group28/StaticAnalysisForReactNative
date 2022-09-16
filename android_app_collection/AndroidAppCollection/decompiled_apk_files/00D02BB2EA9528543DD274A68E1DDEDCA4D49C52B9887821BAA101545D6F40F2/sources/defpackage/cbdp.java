package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cbdp  reason: default package */
/* loaded from: classes4.dex */
public class cbdp implements cbri {
    public final bwqv a;
    public final ges b;
    public final cqhn c;
    public final dxio<bbut> d;
    public final bbtk e;
    public final akfa f;
    public final dxio<bbul> g;
    public final aajk h;
    public final String j;
    @dzsi
    public cbrf o;
    @dzsi
    public dive p;
    private final gga r;
    private final dxio<bdhl> s;
    private final cayn t;
    private final cbre u;
    private boolean v;
    @dzsi
    public ilo i = null;
    public dcdn<String, String> m = dcmn.a;
    public List<bbtm> k = dcdc.e();
    public List<cbrf> n = dcdc.e();
    public Set<String> l = dcmr.a;

    public cbdp(ges gesVar, String str, cbre cbreVar, bwqv bwqvVar, gga ggaVar, cqhn cqhnVar, dxio<bbut> dxioVar, dxio<bdhl> dxioVar2, bbtk bbtkVar, akfa akfaVar, dxio<bbul> dxioVar3, aajk aajkVar, cayn caynVar) {
        this.a = bwqvVar;
        this.b = gesVar;
        this.r = ggaVar;
        this.c = cqhnVar;
        this.d = dxioVar;
        this.e = bbtkVar;
        this.s = dxioVar2;
        this.f = akfaVar;
        this.g = dxioVar3;
        this.h = aajkVar;
        this.j = str;
        this.u = cbreVar;
        this.t = caynVar;
    }

    @Override // defpackage.cbri
    public List<cbrf> a() {
        return this.n;
    }

    @Override // defpackage.cbri
    @dzsi
    public cbrf b() {
        if (!this.n.isEmpty()) {
            return this.n.get(0);
        }
        return null;
    }

    @Override // defpackage.cbri
    public cqkl c() {
        this.t.a(cbnv.a);
        ilo iloVar = this.i;
        if (iloVar == null || iloVar.ai().equals(akqi.a)) {
            bbuz m = bbve.m();
            m.b(bbuy.POP_OUT_OF_PHOTO_UPLOAD_FLOW);
            m.e(dwyd.EVENTS_UGC);
            this.d.a().k(m.a(), this.b);
        } else {
            ges gesVar = this.b;
            bdhe k = bdhg.k();
            ilo iloVar2 = this.i;
            dbsk.s(iloVar2);
            k.c(iloVar2.ai().o());
            k.g(this.r.getString(R.string.UGC_EVENTS_ADD_PHOTOS));
            k.f(this.u.a());
            bdhb bdhbVar = (bdhb) k;
            bdhbVar.d = 4;
            gga ggaVar = this.r;
            ilo iloVar3 = this.i;
            dbsk.s(iloVar3);
            bdhbVar.c = ggaVar.getString(R.string.SUGGEST_PHOTO_FROM_A_PLACE, new Object[]{iloVar3.n()});
            this.s.a().e(gesVar, k.a());
        }
        return cqkl.a;
    }

    @Override // defpackage.cbri
    public cjtd d() {
        return cjtd.a(dtyd.a);
    }

    public void e() {
        cbrf cbrfVar = this.o;
        if (cbrfVar != null) {
            g(cbrfVar);
            this.o = null;
            this.v = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(Map<String, String> map) {
        dcdg p = dcdn.p();
        p.c(this.m);
        dccx F = dcdc.F();
        F.i(this.n);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!this.l.contains(entry.getKey()) && !this.m.containsKey(entry.getKey())) {
                p.g(entry);
                F.g(new cbcr(entry.getValue(), null, new cqkn(this) { // from class: cbdn
                    private final cbdp a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.cqkn
                    public final void a(cqkp cqkpVar, View view) {
                        this.a.g((cbrf) cqkpVar);
                    }
                }));
            }
        }
        this.m = p.b();
        this.n = F.f();
        cqkx.p(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(cbrf cbrfVar) {
        this.t.a(cbnv.a);
        String a = cbrfVar.a();
        dcdg p = dcdn.p();
        dcpd<Map.Entry<String, String>> it = this.m.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            if (!next.getValue().equals(a)) {
                p.g(next);
            }
        }
        this.m = p.b();
        dccx F = dcdc.F();
        for (bbtm bbtmVar : this.k) {
            if (!bbtmVar.a().equals(a)) {
                F.g(bbtmVar);
            }
        }
        this.k = F.f();
        dccx F2 = dcdc.F();
        for (cbrf cbrfVar2 : this.n) {
            if (!cbrfVar2.a().equals(a)) {
                F2.g(cbrfVar2);
            }
        }
        dive diveVar = this.p;
        if (diveVar != null) {
            dsqp dsqpVar = (dsqp) diveVar.cu(5);
            dsqpVar.bC(diveVar);
            divd divdVar = (divd) dsqpVar;
            if (divdVar.c) {
                divdVar.bF();
                divdVar.c = false;
            }
            ((dive) divdVar.b).a = dive.ck();
            for (dwfl dwflVar : diveVar.a) {
                if (!dwflVar.h.equals(a)) {
                    if (divdVar.c) {
                        divdVar.bF();
                        divdVar.c = false;
                    }
                    dive diveVar2 = (dive) divdVar.b;
                    dwflVar.getClass();
                    dsrj<dwfl> dsrjVar = diveVar2.a;
                    if (!dsrjVar.a()) {
                        diveVar2.a = dsqw.cl(dsrjVar);
                    }
                    diveVar2.a.add(dwflVar);
                }
            }
            this.p = divdVar.bK();
        }
        this.n = F2.f();
        cqkx.p(this);
    }

    @Override // defpackage.cbrp
    public Boolean j() {
        boolean z = true;
        if (this.n.isEmpty() && this.k.isEmpty() && !this.v) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
