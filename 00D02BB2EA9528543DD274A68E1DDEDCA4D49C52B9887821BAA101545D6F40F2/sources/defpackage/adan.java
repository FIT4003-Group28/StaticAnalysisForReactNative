package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adan  reason: default package */
/* loaded from: classes2.dex */
public final class adan extends adae<adar> {
    public static final /* synthetic */ int b = 0;
    private static final dcqe c = dcqe.c("adan");
    private final bssx d;
    private dcdc<drgf> e;
    private dcdc<cqix<adar>> f;

    public adan(bssx bssxVar, final acyr acyrVar) {
        super(o(dbud.a(new dbty(acyrVar) { // from class: adam
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adan.b;
                dktp dktpVar = acyrVar2.a().C;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.d = bssxVar;
        this.f = dcdc.e();
        this.e = dcdc.e();
    }

    private final void q(awwb awwbVar) {
        dcdc<drgf> f;
        dbsg dbsgVar;
        dbsg i;
        dbsg dbsgVar2;
        drbr drbrVar = (drbr) awwbVar.a(awvv.D).f();
        if (drbrVar == null) {
            f = dcdc.e();
        } else {
            dccx F = dcdc.F();
            drgh drghVar = drbrVar.b;
            if (drghVar == null) {
                drghVar = drgh.b;
            }
            for (drgf drgfVar : drghVar.a) {
                int a = drge.a(drgfVar.b);
                if (a != 0 && a == 2) {
                    F.g(drgfVar);
                } else {
                    Object[] objArr = new Object[1];
                    int a2 = drge.a(drgfVar.b);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    objArr[0] = Integer.valueOf(a2 - 1);
                    bvoo.h("Received unexpected placement from server: %s", objArr);
                }
            }
            f = F.f();
        }
        if (!dchl.m(f, this.e)) {
            adaq adaqVar = new adaq();
            final bssx bssxVar = this.d;
            drgg bZ = drgh.b.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drgh drghVar2 = (drgh) bZ.b;
            dsrj<drgf> dsrjVar = drghVar2.a;
            if (!dsrjVar.a()) {
                drghVar2.a = dsqw.cl(dsrjVar);
            }
            dsod.bv(f, drghVar2.a);
            drgh bK = bZ.bK();
            if (bK == null || bK.a.size() == 0) {
                dbsgVar = dbpy.a;
            } else if (bK.a.size() > 1) {
                bvoo.h("Expected 1 or less serverside experiments but received %d", Integer.valueOf(bK.a.size()));
                dbsgVar = dbpy.a;
            } else {
                dbsgVar = dbsg.i(bK.a.get(0));
            }
            if (!dbsgVar.a()) {
                i = dbpy.a;
            } else {
                drgb drgbVar = ((drgf) dbsgVar.b()).a;
                if (drgbVar == null) {
                    drgbVar = drgb.c;
                }
                drga drgaVar = drga.MOD_CAROUSEL;
                if (drga.a(drgbVar.a).ordinal() != 0) {
                    bvoo.h("Received unexpected ServersideExperiments component from server: %s", drga.a(drgbVar.a));
                    i = dbpy.a;
                } else {
                    drgn drgnVar = drgbVar.a == 1 ? (drgn) drgbVar.b : drgn.b;
                    dccx F2 = dcdc.F();
                    for (drgm drgmVar : drgnVar.a) {
                        bstf bstfVar = new bstf();
                        bstj bstjVar = bssxVar.b;
                        drgp drgpVar = drgmVar.c;
                        if (drgpVar == null) {
                            drgpVar = drgp.c;
                        }
                        if ((drgpVar.a & 1) != 0) {
                            drgp drgpVar2 = drgmVar.c;
                            if (drgpVar2 == null) {
                                drgpVar2 = drgp.c;
                            }
                            dbsgVar2 = dbsg.i(drgpVar2.b);
                        } else {
                            dbsgVar2 = dbpy.a;
                        }
                        dbsg i2 = (drgmVar.a & 4) != 0 ? dbsg.i(drgmVar.d) : dbpy.a;
                        final drgj drgjVar = drgmVar.b;
                        if (drgjVar == null) {
                            drgjVar = drgj.c;
                        }
                        F2.g(cqgr.fT(bstfVar, new bsti(dbsgVar2, i2, drgjVar.a == 1 ? dbsg.i(new Runnable(bssxVar, drgjVar) { // from class: bssw
                            private final bssx a;
                            private final drgj b;

                            {
                                this.a = bssxVar;
                                this.b = drgjVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                dqdk dqdkVar;
                                bssx bssxVar2 = this.a;
                                drgj drgjVar2 = this.b;
                                afha a3 = bssxVar2.c.a();
                                if (drgjVar2.a == 1) {
                                    dqdkVar = (dqdk) drgjVar2.b;
                                } else {
                                    dqdkVar = dqdk.e;
                                }
                                a3.D(dqdkVar);
                            }
                        }) : dbpy.a)));
                    }
                    ihx ihxVar = new ihx();
                    iic j = iid.j();
                    j.e(F2.f());
                    i = dbsg.i(cqix.d(ihxVar, j.f(), true));
                }
            }
            this.f = dcdc.f(cqgr.fT(adaqVar, new adas(i)));
            this.e = f;
        }
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        this.f = dcdc.e();
        this.e = dcdc.e();
        q(awwbVar);
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        if (awwbVar.c(awvv.D).a()) {
            q(awwbVar);
        }
    }

    @Override // defpackage.adae
    public final List<cqix<adar>> k(List<cqix<?>> list) {
        return this.f;
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> l() {
        return dcep.B(awvv.D);
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> m() {
        return dcmr.a;
    }
}
