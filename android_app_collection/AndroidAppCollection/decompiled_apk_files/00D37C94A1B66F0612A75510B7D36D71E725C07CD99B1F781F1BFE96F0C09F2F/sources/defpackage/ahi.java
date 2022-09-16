package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: ahi  reason: default package */
/* loaded from: classes.dex */
public final class ahi extends aho {
    public int ar;
    public int as;
    public int c;
    public final ahq a = new ahq(this);
    public final aht b = new aht(this);
    public aij aG = null;
    public boolean d = false;
    public final agy aq = new agy();
    public int at = 0;
    public int au = 0;
    public ahf[] av = new ahf[4];
    public ahf[] aw = new ahf[4];
    public int ax = 257;
    public boolean ay = false;
    public boolean az = false;
    public WeakReference aA = null;
    public WeakReference aB = null;
    public WeakReference aC = null;
    public WeakReference aD = null;
    final HashSet aE = new HashSet();
    public final ahp aF = new ahp();

    public static void X(ahh ahhVar, aij aijVar, ahp ahpVar) {
        int i;
        int i2;
        if (aijVar == null) {
            return;
        }
        if (ahhVar.ag == 8 || (ahhVar instanceof ahk) || (ahhVar instanceof ahe)) {
            ahpVar.c = 0;
            ahpVar.d = 0;
            return;
        }
        ahpVar.i = ahhVar.N();
        ahpVar.j = ahhVar.O();
        ahpVar.a = ahhVar.j();
        ahpVar.b = ahhVar.h();
        ahpVar.g = false;
        ahpVar.h = 0;
        boolean z = ahpVar.i == 3;
        boolean z2 = ahpVar.j == 3;
        boolean z3 = z && ahhVar.W > 0.0f;
        boolean z4 = z2 && ahhVar.W > 0.0f;
        if (z && ahhVar.G(0) && ahhVar.s == 0 && !z3) {
            ahpVar.i = 2;
            if (z2 && ahhVar.t == 0) {
                ahpVar.i = 1;
            }
            z = false;
        }
        if (z2 && ahhVar.G(1) && ahhVar.t == 0 && !z4) {
            ahpVar.j = 2;
            if (z && ahhVar.s == 0) {
                ahpVar.j = 1;
            }
            z2 = false;
        }
        if (ahhVar.e()) {
            ahpVar.i = 1;
            z = false;
        }
        if (ahhVar.f()) {
            ahpVar.j = 1;
            z2 = false;
        }
        if (z3) {
            if (ahhVar.u[0] == 4) {
                ahpVar.i = 1;
            } else if (!z2) {
                if (ahpVar.j == 1) {
                    i2 = ahpVar.b;
                } else {
                    ahpVar.i = 2;
                    aijVar.a(ahhVar, ahpVar);
                    i2 = ahpVar.d;
                }
                ahpVar.i = 1;
                ahpVar.a = (int) (ahhVar.W * i2);
            }
        }
        if (z4) {
            if (ahhVar.u[1] == 4) {
                ahpVar.j = 1;
            } else if (!z) {
                if (ahpVar.i == 1) {
                    i = ahpVar.a;
                } else {
                    ahpVar.j = 2;
                    aijVar.a(ahhVar, ahpVar);
                    i = ahpVar.c;
                }
                ahpVar.j = 1;
                if (ahhVar.X != -1) {
                    ahpVar.b = (int) (ahhVar.W * i);
                } else {
                    ahpVar.b = (int) (i / ahhVar.W);
                }
            }
        }
        aijVar.a(ahhVar, ahpVar);
        ahhVar.D(ahpVar.c);
        ahhVar.y(ahpVar.d);
        ahhVar.F = ahpVar.f;
        ahhVar.v(ahpVar.e);
        ahpVar.h = 0;
        boolean z5 = ahpVar.g;
    }

    private final void Z(ahg ahgVar, ahc ahcVar) {
        this.aq.g(ahcVar, this.aq.b(ahgVar), 0, 5);
    }

    private final void aa(ahg ahgVar, ahc ahcVar) {
        this.aq.g(this.aq.b(ahgVar), ahcVar, 0, 5);
    }

    private final void ab() {
        this.at = 0;
        this.au = 0;
    }

    @Override // defpackage.ahh
    public final void E(boolean z, boolean z2) {
        super.E(z, z2);
        int size = this.aH.size();
        for (int i = 0; i < size; i++) {
            ((ahh) this.aH.get(i)).E(z, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:316:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x05b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0626 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0978 A[LOOP:14: B:554:0x0976->B:555:0x0978, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:567:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x09fe  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0a5a  */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    @Override // defpackage.aho
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T() {
        /*
            Method dump skipped, instructions count: 2666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahi.T():void");
    }

    public final void U(int i) {
        this.ax = i;
        agy.a = W(512);
    }

    public final boolean V(boolean z, int i) {
        boolean z2;
        boolean z3;
        aht ahtVar = this.b;
        boolean z4 = false;
        int M = ahtVar.a.M(0);
        int M2 = ahtVar.a.M(1);
        int k = ahtVar.a.k();
        int l = ahtVar.a.l();
        if (z) {
            if (M != 2) {
                if (M2 == 2) {
                    M2 = 2;
                }
            }
            ArrayList arrayList = ahtVar.e;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z3 = true;
                    break;
                }
                aid aidVar = (aid) arrayList.get(i2);
                if (aidVar.g == i && !aidVar.e()) {
                    z3 = false;
                    break;
                }
                i2++;
            }
            if (i == 0) {
                if (z3 && M == 2) {
                    ahtVar.a.Q(1);
                    ahi ahiVar = ahtVar.a;
                    ahiVar.D(ahtVar.a(ahiVar, 0));
                    ahi ahiVar2 = ahtVar.a;
                    ahiVar2.h.f.c(ahiVar2.j());
                }
            } else if (z3 && M2 == 2) {
                ahtVar.a.R(1);
                ahi ahiVar3 = ahtVar.a;
                ahiVar3.y(ahtVar.a(ahiVar3, 1));
                ahi ahiVar4 = ahtVar.a;
                ahiVar4.i.f.c(ahiVar4.h());
            }
        }
        if (i == 0) {
            ahi ahiVar5 = ahtVar.a;
            int i3 = ahiVar5.ap[0];
            if (i3 == 1 || i3 == 4) {
                int j = ahiVar5.j() + k;
                ahtVar.a.h.j.c(j);
                ahtVar.a.h.f.c(j - k);
                z2 = true;
            }
            z2 = false;
        } else {
            ahi ahiVar6 = ahtVar.a;
            int i4 = ahiVar6.ap[1];
            if (i4 == 1 || i4 == 4) {
                int h = ahiVar6.h() + l;
                ahtVar.a.i.j.c(h);
                ahtVar.a.i.f.c(h - l);
                z2 = true;
            }
            z2 = false;
        }
        ahtVar.c();
        ArrayList arrayList2 = ahtVar.e;
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            aid aidVar2 = (aid) arrayList2.get(i5);
            if (aidVar2.g == i && (aidVar2.d != ahtVar.a || aidVar2.h)) {
                aidVar2.c();
            }
        }
        ArrayList arrayList3 = ahtVar.e;
        int size3 = arrayList3.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                z4 = true;
                break;
            }
            aid aidVar3 = (aid) arrayList3.get(i6);
            if (aidVar3.g == i && ((z2 || aidVar3.d != ahtVar.a) && (!aidVar3.i.i || !aidVar3.j.i || (!(aidVar3 instanceof ahr) && !aidVar3.f.i)))) {
                break;
            }
            i6++;
        }
        ahtVar.a.Q(M);
        ahtVar.a.R(M2);
        return z4;
    }

    public final boolean W(int i) {
        return (this.ax & i) == i;
    }

    public final void c() {
        this.b.b = true;
    }

    @Override // defpackage.aho, defpackage.ahh
    public final void s() {
        this.aq.k();
        this.ar = 0;
        this.as = 0;
        super.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ahh ahhVar, int i) {
        if (i != 0) {
            int i2 = this.au;
            ahf[] ahfVarArr = this.av;
            int length = ahfVarArr.length;
            if (i2 + 1 >= length) {
                this.av = (ahf[]) Arrays.copyOf(ahfVarArr, length + length);
            }
            this.av[this.au] = new ahf(ahhVar, 1, this.d);
            this.au++;
            return;
        }
        int i3 = this.at;
        ahf[] ahfVarArr2 = this.aw;
        int length2 = ahfVarArr2.length;
        if (i3 + 1 >= length2) {
            this.aw = (ahf[]) Arrays.copyOf(ahfVarArr2, length2 + length2);
        }
        this.aw[this.at] = new ahf(ahhVar, 0, this.d);
        this.at++;
    }
}
