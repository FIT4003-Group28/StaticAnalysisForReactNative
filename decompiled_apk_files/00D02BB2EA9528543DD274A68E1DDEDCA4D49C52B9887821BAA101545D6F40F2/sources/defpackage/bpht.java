package defpackage;
/* compiled from: PG */
/* renamed from: bpht  reason: default package */
/* loaded from: classes3.dex */
final class bpht implements bpsr {
    final /* synthetic */ bphv a;

    public bpht(bphv bphvVar) {
        this.a = bphvVar;
    }

    @Override // defpackage.bpsr
    public final void a() {
        bphv bphvVar = this.a;
        if (bphvVar.aD) {
            gga ggaVar = bphvVar.aE;
            dbsk.s(ggaVar);
            jmw.d(ggaVar, new Runnable(this) { // from class: bphs
                private final bpht a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    bphv bphvVar2 = this.a.a;
                    bptn bptnVar = bphvVar2.ak;
                    dbsg m = dcft.m(bpvi.c(bphvVar2.ai), new dbsl(bphvVar2) { // from class: bphp
                        private final bphv a;

                        {
                            this.a = bphvVar2;
                        }

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj) {
                            bphv bphvVar3 = this.a;
                            dpsn dpsnVar = ((drkz) obj).b;
                            if (dpsnVar == null) {
                                dpsnVar = dpsn.d;
                            }
                            return akqi.j(dpsnVar).equals(bphvVar3.an);
                        }
                    });
                    if (m.a()) {
                        dpyn dpynVar = ((drkz) m.b()).c;
                        if (dpynVar == null) {
                            dpynVar = dpyn.d;
                        }
                        str = dpynVar.b;
                    } else {
                        dpyn dpynVar2 = bphvVar2.ai.a.get(0).c;
                        if (dpynVar2 == null) {
                            dpynVar2 = dpyn.d;
                        }
                        str = dpynVar2.b;
                    }
                    bokk bokkVar = new bokk(str, false);
                    bpsw bpswVar = bphvVar2.ae;
                    dcdc z = dcbg.b(bphvVar2.ai.a).s(bphq.a).z();
                    dodb dodbVar = (dodb) m.h(bphr.a).f();
                    dner bZ = dnet.h.bZ();
                    int ordinal = bphvVar2.am.ordinal();
                    int i = 10;
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            i = 6;
                        } else if (ordinal == 2) {
                            i = 18;
                        } else if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw null;
                            }
                            i = 13;
                        }
                    }
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnet dnetVar = (dnet) bZ.b;
                    dnetVar.a |= 1;
                    dnetVar.b = i;
                    bptnVar.a(bpswVar.e(z, dodbVar, bokkVar, bZ.bK(), bphvVar2.al, bphvVar2.aj), true);
                }
            });
        }
    }

    @Override // defpackage.bpsr
    public final void b() {
        gga ggaVar = this.a.aE;
        dbsk.s(ggaVar);
        ggaVar.s();
    }
}
