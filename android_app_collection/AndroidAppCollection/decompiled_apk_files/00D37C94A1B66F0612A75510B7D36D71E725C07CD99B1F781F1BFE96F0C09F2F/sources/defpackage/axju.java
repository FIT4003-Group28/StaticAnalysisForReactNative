package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: axju  reason: default package */
/* loaded from: classes2.dex */
public final class axju extends axjc {
    private static final axlg f = axlg.d(axju.class);
    axjh[] d;
    cwp e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v7, types: [cxv, axiz] */
    /* JADX WARN: Type inference failed for: r10v9, types: [axiz, cyc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public axju(defpackage.axjh... r18) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axju.<init>(axjh[]):void");
    }

    private static final axki n(axkc axkcVar, axkc axkcVar2) {
        axkb axkbVar;
        if (!(axkcVar instanceof axki) || !(axkcVar2 instanceof axki)) {
            f.b("I can only merge ESDescriptors");
            return null;
        }
        axki axkiVar = (axki) axkcVar;
        axki axkiVar2 = (axki) axkcVar2;
        if (axkiVar.c == axkiVar2.c) {
            int i = axkiVar.f;
            int i2 = axkiVar2.f;
            if (axkiVar.h == axkiVar2.h && axkiVar.a == axkiVar2.a && axkiVar.i == axkiVar2.i && axkiVar.d == axkiVar2.d && axkiVar.b == axkiVar2.b) {
                int i3 = axkiVar.e;
                int i4 = axkiVar2.e;
                String str = axkiVar.g;
                if (str != null) {
                    str.equals(axkiVar2.g);
                } else {
                    String str2 = axkiVar2.g;
                }
                axkf axkfVar = axkiVar.j;
                if (axkfVar == null ? axkiVar2.j != null : !axkfVar.equals(axkiVar2.j)) {
                    axkf axkfVar2 = axkiVar.j;
                    axkf axkfVar3 = axkiVar2.j;
                    axkb axkbVar2 = axkfVar2.h;
                    if (axkbVar2 != null && (axkbVar = axkfVar3.h) != null && !axkbVar2.equals(axkbVar)) {
                        return null;
                    }
                    long j = axkfVar2.f;
                    long j2 = axkfVar3.f;
                    if (j != j2) {
                        axkfVar2.f = (j + j2) / 2;
                    }
                    int i5 = axkfVar2.d;
                    int i6 = axkfVar3.d;
                    axkg axkgVar = axkfVar2.g;
                    if (axkgVar == null ? axkfVar3.g != null : !axkgVar.equals(axkfVar3.g)) {
                        return null;
                    }
                    long j3 = axkfVar2.e;
                    long j4 = axkfVar3.e;
                    if (j3 != j4) {
                        axkfVar2.e = Math.max(j3, j4);
                    }
                    if (!axkfVar2.i.equals(axkfVar3.i) || axkfVar2.a != axkfVar3.a || axkfVar2.b != axkfVar3.b || axkfVar2.c != axkfVar3.c) {
                        return null;
                    }
                }
                if (axkiVar.l.equals(axkiVar2.l)) {
                    axko axkoVar = axkiVar.k;
                    if (axkoVar == null ? axkiVar2.k != null : !axkoVar.equals(axkiVar2.k)) {
                        return null;
                    }
                    return axkiVar;
                }
            }
        }
        return null;
    }

    @Override // defpackage.axjc, defpackage.axjh
    public final cwy b() {
        return this.d[0].b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (axjh axjhVar : this.d) {
            axjhVar.close();
        }
    }

    @Override // defpackage.axjc, defpackage.axjh
    public final List d() {
        Iterator it;
        if (this.d[0].d() == null || this.d[0].d().isEmpty()) {
            return null;
        }
        LinkedList<int[]> linkedList = new LinkedList();
        for (axjh axjhVar : this.d) {
            List<cvv> d = axjhVar.d();
            long j = 0;
            while (d.iterator().hasNext()) {
                j += ((cvv) it.next()).a;
            }
            int[] iArr = new int[(int) j];
            int i = 0;
            for (cvv cvvVar : d) {
                int i2 = 0;
                while (i2 < cvvVar.a) {
                    iArr[i] = cvvVar.b;
                    i2++;
                    i++;
                }
            }
            linkedList.add(iArr);
        }
        LinkedList linkedList2 = new LinkedList();
        for (int[] iArr2 : linkedList) {
            for (int i3 : iArr2) {
                if (linkedList2.isEmpty() || ((cvv) linkedList2.getLast()).b != i3) {
                    linkedList2.add(new cvv(1, i3));
                } else {
                    ((cvv) linkedList2.getLast()).a++;
                }
            }
        }
        return linkedList2;
    }

    @Override // defpackage.axjc, defpackage.axjh
    public final List f() {
        if (this.d[0].f() == null || this.d[0].f().isEmpty()) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (axjh axjhVar : this.d) {
            linkedList.addAll(axjhVar.f());
        }
        return linkedList;
    }

    @Override // defpackage.axjc, defpackage.axjh
    public final long[] h() {
        if (this.d[0].h() == null || this.d[0].h().length <= 0) {
            return null;
        }
        int i = 0;
        for (axjh axjhVar : this.d) {
            i += axjhVar.h().length;
        }
        long[] jArr = new long[i];
        long j = 0;
        int i2 = 0;
        for (axjh axjhVar2 : this.d) {
            long[] h = axjhVar2.h();
            int length = h.length;
            int i3 = 0;
            while (i3 < length) {
                jArr[i2] = h[i3] + j;
                i3++;
                i2++;
            }
            j += axjhVar2.l().size();
        }
        return jArr;
    }

    @Override // defpackage.axjh
    public final cwp i() {
        return this.e;
    }

    @Override // defpackage.axjh
    public final axji j() {
        return this.d[0].j();
    }

    @Override // defpackage.axjh
    public final String k() {
        return this.d[0].k();
    }

    @Override // defpackage.axjh
    public final List l() {
        ArrayList arrayList = new ArrayList();
        for (axjh axjhVar : this.d) {
            arrayList.addAll(axjhVar.l());
        }
        return arrayList;
    }

    @Override // defpackage.axjh
    public final synchronized long[] m() {
        long[] jArr;
        int i = 0;
        for (axjh axjhVar : this.d) {
            i += axjhVar.m().length;
        }
        jArr = new long[i];
        int i2 = 0;
        for (axjh axjhVar2 : this.d) {
            long[] m = axjhVar2.m();
            int length = m.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = i2 + 1;
                jArr[i2] = m[i3];
                i3++;
                i2 = i4;
            }
        }
        return jArr;
    }
}
