package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nwj  reason: default package */
/* loaded from: classes7.dex */
public final class nwj implements nxe {
    public final gga a;
    private final dxio<begg> b;
    private final dxio<brba> c;
    private final dxio<cbzd> d;
    private final dxio<cbze> e;
    private final bvrb f;
    private final bxeg g;

    public nwj(gga ggaVar, dxio dxioVar, dxio dxioVar2, dxio dxioVar3, dxio dxioVar4, bxeg bxegVar, bvrb bvrbVar) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dxioVar3;
        this.e = dxioVar4;
        this.g = bxegVar;
        this.f = bvrbVar;
    }

    private final void e(nwi nwiVar) {
        boolean a = this.g.a();
        if (!a) {
            this.c.a().C(true);
        }
        akqq akqqVar = nwiVar.i;
        akra e = akqqVar == null ? null : akra.e(akqqVar.a, akqqVar.b);
        cjta b = cjtd.b();
        dnqh dnqhVar = nwiVar.e;
        b.b = dnqhVar.d;
        b.g(dnqhVar.e);
        doei doeiVar = nwiVar.e.m;
        if (doeiVar == null) {
            doeiVar = doei.d;
        }
        b.c = doeiVar.b;
        cjtd d = b.d();
        ily ilyVar = new ily();
        ilyVar.j(nwiVar.b);
        ilyVar.u = nwiVar.a;
        ilw ilwVar = ilyVar.b;
        if (e != null) {
            dhjy bZ = dhjz.e.bZ();
            double k = e.k();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjz dhjzVar = (dhjz) bZ.b;
            dhjzVar.a |= 2;
            dhjzVar.c = k;
            double o = e.o();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjz dhjzVar2 = (dhjz) bZ.b;
            dhjzVar2.a |= 1;
            dhjzVar2.b = o;
            ilwVar.e = bZ.bK();
        }
        ilyVar.y = d;
        ilyVar.f = false;
        ilyVar.D();
        ilyVar.o(nwiVar.f);
        ilyVar.n(nwiVar.g);
        ilyVar.l = nwiVar.h;
        int i = nwiVar.n;
        if (i == 0 || i == 1) {
            ilyVar.F(nwiVar.d);
        } else {
            ilyVar.F("");
            ilyVar.t = nwiVar.d;
            int i2 = nwiVar.n;
            int i3 = i2 - 2;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0) {
                ilyVar.z = dndr.HOME;
            } else if (i3 == 1) {
                ilyVar.z = dndr.WORK;
            }
        }
        ilo d2 = ilyVar.d();
        begj begjVar = new begj();
        begjVar.b(d2);
        begjVar.d = nwiVar.e;
        begjVar.K = true;
        begjVar.E = true;
        this.b.a().n(begjVar, a, null);
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 1) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        akqi akqiVar;
        int i;
        akqq akqqVar;
        dtov dtovVar = nviVar.a.c;
        if (dtovVar == null) {
            dtovVar = dtov.o;
        }
        cjsb cjsbVar = new cjsb();
        cjsbVar.e(nviVar.c.b);
        cjsbVar.f(nviVar.c.c.a().f());
        cjsbVar.j(dtovVar.k);
        dnqh a = cjsbVar.a();
        String b = oxd.b(dtovVar);
        if ((dtovVar.a & 4) != 0) {
            dgrh dgrhVar = dtovVar.d;
            if (dgrhVar == null) {
                dgrhVar = dgrh.d;
            }
            akqiVar = akqi.k(dgrhVar);
        } else {
            akqiVar = null;
        }
        dspd dspdVar = dtovVar.j;
        int i2 = dtovVar.a;
        String str = (i2 & 512) != 0 ? dtovVar.h : null;
        if ((i2 & 1024) != 0) {
            int a2 = dtnx.a(dtovVar.i);
            i = a2 == 0 ? 1 : a2;
        } else {
            i = 0;
        }
        boolean z = dtovVar.e;
        boolean z2 = dtovVar.l;
        boolean z3 = dtovVar.m;
        boolean z4 = dtovVar.n;
        if ((dtovVar.a & 64) != 0) {
            dgrn dgrnVar = dtovVar.f;
            if (dgrnVar == null) {
                dgrnVar = dgrn.d;
            }
            akqqVar = akqq.m(dgrnVar);
        } else {
            akqqVar = null;
        }
        d(b, akqiVar, dspdVar, str, i, a, z, z2, z3, z4, akqqVar, false);
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.SEARCH);
        set.add(dthd.SEARCH_NAVIGATIONAL);
    }

    public final void d(@dzsi String str, @dzsi akqi akqiVar, dspd dspdVar, @dzsi String str2, @dzsi int i, dnqh dnqhVar, boolean z, boolean z2, boolean z3, boolean z4, @dzsi akqq akqqVar, boolean z5) {
        nwi nwiVar = new nwi();
        nwiVar.a = str;
        nwiVar.b = akqiVar;
        dbsk.s(dspdVar);
        nwiVar.c = dspdVar;
        nwiVar.d = dbsj.e(str2);
        nwiVar.n = i;
        nwiVar.e = dnqhVar;
        nwiVar.f = z2;
        nwiVar.g = z3;
        nwiVar.h = z4;
        nwiVar.i = akqqVar;
        nwiVar.j = z5;
        nwiVar.k = this.c;
        nwiVar.l = this.d;
        nwiVar.m = this.f;
        if (!z || (!akqi.d(nwiVar.b) && nwiVar.i == null)) {
            if (!dbsj.d(nwiVar.a)) {
                if (!this.e.a().b || !this.d.a().c(str).booleanValue()) {
                    dnqh dnqhVar2 = nwiVar.e;
                    dwim bZ = dwir.R.bZ();
                    String str3 = nwiVar.a;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dwir dwirVar = (dwir) bZ.b;
                    str3.getClass();
                    int i2 = 1 | dwirVar.a;
                    dwirVar.a = i2;
                    dwirVar.c = str3;
                    dspd dspdVar2 = nwiVar.c;
                    dspdVar2.getClass();
                    int i3 = i2 | 8192;
                    dwirVar.a = i3;
                    dwirVar.k = dspdVar2;
                    dnqhVar2.getClass();
                    dwirVar.s = dnqhVar2;
                    dwirVar.a = i3 | 33554432;
                    iqy iqyVar = new iqy();
                    int i4 = nwiVar.n;
                    if (i4 != 0) {
                        if (i4 == 2) {
                            iqyVar.e = dndr.HOME;
                        } else if (i4 == 3) {
                            iqyVar.e = dndr.WORK;
                        }
                    }
                    if (dnqhVar2 != null) {
                        ddxx ddxxVar = dnqhVar2.f;
                        if (ddxxVar == null) {
                            ddxxVar = ddxx.j;
                        }
                        if ((ddxxVar.a & 8) != 0) {
                            ddxx ddxxVar2 = dnqhVar2.f;
                            if (ddxxVar2 == null) {
                                ddxxVar2 = ddxx.j;
                            }
                            if (ddxxVar2.d == ((dtxi) bxkq.SPEECH_RECOGNITION.f).a) {
                                iqyVar.d();
                            }
                        }
                    }
                    iqyVar.b();
                    iqyVar.l = nwiVar.d;
                    iqyVar.g = nwiVar.j;
                    nwiVar.m.b(new nwg(this, nwiVar, bZ, iqyVar), bvrj.UI_THREAD);
                    return;
                }
                String substring = nwiVar.a.substring(1);
                cbzb c = cbzc.c();
                cbyz cbyzVar = (cbyz) c;
                cbyzVar.a = nwiVar.e.d;
                cbyzVar.b = true;
                nwiVar.m.b(new nwh(nwiVar, substring, c.a()), bvrj.UI_THREAD);
                return;
            } else if (akqi.d(nwiVar.b)) {
                e(nwiVar);
                return;
            } else {
                this.c.a().C(true);
                return;
            }
        }
        e(nwiVar);
    }
}
