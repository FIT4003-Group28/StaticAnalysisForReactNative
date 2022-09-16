package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: aetv  reason: default package */
/* loaded from: classes.dex */
public final class aetv {
    private final dxio<akty> a;
    private final Resources b;
    private final dxio<akvz> c;
    @dzsi
    private aktc d;
    @dzsi
    private aktg e;
    @dzsi
    private aktg f;
    @dzsi
    private aktg g;

    public aetv(dxio<akty> dxioVar, Resources resources, dxio<akvz> dxioVar2) {
        this.a = dxioVar;
        this.b = resources;
        this.c = dxioVar2;
    }

    private final dmph e(String str, boolean z, int i, aktg aktgVar, aktg aktgVar2) {
        if (z) {
            if (f(i)) {
                String valueOf = String.valueOf(str);
                str = valueOf.length() != 0 ? " ".concat(valueOf) : new String(" ");
            } else {
                str = String.valueOf(str).concat(" ");
            }
        }
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        dmpc dmpcVar = (dmpc) dmpd.h.bZ();
        if (dmpcVar.c) {
            dmpcVar.bF();
            dmpcVar.c = false;
        }
        dmpd dmpdVar = (dmpd) dmpcVar.b;
        str.getClass();
        dmpdVar.a |= 1;
        dmpdVar.b = str;
        int a = aktgVar.a();
        if (dmpcVar.c) {
            dmpcVar.bF();
            dmpcVar.c = false;
        }
        dmpd dmpdVar2 = (dmpd) dmpcVar.b;
        dmpdVar2.a |= 2;
        dmpdVar2.c = a;
        dmpeVar.b(dmpcVar);
        int a2 = aktgVar2.a();
        if (dmpeVar.c) {
            dmpeVar.bF();
            dmpeVar.c = false;
        }
        dmph dmphVar = (dmph) dmpeVar.b;
        dmphVar.a |= 1;
        dmphVar.c = a2;
        return (dmph) dmpeVar.bK();
    }

    private final boolean f(int i) {
        boolean c = bvox.c(this.b);
        if (i == 1) {
            if (c) {
                i = 1;
                c = true;
            }
        }
        return i == 2 && c;
    }

    public final synchronized void a(aetu aetuVar, akra akraVar) {
        dmpm dmpmVar;
        if (this.d != null) {
            c();
        }
        akvz a = this.c.a();
        dmqt dmqtVar = (dmqt) dmqx.e.bZ();
        dmoo dmooVar = (dmoo) dmop.h.bZ();
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar = (dmop) dmooVar.b;
        dmopVar.a |= 1;
        dmopVar.b = 0;
        dmpq bZ = dmpv.s.bZ();
        int d = aetuVar.d();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar = (dmpv) bZ.b;
        dmpvVar.a |= 1;
        dmpvVar.b = d;
        dmoa bZ2 = dmob.g.bZ();
        int f = aetuVar.f();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmob dmobVar = (dmob) bZ2.b;
        int i = dmobVar.a | 1;
        dmobVar.a = i;
        dmobVar.b = f;
        dmobVar.a = i | 2;
        dmobVar.c = 8;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar2 = (dmpv) bZ.b;
        dmob bK = bZ2.bK();
        bK.getClass();
        dmpvVar2.e = bK;
        dmpvVar2.a |= 4;
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar2 = (dmop) dmooVar.b;
        dmpv bK2 = bZ.bK();
        bK2.getClass();
        dmopVar2.d = bK2;
        dmopVar2.a |= 4;
        dmqtVar.a(dmooVar);
        this.e = a.c((dmqx) dmqtVar.bK());
        akvz a2 = this.c.a();
        dmqt dmqtVar2 = (dmqt) dmqx.e.bZ();
        dmoo dmooVar2 = (dmoo) dmop.h.bZ();
        if (dmooVar2.c) {
            dmooVar2.bF();
            dmooVar2.c = false;
        }
        dmop dmopVar3 = (dmop) dmooVar2.b;
        dmopVar3.a |= 1;
        dmopVar3.b = 0;
        dmpq bZ3 = dmpv.s.bZ();
        dmsr bZ4 = dmsu.u.bZ();
        int e = aetuVar.e();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dmsu dmsuVar = (dmsu) bZ4.b;
        dmsuVar.a |= 4;
        dmsuVar.d = e;
        dmsu dmsuVar2 = (dmsu) bZ4.b;
        dmsuVar2.o = 3;
        dmsuVar2.a |= 2048;
        int g = aetuVar.g();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dmsu dmsuVar3 = (dmsu) bZ4.b;
        dmsuVar3.a |= 8;
        dmsuVar3.e = g;
        int k = aetuVar.k();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dmsu dmsuVar4 = (dmsu) bZ4.b;
        dmsuVar4.a |= 128;
        dmsuVar4.k = k;
        int l = aetuVar.l();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dmsu dmsuVar5 = (dmsu) bZ4.b;
        dmsuVar5.a |= 256;
        dmsuVar5.l = l;
        int m = aetuVar.m();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dmsu dmsuVar6 = (dmsu) bZ4.b;
        dmsuVar6.a |= 512;
        dmsuVar6.m = m;
        bZ4.b(aetuVar.p());
        float i2 = aetuVar.i();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dmsu dmsuVar7 = (dmsu) bZ4.b;
        dmsuVar7.a |= 8192;
        dmsuVar7.s = i2;
        float h = aetuVar.h();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dmsu dmsuVar8 = (dmsu) bZ4.b;
        dmsuVar8.a |= 16384;
        dmsuVar8.t = h;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dmpv dmpvVar3 = (dmpv) bZ3.b;
        dmsu bK3 = bZ4.bK();
        bK3.getClass();
        dmpvVar3.f = bK3;
        dmpvVar3.a |= 8;
        if (dmooVar2.c) {
            dmooVar2.bF();
            dmooVar2.c = false;
        }
        dmop dmopVar4 = (dmop) dmooVar2.b;
        dmpv bK4 = bZ3.bK();
        bK4.getClass();
        dmopVar4.d = bK4;
        dmopVar4.a |= 4;
        dmqtVar2.a(dmooVar2);
        this.f = a2.c((dmqx) dmqtVar2.bK());
        dmpk dmpkVar = (dmpk) dmpn.r.bZ();
        dmlp bZ5 = dmlq.e.bZ();
        dmls a3 = akxh.a(akraVar);
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ5.b;
        a3.getClass();
        dmlqVar.b = a3;
        dmlqVar.a |= 1;
        dmlo p = aetuVar.p();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dmlq dmlqVar2 = (dmlq) bZ5.b;
        dmlqVar2.c = p.j;
        dmlqVar2.a |= 2;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar = (dmpn) dmpkVar.b;
        dmlq bK5 = bZ5.bK();
        bK5.getClass();
        dmpnVar.d = bK5;
        dmpnVar.a |= 4;
        dsqv<dmpn, akuj> dsqvVar = akvj.b;
        akui bZ6 = akuj.e.bZ();
        float j = aetuVar.j();
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        akuj akujVar = (akuj) bZ6.b;
        akujVar.a |= 1;
        akujVar.b = j;
        boolean o = aetuVar.o();
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        akuj akujVar2 = (akuj) bZ6.b;
        akujVar2.a |= 4;
        akujVar2.d = o;
        dmpkVar.k(dsqvVar, bZ6.bK());
        dbsg<String> b = aetuVar.b();
        if (b.a()) {
            String b2 = b.b();
            dbsg<String> c = aetuVar.c();
            if (bvox.c(this.b) && c.a()) {
                b2 = c.b();
            }
            akvz a4 = this.c.a();
            dmqt dmqtVar3 = (dmqt) dmqx.e.bZ();
            dmoo dmooVar3 = (dmoo) dmop.h.bZ();
            if (dmooVar3.c) {
                dmooVar3.bF();
                dmooVar3.c = false;
            }
            dmop dmopVar5 = (dmop) dmooVar3.b;
            dmopVar5.a |= 1;
            dmopVar5.b = 0;
            int n = aetuVar.n();
            dmpq bZ7 = dmpv.s.bZ();
            dmog dmogVar = (dmog) dmoh.h.bZ();
            if (dmogVar.c) {
                dmogVar.bF();
                dmogVar.c = false;
            }
            dmoh dmohVar = (dmoh) dmogVar.b;
            b2.getClass();
            int i3 = dmohVar.a | 1;
            dmohVar.a = i3;
            dmohVar.b = b2;
            dmohVar.a = i3 | 4;
            dmohVar.c = n;
            bZ7.a(dmogVar);
            dmpv bK6 = bZ7.bK();
            if (dmooVar3.c) {
                dmooVar3.bF();
                dmooVar3.c = false;
            }
            dmop dmopVar6 = (dmop) dmooVar3.b;
            bK6.getClass();
            dmopVar6.d = bK6;
            dmopVar6.a |= 4;
            dmqtVar3.a(dmooVar3);
            aktg c2 = a4.c((dmqx) dmqtVar3.bK());
            this.g = c2;
            aktg aktgVar = this.f;
            dmpe dmpeVar = (dmpe) dmph.f.bZ();
            dmpc dmpcVar = (dmpc) dmpd.h.bZ();
            int a5 = c2.a();
            if (dmpcVar.c) {
                dmpcVar.bF();
                dmpcVar.c = false;
            }
            dmpd dmpdVar = (dmpd) dmpcVar.b;
            dmpdVar.a |= 2;
            dmpdVar.c = a5;
            dmpeVar.b(dmpcVar);
            int a6 = aktgVar.a();
            if (dmpeVar.c) {
                dmpeVar.bF();
                dmpeVar.c = false;
            }
            dmph dmphVar = (dmph) dmpeVar.b;
            dmphVar.a |= 1;
            dmphVar.c = a6;
            dmph dmphVar2 = (dmph) dmpeVar.bK();
            if (dmpkVar.c) {
                dmpkVar.bF();
                dmpkVar.c = false;
            }
            dmpn dmpnVar2 = (dmpn) dmpkVar.b;
            dmphVar2.getClass();
            dmpnVar2.b = dmphVar2;
            dmpnVar2.a |= 1;
            dmph e2 = e(aetuVar.a(), true, aetuVar.r(), this.e, this.f);
            if (dmpkVar.c) {
                dmpkVar.bF();
                dmpkVar.c = false;
            }
            dmpn dmpnVar3 = (dmpn) dmpkVar.b;
            e2.getClass();
            dmpnVar3.c = e2;
            dmpnVar3.a |= 2;
            if (f(aetuVar.r())) {
                dmpmVar = dmpm.CENTER_LEFT_TO_CENTER_RIGHT;
            } else {
                dmpmVar = dmpm.CENTER_RIGHT_TO_CENTER_LEFT;
            }
            if (dmpkVar.c) {
                dmpkVar.bF();
                dmpkVar.c = false;
            }
            dmpn dmpnVar4 = (dmpn) dmpkVar.b;
            dmpnVar4.f = dmpmVar.q;
            dmpnVar4.a |= 16;
        } else {
            dmph e3 = e(aetuVar.a(), false, aetuVar.r(), this.e, this.f);
            if (dmpkVar.c) {
                dmpkVar.bF();
                dmpkVar.c = false;
            }
            dmpn dmpnVar5 = (dmpn) dmpkVar.b;
            e3.getClass();
            dmpnVar5.b = e3;
            dmpnVar5.a |= 1;
        }
        aktc d2 = this.a.a().d((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
        akvo<? super aktd> q = aetuVar.q();
        if (q != null) {
            d2.Pt(q);
        }
        this.d = d2;
        this.a.a().f(this.d);
    }

    public final synchronized boolean b() {
        return this.d != null;
    }

    public final synchronized void c() {
        akty a = this.a.a();
        akvz a2 = this.c.a();
        aktc aktcVar = this.d;
        if (aktcVar != null) {
            a.g(aktcVar);
            a.e(this.d);
            this.d = null;
        }
        aktg aktgVar = this.e;
        if (aktgVar != null) {
            a2.j(aktgVar);
            this.e = null;
        }
        aktg aktgVar2 = this.f;
        if (aktgVar2 != null) {
            a2.j(aktgVar2);
            this.f = null;
        }
        aktg aktgVar3 = this.g;
        if (aktgVar3 != null) {
            a2.j(aktgVar3);
            this.g = null;
        }
    }

    public final synchronized void d(akra akraVar) {
        aktc aktcVar = this.d;
        if (aktcVar != null) {
            dmlo c = aktcVar.c();
            dbsk.s(c);
            aktcVar.a(new aktb(akraVar, c));
        }
    }
}
