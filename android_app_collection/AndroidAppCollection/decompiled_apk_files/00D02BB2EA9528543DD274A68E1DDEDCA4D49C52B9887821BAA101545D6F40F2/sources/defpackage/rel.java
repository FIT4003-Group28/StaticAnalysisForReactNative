package defpackage;

import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: rel  reason: default package */
/* loaded from: classes7.dex */
public class rel implements reg {
    private static final cjtd c;
    private static final cjtd d;
    private final gga e;
    private final btvo f;
    private final cjqq g;
    private final int i;
    private final int j;
    private dbsg<dozz> h = dbpy.a;
    boolean a = false;
    boolean b = false;

    static {
        cjta b = cjtd.b();
        b.d = dtxl.bL;
        b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
        c = b.a();
        cjta b2 = cjtd.b();
        b2.d = dtxl.bD;
        b2.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
        d = b2.a();
    }

    public rel(gga ggaVar, btvo btvoVar, cjqq cjqqVar) {
        this.e = ggaVar;
        this.f = btvoVar;
        this.g = cjqqVar;
        int a = dkhy.a(btvoVar.getCommuteDrivingImmersiveParameters().e);
        int i = 1;
        this.i = a == 0 ? 1 : a;
        int a2 = dkhy.a(btvoVar.getCommuteDrivingImmersiveParameters().c);
        this.j = a2 != 0 ? a2 : i;
    }

    private final boolean i() {
        int i = this.j;
        return i == 3 || i == 4;
    }

    private final boolean j() {
        int i = this.i;
        return i == 3 || i == 4;
    }

    @Override // defpackage.reg
    @dzsi
    public CharSequence b() {
        if (this.h.a()) {
            String s = alcf.s(this.h.b().m);
            if (s != null || (s = this.h.b().i) != null) {
                return s;
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.reg
    public cqtd c() {
        if (this.a) {
            return iup.e(R.raw.road_closure);
        }
        return iup.e(R.raw.suspected_road_closure);
    }

    @Override // defpackage.reg
    public cqss d() {
        if (this.a) {
            return ibm.A();
        }
        return ibm.F();
    }

    @Override // defpackage.reg
    @dzsi
    public cjtd e() {
        return cjtd.a(this.a ? dtxl.bD : dtxl.bL);
    }

    @Override // defpackage.reg
    public cqkl f() {
        amwb a;
        dbsg dbsgVar;
        dozs dozsVar;
        doud doudVar;
        if (this.h.a()) {
            dozz b = this.h.b();
            if (b.b != 22 || ((dozs) b.c).k.size() <= 0) {
                long E = amwb.E(b.s);
                amwa J = amwb.J();
                J.c(E);
                J.b(b.i);
                doyd b2 = doyd.b(b.t);
                if (b2 == null) {
                    b2 = doyd.INCIDENT_OTHER;
                }
                ((amvy) J).f = b2;
                J.d(true);
                a = J.a();
            } else {
                a = amwb.F(b);
            }
            if (b.b == 22) {
                dozs dozsVar2 = (dozs) b.c;
                if ((dozsVar2.a & 512) != 0) {
                    dozr dozrVar = dozsVar2.l;
                    if (dozrVar == null) {
                        dozrVar = dozr.e;
                    }
                    if (dozrVar.b == 1) {
                        if (b.b == 22) {
                            dozsVar = (dozs) b.c;
                        } else {
                            dozsVar = dozs.q;
                        }
                        dozr dozrVar2 = dozsVar.l;
                        if (dozrVar2 == null) {
                            dozrVar2 = dozr.e;
                        }
                        if (dozrVar2.b == 1) {
                            doudVar = (doud) dozrVar2.c;
                        } else {
                            doudVar = doud.c;
                        }
                        akrk g = akrk.g(doudVar);
                        if (g.l() == 0) {
                            dbsgVar = dbpy.a;
                        } else {
                            akra akraVar = new akra();
                            g.a().t(akraVar);
                            dbsgVar = dbsg.i(akraVar);
                        }
                    }
                }
                dbsgVar = dbpy.a;
            } else if ((b.a & ImageMetadata.LENS_APERTURE) != 0) {
                dnoh dnohVar = b.q;
                if (dnohVar == null) {
                    dnohVar = dnoh.d;
                }
                double d2 = dnohVar.b;
                dnoh dnohVar2 = b.q;
                if (dnohVar2 == null) {
                    dnohVar2 = dnoh.d;
                }
                dbsgVar = dbsg.i(akra.e(d2, dnohVar2.c));
            } else {
                dbsgVar = dbpy.a;
            }
            if (dbsgVar.a()) {
                this.e.D(byky.g(a, (akra) dbsgVar.b(), null, false));
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.reg
    public CharSequence g() {
        return null;
    }

    public void h(@dzsi amte amteVar) {
        this.b = false;
        if ((i() || j()) && amteVar != null) {
            for (amub amubVar : amteVar.a(this.e)) {
                dpeq dpeqVar = amubVar.s;
                if (dpeqVar != null) {
                    if (i()) {
                        for (dozz dozzVar : dpeqVar.f) {
                            doyd b = doyd.b(dozzVar.t);
                            if (b == null) {
                                b = doyd.INCIDENT_OTHER;
                            }
                            if (b == doyd.INCIDENT_ROAD_CLOSED) {
                                if (this.j == 4) {
                                    this.g.g().d(d);
                                } else {
                                    this.b = true;
                                }
                                this.a = true;
                                this.h = dbsg.i(dozzVar);
                                return;
                            }
                        }
                    }
                    if (j() && !this.h.a()) {
                        Iterator<dozz> it = dpeqVar.h.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                dozz next = it.next();
                                doyd b2 = doyd.b(next.t);
                                if (b2 == null) {
                                    b2 = doyd.INCIDENT_OTHER;
                                }
                                if (b2 == doyd.INCIDENT_ROAD_CLOSED) {
                                    if (this.i == 4) {
                                        this.g.g().d(c);
                                    } else {
                                        this.b = true;
                                    }
                                    this.a = false;
                                    this.h = dbsg.i(next);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.reg
    public Boolean a() {
        if (i() || j()) {
            return Boolean.valueOf(this.b);
        }
        return false;
    }
}
