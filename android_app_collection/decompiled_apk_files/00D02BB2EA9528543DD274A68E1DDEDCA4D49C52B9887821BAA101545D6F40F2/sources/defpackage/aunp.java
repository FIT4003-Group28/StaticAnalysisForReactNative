package defpackage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aunp  reason: default package */
/* loaded from: classes2.dex */
public final class aunp {
    private static final long a = TimeUnit.DAYS.toMillis(28);
    private final bvjj b;
    private final cqat c;

    public aunp(bvjj bvjjVar, cqat cqatVar) {
        this.b = bvjjVar;
        this.c = cqatVar;
    }

    private static boolean d(auni auniVar, auni auniVar2) {
        if (auniVar.b == auniVar2.b) {
            if (((auniVar.a & 2) != 0) == ((auniVar2.a & 2) != 0) && auniVar.c.equals(auniVar2.c)) {
                return true;
            }
        }
        return false;
    }

    @dzsi
    private final synchronized aunm e(auni auniVar, int i) {
        aunk aunkVar = (aunk) this.b.L(bvjk.dp, (dssr) aunk.b.cu(7), null);
        if (aunkVar != null) {
            for (aunm aunmVar : aunkVar.a) {
                auni auniVar2 = aunmVar.b;
                if (auniVar2 == null) {
                    auniVar2 = auni.e;
                }
                if (d(auniVar, auniVar2)) {
                    int a2 = auno.a(aunmVar.d);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    if (a2 == i) {
                        return aunmVar;
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void a(auni auniVar, int i, @dzsi int i2) {
        long b = this.c.b();
        ArrayList arrayList = new ArrayList();
        aunl bZ = aunm.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        aunm aunmVar = (aunm) bZ.b;
        auniVar.getClass();
        aunmVar.b = auniVar;
        int i3 = aunmVar.a | 1;
        aunmVar.a = i3;
        int i4 = i3 | 2;
        aunmVar.a = i4;
        aunmVar.c = b;
        aunmVar.d = i - 1;
        int i5 = i4 | 4;
        aunmVar.a = i5;
        if (i2 != 0) {
            aunmVar.e = i2 - 1;
            aunmVar.a = i5 | 8;
        }
        arrayList.add(bZ.bK());
        for (aunm aunmVar2 : ((aunk) this.b.L(bvjk.dp, (dssr) aunk.b.cu(7), aunk.b)).a) {
            auni auniVar2 = aunmVar2.b;
            if (auniVar2 == null) {
                auniVar2 = auni.e;
            }
            if (auniVar2.d + a > b) {
                auni auniVar3 = aunmVar2.b;
                if (auniVar3 == null) {
                    auniVar3 = auni.e;
                }
                if (d(auniVar, auniVar3)) {
                    int a2 = auno.a(aunmVar2.d);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    if (a2 != i) {
                    }
                }
                arrayList.add(aunmVar2);
            }
        }
        bvjj bvjjVar = this.b;
        bvjk bvjkVar = bvjk.dp;
        aunj bZ2 = aunk.b.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        aunk aunkVar = (aunk) bZ2.b;
        dsrj<aunm> dsrjVar = aunkVar.a;
        if (!dsrjVar.a()) {
            aunkVar.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(arrayList, aunkVar.a);
        bvjjVar.al(bvjkVar, bZ2.bK());
    }

    public final synchronized boolean b(auni auniVar, int i) {
        aunk aunkVar = (aunk) this.b.L(bvjk.dp, (dssr) aunk.b.cu(7), null);
        if (aunkVar == null) {
            return false;
        }
        for (aunm aunmVar : aunkVar.a) {
            auni auniVar2 = aunmVar.b;
            if (auniVar2 == null) {
                auniVar2 = auni.e;
            }
            if (auniVar.equals(auniVar2)) {
                int a2 = auno.a(aunmVar.d);
                if (a2 == 0) {
                    a2 = 1;
                }
                if (a2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    @dzsi
    public final synchronized Long c(auni auniVar, int i) {
        aunm e = e(auniVar, i);
        if (e == null) {
            return null;
        }
        return Long.valueOf(e.c);
    }
}
