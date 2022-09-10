package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cfgn  reason: default package */
/* loaded from: classes4.dex */
public final class cfgn {
    public static final dcdc<dmlo> a;
    static final dmlo b;
    public final Context c;
    public final akto d;
    public final gce e;

    static {
        dcdc<dmlo> m = dcdc.m(dmlo.BOTTOM, dmlo.TOP, dmlo.RIGHT, dmlo.LEFT, dmlo.BOTTOM_RIGHT, dmlo.BOTTOM_LEFT, dmlo.TOP_RIGHT, dmlo.TOP_LEFT);
        a = m;
        b = m.get(4);
    }

    public cfgn(gga ggaVar, akto aktoVar, gce gceVar) {
        this.c = ggaVar;
        this.d = aktoVar;
        this.e = gceVar;
    }

    private final synchronized aktg f(dmpv dmpvVar) {
        dmqt dmqtVar;
        dmqtVar = (dmqt) dmqx.e.bZ();
        dmoo dmooVar = (dmoo) dmop.h.bZ();
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar = (dmop) dmooVar.b;
        int i = dmopVar.a | 1;
        dmopVar.a = i;
        dmopVar.b = 0;
        dmpvVar.getClass();
        dmopVar.d = dmpvVar;
        dmopVar.a = i | 4;
        dmqtVar.a(dmooVar);
        return this.d.e().c((dmqx) dmqtVar.bK());
    }

    public final synchronized aktg a(dllh dllhVar) {
        dmpq bZ;
        bZ = dmpv.s.bZ();
        int i = dllhVar.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar = (dmpv) bZ.b;
        dmpvVar.a |= 1;
        dmpvVar.b = i;
        dmoa bZ2 = dmob.g.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmob dmobVar = (dmob) bZ2.b;
        int i2 = dmobVar.a | 4;
        dmobVar.a = i2;
        dmobVar.d = 100;
        int i3 = i2 | 1;
        dmobVar.a = i3;
        dmobVar.b = 13;
        dmobVar.a = i3 | 32;
        dmobVar.f = 24;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar2 = (dmpv) bZ.b;
        dmob bK = bZ2.bK();
        bK.getClass();
        dmpvVar2.e = bK;
        dmpvVar2.a |= 4;
        return f(bZ.bK());
    }

    public final synchronized aktg b(dllh dllhVar) {
        dmpq bZ;
        bZ = dmpv.s.bZ();
        dmsr bZ2 = dmsu.u.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmsu dmsuVar = (dmsu) bZ2.b;
        int i = dmsuVar.a | 64;
        dmsuVar.a = i;
        dmsuVar.j = 2;
        int i2 = i | 128;
        dmsuVar.a = i2;
        dmsuVar.k = 2;
        int i3 = dllhVar.e;
        int i4 = i2 | 256;
        dmsuVar.a = i4;
        dmsuVar.l = i3;
        int i5 = i4 | 512;
        dmsuVar.a = i5;
        dmsuVar.m = 64;
        int i6 = dllhVar.f;
        dmsuVar.a = i5 | 4;
        dmsuVar.d = i6;
        dmsu dmsuVar2 = (dmsu) bZ2.b;
        dmsuVar2.o = 2;
        int i7 = dmsuVar2.a | 2048;
        dmsuVar2.a = i7;
        int i8 = i7 | 32;
        dmsuVar2.a = i8;
        dmsuVar2.g = 12;
        int i9 = i8 | 16;
        dmsuVar2.a = i9;
        dmsuVar2.f = 6;
        int i10 = i9 | 1024;
        dmsuVar2.a = i10;
        dmsuVar2.n = 64;
        int i11 = i10 | 8192;
        dmsuVar2.a = i11;
        dmsuVar2.s = 8.0f;
        dmsuVar2.a = i11 | 16384;
        dmsuVar2.t = 4.0f;
        bZ2.a(a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar = (dmpv) bZ.b;
        dmsu bK = bZ2.bK();
        bK.getClass();
        dmpvVar.f = bK;
        dmpvVar.a |= 8;
        return f(bZ.bK());
    }

    public final synchronized aktc c(dllh dllhVar, aktg aktgVar, aktg aktgVar2) {
        dmpk dmpkVar;
        dmpkVar = (dmpk) dmpn.r.bZ();
        dmpe f = aktgVar2.f();
        dmpc e = aktgVar.e();
        String str = dllhVar.b;
        if (e.c) {
            e.bF();
            e.c = false;
        }
        dmpd dmpdVar = (dmpd) e.b;
        dmpd dmpdVar2 = dmpd.h;
        str.getClass();
        dmpdVar.a |= 1;
        dmpdVar.b = str;
        f.b(e);
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar = (dmpn) dmpkVar.b;
        dmph dmphVar = (dmph) f.bK();
        dmphVar.getClass();
        dmpnVar.b = dmphVar;
        dmpnVar.a |= 1;
        dmlp bZ = dmlq.e.bZ();
        dmlo dmloVar = b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ.b;
        dmlqVar.c = dmloVar.j;
        dmlqVar.a |= 2;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar2 = (dmpn) dmpkVar.b;
        dmlq bK = bZ.bK();
        bK.getClass();
        dmpnVar2.d = bK;
        dmpnVar2.a |= 4;
        dsqv<dmpn, akus> dsqvVar = akvj.a;
        akuq bZ2 = akus.o.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        akus.b((akus) bZ2.b);
        dmpkVar.k(dsqvVar, bZ2.bK());
        dsqv<dmpn, akuj> dsqvVar2 = akvj.b;
        akui bZ3 = akuj.e.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        akuj akujVar = (akuj) bZ3.b;
        akujVar.a |= 4;
        akujVar.d = true;
        dmpkVar.k(dsqvVar2, bZ3.bK());
        return this.d.d().d((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
    }

    public final synchronized aktg d() {
        dmpq bZ;
        bZ = dmpv.s.bZ();
        dmsr bZ2 = dmsu.u.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmsu dmsuVar = (dmsu) bZ2.b;
        dmsuVar.a |= 8192;
        dmsuVar.s = 8.0f;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar = (dmpv) bZ.b;
        dmsu bK = bZ2.bK();
        bK.getClass();
        dmpvVar.f = bK;
        dmpvVar.a |= 8;
        return f(bZ.bK());
    }

    public final synchronized akti e(dllx dllxVar, aktg aktgVar, aktg aktgVar2, akuh akuhVar) {
        dmpk dmpkVar;
        dpum dpumVar = dllxVar.b;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        double d = dpumVar.b;
        dpum dpumVar2 = dllxVar.b;
        if (dpumVar2 == null) {
            dpumVar2 = dpum.d;
        }
        dmls a2 = akxh.a(akra.e(d, dpumVar2.c));
        dmpkVar = (dmpk) dmpn.r.bZ();
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar = (dmpn) dmpkVar.b;
        dmpnVar.a |= 32;
        dmpnVar.g = 3;
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        dmpeVar.b(akuhVar.e());
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar2 = (dmpn) dmpkVar.b;
        dmph dmphVar = (dmph) dmpeVar.bK();
        dmphVar.getClass();
        dmpnVar2.b = dmphVar;
        dmpnVar2.a |= 1;
        dmpe f = aktgVar.f();
        dmpc e = aktgVar2.e();
        String str = dllxVar.c;
        if (e.c) {
            e.bF();
            e.c = false;
        }
        dmpd dmpdVar = (dmpd) e.b;
        dmpd dmpdVar2 = dmpd.h;
        str.getClass();
        dmpdVar.a |= 1;
        dmpdVar.b = str;
        f.b(e);
        dmpc e2 = aktgVar2.e();
        if (e2.c) {
            e2.bF();
            e2.c = false;
        }
        dmpd dmpdVar3 = (dmpd) e2.b;
        int i = dmpdVar3.a | 1;
        dmpdVar3.a = i;
        dmpdVar3.b = " ";
        dmpdVar3.a = i | 16;
        dmpdVar3.f = true;
        f.b(e2);
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar3 = (dmpn) dmpkVar.b;
        dmph dmphVar2 = (dmph) f.bK();
        dmphVar2.getClass();
        dmpnVar3.c = dmphVar2;
        dmpnVar3.a |= 2;
        dmpm dmpmVar = dmpm.CENTER_RIGHT_TO_CENTER_LEFT;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar4 = (dmpn) dmpkVar.b;
        dmpnVar4.f = dmpmVar.q;
        dmpnVar4.a |= 16;
        dmlp bZ = dmlq.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ.b;
        a2.getClass();
        dmlqVar.b = a2;
        dmlqVar.a |= 1;
        dmlo dmloVar = dmlo.TOP;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar2 = (dmlq) bZ.b;
        dmlqVar2.c = dmloVar.j;
        dmlqVar2.a |= 2;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar5 = (dmpn) dmpkVar.b;
        dmlq bK = bZ.bK();
        bK.getClass();
        dmpnVar5.d = bK;
        dmpnVar5.a |= 4;
        dsqv<dmpn, akus> dsqvVar = akvj.a;
        akuq bZ2 = akus.o.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        akus.b((akus) bZ2.b);
        dmpkVar.k(dsqvVar, bZ2.bK());
        return this.d.a((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
    }
}
