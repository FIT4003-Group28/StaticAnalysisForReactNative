package defpackage;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xdd  reason: default package */
/* loaded from: classes7.dex */
public final class xdd implements xdk {
    private final dxio<akty> a;
    private final dxio<akvz> b;
    private final dxio<akxn> c;
    private final xdi d;
    private final Map<xdj, xdc> e = new dzqz();

    public xdd(dxio<akty> dxioVar, final dxio<akvz> dxioVar2, xdi xdiVar) {
        this.a = dxioVar;
        this.d = xdiVar;
        this.b = dxioVar2;
        this.c = new dxio(dxioVar2) { // from class: xcx
            private final dxio a;

            {
                this.a = dxioVar2;
            }

            @Override // defpackage.dxio
            public final Object a() {
                return new akxn((akvz) this.a.a());
            }
        };
    }

    private final akxi c() {
        return this.c.a().b(this.d.c());
    }

    @Override // defpackage.xdk
    public final void a(Iterable<xdj> iterable, boolean z) {
        final dcep K = dcep.K(((dznt) this.e).keySet());
        final dcep L = dcep.L(iterable);
        for (xdj xdjVar : dcbg.b(K).o(new dbsl(L) { // from class: xcy
            private final dcep a;

            {
                this.a = L;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return !this.a.contains((xdj) obj);
            }
        })) {
            xdc remove = this.e.remove(xdjVar);
            if (remove != null) {
                akty a = this.a.a();
                a.g(remove.a);
                a.e(remove.a);
                this.b.a().j(remove.b);
                remove.c.b();
            }
        }
        for (xdj xdjVar2 : dcbg.b(iterable).o(new dbsl(K) { // from class: xcz
            private final dcep a;

            {
                this.a = K;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return !this.a.contains((xdj) obj);
            }
        })) {
            akuh e = this.b.a().e(dcdc.g(dbsi.a(14, this.d.a(xdjVar2.c())), dbsi.a(16, this.d.b(xdjVar2.c()))));
            akxi c = c();
            akxi c2 = this.c.a().c(dmqc.LEGEND_STYLE_POI_CUSTOM_TEXT_TITLE);
            akty a2 = this.a.a();
            akra f = akra.f(xdjVar2.b());
            int i = true != xdjVar2.e() ? 1 : 17;
            dmpk g = c().a().g();
            dmlp bZ = dmlq.e.bZ();
            dmls a3 = akxh.a(f);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmlq dmlqVar = (dmlq) bZ.b;
            a3.getClass();
            dmlqVar.b = a3;
            dmlqVar.a |= 1;
            if (g.c) {
                g.bF();
                g.c = false;
            }
            dmpn dmpnVar = (dmpn) g.b;
            dmlq bK = bZ.bK();
            dmpn dmpnVar2 = dmpn.r;
            bK.getClass();
            dmpnVar.d = bK;
            dmpnVar.a |= 4;
            dmpe dmpeVar = (dmpe) dmph.f.bZ();
            dmpeVar.b(e.e());
            if (g.c) {
                g.bF();
                g.c = false;
            }
            dmpn dmpnVar3 = (dmpn) g.b;
            dmph dmphVar = (dmph) dmpeVar.bK();
            dmphVar.getClass();
            dmpnVar3.b = dmphVar;
            dmpnVar3.a |= 1;
            if (g.c) {
                g.bF();
                g.c = false;
            }
            dmpn dmpnVar4 = (dmpn) g.b;
            dmpnVar4.a |= 32;
            dmpnVar4.g = i;
            akxf.I(g);
            String d = xdjVar2.d();
            if (!TextUtils.isEmpty(d)) {
                dmpe a4 = akxg.a(dfyn.a(d, 20, 3, 50), ((akxj) c2).a);
                if (g.c) {
                    g.bF();
                    g.c = false;
                }
                dmpn dmpnVar5 = (dmpn) g.b;
                dmph dmphVar2 = (dmph) a4.bK();
                dmphVar2.getClass();
                dmpnVar5.c = dmphVar2;
                dmpnVar5.a |= 2;
                akxf.M(g);
            }
            akxf.H(g, xdjVar2.a());
            dnbb bZ2 = dnbc.c.bZ();
            dnox bZ3 = dnpo.t.bZ();
            bZ3.b(dnow.SPOTLIT_PIN);
            dnpo bK2 = bZ3.bK();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnbc dnbcVar = (dnbc) bZ2.b;
            bK2.getClass();
            dnbcVar.b = bK2;
            dnbcVar.a |= 1;
            akxf.N(g, bZ2.bK());
            akti c3 = a2.c((dmpn) g.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
            a2.f(c3);
            if (z) {
                c3.c(new xdb());
            }
            Runnable f2 = xdjVar2.f();
            if (f2 != null) {
                c3.Pt(new xda(f2));
            }
            this.e.put(xdjVar2, new xdc(c3, e, c));
        }
    }

    @Override // defpackage.xdk
    public final void b() {
        a(dcdc.e(), false);
        this.d.d();
    }
}
