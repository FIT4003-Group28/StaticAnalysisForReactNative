package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ahqq  reason: default package */
/* loaded from: classes2.dex */
public final class ahqq extends ahqp {
    private final ahqr f;
    private final bqyh g;
    private boolean[] h;
    private final List<ahqq> i;

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (((r1 - r2) * (r3 - r4)) == ((r14.b - r4) * (r12.a - r2))) goto L27;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ahqq(defpackage.ahqr r10, defpackage.bqyh r11, defpackage.akra r12, defpackage.akra r13, defpackage.akra r14, java.util.List<defpackage.ahqq> r15) {
        /*
            r9 = this;
            r0 = 0
            if (r13 == 0) goto L1f
            int r1 = r14.a
            int r2 = r13.a
            int r3 = r12.b
            int r4 = r13.b
            int r1 = r1 - r2
            long r5 = (long) r1
            int r3 = r3 - r4
            long r7 = (long) r3
            long r5 = r5 * r7
            int r1 = r14.b
            int r1 = r1 - r4
            long r3 = (long) r1
            int r1 = r12.a
            int r1 = r1 - r2
            long r1 = (long) r1
            long r3 = r3 * r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
        L1f:
            r13 = r0
        L20:
            r9.<init>(r12, r13, r14)
            r9.h = r0
            boolean r13 = r12.equals(r14)
            r14 = 1
            r13 = r13 ^ r14
            java.lang.String r0 = r11.toString()
            java.lang.String r12 = r12.toString()
            java.lang.String r1 = "segment %s has same start and end point %s"
            defpackage.dbsk.j(r13, r1, r0, r12)
            r9.f = r10
            r9.g = r11
            r9.i = r15
            java.util.List r10 = r11.f()
            r11 = 0
            r12 = 0
        L44:
            int r13 = r10.size()
            if (r12 >= r13) goto L72
            java.lang.Object r13 = r10.get(r12)
            if (r13 != 0) goto L6f
            int r12 = r10.size()
            boolean[] r12 = new boolean[r12]
            r9.h = r12
            r12 = 0
        L59:
            int r13 = r10.size()
            if (r12 >= r13) goto L72
            boolean[] r13 = r9.h
            java.lang.Object r15 = r10.get(r12)
            if (r15 != 0) goto L69
            r15 = 1
            goto L6a
        L69:
            r15 = 0
        L6a:
            r13[r12] = r15
            int r12 = r12 + 1
            goto L59
        L6f:
            int r12 = r12 + 1
            goto L44
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahqq.<init>(ahqr, bqyh, akra, akra, akra, java.util.List):void");
    }

    public static void d(List<ahqq> list, bqyh bqyhVar, Set<ahqq> set, Set<bqyh> set2) {
        for (ahqq ahqqVar : list) {
            set.add(ahqqVar);
            if (!ahqqVar.g.equals(bqyhVar)) {
                set2.remove(ahqqVar.g);
            }
            List<ahqq> list2 = ahqqVar.i;
            if (list2 != null) {
                d(list2, bqyhVar, set, set2);
            }
        }
    }

    @Override // defpackage.bqyh
    public final List<ahqq> e() {
        List<? extends bqyh> f = this.g.f();
        if (this.i == null) {
            if (this.h != null) {
                int i = 0;
                while (true) {
                    boolean[] zArr = this.h;
                    if (i >= zArr.length) {
                        break;
                    }
                    if (zArr[i] && f.get(i) != null) {
                        this.f.b.o(this.g);
                        this.h[i] = false;
                    }
                    i++;
                }
            }
            return this.f.a(this.g);
        }
        if (this.h != null) {
            int i2 = 0;
            while (true) {
                boolean[] zArr2 = this.h;
                if (i2 >= zArr2.length) {
                    break;
                }
                if (zArr2[i2] && f.get(i2) != null) {
                    bqyh bqyhVar = f.get(i2);
                    akra akraVar = new akra();
                    akra.H(bqyhVar.b, bqyhVar.c, 0.5f, akraVar);
                    if (akraVar.equals(this.c)) {
                        akraVar.a += (int) akraVar.r();
                    }
                    this.i.add(new ahqq(this.f, bqyhVar, this.c, null, akraVar, null));
                    this.h[i2] = false;
                }
                i2++;
            }
        }
        return this.i;
    }

    @Override // defpackage.ahqp, defpackage.bqyh
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahqq)) {
            return false;
        }
        ahqq ahqqVar = (ahqq) obj;
        return this.b.equals(ahqqVar.b) && this.c.equals(ahqqVar.c) && dbsd.a(this.a, ahqqVar.a) && this.g.equals(ahqqVar.g) && this.f == ahqqVar.f;
    }

    @Override // defpackage.bqyh
    public final List<bqyh> f() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bqyh
    public final boolean g() {
        return this.g.g();
    }

    @Override // defpackage.bqyh
    public final boolean h(bqyh bqyhVar) {
        if (!(bqyhVar instanceof ahqq)) {
            return false;
        }
        return this.g.h(((ahqq) bqyhVar).g);
    }

    @Override // defpackage.ahqp, defpackage.bqyh
    public final int hashCode() {
        int hashCode = (this.b.hashCode() * 229) + this.c.hashCode();
        akra akraVar = this.a;
        if (akraVar != null) {
            hashCode = (hashCode * 233) + akraVar.hashCode();
        }
        return (((hashCode * 229) + this.g.hashCode()) * 241) + System.identityHashCode(this.f);
    }
}
