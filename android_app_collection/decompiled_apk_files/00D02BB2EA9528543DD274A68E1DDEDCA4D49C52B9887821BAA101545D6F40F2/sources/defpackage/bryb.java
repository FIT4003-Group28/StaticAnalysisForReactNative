package defpackage;

import java.util.List;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: bryb  reason: default package */
/* loaded from: classes4.dex */
public final class bryb {
    static final eaow a = eaow.a(90);
    static final dcem<Integer, eaow> b;

    static {
        dcek a2 = dcem.a();
        a2.b(dclz.i(5), eaow.b(1L));
        a2.b(dclz.g(5, 6), eaow.a(14L));
        a2.b(dclz.g(6, 10), eaow.b(1L));
        a2.b(dclz.g(10, 11), eaow.a(28L));
        a2.b(dclz.g(11, 15), eaow.b(1L));
        a2.b(dclz.g(15, 16), eaow.a(42L));
        a2.b(dclz.g(16, 20), eaow.b(1L));
        a2.b(dclz.l(20), eaow.a(42L));
        b = a2.a();
    }

    public static final boolean a(int i, long j, boolean z) {
        int i2;
        if (j == -1 || j < 0) {
            return true;
        }
        eapd eapdVar = new eapd(j);
        eaow eaowVar = null;
        eaow eaowVar2 = new eaow(eapdVar, (eapr) null);
        if (eaowVar2.b < 0) {
            return true;
        }
        int i3 = 0;
        if (z && eaowVar2.q(a)) {
            return false;
        }
        dcem<Integer, eaow> dcemVar = b;
        Integer valueOf = Integer.valueOf(i);
        dcdc<dclz<Integer>> dcdcVar = dcemVar.b;
        dbrn b2 = dclz.b();
        dcak j2 = dcak.j(valueOf);
        dcns dcnsVar = dcns.ANY_PRESENT;
        dcnr dcnrVar = dcnr.NEXT_LOWER;
        dcln dclnVar = dcln.a;
        List k = dchl.k(dcdcVar, b2);
        dbsk.s(dcnsVar);
        dbsk.s(dcnrVar);
        if (!(k instanceof RandomAccess)) {
            k = dchl.c(k);
        }
        int size = k.size() - 1;
        while (true) {
            if (i3 <= size) {
                int i4 = (i3 + size) >>> 1;
                int compare = dclnVar.compare(j2, k.get(i4));
                if (compare < 0) {
                    size = i4 - 1;
                } else if (compare > 0) {
                    i3 = i4 + 1;
                } else {
                    k.subList(i3, size + 1);
                    int i5 = i4 - i3;
                    int ordinal = dcnsVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            throw null;
                        }
                        if (ordinal == 2) {
                            throw null;
                        }
                        if (ordinal == 3) {
                            throw null;
                        }
                        if (ordinal == 4) {
                            throw null;
                        }
                        throw null;
                    }
                    i2 = i3 + i5;
                }
            } else if (dcnrVar.ordinal() != 0) {
                throw null;
            } else {
                i2 = i3 - 1;
            }
        }
        if (i2 != -1 && dcemVar.b.get(i2).a(valueOf)) {
            eaowVar = dcemVar.c.get(i2);
        }
        return eaowVar2.p(eaowVar);
    }
}
