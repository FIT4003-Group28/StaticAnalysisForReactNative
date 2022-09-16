package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alnu  reason: default package */
/* loaded from: classes.dex */
public final class alnu implements amlm {
    private final alrv a;
    private final alnt b;

    public alnu(alrv alrvVar) {
        this.a = alrvVar;
        this.b = new alnt(alrvVar);
    }

    private static alxp g(long j, dmpn dmpnVar, dcep<Integer> dcepVar, alrv alrvVar) {
        Object b;
        dsqv<dmpn, alwt> dsqvVar = alwu.c;
        dmpnVar.f(dsqvVar);
        if (dmpnVar.V.k(dsqvVar.d)) {
            Long valueOf = Long.valueOf(j);
            dsqv<dmpn, alwt> dsqvVar2 = alwu.c;
            dmpnVar.f(dsqvVar2);
            Object l = dmpnVar.V.l(dsqvVar2.d);
            if (l == null) {
                b = dsqvVar2.b;
            } else {
                b = dsqvVar2.b(l);
            }
            return h(valueOf, ((alwt) b).f, dcepVar, alrvVar);
        }
        return alrvVar.p(alrvVar.u(Long.valueOf(j), dcepVar).longValue());
    }

    private static alxp h(Long l, int i, dcep<Integer> dcepVar, alrv alrvVar) {
        long longValue = alrvVar.v(l, dcepVar, i).longValue();
        alxs y = alrvVar.y(i);
        if (y != null) {
            return y.a(longValue);
        }
        return alxp.e;
    }

    private static alxp i(Long l, dcep<Integer> dcepVar, alrv alrvVar) {
        return alrvVar.p(alrvVar.u(l, dcepVar).longValue());
    }

    private final alxp j(dmpn dmpnVar, int i) {
        Object b;
        dcep K = dcep.K(dmpnVar.o);
        dsqv<dmpn, dmpz> dsqvVar = dmqa.b;
        dmpnVar.f(dsqvVar);
        Object l = dmpnVar.V.l(dsqvVar.d);
        if (l == null) {
            b = dsqvVar.b;
        } else {
            b = dsqvVar.b(l);
        }
        dmpz dmpzVar = (dmpz) b;
        alxp alxpVar = alxp.e;
        int i2 = dmpzVar.b;
        if (i2 != 0) {
            alrv alrvVar = this.a;
            alxp i3 = i(Long.valueOf(alrvVar.o(i2, alrvVar.x()).a), K, this.a);
            int i4 = dmpzVar.b;
            long j = i3.a;
            return i3;
        }
        int i5 = dmpnVar.a;
        if ((i5 & 4096) == 0) {
            return (i5 & 2048) == 0 ? alxpVar : this.a.t(i).g(dmpnVar.k);
        }
        alxp g = g(dmpnVar.l, dmpnVar, K, this.a);
        if (dmpnVar.l == g.a) {
            return g;
        }
        int i6 = dmpzVar.b;
        return g;
    }

    @Override // defpackage.amlm
    public final alxo a(dmpd dmpdVar, dmpn dmpnVar, int i, int i2) {
        Object b;
        alxp g;
        alxp g2;
        long j;
        long j2;
        Object b2;
        Object b3;
        Object b4;
        int max = Math.max(0, i2);
        dcep K = dcep.K(dmpnVar.o);
        dsqv<dmpd, dmpz> dsqvVar = dmqa.d;
        dmpdVar.f(dsqvVar);
        Object l = dmpdVar.V.l(dsqvVar.d);
        if (l == null) {
            b = dsqvVar.b;
        } else {
            b = dsqvVar.b(l);
        }
        dmpz dmpzVar = (dmpz) b;
        int i3 = dmpzVar.b;
        if (i3 != 0) {
            alrv alrvVar = this.a;
            g = i(Long.valueOf(alrvVar.o(i3, alrvVar.x()).a), K, this.a);
            int i4 = dmpzVar.b;
            long j3 = g.a;
        } else {
            int i5 = dmpdVar.a;
            if ((i5 & 8) != 0) {
                alxp j4 = j(dmpnVar, i);
                int i6 = dmpdVar.e;
                SparseIntArray sparseIntArray = j4.c;
                int i7 = -1;
                if (sparseIntArray != null) {
                    i7 = sparseIntArray.get(i6, -1);
                }
                g2 = g(i7, dmpnVar, dcmr.a, this.a);
                int i8 = dmpdVar.e;
                long j5 = g2.a;
            } else if ((i5 & 4) != 0) {
                dsqv<dmpd, Integer> dsqvVar2 = alwu.b;
                dmpdVar.f(dsqvVar2);
                if (!dmpdVar.V.k(dsqvVar2.d)) {
                    g2 = g(dmpdVar.d, dmpnVar, K, this.a);
                    j = dmpdVar.d;
                    j2 = g2.a;
                } else {
                    Long valueOf = Long.valueOf(dmpdVar.d);
                    dsqv<dmpd, Integer> dsqvVar3 = alwu.b;
                    dmpdVar.f(dsqvVar3);
                    Object l2 = dmpdVar.V.l(dsqvVar3.d);
                    if (l2 == null) {
                        b2 = dsqvVar3.b;
                    } else {
                        b2 = dsqvVar3.b(l2);
                    }
                    g2 = h(valueOf, ((Integer) b2).intValue(), K, this.a);
                    j = dmpdVar.d;
                    j2 = g2.a;
                }
                int i9 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            } else if ((i5 & 2) == 0) {
                return alxp.e.j();
            } else {
                g = this.a.t(i).g(dmpdVar.c);
            }
            g = g2;
        }
        alxo c = g.c(max);
        dsqv<dmpn, akuj> dsqvVar4 = akvj.b;
        dmpnVar.f(dsqvVar4);
        Object l3 = dmpnVar.V.l(dsqvVar4.d);
        if (l3 == null) {
            b3 = dsqvVar4.b;
        } else {
            b3 = dsqvVar4.b(l3);
        }
        if ((((akuj) b3).a & 2) != 0) {
            dsqv<dmpn, akuj> dsqvVar5 = akvj.b;
            dmpnVar.f(dsqvVar5);
            Object l4 = dmpnVar.V.l(dsqvVar5.d);
            if (l4 == null) {
                b4 = dsqvVar5.b;
            } else {
                b4 = dsqvVar5.b(l4);
            }
            akul akulVar = ((akuj) b4).c;
            if (akulVar == null) {
                akulVar = akul.d;
            }
            if (!c.b()) {
                return c;
            }
            alye i10 = c.q.i();
            if ((akulVar.a & 1) != 0) {
                i10.c(akulVar.b);
            }
            if ((akulVar.a & 2) != 0) {
                i10.b(akulVar.c);
            }
            alxn a = c.a();
            a.n = i10.a();
            return a.a();
        }
        return c;
    }

    @Override // defpackage.amlm
    public final alxo b(dmph dmphVar, dmpn dmpnVar, int i, int i2) {
        Object b;
        int max = Math.max(0, i2);
        dcep K = dcep.K(dmpnVar.o);
        dsqv<dmph, dmpz> dsqvVar = dmqa.c;
        dmphVar.f(dsqvVar);
        Object l = dmphVar.V.l(dsqvVar.d);
        if (l == null) {
            b = dsqvVar.b;
        } else {
            b = dsqvVar.b(l);
        }
        int i3 = ((dmpz) b).b;
        if (i3 != 0) {
            alrv alrvVar = this.a;
            return i(Long.valueOf(alrvVar.o(i3, alrvVar.x()).a), K, this.a).c(max);
        }
        int i4 = dmphVar.a;
        if ((i4 & 2) != 0) {
            return g(dmphVar.d, dmpnVar, K, this.a).c(max);
        }
        if ((i4 & 1) == 0) {
            return alxp.e.j();
        }
        return this.a.t(i).g(dmphVar.c).c(max);
    }

    @Override // defpackage.amlm
    public final alxo c(dmpn dmpnVar, int i, int i2) {
        int max = Math.max(0, i2);
        alxp j = j(dmpnVar, i);
        long j2 = j.a;
        return j.c(max);
    }

    @Override // defpackage.amlm
    public final decj d(dmpn dmpnVar) {
        Object b;
        dsqv<dmpn, alwt> dsqvVar = alwu.c;
        dmpnVar.f(dsqvVar);
        Object l = dmpnVar.V.l(dsqvVar.d);
        if (l == null) {
            b = dsqvVar.b;
        } else {
            b = dsqvVar.b(l);
        }
        int i = ((alwt) b).f;
        if (i == 0) {
            return decj.a;
        }
        return this.a.e.j(i);
    }

    @Override // defpackage.amlm
    public final dcdn<Integer, Integer> e(dmpn dmpnVar) {
        Object b;
        dsqv<dmpn, alwt> dsqvVar = alwu.c;
        dmpnVar.f(dsqvVar);
        Object l = dmpnVar.V.l(dsqvVar.d);
        if (l == null) {
            b = dsqvVar.b;
        } else {
            b = dsqvVar.b(l);
        }
        int i = ((alwt) b).f;
        return i == 0 ? dcmn.a : this.a.e.k(i);
    }

    @Override // defpackage.amlm
    public final boolean f(dmpn dmpnVar, dmmi dmmiVar) {
        alvm alvmVar;
        alwz i;
        int a;
        boolean a2 = alvm.a(dmpnVar.p, dmmiVar);
        int b = this.b.b(dmpnVar);
        alrv alrvVar = this.a;
        synchronized (alrvVar.q) {
            alvmVar = null;
            if (b == alrvVar.n) {
                alwz alwzVar = alrvVar.p;
                if (alwzVar != null) {
                    alvmVar = alwzVar.b;
                }
            } else if (alrvVar.e.g(b) && (i = alrvVar.e.i(b)) != null) {
                alvmVar = i.b;
            }
        }
        if (alvmVar == null || (a = this.b.a(dmpnVar)) == -1) {
            return a2;
        }
        List list = dmpnVar.p;
        List i2 = alvmVar.a.i(a);
        if (i2 == null) {
            if (!list.isEmpty()) {
                return alvm.a(list, dmmiVar);
            }
            return false;
        }
        if (!i2.isEmpty()) {
            if (!list.isEmpty()) {
                List arrayList = new ArrayList(i2.size() + list.size());
                dcgg t = dcgh.t(i2.iterator());
                dcgg t2 = dcgh.t(list.iterator());
                while (t.hasNext() && t2.hasNext()) {
                    int compare = alvm.b.compare((dmma) t.a(), (dmma) t2.a());
                    if (compare < 0) {
                        arrayList.add((dmma) t.next());
                    } else if (compare > 0) {
                        arrayList.add((dmma) t2.next());
                    } else {
                        arrayList.add((dmma) t.next());
                        t2.next();
                    }
                }
                dcgh.g(arrayList, t);
                dcgh.g(arrayList, t2);
                list = arrayList;
            } else {
                list = i2;
            }
        }
        return alvm.a(list, dmmiVar);
    }
}
