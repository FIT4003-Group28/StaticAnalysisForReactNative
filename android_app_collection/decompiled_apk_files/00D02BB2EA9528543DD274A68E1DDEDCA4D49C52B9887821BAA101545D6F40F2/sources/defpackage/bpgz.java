package defpackage;
/* compiled from: PG */
/* renamed from: bpgz  reason: default package */
/* loaded from: classes3.dex */
final class bpgz implements bpsr {
    final /* synthetic */ bpha a;

    public bpgz(bpha bphaVar) {
        this.a = bphaVar;
    }

    @Override // defpackage.bpsr
    public final void a() {
        bpha bphaVar = this.a;
        if (bphaVar.aD) {
            gga ggaVar = bphaVar.aE;
            dbsk.s(ggaVar);
            jmw.d(ggaVar, new Runnable(this) { // from class: bpgy
                private final bpgz a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    bpha bphaVar2 = this.a.a;
                    bptn bptnVar = bphaVar2.ak;
                    dbsg m = dcft.m(bpvi.c(bphaVar2.ai), new dbsl(bphaVar2) { // from class: bpgv
                        private final bpha a;

                        {
                            this.a = bphaVar2;
                        }

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj) {
                            bpha bphaVar3 = this.a;
                            dpsn dpsnVar = ((drkz) obj).b;
                            if (dpsnVar == null) {
                                dpsnVar = dpsn.d;
                            }
                            return akqi.j(dpsnVar).equals(bphaVar3.am);
                        }
                    });
                    if (m.a()) {
                        dpyn dpynVar = ((drkz) m.b()).c;
                        if (dpynVar == null) {
                            dpynVar = dpyn.d;
                        }
                        str = dpynVar.b;
                    } else {
                        dpyn dpynVar2 = bphaVar2.ai.a.get(0).c;
                        if (dpynVar2 == null) {
                            dpynVar2 = dpyn.d;
                        }
                        str = dpynVar2.b;
                    }
                    bokk bokkVar = new bokk(str, false);
                    bpsw bpswVar = bphaVar2.ae;
                    dcdc z = dcbg.b(bphaVar2.ai.a).s(bpgw.a).z();
                    dodb dodbVar = (dodb) m.h(bpgx.a).f();
                    dner bZ = dnet.h.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnet dnetVar = (dnet) bZ.b;
                    dnetVar.a |= 1;
                    dnetVar.b = 13;
                    bptnVar.a(bpswVar.e(z, dodbVar, bokkVar, bZ.bK(), bphaVar2.al, bphaVar2.aj), true);
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
