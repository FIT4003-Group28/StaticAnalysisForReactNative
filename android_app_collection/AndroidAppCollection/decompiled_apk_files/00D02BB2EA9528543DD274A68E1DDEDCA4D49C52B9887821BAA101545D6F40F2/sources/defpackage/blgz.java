package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: blgz  reason: default package */
/* loaded from: classes3.dex */
public final class blgz extends blho {
    public final ilo a;
    public boolean b;
    private final cebq c;

    public blgz(cebq cebqVar, ilo iloVar, blhw blhwVar) {
        super(blhwVar);
        this.b = false;
        this.a = iloVar;
        this.c = cebqVar;
    }

    @Override // defpackage.blho
    public final boolean a() {
        return !this.e.e().isEmpty() && !this.b;
    }

    @Override // defpackage.blho
    protected final void b() {
        this.c.a(bwrs.a(this.a), this.e.e(), new cebp(this) { // from class: blgv
            private final blgz a;

            {
                this.a = this;
            }

            @Override // defpackage.cebp
            public final void a(cdjd cdjdVar) {
                final cdjd cdjdVar2;
                cdjd cdsaVar;
                drey dreyVar;
                dbsg dbsgVar;
                blgz blgzVar = this.a;
                blgzVar.b = true;
                ilo iloVar = blgzVar.a;
                if (!cdjdVar.c().b().a()) {
                    cdjdVar2 = cdjdVar;
                } else {
                    String a = cdjdVar.c().b().b().a();
                    cdjdVar2 = cdjdVar;
                    dbsg r = dcbg.b(iloVar.bB()).r(new dbsl(cdjdVar2) { // from class: blgx
                        private final cdjd a;

                        {
                            this.a = cdjdVar2;
                        }

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj) {
                            return ((doft) obj).d.equals(this.a.a().g());
                        }
                    });
                    if (r.a()) {
                        dcep B = dcbg.b(cdjdVar.c().c()).s(blgy.a).B();
                        ArrayList arrayList = new ArrayList();
                        for (dofs dofsVar : ((doft) r.b()).f) {
                            if ((dofsVar.a & 4) == 0) {
                                dreyVar = drey.USER_QUERY_MATCH;
                            } else {
                                dreyVar = drey.PLACE_TOPIC_MENTION;
                            }
                            if (!B.contains(dreyVar)) {
                                dcdc<dclz<Integer>> a2 = bljw.a(a, ((doft) r.b()).e.substring(dofsVar.b, dofsVar.c));
                                int size = a2.size();
                                int i = 0;
                                while (i < size) {
                                    dclz<Integer> dclzVar = a2.get(i);
                                    drer bZ = drew.g.bZ();
                                    int intValue = dclzVar.n().intValue();
                                    if (bZ.c) {
                                        bZ.bF();
                                        bZ.c = false;
                                    }
                                    drew drewVar = (drew) bZ.b;
                                    drewVar.a |= 1;
                                    drewVar.d = intValue;
                                    int intValue2 = dclzVar.o().intValue();
                                    if (bZ.c) {
                                        bZ.bF();
                                        bZ.c = false;
                                    }
                                    drew drewVar2 = (drew) bZ.b;
                                    int i2 = drewVar2.a | 2;
                                    drewVar2.a = i2;
                                    drewVar2.e = intValue2;
                                    drewVar2.f = dreyVar.e;
                                    drewVar2.a = i2 | 4;
                                    if ((dofsVar.a & 4) != 0) {
                                        dreu bZ2 = drev.c.bZ();
                                        drdl bZ3 = drdm.e.bZ();
                                        drdk drdkVar = dofsVar.d;
                                        if (drdkVar == null) {
                                            drdkVar = drdk.c;
                                        }
                                        dbsgVar = r;
                                        if (bZ3.c) {
                                            bZ3.bF();
                                            bZ3.c = false;
                                        }
                                        drdm drdmVar = (drdm) bZ3.b;
                                        drdkVar.getClass();
                                        drdmVar.b = drdkVar;
                                        drdmVar.a |= 1;
                                        if (bZ2.c) {
                                            bZ2.bF();
                                            bZ2.c = false;
                                        }
                                        drev drevVar = (drev) bZ2.b;
                                        drdm bK = bZ3.bK();
                                        bK.getClass();
                                        drevVar.b = bK;
                                        drevVar.a |= 1;
                                        if (bZ.c) {
                                            bZ.bF();
                                            bZ.c = false;
                                        }
                                        drew drewVar3 = (drew) bZ.b;
                                        drev bK2 = bZ2.bK();
                                        bK2.getClass();
                                        drewVar3.c = bK2;
                                        drewVar3.b = 4;
                                    } else {
                                        dbsgVar = r;
                                    }
                                    arrayList.add(bZ.bK());
                                    i++;
                                    r = dbsgVar;
                                }
                            }
                        }
                        dmbc i3 = cdjdVar.i();
                        dsqp dsqpVar = (dsqp) i3.cu(5);
                        dsqpVar.bC(i3);
                        dmbb dmbbVar = (dmbb) dsqpVar;
                        dmbg dmbgVar = i3.d;
                        if (dmbgVar == null) {
                            dmbgVar = dmbg.i;
                        }
                        dsqp dsqpVar2 = (dsqp) dmbgVar.cu(5);
                        dsqpVar2.bC(dmbgVar);
                        dmbf dmbfVar = (dmbf) dsqpVar2;
                        dmbg dmbgVar2 = i3.d;
                        if (dmbgVar2 == null) {
                            dmbgVar2 = dmbg.i;
                        }
                        dmcc dmccVar = dmbgVar2.c;
                        if (dmccVar == null) {
                            dmccVar = dmcc.i;
                        }
                        dsqp dsqpVar3 = (dsqp) dmccVar.cu(5);
                        dsqpVar3.bC(dmccVar);
                        dmcb dmcbVar = (dmcb) dsqpVar3;
                        dmcbVar.a(arrayList);
                        if (dmbfVar.c) {
                            dmbfVar.bF();
                            dmbfVar.c = false;
                        }
                        dmbg dmbgVar3 = (dmbg) dmbfVar.b;
                        dmcc bK3 = dmcbVar.bK();
                        bK3.getClass();
                        dmbgVar3.c = bK3;
                        dmbgVar3.a |= 2;
                        if (dmbbVar.c) {
                            dmbbVar.bF();
                            dmbbVar.c = false;
                        }
                        dmbc dmbcVar = (dmbc) dmbbVar.b;
                        dmbg bK4 = dmbfVar.bK();
                        bK4.getClass();
                        dmbcVar.d = bK4;
                        dmbcVar.a |= 4;
                        cdsaVar = new cdsa(dmbbVar.bK());
                        blgzVar.f(blhy.c(dcdc.f(cdsaVar)));
                    }
                }
                cdsaVar = cdjdVar2;
                blgzVar.f(blhy.c(dcdc.f(cdsaVar)));
            }
        }, new Runnable(this) { // from class: blgw
            private final blgz a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                blgz blgzVar = this.a;
                blgzVar.b = true;
                blgzVar.f(blhy.a);
            }
        });
    }
}
