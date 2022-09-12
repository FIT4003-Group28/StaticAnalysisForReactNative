package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
/* compiled from: PG */
/* renamed from: aikc  reason: default package */
/* loaded from: classes2.dex */
public final class aikc implements Comparable<aikc> {
    public final PersonId a;
    public final cqat b;
    public ahwl c;
    private final ahvi d;
    private final btvo e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aikc(com.google.android.apps.gmm.locationsharing.api.PersonId r4, defpackage.doep r5, boolean r6, defpackage.dcdc<defpackage.dqzv> r7, defpackage.cqat r8, defpackage.ahvi r9, defpackage.btvo r10) {
        /*
            r3 = this;
            ahwm r0 = defpackage.ahwn.H()
            ahwk r1 = com.google.android.apps.gmm.locationsharing.api.Profile.g()
            r2 = r1
            ahuw r2 = (defpackage.ahuw) r2
            r2.a = r4
            dbsg r4 = defpackage.dbsg.i(r5)
            dbsg r4 = h(r4, r7)
            r2.b = r4
            dbsg r4 = defpackage.dbsg.i(r5)
            dbsg r4 = i(r4, r7)
            r2.c = r4
            dbsg r4 = defpackage.dbsg.i(r5)
            dbsg r4 = j(r4, r7)
            r2.d = r4
            com.google.android.apps.gmm.locationsharing.api.Profile r4 = r1.a()
            r0.j(r4)
            r0.m(r5)
            r0.n(r6)
            r0.k(r7)
            boolean r4 = k(r7)
            r0.l(r4)
            doek r4 = r5.f
            if (r4 != 0) goto L48
            doek r4 = defpackage.doek.f
        L48:
            r5 = r9
            aibf r5 = (defpackage.aibf) r5
            dbsg r4 = r5.b(r4)
            r0.e(r4)
            long r4 = r8.b()
            r0.g(r4)
            long r4 = r8.b()
            r0.h(r4)
            long r4 = r8.b()
            r0.c(r4)
            dbsg r4 = defpackage.ahwn.I(r7)
            r0.i(r4)
            ahwn r4 = r0.a()
            r3.<init>(r4, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aikc.<init>(com.google.android.apps.gmm.locationsharing.api.PersonId, doep, boolean, dcdc, cqat, ahvi, btvo):void");
    }

    public static dbsg<String> h(dbsg<doep> dbsgVar, dcdc<dqzv> dcdcVar) {
        dqyb dqybVar;
        dqya dqyaVar;
        dqyj dqyjVar;
        dqyj dqyjVar2;
        if (dbsgVar.a()) {
            dqyj dqyjVar3 = dbsgVar.b().c;
            if (dqyjVar3 == null) {
                dqyjVar3 = dqyj.f;
            }
            if ((dqyjVar3.a & 8) != 0) {
                dqyj dqyjVar4 = dbsgVar.b().c;
                if (dqyjVar4 == null) {
                    dqyjVar4 = dqyj.f;
                }
                return dbsg.i(dqyjVar4.d);
            }
        }
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            dqzv dqzvVar = dcdcVar.get(i);
            if (dqzvVar.b == 2) {
                dqybVar = (dqyb) dqzvVar.c;
            } else {
                dqybVar = dqyb.j;
            }
            if (dqybVar.b == 6) {
                dqyaVar = (dqya) dqybVar.c;
            } else {
                dqyaVar = dqya.e;
            }
            if (dqzvVar.b == 1) {
                dqyjVar = (dqyj) dqzvVar.c;
            } else {
                dqyjVar = dqyj.f;
            }
            if ((dqyjVar.a & 8) != 0) {
                if (dqzvVar.b == 1) {
                    dqyjVar2 = (dqyj) dqzvVar.c;
                } else {
                    dqyjVar2 = dqyj.f;
                }
                return dbsg.i(dqyjVar2.d);
            }
            int i2 = dqyaVar.a;
            if ((i2 & 1) != 0) {
                return dbsg.i(dqyaVar.b);
            }
            if ((i2 & 2) != 0) {
                return dbsg.i(dqyaVar.c);
            }
            if ((i2 & 4) != 0) {
                return dbsg.i(dqyaVar.d);
            }
            int i3 = dqybVar.a;
            if ((i3 & 128) != 0) {
                return dbsg.i(dqybVar.i);
            }
            if ((i3 & 32) != 0) {
                return dbsg.i(dqybVar.g);
            }
            i++;
            if ((i3 & 64) != 0) {
                return dbsg.i(dqybVar.h);
            }
        }
        return dbpy.a;
    }

    public static dbsg<String> i(dbsg<doep> dbsgVar, dcdc<dqzv> dcdcVar) {
        dqyj dqyjVar;
        dqyj dqyjVar2;
        if (dbsgVar.a()) {
            dqyj dqyjVar3 = dbsgVar.b().c;
            if (dqyjVar3 == null) {
                dqyjVar3 = dqyj.f;
            }
            if ((dqyjVar3.a & 16) != 0) {
                dqyj dqyjVar4 = dbsgVar.b().c;
                if (dqyjVar4 == null) {
                    dqyjVar4 = dqyj.f;
                }
                return dbsg.i(dqyjVar4.e);
            }
        }
        if (!dcdcVar.isEmpty()) {
            dqzv dqzvVar = dcdcVar.get(0);
            if (dqzvVar.b == 1) {
                dqyjVar = (dqyj) dqzvVar.c;
            } else {
                dqyjVar = dqyj.f;
            }
            if ((dqyjVar.a & 16) != 0) {
                dqzv dqzvVar2 = dcdcVar.get(0);
                if (dqzvVar2.b != 1) {
                    dqyjVar2 = dqyj.f;
                } else {
                    dqyjVar2 = (dqyj) dqzvVar2.c;
                }
                return dbsg.i(dqyjVar2.e);
            }
        }
        return dbpy.a;
    }

    public static dbsg<String> j(dbsg<doep> dbsgVar, dcdc<dqzv> dcdcVar) {
        dqyj dqyjVar;
        dqyj dqyjVar2;
        if (dbsgVar.a()) {
            dqyj dqyjVar3 = dbsgVar.b().c;
            if (dqyjVar3 == null) {
                dqyjVar3 = dqyj.f;
            }
            if ((dqyjVar3.a & 4) != 0) {
                dqyj dqyjVar4 = dbsgVar.b().c;
                if (dqyjVar4 == null) {
                    dqyjVar4 = dqyj.f;
                }
                return dbsg.i(dqyjVar4.c);
            }
        }
        if (!dcdcVar.isEmpty()) {
            dqzv dqzvVar = dcdcVar.get(0);
            if (dqzvVar.b == 1) {
                dqyjVar = (dqyj) dqzvVar.c;
            } else {
                dqyjVar = dqyj.f;
            }
            if ((dqyjVar.a & 4) != 0) {
                dqzv dqzvVar2 = dcdcVar.get(0);
                if (dqzvVar2.b != 1) {
                    dqyjVar2 = dqyj.f;
                } else {
                    dqyjVar2 = (dqyj) dqzvVar2.c;
                }
                return dbsg.i(dqyjVar2.c);
            }
        }
        return dbpy.a;
    }

    public static boolean k(dcdc<dqzv> dcdcVar) {
        int i;
        if (dcdcVar.isEmpty()) {
            return false;
        }
        int size = dcdcVar.size();
        int i2 = 0;
        do {
            i = 1;
            if (i2 >= size) {
                return true;
            }
            dqzu dqzuVar = dcdcVar.get(i2).g;
            if (dqzuVar == null) {
                dqzuVar = dqzu.b;
            }
            int a = dqzt.a(dqzuVar.a);
            if (a != 0) {
                i = a;
            }
            i2++;
        } while (i == 3);
        return false;
    }

    private static void l(ahwm ahwmVar, Profile profile, doep doepVar, dcdc<dqzv> dcdcVar) {
        ahwk f = profile.f();
        dbsg<String> h = h(dbsg.i(doepVar), dcdcVar);
        if (h.a()) {
            f.d(h);
        }
        dbsg<String> i = i(dbsg.i(doepVar), dcdcVar);
        if (i.a()) {
            f.e(i);
        }
        dbsg<String> j = j(dbsg.i(doepVar), dcdcVar);
        if (j.a()) {
            f.b(j);
        }
        ahwmVar.j(f.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
        if (r0.c <= 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.doep r11) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aikc.a(doep):void");
    }

    public final void b(dcdc<dqzv> dcdcVar) {
        bvrj.UI_THREAD.c();
        ahwm G = ahwn.G(this.c);
        G.k(dcdcVar);
        G.l(k(dcdcVar));
        if (this.c.l() || !dcdcVar.isEmpty()) {
            G.h(this.b.b());
        }
        if (!this.c.m().a()) {
            G.i(ahwn.I(dcdcVar));
        }
        l(G, this.c.a(), this.c.b(), dcdcVar);
        this.c = G.a();
    }

    public final void c(boolean z) {
        long b;
        if (z || this.c.B()) {
            b = this.b.b();
        } else {
            b = this.c.e();
        }
        ahwm G = ahwn.G(this.c);
        G.n(z);
        G.h(b);
        this.c = G.a();
        if (!z) {
            d();
            e();
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(aikc aikcVar) {
        return this.a.compareTo(aikcVar.a);
    }

    public final void d() {
        bvrj.UI_THREAD.c();
        if ((this.c.b().a & 1024) != 0) {
            doep b = this.c.b();
            dsqp dsqpVar = (dsqp) b.cu(5);
            dsqpVar.bC(b);
            doeo doeoVar = (doeo) dsqpVar;
            if (doeoVar.c) {
                doeoVar.bF();
                doeoVar.c = false;
            }
            doep doepVar = (doep) doeoVar.b;
            doepVar.h = null;
            doepVar.a &= -1025;
            ahwm G = ahwn.G(this.c);
            G.c(0L);
            G.m(doeoVar.bK());
            this.c = G.a();
        }
    }

    public final void e() {
        bvrj.UI_THREAD.c();
        doep b = this.c.b();
        dsqp dsqpVar = (dsqp) b.cu(5);
        dsqpVar.bC(b);
        doeo doeoVar = (doeo) dsqpVar;
        if (doeoVar.c) {
            doeoVar.bF();
            doeoVar.c = false;
        }
        doep doepVar = (doep) doeoVar.b;
        doep doepVar2 = doep.i;
        doepVar.d = null;
        int i = doepVar.a & (-9);
        doepVar.a = i;
        doepVar.f = null;
        doepVar.a = i & (-65);
        ahwm G = ahwn.G(this.c);
        G.n(false);
        G.e(dbpy.a);
        G.m(doeoVar.bK());
        this.c = G.a();
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof aikc)) {
            return false;
        }
        return f().equals(((aikc) obj).f());
    }

    public final PersonId f() {
        bvrj.UI_THREAD.c();
        return this.a;
    }

    public final ahwl g() {
        bvrj.UI_THREAD.c();
        return this.c;
    }

    public final int hashCode() {
        return f().hashCode();
    }

    public aikc(ahwl ahwlVar, cqat cqatVar, ahvi ahviVar, btvo btvoVar) {
        this.a = ahwlVar.q();
        this.b = cqatVar;
        this.d = ahviVar;
        this.c = ahwlVar;
        this.e = btvoVar;
    }
}
