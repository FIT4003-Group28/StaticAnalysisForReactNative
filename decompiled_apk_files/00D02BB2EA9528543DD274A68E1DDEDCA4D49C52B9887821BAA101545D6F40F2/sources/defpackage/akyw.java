package defpackage;

import java.util.HashSet;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: akyw  reason: default package */
/* loaded from: classes.dex */
public final class akyw implements akzu {
    private final akza d;
    private final akzv[] a = new akzv[alad.b];
    private final int[] b = new int[alad.b];
    private final HashSet<akzv> c = new HashSet<>();
    private final akyv e = new akyv();

    public akyw(akza akzaVar) {
        dbsk.s(akzaVar);
        this.d = akzaVar;
    }

    public final synchronized int a(akzv akzvVar) {
        dbsk.s(akzvVar);
        int d = akzvVar.d();
        if (akzvVar.h()) {
            int[] b = alab.b();
            for (int i = 0; i < 5; i++) {
                int i2 = b[i];
                int i3 = i2 - 1;
                if (i2 != 0) {
                    akzv akzvVar2 = this.a[i3];
                    if (((1 << i3) & d) != 0 && akzvVar2 != null && !akzvVar2.m(akzvVar, i2)) {
                        int[] b2 = alab.b();
                        for (int i4 = 0; i4 < 5; i4++) {
                            if (b2[i4] == i2) {
                                return 0;
                            }
                        }
                        continue;
                    }
                } else {
                    throw null;
                }
            }
        }
        int[] b3 = alab.b();
        int i5 = 0;
        for (int i6 = 0; i6 < 5; i6++) {
            int i7 = b3[i6];
            int i8 = i7 - 1;
            if (i7 == 0) {
                throw null;
            }
            int i9 = 1 << i8;
            if ((d & i9) != 0) {
                akzv akzvVar3 = this.a[i8];
                if (akzvVar3 == null || akzvVar.h() || akzvVar3.m(akzvVar, i7)) {
                    if (akzvVar3 != null) {
                        akzvVar3.n(akzvVar, i7);
                        if (akzvVar3.h() && akzvVar3 != akzvVar) {
                            this.c.add(akzvVar3);
                        }
                    }
                    this.a[i8] = akzvVar;
                    i5 |= i9;
                }
            } else {
                if (this.a[i8] != akzvVar) {
                }
                i5 |= i9;
            }
        }
        Iterator<akzv> it = this.c.iterator();
        while (it.hasNext()) {
            g(it.next());
        }
        this.c.clear();
        if (i5 != 0) {
            akzvVar.j(i5);
        }
        return i5;
    }

    public final synchronized int b(long j, alaa alaaVar) {
        int i;
        int[] b = alab.b();
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = b[i2];
            int i4 = i3 - 1;
            if (i3 != 0) {
                akzv akzvVar = this.a[i4];
                if (akzvVar != null) {
                    int i5 = 0;
                    while (true) {
                        if (i5 < i4) {
                            if (this.a[i5] == akzvVar) {
                                int[] iArr = this.b;
                                iArr[i4] = iArr[i5];
                                break;
                            }
                            i5++;
                        } else {
                            this.b[i4] = akzvVar.e(j);
                            break;
                        }
                    }
                    alaaVar.f(i3, akzvVar.k(i3));
                } else {
                    this.b[i4] = 0;
                }
            } else {
                throw null;
            }
        }
        this.d.b(alaaVar);
        akyv akyvVar = this.e;
        long j2 = akyvVar.c;
        float f = ((float) (j - j2)) / 1000.0f;
        if (j2 >= 0) {
            akyvVar.b.a(alaaVar);
            akyu akyuVar = akyvVar.b;
            akyu akyuVar2 = akyvVar.a;
            akyuVar.a -= akyuVar2.a;
            akyuVar.b -= akyuVar2.b;
            akyuVar.c = bvop.c(akyuVar.c - akyuVar2.c);
            akyuVar.d -= akyuVar2.d;
            akyuVar.e -= akyuVar2.e;
            akyuVar.f -= akyuVar2.f;
            akyuVar.g -= akyuVar2.g;
            akyu akyuVar3 = akyvVar.b;
            float f2 = 1.0f / f;
            akyuVar3.a *= f2;
            akyuVar3.b *= f2;
            akyuVar3.c *= f2;
            akyuVar3.d *= f2;
            akyuVar3.e *= f2;
            akyuVar3.f *= f2;
            akyuVar3.g *= f2;
        }
        akyvVar.c = j;
        akyvVar.a.a(alaaVar);
        int[] b2 = alab.b();
        i = 0;
        for (int i6 = 0; i6 < 5; i6++) {
            int i7 = b2[i6];
            int i8 = i7 - 1;
            if (i7 != 0) {
                akzv akzvVar2 = this.a[i8];
                if (akzvVar2 != null && this.b[i8] == 0) {
                    g(akzvVar2);
                }
                i |= this.b[i8];
            } else {
                throw null;
            }
        }
        return i;
    }

    public final synchronized long c() {
        long j;
        j = -1;
        for (int i = 0; i < alad.b; i++) {
            akzv akzvVar = this.a[i];
            if (akzvVar != null) {
                j = Math.max(j, akzvVar.f());
            }
        }
        return j;
    }

    public final synchronized boolean d(alaa alaaVar) {
        boolean z;
        Object l;
        int[] b = alab.b();
        z = false;
        for (int i = 0; i < 5; i++) {
            int i2 = b[i];
            akzv[] akzvVarArr = this.a;
            int i3 = i2 - 1;
            if (i2 != 0) {
                akzv akzvVar = akzvVarArr[i3];
                if (akzvVar != null && (l = akzvVar.l(i2)) != null) {
                    alaaVar.f(i2, l);
                    z = true;
                }
            } else {
                throw null;
            }
        }
        return z;
    }

    @Override // defpackage.akzu
    public final synchronized boolean e() {
        for (int i = 0; i < alad.b; i++) {
            akzv akzvVar = this.a[i];
            if (akzvVar != null && akzvVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.akzu
    public final synchronized boolean f() {
        int[] b = alab.b();
        for (int i = 0; i < 5; i++) {
            int i2 = b[i];
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (this.a[i3] != null && this.b[i3] != 0) {
                    return true;
                }
            } else {
                throw null;
            }
        }
        return false;
    }

    final synchronized void g(akzv akzvVar) {
        if (akzvVar == null) {
            return;
        }
        int[] b = alab.b();
        for (int i = 0; i < 5; i++) {
            int i2 = b[i];
            int i3 = i2 - 1;
            if (i2 != 0) {
                akzv akzvVar2 = this.a[i3];
                if (akzvVar2 == akzvVar) {
                    if (akzvVar2.m(null, i2)) {
                        this.a[i3].n(null, i2);
                        this.a[i3] = null;
                    } else {
                        this.a[i3].i();
                    }
                }
            } else {
                throw null;
            }
        }
    }
}
