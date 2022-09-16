package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: aht  reason: default package */
/* loaded from: classes.dex */
public final class aht {
    public final ahi a;
    public final ahi d;
    final ArrayList f;
    public aij g;
    private final ahp h;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList e = new ArrayList();

    public aht(ahi ahiVar) {
        new ArrayList();
        this.g = null;
        this.h = new ahp();
        this.f = new ArrayList();
        this.a = ahiVar;
        this.d = ahiVar;
    }

    private final void e(aid aidVar, int i, ArrayList arrayList) {
        for (ahs ahsVar : aidVar.i.j) {
            if (ahsVar instanceof ahu) {
                g((ahu) ahsVar, i, aidVar.j, arrayList, null);
            } else if (ahsVar instanceof aid) {
                g(((aid) ahsVar).i, i, aidVar.j, arrayList, null);
            }
        }
        for (ahs ahsVar2 : aidVar.j.j) {
            if (ahsVar2 instanceof ahu) {
                g((ahu) ahsVar2, i, aidVar.i, arrayList, null);
            } else if (ahsVar2 instanceof aid) {
                g(((aid) ahsVar2).j, i, aidVar.i, arrayList, null);
            }
        }
        if (i == 1) {
            for (ahs ahsVar3 : ((aib) aidVar).a.j) {
                if (ahsVar3 instanceof ahu) {
                    g((ahu) ahsVar3, 1, null, arrayList, null);
                }
            }
        }
    }

    private final void f(ahh ahhVar, int i, int i2, int i3, int i4) {
        ahp ahpVar = this.h;
        ahpVar.i = i;
        ahpVar.j = i3;
        ahpVar.a = i2;
        ahpVar.b = i4;
        this.g.a(ahhVar, ahpVar);
        ahhVar.D(this.h.c);
        ahhVar.y(this.h.d);
        ahp ahpVar2 = this.h;
        ahhVar.F = ahpVar2.f;
        ahhVar.v(ahpVar2.e);
    }

    private final void g(ahu ahuVar, int i, ahu ahuVar2, ArrayList arrayList, aia aiaVar) {
        aid aidVar = ahuVar.d;
        if (aidVar.e == null) {
            ahi ahiVar = this.a;
            if (aidVar == ahiVar.h || aidVar == ahiVar.i) {
                return;
            }
            if (aiaVar == null) {
                aiaVar = new aia(aidVar);
                arrayList.add(aiaVar);
            }
            aidVar.e = aiaVar;
            aiaVar.c.add(aidVar);
            for (ahs ahsVar : aidVar.i.j) {
                if (ahsVar instanceof ahu) {
                    g((ahu) ahsVar, i, ahuVar2, arrayList, aiaVar);
                }
            }
            for (ahs ahsVar2 : aidVar.j.j) {
                if (ahsVar2 instanceof ahu) {
                    g((ahu) ahsVar2, i, ahuVar2, arrayList, aiaVar);
                }
            }
            if (i == 1 && (aidVar instanceof aib)) {
                for (ahs ahsVar3 : ((aib) aidVar).a.j) {
                    if (ahsVar3 instanceof ahu) {
                        g((ahu) ahsVar3, 1, ahuVar2, arrayList, aiaVar);
                    }
                }
            }
            for (ahu ahuVar3 : aidVar.i.k) {
                g(ahuVar3, i, ahuVar2, arrayList, aiaVar);
            }
            for (ahu ahuVar4 : aidVar.j.k) {
                g(ahuVar4, i, ahuVar2, arrayList, aiaVar);
            }
            if (i != 1 || !(aidVar instanceof aib)) {
                return;
            }
            for (ahu ahuVar5 : ((aib) aidVar).a.k) {
                g(ahuVar5, 1, ahuVar2, arrayList, aiaVar);
            }
        }
    }

    public final int a(ahi ahiVar, int i) {
        aid aidVar;
        long a;
        ahu ahuVar;
        ahu ahuVar2;
        float f;
        aht ahtVar = this;
        ahi ahiVar2 = ahiVar;
        int size = ahtVar.f.size();
        long j = 0;
        int i2 = 0;
        long j2 = 0;
        while (i2 < size) {
            aia aiaVar = (aia) ahtVar.f.get(i2);
            aid aidVar2 = aiaVar.b;
            if (!(aidVar2 instanceof ahr) ? i != 0 ? (aidVar2 instanceof aib) : (aidVar2 instanceof ahz) : ((ahr) aidVar2).g == i) {
                ahu ahuVar3 = i == 0 ? ahiVar2.h.i : ahiVar2.i.i;
                ahu ahuVar4 = i == 0 ? ahiVar2.h.j : ahiVar2.i.j;
                boolean contains = aidVar2.i.k.contains(ahuVar3);
                boolean contains2 = aiaVar.b.j.k.contains(ahuVar4);
                long a2 = aiaVar.b.a();
                if (contains && contains2) {
                    long b = aiaVar.b(aiaVar.b.i, j);
                    long a3 = aiaVar.a(aiaVar.b.j, j);
                    long j3 = b - a2;
                    aid aidVar3 = aiaVar.b;
                    int i3 = aidVar3.j.e;
                    if (j3 >= (-i3)) {
                        j3 += i3;
                    }
                    long j4 = aidVar3.i.e;
                    long j5 = ((-a3) - a2) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    ahh ahhVar = aidVar3.d;
                    float f2 = (float) ((i == 0 ? ahhVar.ad : ahhVar.ae) > 0.0f ? (((float) j5) / f) + (((float) j3) / (1.0f - f)) : 0L);
                    a = (j4 + ((((f2 * f) + 0.5f) + a2) + ((f2 * (1.0f - f)) + 0.5f))) - i3;
                } else if (contains) {
                    a = Math.max(aiaVar.b(aiaVar.b.i, ahuVar2.e), aiaVar.b.i.e + a2);
                } else if (contains2) {
                    a = Math.max(-aiaVar.a(aiaVar.b.j, ahuVar.e), (-aiaVar.b.j.e) + a2);
                } else {
                    a = (aidVar.i.e + aiaVar.b.a()) - aiaVar.b.j.e;
                }
            } else {
                a = j;
            }
            j2 = Math.max(j2, a);
            i2++;
            ahtVar = this;
            ahiVar2 = ahiVar;
            j = 0;
        }
        return (int) j2;
    }

    public final void b() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        this.d.h.d();
        this.d.i.d();
        arrayList.add(this.d.h);
        arrayList.add(this.d.i);
        ArrayList arrayList2 = this.d.aH;
        int size = arrayList2.size();
        HashSet hashSet = null;
        for (int i = 0; i < size; i++) {
            ahh ahhVar = (ahh) arrayList2.get(i);
            if (ahhVar instanceof ahk) {
                arrayList.add(new ahx(ahhVar));
            } else {
                if (ahhVar.I()) {
                    if (ahhVar.f == null) {
                        ahhVar.f = new ahr(ahhVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(ahhVar.f);
                } else {
                    arrayList.add(ahhVar.h);
                }
                if (ahhVar.J()) {
                    if (ahhVar.g == null) {
                        ahhVar.g = new ahr(ahhVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(ahhVar.g);
                } else {
                    arrayList.add(ahhVar.i);
                }
                if (ahhVar instanceof ahl) {
                    arrayList.add(new ahy(ahhVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((aid) arrayList.get(i2)).d();
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            aid aidVar = (aid) arrayList.get(i3);
            if (aidVar.d != this.d) {
                aidVar.b();
            }
        }
        this.f.clear();
        aia.a = 0;
        e(this.a.h, 0, this.f);
        e(this.a.i, 1, this.f);
        this.b = false;
    }

    public final void c() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        ahv ahvVar;
        ArrayList arrayList = this.a.aH;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ahh ahhVar = (ahh) arrayList.get(i3);
            if (!ahhVar.e) {
                int[] iArr = ahhVar.ap;
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = ahhVar.s;
                int i7 = ahhVar.t;
                if (i4 == 2) {
                    i = i4;
                    z = true;
                } else if (i4 == 3) {
                    z = i6 == 1;
                    i = 3;
                } else {
                    i = i4;
                    z = false;
                }
                if (i5 == 2) {
                    i2 = i5;
                    z2 = true;
                } else if (i5 == 3) {
                    z2 = i7 == 1;
                    i2 = 3;
                } else {
                    i2 = i5;
                    z2 = false;
                }
                ahv ahvVar2 = ahhVar.h.f;
                boolean z3 = ahvVar2.i;
                ahv ahvVar3 = ahhVar.i.f;
                boolean z4 = ahvVar3.i;
                if (z3 && z4) {
                    f(ahhVar, 1, ahvVar2.f, 1, ahvVar3.f);
                    ahhVar.e = true;
                } else if (z3 && z2) {
                    f(ahhVar, 1, ahvVar2.f, 2, ahvVar3.f);
                    if (i2 == 3) {
                        ahhVar.i.f.m = ahhVar.h();
                    } else {
                        ahhVar.i.f.c(ahhVar.h());
                        ahhVar.e = true;
                    }
                } else if (z4 && z) {
                    f(ahhVar, 2, ahvVar2.f, 1, ahvVar3.f);
                    if (i == 3) {
                        ahhVar.h.f.m = ahhVar.j();
                    } else {
                        ahhVar.h.f.c(ahhVar.j());
                        ahhVar.e = true;
                    }
                }
                if (ahhVar.e && (ahvVar = ahhVar.i.b) != null) {
                    ahvVar.c(ahhVar.aa);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.ahi r18) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aht.d(ahi):void");
    }
}
