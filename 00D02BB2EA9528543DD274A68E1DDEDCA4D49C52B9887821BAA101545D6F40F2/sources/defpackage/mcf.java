package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mcf  reason: default package */
/* loaded from: classes7.dex */
public final class mcf implements atzb {
    final /* synthetic */ mcg a;

    public mcf(mcg mcgVar) {
        this.a = mcgVar;
    }

    @Override // defpackage.atzb
    public final void a(brlu brluVar, boolean z) {
        ilo d;
        akqq aj;
        int i;
        boolean z2 = brluVar.e;
        boolean z3 = brluVar.d;
        if (!z2) {
            return;
        }
        if (brluVar.E() != 0) {
            brluVar.o.s();
            int i2 = z3 ? 8 : 9;
            dccx G = dcdc.G(brluVar.E());
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= brluVar.E()) {
                    break;
                }
                broh D = brluVar.D(i3);
                if (D.c() && (aj = (d = D.d()).aj()) != null) {
                    if (z) {
                        mcg mcgVar = this.a;
                        amvh d2 = d.d();
                        amvh[] amvhVarArr = mcgVar.g;
                        int length = amvhVarArr.length;
                        int i5 = 0;
                        while (i5 < length) {
                            i = i3;
                            if (!d2.e(amvhVarArr[i5], 1.0d)) {
                                i5++;
                                i3 = i;
                            }
                        }
                    }
                    i = i3;
                    akra f = akra.f(aj);
                    boolean z4 = this.a.d.a.getCarParameters().m;
                    aryq aryqVar = aryq.GENERIC;
                    mcg mcgVar2 = this.a;
                    mck a = mck.a(d, f, mcgVar2.a, mcgVar2.c, z3, aryqVar);
                    akqi ai = d.ai();
                    if (this.a.h == null || !ai.o().equals(this.a.h.f())) {
                        i4++;
                        G.g(a);
                        d.F();
                        if (i4 >= i2) {
                            break;
                        }
                    } else {
                        G = dcdc.F();
                        G.g(a);
                        break;
                    }
                } else {
                    i = i3;
                }
                i3 = i + 1;
            }
            this.a.e(astb.SEARCH_NOT_AUTOREFRESHING, mco.d(G.f(), z3, brluVar.o));
            return;
        }
        this.a.e(astb.NO_SEARCH, mco.d(dcdc.e(), z3, null));
    }

    @Override // defpackage.atzb
    public final void b(bttq bttqVar) {
        this.a.e(astb.NO_SEARCH, mco.d(dcdc.e(), bttqVar == bttq.NO_CONNECTIVITY, null));
    }
}
