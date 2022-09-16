package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: sty  reason: default package */
/* loaded from: classes4.dex */
final class sty extends dhj {
    @dfs(a = 6)
    List k;
    @dfs(a = 13)
    axmr l;
    @dfs(a = 13)
    aypf m;
    @dfs(a = 13)
    tda n;
    @dfs(a = 13)
    tdi o;
    @dfs(a = 13)
    tdr p;

    public sty() {
        super("CollectionSection");
    }

    @Override // defpackage.dhj
    public final boolean d(dhj dhjVar) {
        if (this == dhjVar) {
            return true;
        }
        if (dhjVar == null || getClass() != dhjVar.getClass()) {
            return false;
        }
        sty styVar = (sty) dhjVar;
        List list = this.k;
        if (list != null) {
            if (styVar.k == null || list.size() != styVar.k.size()) {
                return false;
            }
            Iterator it = this.k.iterator();
            Iterator it2 = styVar.k.iterator();
            while (it.hasNext() && it2.hasNext()) {
                if (!((cyr) it.next()).f((cyr) it2.next())) {
                    return false;
                }
            }
        } else if (styVar.k != null) {
            return false;
        }
        axmr axmrVar = this.l;
        if (axmrVar == null ? styVar.l != null : !axmrVar.equals(styVar.l)) {
            return false;
        }
        aypf aypfVar = this.m;
        if (aypfVar == null ? styVar.m != null : !aypfVar.equals(styVar.m)) {
            return false;
        }
        tda tdaVar = this.n;
        if (tdaVar == null ? styVar.n != null : !tdaVar.equals(styVar.n)) {
            return false;
        }
        tdi tdiVar = this.o;
        if (tdiVar == null ? styVar.o != null : !tdiVar.equals(styVar.o)) {
            return false;
        }
        tdr tdrVar = this.p;
        return tdrVar == null ? styVar.p == null : tdrVar.equals(styVar.p);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhl
    public final dhf e(dhk dhkVar) {
        tda tdaVar = this.n;
        tdr tdrVar = this.p;
        tdi tdiVar = this.o;
        aypf aypfVar = this.m;
        axmr axmrVar = this.l;
        List<cyr> list = this.k;
        dhf dhfVar = new dhf();
        if (axmrVar.aH() > 0) {
            aodt aodtVar = new aodt();
            aodt aodtVar2 = new aodt();
            int i = 0;
            while (i < axmrVar.aH()) {
                int i2 = 4;
                int b = axmrVar.b(4);
                if (b != 0) {
                    aodtVar2.f(axmrVar.a(axmrVar.c(b) + (i * 4)), axmrVar.b);
                }
                int i3 = 0;
                while (true) {
                    int b2 = aodtVar2.b(i2);
                    if (i3 < (b2 != 0 ? aodtVar2.d(b2) : 0)) {
                        int b3 = aodtVar2.b(i2);
                        if (b3 != 0) {
                            aodtVar.f(aodtVar2.a(aodtVar2.c(b3) + (i3 * 4)), aodtVar2.b);
                        }
                        int i4 = i3;
                        int i5 = i;
                        cyr b4 = tdrVar.b(dhkVar, tdaVar, aodtVar, tdiVar, aypfVar);
                        if (b4 != null) {
                            dhy j = dhz.j(dhkVar);
                            j.R(b4);
                            czu.Q(j, dhfVar);
                        }
                        i3 = i4 + 1;
                        i = i5;
                        i2 = 4;
                    }
                }
                i++;
            }
        } else if (list != null) {
            for (cyr cyrVar : list) {
                dhy j2 = dhz.j(dhkVar);
                j2.R(cyrVar);
                czu.Q(j2, dhfVar);
            }
        }
        return dhfVar;
    }

    @Override // defpackage.dhj, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return d((dhj) obj);
    }
}
