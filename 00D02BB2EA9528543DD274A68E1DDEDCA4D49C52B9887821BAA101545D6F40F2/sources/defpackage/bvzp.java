package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bvzp  reason: default package */
/* loaded from: classes4.dex */
public final class bvzp extends bvwl<dmeg, dmem> {
    public final gga c;
    private final axwq d;

    public bvzp(axwq axwqVar, gga ggaVar) {
        super(dmeg.c, dmem.c);
        this.d = axwqVar;
        this.c = ggaVar;
    }

    @Override // defpackage.bvwl
    protected final /* bridge */ /* synthetic */ dmem g(dmeg dmegVar) {
        dmel bZ = dmem.b.bZ();
        for (dmdp dmdpVar : dmegVar.a) {
            dgrh dgrhVar = bkkc.a(dmdpVar.a).b;
            if (dgrhVar == null) {
                dgrhVar = dgrh.d;
            }
            akqi k = akqi.k(dgrhVar);
            dbsg<azva> k2 = this.d.k(k);
            List<azvo> o = this.d.o(k);
            if (k2.a() || !o.isEmpty()) {
                final dmej bZ2 = dmek.d.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dmek dmekVar = (dmek) bZ2.b;
                dmdpVar.getClass();
                dmekVar.b = dmdpVar;
                dmekVar.a |= 1;
                dbsg<V> h = k2.h(new dbrn(this) { // from class: bvzn
                    private final bvzp a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        bvzp bvzpVar = this.a;
                        azva azvaVar = (azva) obj;
                        dmeh bZ3 = dmei.d.bZ();
                        dndr dndrVar = azvaVar.a;
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dmei dmeiVar = (dmei) bZ3.b;
                        dmeiVar.b = dndrVar.h;
                        dmeiVar.a |= 1;
                        String e = azvaVar.e(bvzpVar.c);
                        if (!e.isEmpty()) {
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            dmei dmeiVar2 = (dmei) bZ3.b;
                            e.getClass();
                            dmeiVar2.a |= 2;
                            dmeiVar2.c = e;
                        }
                        return bZ3.bK();
                    }
                });
                bZ2.getClass();
                bvor.a(h, new mw(bZ2) { // from class: bvzo
                    private final dmej a;

                    {
                        this.a = bZ2;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj) {
                        this.a.a((dmei) obj);
                    }
                });
                for (azvo azvoVar : o) {
                    dmeh bZ3 = dmei.d.bZ();
                    dndr dndrVar = dndr.CONTACT;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dmei dmeiVar = (dmei) bZ3.b;
                    dmeiVar.b = dndrVar.h;
                    dmeiVar.a |= 1;
                    String e = azvoVar.e(this.c);
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dmei dmeiVar2 = (dmei) bZ3.b;
                    e.getClass();
                    dmeiVar2.a |= 2;
                    dmeiVar2.c = e;
                    bZ2.a(bZ3.bK());
                }
                dmek bK = bZ2.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmem dmemVar = (dmem) bZ.b;
                bK.getClass();
                dsrj<dmek> dsrjVar = dmemVar.a;
                if (!dsrjVar.a()) {
                    dmemVar.a = dsqw.cl(dsrjVar);
                }
                dmemVar.a.add(bK);
            }
        }
        return bZ.bK();
    }
}
