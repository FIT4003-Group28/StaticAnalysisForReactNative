package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azng  reason: default package */
/* loaded from: classes3.dex */
public final class azng implements axxb {
    public final axwq a;
    private final batm b;
    private final cqat c;

    public azng(axwq axwqVar, batm batmVar, cqat cqatVar) {
        this.a = axwqVar;
        this.b = batmVar;
        this.c = cqatVar;
    }

    @Override // defpackage.axxb
    public final boolean a(ilo iloVar) {
        return g(iloVar) != null;
    }

    @Override // defpackage.axxb
    public final azxk b(ilo iloVar) {
        dolj bZ = dolk.h.bZ();
        akqq aj = iloVar.aj();
        dbsk.b(aj != null, "Unable to create StarredPlace: placemark does not have a valid lat/lng.");
        dbsk.s(aj);
        dnog bZ2 = dnoh.d.bZ();
        double d = aj.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnoh dnohVar = (dnoh) bZ2.b;
        int i = dnohVar.a | 1;
        dnohVar.a = i;
        dnohVar.b = d;
        double d2 = aj.b;
        dnohVar.a = i | 2;
        dnohVar.c = d2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dolk dolkVar = (dolk) bZ.b;
        dnoh bK = bZ2.bK();
        bK.getClass();
        dolkVar.e = bK;
        dolkVar.a |= 4;
        if (akqi.d(iloVar.ai())) {
            String o = iloVar.ai().o();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dolk dolkVar2 = (dolk) bZ.b;
            o.getClass();
            dolkVar2.a |= 16;
            dolkVar2.g = o;
        }
        String y = iloVar.y();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dolk dolkVar3 = (dolk) bZ.b;
        y.getClass();
        dolkVar3.a |= 2;
        dolkVar3.d = y;
        boolean aV = iloVar.aV();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dolk dolkVar4 = (dolk) bZ.b;
        dolkVar4.a |= 8;
        dolkVar4.f = aV;
        String n = iloVar.n();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dolk dolkVar5 = (dolk) bZ.b;
        n.getClass();
        dolkVar5.a |= 1;
        dolkVar5.b = n;
        dojy bZ3 = dojz.c.bZ();
        long b = this.c.b();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dojz dojzVar = (dojz) bZ3.b;
        dojzVar.a |= 1;
        dojzVar.b = b;
        dojz bK2 = bZ3.bK();
        dolp bZ4 = dolq.e.bZ();
        String ay = iloVar.ay();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dolq dolqVar = (dolq) bZ4.b;
        ay.getClass();
        dolqVar.a = 1 | dolqVar.a;
        dolqVar.b = ay;
        dolk bK3 = bZ.bK();
        bK3.getClass();
        dolqVar.c = bK3;
        dolqVar.a |= 2;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dolq dolqVar2 = (dolq) bZ4.b;
        bK2.getClass();
        dolqVar2.d = bK2;
        dolqVar2.a |= 4;
        return new azxj(bZ4.bK()).b();
    }

    @Override // defpackage.axxb
    public final void c(ilo iloVar) {
        bvrj.UI_THREAD.d();
        azxk b = b(iloVar);
        bvrj.UI_THREAD.d();
        dehf.a(this.a.p(azxm.e, b), axxc.class);
    }

    @Override // defpackage.axxb
    public final boolean d(ilo iloVar) {
        bvrj.UI_THREAD.d();
        try {
            azxk g = g(iloVar);
            if (g == null) {
                return false;
            }
            bvrj.UI_THREAD.d();
            return ((Boolean) dehf.a(this.a.q(g), axxc.class)).booleanValue();
        } catch (axxc unused) {
            return false;
        }
    }

    @Override // defpackage.axxb
    public final dehn<Integer> e() {
        return this.b.c(new Callable(this) { // from class: aznf
            private final azng a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i;
                try {
                    i = this.a.a.g(azxm.e).size();
                } catch (axxc unused) {
                    i = 0;
                }
                return Integer.valueOf(i);
            }
        });
    }

    @Override // defpackage.axxb
    public final dehn<Long> f() {
        return this.b.c(new Callable(this) { // from class: azne
            private final azng a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                azng azngVar = this.a;
                dcdc e = dcdc.e();
                try {
                    e = azngVar.a.g(azxm.e);
                } catch (axxc unused) {
                }
                int size = e.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    azxk azxkVar = (azxk) e.get(i);
                    if (azxkVar.q() > j) {
                        j = azxkVar.q();
                    }
                }
                return Long.valueOf(j);
            }
        });
    }

    @dzsi
    private final azxk g(ilo iloVar) {
        dcdc h;
        if (akqi.d(iloVar.D)) {
            h = this.a.i(azxm.e, iloVar.D);
        } else if (iloVar.E == null) {
            return null;
        } else {
            axwq axwqVar = this.a;
            azxm<azxk> azxmVar = azxm.e;
            akqq akqqVar = iloVar.E;
            dbsk.s(akqqVar);
            h = axwqVar.h(azxmVar, akqqVar);
        }
        return (azxk) dcft.r(h, null);
    }
}
