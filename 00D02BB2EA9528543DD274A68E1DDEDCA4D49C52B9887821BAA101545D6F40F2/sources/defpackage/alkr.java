package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: alkr  reason: default package */
/* loaded from: classes.dex */
public final class alkr extends alkq implements akta {
    private static final bnvs m = new bnvs(0.0f, 0.0f, 1.0f);
    private final aksz n;
    private boolean o;

    public alkr(dmmu dmmuVar, akqj akqjVar, also alsoVar, alyj alyjVar, akuh akuhVar, alrv alrvVar, alkp alkpVar, bnsn bnsnVar, akzh akzhVar, akpq akpqVar, btrm btrmVar, aksp akspVar) {
        super(dmmuVar, akqjVar, alsoVar, alyjVar, akuhVar, alrvVar, alkpVar, bnsnVar, akzhVar, akpqVar, btrmVar, akspVar);
        aksz akszVar = new aksz();
        this.n = akszVar;
        this.o = true;
        akszVar.b(this.j);
        akszVar.d(0.0f, this.j);
        akszVar.c(1.0f, aksy.PIXEL);
    }

    @Override // defpackage.akta
    public final void c(aksz akszVar) {
        boolean z;
        aksz akszVar2;
        synchronized (this) {
            boolean z2 = !this.n.a.equals(akszVar.a);
            boolean z3 = false;
            if (this.n.b.equals(akszVar.b) && this.n.c == akszVar.c) {
                z = false;
                akszVar2 = this.n;
                if (akszVar2.d == akszVar.d || !akszVar2.e.equals(akszVar.e)) {
                    z3 = true;
                }
                this.n.a(akszVar);
                if (!z2 || z3 || z) {
                    this.o = true;
                    this.d.d();
                }
            }
            z = true;
            akszVar2 = this.n;
            if (akszVar2.d == akszVar.d) {
            }
            z3 = true;
            this.n.a(akszVar);
            if (!z2) {
            }
            this.o = true;
            this.d.d();
        }
    }

    @Override // defpackage.akta
    public final aksz d() {
        aksz akszVar = new aksz();
        synchronized (this) {
            akszVar.a(this.n);
        }
        return akszVar;
    }

    @Override // defpackage.alkq
    @dzsi
    protected final allr e(alkq alkqVar, alkp alkpVar, also alsoVar, akqj akqjVar, alvn alvnVar, dmmu dmmuVar, akuh akuhVar) {
        int i;
        int i2;
        dspd dspdVar;
        RandomAccess randomAccess;
        dspd dspdVar2;
        dmrb dmrbVar = dmmuVar.b;
        if (dmrbVar == null) {
            dmrbVar = dmrb.n;
        }
        dspd dspdVar3 = dmrbVar.b;
        dsrf dsrfVar = dmrbVar.c;
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        F2.i(dsrfVar);
        int b = akqjVar.b(dspdVar3);
        if (dsrfVar.isEmpty() || dsrfVar.get(dsrfVar.size() - 1).intValue() != b) {
            F2.g(Integer.valueOf(b));
        }
        dsrf dsrfVar2 = dmrbVar.h;
        dcdc<Integer> f = F2.f();
        ArrayList arrayList = new ArrayList(f.size());
        for (Integer num : f) {
            arrayList.add(new ArrayList());
        }
        if (!dsrfVar2.isEmpty()) {
            int intValue = dsrfVar2.get(0).intValue();
            int intValue2 = ((Integer) f.get(0)).intValue();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (intValue < intValue2) {
                    ((List) arrayList.get(i3)).add(Integer.valueOf(intValue - i4));
                    i5++;
                    if (i5 == dsrfVar2.size()) {
                        break;
                    }
                    intValue = dsrfVar2.get(i5).intValue();
                } else {
                    i3++;
                    if (i3 == f.size()) {
                        break;
                    }
                    i4 = intValue2;
                    intValue2 = ((Integer) f.get(i3)).intValue();
                }
            }
        }
        int a = akqjVar.a();
        dcdc f2 = F2.f();
        int size = f2.size();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < size) {
            Integer num2 = (Integer) f2.get(i6);
            int i9 = i7 * a;
            dspd i10 = dspdVar3.i(i9, (i7 + 1) * a);
            dspd i11 = dspdVar3.i(i9, num2.intValue() * a);
            if (!i11.v(i11.c() - a).equals(i10)) {
                i11 = i11.D(i10);
            }
            List<Integer> list = (List) arrayList.get(i8);
            int a2 = akqjVar.a();
            if (list.isEmpty()) {
                randomAccess = dcdc.f(i11);
                i2 = a;
                dspdVar = dspdVar3;
            } else {
                ArrayList arrayList2 = new ArrayList(1);
                int i12 = 0;
                for (Integer num3 : list) {
                    int i13 = a;
                    int intValue3 = num3.intValue();
                    if (i12 < intValue3) {
                        dspdVar2 = dspdVar3;
                        arrayList2.add(i11.i(i12 * a2, (intValue3 + 1) * a2));
                    } else {
                        dspdVar2 = dspdVar3;
                    }
                    i12 = intValue3 + 1;
                    a = i13;
                    dspdVar3 = dspdVar2;
                }
                i2 = a;
                dspdVar = dspdVar3;
                int b2 = akqjVar.b(i11) - 1;
                if (i12 < b2) {
                    arrayList2.add(i11.i(i12 * a2, (b2 + 1) * a2));
                }
                randomAccess = arrayList2;
            }
            F.i(randomAccess);
            i7 = num2.intValue();
            i8++;
            i6++;
            a = i2;
            dspdVar3 = dspdVar;
        }
        dcdc<dspd> f3 = F.f();
        int i14 = alvnVar.c;
        int i15 = dmmuVar.k;
        int a3 = dmon.a(dmmuVar.e);
        if (a3 == 0) {
            a3 = 1;
        }
        dmqh bZ = dmqi.b.bZ();
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (dspd dspdVar4 : f3) {
            int b3 = akqjVar.b(dspdVar4);
            dmqd dmqdVar = (dmqd) dmqg.p.bZ();
            if (dmqdVar.c) {
                dmqdVar.bF();
                i = 0;
                dmqdVar.c = false;
            } else {
                i = 0;
            }
            dmqg dmqgVar = (dmqg) dmqdVar.b;
            dmqgVar.f = i;
            dmqgVar.a |= 4;
            dmqg dmqgVar2 = (dmqg) dmqdVar.b;
            dmqgVar2.g = i;
            int i16 = dmqgVar2.a | 8;
            dmqgVar2.a = i16;
            int i17 = i16 | 2;
            dmqgVar2.a = i17;
            dmqgVar2.c = b3;
            dspdVar4.getClass();
            int i18 = i17 | 1;
            dmqgVar2.a = i18;
            dmqgVar2.b = dspdVar4;
            int i19 = i18 | 1024;
            dmqgVar2.a = i19;
            dmqgVar2.n = i14;
            int i20 = i19 | 2048;
            dmqgVar2.a = i20;
            dmqgVar2.o = i15;
            dmqgVar2.h = a3 - 1;
            dmqgVar2.a = i20 | 16;
            dmpz b4 = akuhVar.b();
            if (b4 != null) {
                dmqdVar.k(dmqa.e, b4);
            } else if (akuhVar.a() != -1) {
                int a4 = akuhVar.a();
                if (dmqdVar.c) {
                    dmqdVar.bF();
                    dmqdVar.c = false;
                }
                dmqg dmqgVar3 = (dmqg) dmqdVar.b;
                dmqgVar3.a |= 256;
                dmqgVar3.l = a4;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmqi dmqiVar = (dmqi) bZ.b;
            dmqg dmqgVar4 = (dmqg) dmqdVar.bK();
            dmqgVar4.getClass();
            dmqiVar.b();
            dmqiVar.a.add(dmqgVar4);
            int i21 = b3 + b3;
            float[] fArr = new float[i21];
            akqjVar.g(dspdVar4, b3, 0, fArr);
            for (int i22 = 0; i22 < i21 - 1; i22 += 2) {
                f4 = Math.min(fArr[i22], f4);
                f5 = Math.min(fArr[i22 + 1], f5);
            }
        }
        dmqi bK = bZ.bK();
        aljs aljsVar = (aljs) alkpVar;
        alot alotVar = aljsVar.a;
        allr allrVar = new allr(alotVar, alotVar.b, aljsVar.b, aljsVar.c, aljsVar.d, aljsVar.e, aljsVar.f.getResources().getDisplayMetrics().density, bK, alkqVar, alsoVar, akqjVar);
        if (allrVar == alot.a) {
            return null;
        }
        ArrayList a5 = dchl.a();
        allrVar.e(a5);
        int size2 = a5.size();
        for (int i23 = 0; i23 < size2; i23++) {
            amxj amxjVar = a5.get(i23);
            if (amxjVar.t) {
                bnuq bnuqVar = bnuq.INVALID;
            }
            float[] fArr2 = amxjVar.f;
            fArr2[0] = f4;
            fArr2[1] = f5;
            fArr2[2] = 0.0f;
            amxjVar.p = true;
        }
        return allrVar;
    }

    @Override // defpackage.alkq
    public final synchronized void f() {
        akra akraVar;
        allr allrVar;
        bnuq bnuqVar = bnuq.INVALID;
        if (!this.a) {
            return;
        }
        super.f();
        if (this.o) {
            this.o = false;
            akra s = akra.s(this.n.a);
            aksz akszVar = this.n;
            float f = -akszVar.d;
            akra s2 = akra.s(akszVar.e);
            aksz akszVar2 = this.n;
            akse akseVar = akszVar2.b;
            float f2 = akseVar.b;
            float f3 = akseVar.c;
            aksy aksyVar = akszVar2.c;
            akra akraVar2 = this.j;
            if (f != 0.0f) {
                akraVar = s.E(s2);
                akraVar.Y(Math.toRadians(f));
                akraVar.X(s2);
            } else {
                akraVar = s;
            }
            this.h.j(akraVar);
            for (amxj amxjVar : l()) {
                amxjVar.j(akraVar);
            }
            this.h.l(f);
            for (amxj amxjVar2 : l()) {
                amxjVar2.l(f);
            }
            if (aksyVar == aksy.PIXEL) {
                this.h.m(f2, f3);
                for (amxj amxjVar3 : l()) {
                    amxjVar3.m(f2, f3);
                }
                allr allrVar2 = this.i;
                if (allrVar2 != null) {
                    allp allpVar = allrVar2.o;
                    float f4 = allrVar2.g;
                    allpVar.a = true;
                    allpVar.b = (1.0f / f2) * f4;
                    allrVar2.d();
                }
            } else if (aksyVar == aksy.WORLD) {
                this.h.k(f2);
                for (amxj amxjVar4 : l()) {
                    amxjVar4.k(f2);
                }
                if (f2 != 0.0f && (allrVar = this.i) != null) {
                    allrVar.p = 1.0f / f2;
                    allp allpVar2 = allrVar.o;
                    allpVar2.a = false;
                    allpVar2.b = 1.0f;
                    allrVar.d();
                }
            } else {
                throw new UnsupportedOperationException("This scale type is not supported yet.");
            }
            bnvr bnvrVar = new bnvr();
            bnvrVar.i(akraVar2.a - s.a, akraVar2.b - s.b, 0.0f);
            bnvrVar.i(s2.a, s2.b, 0.0f);
            bnvrVar.c(m, -f);
            bnvrVar.i(-s2.a, -s2.b, 0.0f);
            if (this.g != null) {
                if (aksyVar == aksy.WORLD) {
                    this.g.a(bnvrVar, f2);
                } else {
                    this.g.b(bnvrVar, f2, f3);
                }
            }
        }
    }
}
