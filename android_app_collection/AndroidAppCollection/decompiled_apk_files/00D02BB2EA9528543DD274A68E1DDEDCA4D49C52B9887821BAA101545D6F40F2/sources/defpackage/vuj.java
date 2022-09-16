package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.SparseArray;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vuj  reason: default package */
/* loaded from: classes7.dex */
public final class vuj implements amjm {
    private static final dcqe w = dcqe.c("vuj");
    private static final dcdc<dmlo> x = dcdc.i(dmlo.BOTTOM_RIGHT, dmlo.BOTTOM_LEFT, dmlo.TOP_RIGHT, dmlo.TOP_LEFT);
    @dzsi
    private algn D;
    private final atln E;
    private final Rect F;
    private final alfx G;
    private final dbty<Boolean> H;
    public final aldv a;
    public final boolean b;
    public final boolean c;
    public boolean d;
    public final Resources e;
    public final alec f;
    public final alfe j;
    public final dcdn<alfg, vui> k;
    @dzsi
    public aley l;
    public final boolean m;
    public final amub n;
    @dzsi
    public btrm o;
    @dzsi
    public amii p;
    public final bnsn q;
    public final akoq r;
    public final btvo s;
    @dzsi
    public final crfl t;
    public final int v;
    private final dcdc<algb> y;
    @dzsi
    private final dbsl<dmpn> z;
    public dcdc<akta> g = dcdc.e();
    @dzsi
    public vtx h = null;
    public final SparseArray<akta> i = new SparseArray<>();
    private volatile dcdc<amrc> A = dcdc.e();
    private volatile dcdc<amrc> B = dcdc.e();
    private volatile dcdc<amrc> C = dcdc.e();
    @dzsi
    public Runnable u = null;

    public vuj(amtu amtuVar, akoq akoqVar, Context context, bnsn bnsnVar, alec alecVar, boolean z, boolean z2, boolean z3, List<dozz> list, dcdc<akrk> dcdcVar, boolean z4, Rect rect, atln atlnVar, cqat cqatVar, @dzsi alfe alfeVar, btvo btvoVar, @dzsi bvjj bvjjVar, @dzsi crfl crflVar, boolean z5, dbty<Boolean> dbtyVar) {
        amuo[] amuoVarArr;
        dozs dozsVar;
        int i;
        int i2;
        doyy doyyVar;
        this.q = bnsnVar;
        this.e = context.getResources();
        this.f = alecVar;
        this.d = z;
        this.b = z2;
        this.c = z3;
        this.m = z4;
        this.j = alfeVar == null ? new alfe(context, akoqVar.aE(), z3, bvjjVar, btvoVar, cqatVar) : alfeVar;
        this.E = atlnVar;
        this.r = akoqVar;
        this.F = rect;
        this.s = btvoVar;
        this.t = crflVar;
        int i3 = 3;
        if (z5) {
            this.v = 3;
        } else if (amtuVar.i()) {
            this.v = 1;
        } else {
            this.v = amtuVar.k() ? 2 : i3;
        }
        if (!list.isEmpty()) {
            dcdg p = dcdn.p();
            dcen N = dcep.N();
            for (dozz dozzVar : list) {
                if (dozzVar.b == 22) {
                    dozsVar = (dozs) dozzVar.c;
                } else {
                    dozsVar = dozs.q;
                }
                dcep<Long> k = alca.k(dozzVar);
                N.i(k);
                dgas dgasVar = dozsVar.d;
                if ((dgasVar == null ? dgas.e : dgasVar).b > 0) {
                    dgas dgasVar2 = dozsVar.d;
                    if ((dgasVar2 == null ? dgas.e : dgasVar2).b > 59) {
                    }
                }
                dozy b = dozy.b(dozzVar.f);
                if ((b == null ? dozy.UNKNOWN : b) == dozy.ON_ROUTE_PROBLEM) {
                    if (dozzVar.b == 30) {
                        doyyVar = (doyy) dozzVar.c;
                    } else {
                        doyyVar = doyy.d;
                    }
                    dowb dowbVar = doyyVar.a;
                    i2 = (dowbVar == null ? dowb.d : dowbVar).b;
                    i = 0;
                } else {
                    dozl dozlVar = dozsVar.j;
                    dozlVar = dozlVar == null ? dozl.e : dozlVar;
                    int i4 = dozlVar.b;
                    i = dozlVar.c;
                    i2 = i4;
                }
                dgas dgasVar3 = dozsVar.d;
                vui vuiVar = new vui(dozzVar, dgasVar3 == null ? dgas.e : dgasVar3, amtuVar.l().ar(i2, i), k, amtuVar.i());
                p.f(new alfg(vuiVar.c), vuiVar);
            }
            this.k = p.b();
            this.z = alfg.a(N.f());
        } else {
            this.k = dcmn.a;
            this.z = null;
        }
        this.D = new algn(akoqVar.aE());
        this.y = dcbg.b(dcdcVar).s(vuf.a).z();
        dccx F = dcdc.F();
        dcdc<dwnl> h = amtuVar.h();
        int size = h.size();
        for (int i5 = 0; i5 < size; i5++) {
            dwnl dwnlVar = h.get(i5);
            dwnk b2 = dwnk.b(dwnlVar.c);
            if ((b2 == null ? dwnk.INCIDENT_OTHER : b2) != dwnk.INCIDENT_JAM) {
                F.g(dwnlVar);
            }
        }
        dccx F2 = dcdc.F();
        for (amuo amuoVar : amtuVar.l().k) {
            dcdc<amtn> dcdcVar2 = amuoVar.O;
            int size2 = dcdcVar2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                F2.g(new alci(dcdcVar2.get(i6), amtuVar.i(), amuoVar.d));
            }
        }
        this.a = new aldv(F.f(), F2.f(), akoqVar.aC(), akoqVar.aE());
        amub l = amtuVar.l();
        this.n = l;
        this.G = new alfx(rect, dcdc.t(l.o));
        this.H = dbtyVar;
    }

    private final void c() {
        dcdc<amrc> dcdcVar = this.A;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            amrc amrcVar = dcdcVar.get(i);
            this.r.ak().a(amrcVar.a());
            this.r.aC().e(amrcVar.a());
        }
        this.A = dcdc.e();
        dcdc<amrc> dcdcVar2 = this.B;
        int size2 = dcdcVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            amrc amrcVar2 = dcdcVar2.get(i2);
            this.r.ak().a(amrcVar2.a());
            this.r.aC().e(amrcVar2.a());
        }
        this.B = dcdc.e();
        dcdc<amrc> dcdcVar3 = this.C;
        int size3 = dcdcVar3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            amrc amrcVar3 = dcdcVar3.get(i3);
            this.r.ak().a(amrcVar3.a());
            this.r.aC().e(amrcVar3.a());
        }
        this.C = dcdc.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x017f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e A[Catch: all -> 0x018f, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000b, B:8:0x0013, B:54:0x00b0, B:56:0x00b6, B:60:0x00bf, B:62:0x00c9, B:100:0x017f, B:69:0x00d8, B:71:0x00de, B:83:0x0103, B:87:0x0112, B:94:0x0138, B:99:0x017c, B:97:0x014e, B:73:0x00e6, B:75:0x00ec, B:77:0x00f5, B:79:0x00fb, B:80:0x00fe, B:88:0x011e, B:89:0x0126, B:93:0x012f, B:46:0x008e, B:49:0x0097, B:51:0x00a3, B:11:0x0029, B:13:0x0033, B:15:0x003b, B:16:0x003e, B:18:0x0044, B:25:0x0050, B:27:0x005a, B:29:0x0062, B:30:0x0065, B:32:0x006b, B:39:0x0077, B:41:0x0081, B:43:0x0089, B:35:0x0070, B:21:0x0049, B:101:0x0183, B:104:0x0189), top: B:112:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8 A[Catch: all -> 0x018f, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000b, B:8:0x0013, B:54:0x00b0, B:56:0x00b6, B:60:0x00bf, B:62:0x00c9, B:100:0x017f, B:69:0x00d8, B:71:0x00de, B:83:0x0103, B:87:0x0112, B:94:0x0138, B:99:0x017c, B:97:0x014e, B:73:0x00e6, B:75:0x00ec, B:77:0x00f5, B:79:0x00fb, B:80:0x00fe, B:88:0x011e, B:89:0x0126, B:93:0x012f, B:46:0x008e, B:49:0x0097, B:51:0x00a3, B:11:0x0029, B:13:0x0033, B:15:0x003b, B:16:0x003e, B:18:0x0044, B:25:0x0050, B:27:0x005a, B:29:0x0062, B:30:0x0065, B:32:0x006b, B:39:0x0077, B:41:0x0081, B:43:0x0089, B:35:0x0070, B:21:0x0049, B:101:0x0183, B:104:0x0189), top: B:112:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0126 A[Catch: all -> 0x018f, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000b, B:8:0x0013, B:54:0x00b0, B:56:0x00b6, B:60:0x00bf, B:62:0x00c9, B:100:0x017f, B:69:0x00d8, B:71:0x00de, B:83:0x0103, B:87:0x0112, B:94:0x0138, B:99:0x017c, B:97:0x014e, B:73:0x00e6, B:75:0x00ec, B:77:0x00f5, B:79:0x00fb, B:80:0x00fe, B:88:0x011e, B:89:0x0126, B:93:0x012f, B:46:0x008e, B:49:0x0097, B:51:0x00a3, B:11:0x0029, B:13:0x0033, B:15:0x003b, B:16:0x003e, B:18:0x0044, B:25:0x0050, B:27:0x005a, B:29:0x0062, B:30:0x0065, B:32:0x006b, B:39:0x0077, B:41:0x0081, B:43:0x0089, B:35:0x0070, B:21:0x0049, B:101:0x0183, B:104:0x0189), top: B:112:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014e A[Catch: all -> 0x018f, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000b, B:8:0x0013, B:54:0x00b0, B:56:0x00b6, B:60:0x00bf, B:62:0x00c9, B:100:0x017f, B:69:0x00d8, B:71:0x00de, B:83:0x0103, B:87:0x0112, B:94:0x0138, B:99:0x017c, B:97:0x014e, B:73:0x00e6, B:75:0x00ec, B:77:0x00f5, B:79:0x00fb, B:80:0x00fe, B:88:0x011e, B:89:0x0126, B:93:0x012f, B:46:0x008e, B:49:0x0097, B:51:0x00a3, B:11:0x0029, B:13:0x0033, B:15:0x003b, B:16:0x003e, B:18:0x0044, B:25:0x0050, B:27:0x005a, B:29:0x0062, B:30:0x0065, B:32:0x006b, B:39:0x0077, B:41:0x0081, B:43:0x0089, B:35:0x0070, B:21:0x0049, B:101:0x0183, B:104:0x0189), top: B:112:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017c A[Catch: all -> 0x018f, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000b, B:8:0x0013, B:54:0x00b0, B:56:0x00b6, B:60:0x00bf, B:62:0x00c9, B:100:0x017f, B:69:0x00d8, B:71:0x00de, B:83:0x0103, B:87:0x0112, B:94:0x0138, B:99:0x017c, B:97:0x014e, B:73:0x00e6, B:75:0x00ec, B:77:0x00f5, B:79:0x00fb, B:80:0x00fe, B:88:0x011e, B:89:0x0126, B:93:0x012f, B:46:0x008e, B:49:0x0097, B:51:0x00a3, B:11:0x0029, B:13:0x0033, B:15:0x003b, B:16:0x003e, B:18:0x0044, B:25:0x0050, B:27:0x005a, B:29:0x0062, B:30:0x0065, B:32:0x006b, B:39:0x0077, B:41:0x0081, B:43:0x0089, B:35:0x0070, B:21:0x0049, B:101:0x0183, B:104:0x0189), top: B:112:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized defpackage.dcdc<defpackage.amrc> d() {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vuj.d():dcdc");
    }

    private static dcdn<aktc, amrl> e(List<amrc> list) {
        dcdg p = dcdn.p();
        for (amrc amrcVar : list) {
            p.f(amrcVar.a(), amrcVar.b());
        }
        return p.b();
    }

    private static void f(dmpk dmpkVar, int i) {
        dnbb bZ = dnbc.c.bZ();
        dnox bZ2 = dnpo.t.bZ();
        bZ2.b(dnow.GENERIC_INTERACTIVE);
        dnpo bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnbc dnbcVar = (dnbc) bZ.b;
        bK.getClass();
        dnbcVar.b = bK;
        dnbcVar.a |= 1;
        akxf.N(dmpkVar, bZ.bK());
        dmll bZ3 = dmlm.g.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dmlm dmlmVar = (dmlm) bZ3.b;
        dmlmVar.a |= 8;
        dmlmVar.e = i;
        akxf.y(dmpkVar, bZ3.bK());
    }

    public final void a() {
        int i;
        dcdc<amrc> f;
        dozs dozsVar;
        albp a;
        dozs dozsVar2;
        dmpn d;
        dozs dozsVar3;
        int i2;
        doyy doyyVar;
        doyy doyyVar2;
        c();
        dccx F = dcdc.F();
        dcpd<Map.Entry<alfg, vui>> it = this.k.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<alfg, vui> next = it.next();
            alfg key = next.getKey();
            vui value = next.getValue();
            dozy b = dozy.b(value.a.f);
            if (b == null) {
                b = dozy.UNKNOWN;
            }
            dozy dozyVar = dozy.ON_ROUTE_PROBLEM;
            if (b == dozyVar) {
                dozz dozzVar = value.a;
                if (dozzVar.b == 30) {
                    doyyVar2 = (doyy) dozzVar.c;
                } else {
                    doyyVar2 = doyy.d;
                }
                doyx doyxVar = doyyVar2.b;
                if (doyxVar == null) {
                    doyxVar = doyx.d;
                }
                akuh a2 = this.r.aE().a(dmqc.LEGEND_STYLE_UNDEFINED);
                if ((doyxVar.a & 1) != 0) {
                    dmqc b2 = dmqc.b(doyxVar.b);
                    if (b2 == null) {
                        b2 = dmqc.LEGEND_STYLE_UNDEFINED;
                    }
                    if (b2 != dmqc.LEGEND_STYLE_UNDEFINED) {
                        if ((doyxVar.a & 2) != 0) {
                            dmqc b3 = dmqc.b(doyxVar.c);
                            if (b3 == null) {
                                b3 = dmqc.LEGEND_STYLE_UNDEFINED;
                            }
                            if (b3 != dmqc.LEGEND_STYLE_UNDEFINED) {
                                a = new albp(a2, true, true, 1);
                            }
                        }
                        a = new albp(a2, true, false, 1);
                    }
                }
                a = new albp(a2, 1);
            } else {
                dozz dozzVar2 = value.a;
                if (dozzVar2.b == 22) {
                    dozsVar = (dozs) dozzVar2.c;
                } else {
                    dozsVar = dozs.q;
                }
                dozr dozrVar = dozsVar.l;
                if (dozrVar == null) {
                    dozrVar = dozr.e;
                }
                a = albp.a(dozrVar, this.r.aE());
            }
            albp albpVar = a;
            if (albpVar.b) {
                dozz dozzVar3 = value.a;
                if ((dozzVar3.a & 16777216) != 0) {
                    String o = alca.o(dozzVar3, this.c);
                    if (b == dozyVar) {
                        dozz dozzVar4 = value.a;
                        if (dozzVar4.b == 30) {
                            doyyVar = (doyy) dozzVar4.c;
                        } else {
                            doyyVar = doyy.d;
                        }
                        dpce dpceVar = doyyVar.c;
                        if (dpceVar == null) {
                            dpceVar = dpce.f;
                        }
                        doul doulVar = dpceVar.c;
                        if (doulVar == null) {
                            doulVar = doul.f;
                        }
                        String str = doulVar.b;
                        if (!albpVar.c || str.isEmpty()) {
                            d = this.j.d(this.d, o);
                        } else {
                            d = this.j.f(this.d, o, null, str, null, false);
                        }
                    } else if (!albpVar.c || (i2 = value.b.b) == 0) {
                        dozz dozzVar5 = value.a;
                        if (dozzVar5.b == 22) {
                            dozsVar2 = (dozs) dozzVar5.c;
                        } else {
                            dozsVar2 = dozs.q;
                        }
                        dozr dozrVar2 = dozsVar2.l;
                        if (dozrVar2 == null) {
                            dozrVar2 = dozr.e;
                        }
                        if (albp.a(dozrVar2, this.r.aE()).c) {
                            dozn doznVar = dozsVar2.m;
                            if (doznVar == null) {
                                doznVar = dozn.f;
                            }
                            if (doznVar.b > 0) {
                                dozn doznVar2 = dozsVar2.m;
                                if (doznVar2 == null) {
                                    doznVar2 = dozn.f;
                                }
                                if (doznVar2.d) {
                                    alfe alfeVar = this.j;
                                    dozz dozzVar6 = value.a;
                                    if (dozzVar6.b == 22) {
                                        dozsVar3 = (dozs) dozzVar6.c;
                                    } else {
                                        dozsVar3 = dozs.q;
                                    }
                                    dozn doznVar3 = dozsVar3.m;
                                    if (doznVar3 == null) {
                                        doznVar3 = dozn.f;
                                    }
                                    long j = doznVar3.b;
                                    Long next2 = value.d.iterator().next();
                                    crfl crflVar = this.t;
                                    d = alfeVar.c((crflVar == null || next2 == null) ? j : crflVar.d(next2.longValue(), j), this.d, o, null);
                                }
                            }
                        }
                        d = this.j.d(this.d, o);
                    } else {
                        d = this.j.b(i2, this.d, o);
                    }
                    dsqp dsqpVar = (dsqp) d.cu(5);
                    dsqpVar.bC(d);
                    dmpk dmpkVar = (dmpk) dsqpVar;
                    f(dmpkVar, ((dtxi) dtxt.a).a);
                    if (this.H.a().booleanValue()) {
                        akxf.z(dmpkVar, dtxt.a);
                        akxf.A(dmpkVar, this.n.g());
                    }
                    aktc d2 = this.r.aC().d((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
                    d2.Pt(new vuh(this, value));
                    alge algeVar = new alge(true, key, dcdc.e(), this.G, dbpy.a);
                    int a3 = alfe.a(value.a, albpVar.c, value.e);
                    amrb g = amrc.g();
                    g.b(d2);
                    g.c(algeVar);
                    g.f(amsb.JAMCIDENTS);
                    g.d(a3);
                    g.e(alfq.c);
                    F.g(g.g());
                }
            }
        }
        this.A = F.f();
        amsg amsgVar = new amsg(e(this.A), 3);
        dcdc<amrc> dcdcVar = this.A;
        int size = dcdcVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            amrc amrcVar = dcdcVar.get(i3);
            this.r.ak().b(amrcVar.a(), amsgVar, amrcVar.c(), amrcVar.d(), amrcVar.e());
        }
        dccx F2 = dcdc.F();
        if (this.D == null) {
            f = F2.f();
        } else {
            dcdc<algb> dcdcVar2 = this.y;
            int size2 = dcdcVar2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                algb algbVar = dcdcVar2.get(i4);
                algn algnVar = this.D;
                dbsk.s(algnVar);
                dmpk dmpkVar2 = (dmpk) dmpn.r.bZ();
                dmpe f2 = algnVar.c.f();
                f2.b(algnVar.d.e());
                if (dmpkVar2.c) {
                    dmpkVar2.bF();
                    dmpkVar2.c = false;
                }
                dmpn dmpnVar = (dmpn) dmpkVar2.b;
                dmph dmphVar = (dmph) f2.bK();
                dmphVar.getClass();
                dmpnVar.b = dmphVar;
                dmpnVar.a |= 1;
                dmlp bZ = dmlq.e.bZ();
                dmlo dmloVar = algn.a.get(0);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmlq dmlqVar = (dmlq) bZ.b;
                dmlqVar.c = dmloVar.j;
                dmlqVar.a |= 2;
                dmlq bK = bZ.bK();
                if (dmpkVar2.c) {
                    dmpkVar2.bF();
                    dmpkVar2.c = false;
                }
                dmpn dmpnVar2 = (dmpn) dmpkVar2.b;
                bK.getClass();
                dmpnVar2.d = bK;
                int i5 = dmpnVar2.a | 4;
                dmpnVar2.a = i5;
                dmpnVar2.a = i5 | 128;
                dmpnVar2.i = 76;
                dmpn dmpnVar3 = (dmpn) dmpkVar2.bK();
                dsqp dsqpVar2 = (dsqp) dmpnVar3.cu(5);
                dsqpVar2.bC(dmpnVar3);
                dmpk dmpkVar3 = (dmpk) dsqpVar2;
                f(dmpkVar3, ((dtxi) dtyc.fp).a);
                aktc d3 = this.r.aC().d((dmpn) dmpkVar3.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
                alge algeVar2 = new alge(algbVar, dcdc.f(this.n.l), new alfx(new Rect(), dcdc.e()), dbpy.a);
                amrb g2 = amrc.g();
                g2.b(d3);
                g2.c(algeVar2);
                g2.f(amsb.JAMCIDENTS);
                g2.e(algn.a);
                F2.g(g2.g());
            }
            f = F2.f();
        }
        this.B = f;
        amsg amsgVar2 = new amsg(e(this.B), 5);
        dcdc<amrc> dcdcVar3 = this.B;
        int size3 = dcdcVar3.size();
        for (int i6 = 0; i6 < size3; i6++) {
            amrc amrcVar2 = dcdcVar3.get(i6);
            this.r.ak().b(amrcVar2.a(), amsgVar2, amrcVar2.c(), amrcVar2.d(), amrcVar2.e());
        }
        if (this.m) {
            this.C = d();
            amsg amsgVar3 = new amsg(e(this.C), 5);
            dcdc<amrc> dcdcVar4 = this.C;
            int size4 = dcdcVar4.size();
            for (i = 0; i < size4; i++) {
                amrc amrcVar3 = dcdcVar4.get(i);
                this.r.ak().b(amrcVar3.a(), amsgVar3, amrcVar3.c(), amrcVar3.d(), amrcVar3.e());
            }
        }
    }

    public final synchronized void b() {
        dcdc r;
        Runnable runnable;
        aldv aldvVar = this.a;
        aldvVar.b();
        synchronized (aldvVar) {
            r = dcdc.r(aldvVar.d);
            aldvVar.d.clear();
        }
        int size = r.size();
        for (int i = 0; i < size; i++) {
            aldvVar.a.e((aktd) r.get(i));
        }
        for (aktg aktgVar : aldvVar.c) {
            aldvVar.b.j(aktgVar);
        }
        aldvVar.c.clear();
        c();
        this.j.h();
        crfl crflVar = this.t;
        if (crflVar != null && (runnable = this.u) != null) {
            crflVar.f(runnable);
        }
        if (!this.g.isEmpty()) {
            this.f.c(this.g);
            this.g = dcdc.e();
        }
        vtx vtxVar = this.h;
        if (vtxVar != null) {
            this.q.l(vtxVar);
            this.h = null;
        }
        dcdc<amrc> dcdcVar = this.B;
        int size2 = dcdcVar.size();
        for (int i2 = 0; i2 < size2; i2++) {
            amrc amrcVar = dcdcVar.get(i2);
            this.r.ak().a(amrcVar.a());
            this.r.aC().e(amrcVar.a());
        }
        this.B = dcdc.e();
        algn algnVar = this.D;
        if (algnVar != null) {
            algnVar.b.j(algnVar.c);
            algnVar.b.j(algnVar.d);
            this.D = null;
        }
        dcdc<amrc> dcdcVar2 = this.C;
        int size3 = dcdcVar2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            amrc amrcVar2 = dcdcVar2.get(i3);
            this.r.ak().a(amrcVar2.a());
            this.r.aC().e(amrcVar2.a());
        }
        this.C = dcdc.e();
        aley aleyVar = this.l;
        if (aleyVar != null) {
            aleyVar.d();
            this.l = null;
        }
        this.o = null;
    }

    @Override // defpackage.amjm
    public final void g(amjl amjlVar) {
    }

    @Override // defpackage.amjm
    public final void h(amii amiiVar) {
        dcdc r;
        this.p = amiiVar;
        a();
        if (this.z != null) {
            this.r.aC().i(this.z);
        }
        aldv aldvVar = this.a;
        synchronized (aldvVar) {
            r = dcdc.r(aldvVar.d);
            aldvVar.d.clear();
        }
        int size = r.size();
        for (int i = 0; i < size; i++) {
            aldvVar.a.f((aktd) r.get(i));
        }
        synchronized (aldvVar) {
            aldvVar.e.addAll(r);
        }
    }

    @Override // defpackage.amjm
    public final void i(amii amiiVar) {
        c();
        if (this.z != null) {
            this.r.aC().j(this.z);
        }
        this.a.b();
    }

    @Override // defpackage.amjm
    public final boolean k() {
        return true;
    }
}
