package defpackage;
/* compiled from: PG */
/* renamed from: bsok  reason: default package */
/* loaded from: classes4.dex */
public final class bsok<T> extends btrh<T> {
    private final int d;

    public bsok(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        int i2 = 0;
        if (i == 0) {
            bsoi bsoiVar = (bsoi) this.a;
            bsnp bsnpVar = (bsnp) obj;
            brwk c = bsnpVar.c();
            bssu b = bsnpVar.b();
            dbsg<ghs<brve>> d = bsnpVar.d();
            int a = bsnpVar.a();
            if (!bsoiVar.q.f() && bsoiVar.s.containsKey(c)) {
                return;
            }
            if (bsoiVar.S() < a) {
                for (int S = bsoiVar.S(); S <= a; S++) {
                    bsoiVar.f(S, b, false);
                }
            }
            bsoiVar.g(a);
            if (!d.a()) {
                return;
            }
            ghs<brve> b2 = d.b();
            if (bsoiVar.D()) {
                bsoi.U(b2, -1.0f);
            }
            bsoiVar.Q(b2, a);
            ght E = bsoiVar.E();
            bsob f = bsob.f(a);
            if (bsoiVar.D != null && E != null && E.equals(f)) {
                ghw ghwVar = bsoiVar.D;
                dbsk.s(ghwVar);
                ghwVar.p(d.b().e(), false);
                ilo y = bsoiVar.y(a);
                if (y != null) {
                    bsoiVar.d.e(y);
                }
                if (bsoiVar.n.b()) {
                    bsoiVar.k();
                }
            }
            if (bsoiVar.q.f()) {
                if (bsoiVar.s.containsKey(c)) {
                    return;
                }
                bsoiVar.s.put(c, b2);
                return;
            }
            bsoiVar.s.put(c, b2);
            cqhn cqhnVar = bsoiVar.c;
            cqkx.p(bsoiVar.s());
        } else if (i == 1) {
            bsoi bsoiVar2 = (bsoi) this.a;
            ardp ardpVar = (ardp) obj;
            if (!bsoiVar2.q.f()) {
                return;
            }
            bsoiVar2.q();
            bsoiVar2.a(false, jjn.HIDDEN);
        } else if (i == 2) {
            bsoi bsoiVar3 = (bsoi) this.a;
            alhl alhlVar = (alhl) obj;
            if (bsoiVar3.C()) {
                bsoiVar3.K();
            } else {
                bsoiVar3.l();
            }
            bsoiVar3.N();
            bsoiVar3.I = true;
        } else if (i == 3) {
            bsoi bsoiVar4 = (bsoi) this.a;
            alhx alhxVar = (alhx) obj;
            if (bsoiVar4.C()) {
                bsoiVar4.K();
            } else {
                bsoiVar4.l();
            }
            bsoiVar4.N();
            bsoiVar4.I = true;
        } else {
            bsoi bsoiVar5 = (bsoi) this.a;
            if (((alhw) obj).a == alje.FIRST_FINGER_DOWN || !bsoiVar5.I) {
                return;
            }
            bsoiVar5.I = false;
            ght E2 = bsoiVar5.E();
            if (E2 != null) {
                synchronized (bsoiVar5) {
                    while (true) {
                        if (i2 >= bsoiVar5.B.size()) {
                            i2 = -1;
                            break;
                        } else if (bsoiVar5.B.get(i2).e().equals(E2)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                ilo y2 = bsoiVar5.y(i2);
                akqq aj = y2 != null ? y2.aj() : null;
                if (aj != null && bsoiVar5.d.f(aj)) {
                    return;
                }
            }
            if (!bsoiVar5.q.f()) {
                return;
            }
            bsoiVar5.l();
        }
    }
}
