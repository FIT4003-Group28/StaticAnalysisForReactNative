package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: bhmp  reason: default package */
/* loaded from: classes3.dex */
public class bhmp implements bhmi {
    public final dxio<qbt> a;
    public final qcz b;
    private final vtn c;
    private final String d;
    private final zcq e;
    private final acli f;
    private final String g;
    private final dcep<xii> h;
    @dzsi
    private String i;
    @dzsi
    private String j;

    public bhmp(Activity activity, cqhn cqhnVar, vtn vtnVar, dxio<qbt> dxioVar, bhml bhmlVar, btvo btvoVar, String str, akqi akqiVar, dopk dopkVar, String str2, int i, @dzsi String str3, dcep<xii> dcepVar) {
        this.i = null;
        this.j = null;
        this.c = vtnVar;
        this.a = dxioVar;
        this.h = dcepVar;
        aclh aclhVar = new aclh();
        aclhVar.a = dtxy.kl;
        aclhVar.e = i;
        aclhVar.b = str3;
        this.f = aclhVar.a();
        albv.f(vtnVar, dopkVar);
        this.g = dopkVar.b;
        this.d = str2;
        douj j = albv.j(dopkVar);
        if (j != null) {
            this.i = vtnVar.a(j.c, vtj.TRANSIT_AUTO);
            this.j = j.e;
        }
        amvg amvgVar = new amvg();
        amvgVar.b = dopkVar.b;
        amvgVar.c = akqi.f(dopkVar.d);
        amvh a = amvgVar.a();
        amvg amvgVar2 = new amvg();
        amvgVar2.b = str;
        amvgVar2.c = akqiVar;
        amvh a2 = amvgVar2.a();
        qcw x = qcx.x();
        x.r(a);
        x.s(dqvj.WALK);
        x.u(a2);
        this.b = x.a();
        dsrj<doph> dsrjVar = dopkVar.e;
        qdb g = qdc.g();
        ((qas) g).c = dopkVar.d;
        btvo a3 = bhmlVar.a.a();
        bhml.a(a3, 1);
        dxio a4 = ((dxjh) bhmlVar.b).a();
        bhml.a(a4, 2);
        bhml.a(vtnVar, 3);
        bhml.a(dsrjVar, 4);
        bhml.a(g, 5);
        this.e = new bhmk(a3, a4, vtnVar, dsrjVar, g);
    }

    @Override // defpackage.igw
    public Boolean a() {
        return igv.a();
    }

    @Override // defpackage.actn
    @dzsi
    public View.OnClickListener b() {
        return new View.OnClickListener(this) { // from class: bhmn
            private final bhmp a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bhmp bhmpVar = this.a;
                bhmpVar.a.a().m(bhmpVar.b);
            }
        };
    }

    @Override // defpackage.bhmi
    public String c() {
        return this.g;
    }

    @Override // defpackage.bhmi
    public String d() {
        return this.d;
    }

    @Override // defpackage.bhmi
    @dzsi
    public cqtd e() {
        String str = this.i;
        if (str == null) {
            return null;
        }
        return this.c.f(str, bvlw.a, new vtk(this) { // from class: bhmo
            private final bhmp a;

            {
                this.a = this;
            }

            @Override // defpackage.vtk
            public final void a(cqtd cqtdVar) {
                cqkx.p(this.a);
            }
        });
    }

    @Override // defpackage.bhmi
    @dzsi
    public String f() {
        return this.j;
    }

    @Override // defpackage.bhmi
    public zcq g() {
        return this.e;
    }

    @Override // defpackage.bhmi
    public cjtd h() {
        return aclj.a(this.f);
    }

    @Override // defpackage.bhmi
    public Boolean i() {
        return Boolean.valueOf(dcft.m(this.h, bhmm.a).a());
    }
}
