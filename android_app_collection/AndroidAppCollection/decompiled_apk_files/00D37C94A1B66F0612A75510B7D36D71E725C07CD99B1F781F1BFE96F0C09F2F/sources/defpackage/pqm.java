package defpackage;

import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
/* compiled from: PG */
/* renamed from: pqm  reason: default package */
/* loaded from: classes4.dex */
final class pqm implements ppy, ppx {
    public final ppy[] a;
    private ppx d;
    private TrackGroupArray e;
    private final ArrayList c = new ArrayList();
    private prk g = pns.b(new prk[0]);
    private final IdentityHashMap b = new IdentityHashMap();
    private ppy[] f = new ppy[0];

    public pqm(long[] jArr, ppy... ppyVarArr) {
        this.a = ppyVarArr;
        for (int i = 0; i < ppyVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.a[i] = new pqk(ppyVarArr[i], j);
            }
        }
    }

    @Override // defpackage.ppy
    public final long a(long j, pkh pkhVar) {
        ppy[] ppyVarArr = this.f;
        return (ppyVarArr.length > 0 ? ppyVarArr[0] : this.a[0]).a(j, pkhVar);
    }

    @Override // defpackage.prj
    public final /* bridge */ /* synthetic */ void b(prk prkVar) {
        ppy ppyVar = (ppy) prkVar;
        ppx ppxVar = this.d;
        ptx.a(ppxVar);
        ppxVar.b(this);
    }

    @Override // defpackage.ppx
    public final void c(ppy ppyVar) {
        this.c.remove(ppyVar);
        if (!this.c.isEmpty()) {
            return;
        }
        int i = 0;
        for (ppy ppyVar2 : this.a) {
            i += ppyVar2.i().b;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i];
        int i2 = 0;
        for (ppy ppyVar3 : this.a) {
            TrackGroupArray i3 = ppyVar3.i();
            int i4 = i3.b;
            int i5 = 0;
            while (i5 < i4) {
                trackGroupArr[i2] = i3.b(i5);
                i5++;
                i2++;
            }
        }
        this.e = new TrackGroupArray(trackGroupArr);
        ppx ppxVar = this.d;
        ptx.a(ppxVar);
        ppxVar.c(this);
    }

    @Override // defpackage.ppy, defpackage.prk
    public final long d() {
        return this.g.d();
    }

    @Override // defpackage.ppy, defpackage.prk
    public final long e() {
        return this.g.e();
    }

    @Override // defpackage.ppy
    public final long f() {
        ppy[] ppyVarArr;
        ppy[] ppyVarArr2;
        long j = -9223372036854775807L;
        for (ppy ppyVar : this.f) {
            long f = ppyVar.f();
            if (f != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (ppy ppyVar2 : this.f) {
                        if (ppyVar2 == ppyVar) {
                            break;
                        } else if (ppyVar2.g(f) != f) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = f;
                } else if (f != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && ppyVar.g(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // defpackage.ppy
    public final long g(long j) {
        long g = this.f[0].g(j);
        int i = 1;
        while (true) {
            ppy[] ppyVarArr = this.f;
            if (i < ppyVarArr.length) {
                if (ppyVarArr[i].g(g) != g) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
                i++;
            } else {
                return g;
            }
        }
    }

    @Override // defpackage.ppy
    public final long h(pvf[] pvfVarArr, boolean[] zArr, pri[] priVarArr, boolean[] zArr2, long j) {
        int length;
        int length2 = pvfVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = pvfVarArr.length;
            if (i >= length) {
                break;
            }
            pri priVar = priVarArr[i];
            Integer num = priVar == null ? null : (Integer) this.b.get(priVar);
            iArr[i] = num == null ? -1 : num.intValue();
            iArr2[i] = -1;
            pvf pvfVar = pvfVarArr[i];
            if (pvfVar != null) {
                TrackGroup p = pvfVar.p();
                int i2 = 0;
                while (true) {
                    ppy[] ppyVarArr = this.a;
                    if (i2 >= ppyVarArr.length) {
                        break;
                    } else if (ppyVarArr[i2].i().a(p) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            i++;
        }
        this.b.clear();
        pri[] priVarArr2 = new pri[length];
        pri[] priVarArr3 = new pri[length];
        pvf[] pvfVarArr2 = new pvf[length];
        ArrayList arrayList = new ArrayList(this.a.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.a.length) {
            for (int i4 = 0; i4 < pvfVarArr.length; i4++) {
                priVarArr3[i4] = iArr[i4] == i3 ? priVarArr[i4] : null;
                pvfVarArr2[i4] = iArr2[i4] == i3 ? pvfVarArr[i4] : null;
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            pri[] priVarArr4 = priVarArr3;
            pvf[] pvfVarArr3 = pvfVarArr2;
            long h = this.a[i3].h(pvfVarArr2, zArr, priVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = h;
            } else if (h != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < pvfVarArr.length; i6++) {
                boolean z2 = true;
                if (iArr2[i6] == i5) {
                    pri priVar2 = priVarArr4[i6];
                    ptx.a(priVar2);
                    priVarArr2[i6] = priVarArr4[i6];
                    this.b.put(priVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    if (priVarArr4[i6] != null) {
                        z2 = false;
                    }
                    ptx.e(z2);
                }
            }
            if (z) {
                arrayList2.add(this.a[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            priVarArr3 = priVarArr4;
            pvfVarArr2 = pvfVarArr3;
        }
        System.arraycopy(priVarArr2, 0, priVarArr, 0, length);
        ppy[] ppyVarArr2 = (ppy[]) arrayList.toArray(new ppy[0]);
        this.f = ppyVarArr2;
        this.g = pns.b(ppyVarArr2);
        return j2;
    }

    @Override // defpackage.ppy
    public final TrackGroupArray i() {
        TrackGroupArray trackGroupArray = this.e;
        ptx.a(trackGroupArray);
        return trackGroupArray;
    }

    @Override // defpackage.ppy
    public final void j(long j, boolean z) {
        for (ppy ppyVar : this.f) {
            ppyVar.j(j, z);
        }
    }

    @Override // defpackage.ppy
    public final void k() {
        for (ppy ppyVar : this.a) {
            ppyVar.k();
        }
    }

    @Override // defpackage.ppy
    public final void l(ppx ppxVar, long j) {
        this.d = ppxVar;
        Collections.addAll(this.c, this.a);
        for (ppy ppyVar : this.a) {
            ppyVar.l(this, j);
        }
    }

    @Override // defpackage.ppy, defpackage.prk
    public final void m(long j) {
        this.g.m(j);
    }

    @Override // defpackage.ppy, defpackage.prk
    public final boolean o(long j) {
        if (!this.c.isEmpty()) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                ((ppy) this.c.get(i)).o(j);
            }
            return false;
        }
        return this.g.o(j);
    }

    @Override // defpackage.ppy, defpackage.prk
    public final boolean p() {
        return this.g.p();
    }
}
