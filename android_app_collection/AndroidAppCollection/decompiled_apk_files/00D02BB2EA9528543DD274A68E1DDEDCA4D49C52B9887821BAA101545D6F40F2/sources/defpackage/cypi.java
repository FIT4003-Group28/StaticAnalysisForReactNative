package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cypi  reason: default package */
/* loaded from: classes5.dex */
public final class cypi implements cyph {
    private final cyhn a;
    private final cyow b;
    private final dbug c;
    private final dbty<Integer> d;

    public cypi(cyhn cyhnVar, cyow cyowVar, dbug dbugVar, dbty<Integer> dbtyVar) {
        this.a = cyhnVar;
        this.b = cyowVar;
        this.c = dbugVar;
        this.d = dbtyVar;
    }

    @Override // defpackage.cyph
    public final void a(eawl eawlVar, cyor cyorVar) {
        eawh h = h(2, cyorVar);
        if (h.c) {
            h.bF();
            h.c = false;
        }
        eawy eawyVar = (eawy) h.b;
        eawy eawyVar2 = eawy.n;
        eawlVar.getClass();
        eawyVar.f = eawlVar;
        eawyVar.a |= 32;
        g(h.bK());
    }

    @Override // defpackage.cyph
    public final dbtp b() {
        return dbtp.c(this.c);
    }

    @Override // defpackage.cyph
    public final void c(int i, cyor cyorVar) {
        eawk bZ = eawl.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eawl eawlVar = (eawl) bZ.b;
        eawlVar.b = i - 1;
        eawlVar.a |= 2;
        a(bZ.bK(), cyorVar);
    }

    @Override // defpackage.cyph
    public final void d(int i, int i2, cyor cyorVar) {
        eawk bZ = eawl.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eawl eawlVar = (eawl) bZ.b;
        eawlVar.b = i - 1;
        int i3 = eawlVar.a | 2;
        eawlVar.a = i3;
        eawlVar.a = i3 | 4;
        eawlVar.c = i2;
        a(bZ.bK(), cyorVar);
    }

    @Override // defpackage.cyph
    public final void e(int i, dbtp dbtpVar, cyor cyorVar) {
        cypg.a(this, i, dbtpVar, cyorVar);
    }

    @Override // defpackage.cyph
    public final void f(int i, int i2, cyor cyorVar) {
        cypg.c(this, 4, i2, cyorVar);
    }

    public final void g(eawy eawyVar) {
        this.a.a(eawyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final eawh h(int i, cyor cyorVar) {
        eawh bZ = eawy.n.bZ();
        eaxq bZ2 = eaxr.f.bZ();
        Integer num = cyorVar.e;
        if (num != null) {
            int intValue = num.intValue();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eaxr eaxrVar = (eaxr) bZ2.b;
            eaxrVar.a |= 16;
            eaxrVar.e = intValue;
        }
        Long l = cyorVar.b;
        if (l != null) {
            long longValue = l.longValue();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eaxr eaxrVar2 = (eaxr) bZ2.b;
            eaxrVar2.a |= 1;
            eaxrVar2.b = longValue;
        }
        Long l2 = cyorVar.c;
        if (l2 != null) {
            long longValue2 = l2.longValue();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eaxr eaxrVar3 = (eaxr) bZ2.b;
            eaxrVar3.a |= 2;
            eaxrVar3.c = longValue2;
        }
        Long l3 = cyorVar.d;
        if (l3 != null) {
            long longValue3 = l3.longValue();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eaxr eaxrVar4 = (eaxr) bZ2.b;
            eaxrVar4.a |= 4;
            eaxrVar4.d = longValue3;
        }
        eaxw bZ3 = eaxx.k.bZ();
        String c = ((cyol) this.b).d.c();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        eaxx eaxxVar = (eaxx) bZ3.b;
        c.getClass();
        eaxxVar.a |= 8;
        eaxxVar.e = c;
        int i2 = ((cyol) this.b).j;
        eaxx eaxxVar2 = (eaxx) bZ3.b;
        int i3 = i2 - 1;
        if (i2 != 0) {
            eaxxVar2.b = i3;
            eaxxVar2.a |= 1;
            String b = ((cyol) this.b).d.b();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            eaxx eaxxVar3 = (eaxx) bZ3.b;
            b.getClass();
            eaxxVar3.a |= 4;
            eaxxVar3.d = b;
            eaxx eaxxVar4 = (eaxx) bZ3.b;
            eaxxVar4.a |= 16;
            eaxxVar4.f = 341506552L;
            dudi bZ4 = dudj.e.bZ();
            int i4 = ((cyol) this.b).i;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dudj dudjVar = (dudj) bZ4.b;
            int i5 = i4 - 1;
            if (i4 != 0) {
                dudjVar.c = i5;
                dudjVar.a |= 2;
                dudj dudjVar2 = (dudj) bZ4.b;
                dudjVar2.b = 2;
                dudjVar2.a |= 1;
                dudj dudjVar3 = (dudj) bZ4.b;
                dudjVar3.d = 2;
                dudjVar3.a |= 4;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                eaxx eaxxVar5 = (eaxx) bZ3.b;
                dudj bK = bZ4.bK();
                bK.getClass();
                eaxxVar5.c = bK;
                eaxxVar5.a |= 2;
                bZ3.a(Arrays.asList(((cyol) this.b).e.b()));
                if (((cyol) this.b).h.e().a()) {
                    czgq b2 = ((cyol) this.b).h.e().b();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    eaxx eaxxVar6 = (eaxx) bZ3.b;
                    int i6 = b2.M;
                    eaxxVar6.j = i6;
                    int i7 = eaxxVar6.a | 128;
                    eaxxVar6.a = i7;
                    eaxxVar6.a = i7 | 32;
                    eaxxVar6.h = i6;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eawy eawyVar = (eawy) bZ.b;
                eaxr bK2 = bZ2.bK();
                bK2.getClass();
                eawyVar.c = bK2;
                eawyVar.a |= 2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eawy eawyVar2 = (eawy) bZ.b;
                eaxx bK3 = bZ3.bK();
                bK3.getClass();
                eawyVar2.b = bK3;
                eawyVar2.a |= 1;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eawy eawyVar3 = (eawy) bZ.b;
                eawyVar3.d = i - 1;
                eawyVar3.a |= 4;
                eawi bZ5 = eawj.c.bZ();
                int intValue2 = this.d.a().intValue();
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                eawj eawjVar = (eawj) bZ5.b;
                eawjVar.a |= 1;
                eawjVar.b = intValue2;
                eawj bK4 = bZ5.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eawy eawyVar4 = (eawy) bZ.b;
                bK4.getClass();
                eawyVar4.e = bK4;
                eawyVar4.a |= 8;
                return bZ;
            }
            throw null;
        }
        throw null;
    }
}
