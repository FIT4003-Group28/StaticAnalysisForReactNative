package defpackage;

import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: ovv  reason: default package */
/* loaded from: classes4.dex */
public final class ovv {
    public final int a;
    public final long b;
    public final HashMap c;
    public owx d;
    public boolean e;
    public boolean f;
    public long g;
    private final int[] h;
    private long i;

    public ovv(ovx ovxVar, int i, owf owfVar, int i2, ovu ovuVar) {
        this.a = i;
        owi b = owfVar.b(i2);
        long d = d(owfVar, i2);
        owc owcVar = (owc) b.b.get(ovuVar.d);
        List list = owcVar.b;
        this.b = b.a * 1000;
        owu owuVar = null;
        if (!owcVar.c.isEmpty()) {
            for (int i3 = 0; i3 < owcVar.c.size(); i3++) {
                owd owdVar = (owd) owcVar.c.get(i3);
                if (owdVar.b != null && owdVar.c != null) {
                    owuVar = owuVar == null ? new owu() : owuVar;
                    owuVar.b(owdVar.b, owdVar.c);
                }
            }
        }
        this.d = owuVar;
        if (ovuVar.a()) {
            this.h = new int[ovuVar.f.length];
            int i4 = 0;
            while (true) {
                ovm[] ovmVarArr = ovuVar.f;
                if (i4 >= ovmVarArr.length) {
                    break;
                }
                this.h[i4] = e(list, ovmVarArr[i4].a);
                i4++;
            }
        } else {
            this.h = new int[]{e(list, ovuVar.e.a)};
        }
        this.c = new HashMap();
        int i5 = 0;
        while (true) {
            int[] iArr = this.h;
            if (i5 < iArr.length) {
                owm owmVar = (owm) list.get(iArr[i5]);
                this.c.put(owmVar.e.a, new ovw(ovxVar, this.b, d, owmVar));
                i5++;
            } else {
                c(d, (owm) list.get(iArr[0]));
                return;
            }
        }
    }

    private final void c(long j, owm owmVar) {
        long j2;
        ovy h = owmVar.h();
        boolean z = true;
        if (h != null) {
            int a = h.a();
            int b = h.b(j);
            if (b != -1) {
                z = false;
            }
            this.e = z;
            this.f = h.g();
            this.g = this.b + h.e(a);
            if (this.e) {
                return;
            }
            j2 = this.b + h.e(b);
            j = h.d(b, j);
        } else {
            this.e = false;
            this.f = true;
            j2 = this.b;
            this.g = j2;
        }
        this.i = j2 + j;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final long d(defpackage.owf r5, int r6) {
        /*
            java.util.List r0 = r5.g
            int r0 = r0.size()
            int r0 = r0 + (-1)
            r1 = -1
            if (r6 != r0) goto L20
            long r3 = r5.b
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L14
            r3 = r1
            goto L37
        L14:
            java.util.List r5 = r5.g
            java.lang.Object r5 = r5.get(r6)
            owi r5 = (defpackage.owi) r5
            long r5 = r5.a
        L1e:
            long r3 = r3 - r5
            goto L37
        L20:
            java.util.List r0 = r5.g
            int r3 = r6 + 1
            java.lang.Object r0 = r0.get(r3)
            owi r0 = (defpackage.owi) r0
            long r3 = r0.a
            java.util.List r5 = r5.g
            java.lang.Object r5 = r5.get(r6)
            owi r5 = (defpackage.owi) r5
            long r5 = r5.a
            goto L1e
        L37:
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r1
        L3c:
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovv.d(owf, int):long");
    }

    private static final int e(List list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(((owm) list.get(i)).e.a)) {
                return i;
            }
        }
        throw new IllegalStateException(str.length() != 0 ? "Missing format id: ".concat(str) : new String("Missing format id: "));
    }

    public final long a() {
        if (!this.e) {
            return this.i;
        }
        throw new IllegalStateException("Period has unbounded index");
    }

    public final void b(owf owfVar, int i, ovu ovuVar) {
        owi b = owfVar.b(i);
        long d = d(owfVar, i);
        List list = ((owc) b.b.get(ovuVar.d)).b;
        int i2 = 0;
        while (true) {
            int[] iArr = this.h;
            if (i2 < iArr.length) {
                owm owmVar = (owm) list.get(iArr[i2]);
                ovw ovwVar = (ovw) this.c.get(owmVar.e.a);
                ovy h = ovwVar.c.h();
                ovy h2 = owmVar.h();
                ovwVar.g = d;
                ovwVar.c = owmVar;
                if (h != null) {
                    ovwVar.d = h2;
                    if (h.g()) {
                        int b2 = h.b(ovwVar.g);
                        long e = h.e(b2) + h.d(b2, ovwVar.g);
                        int a = h2.a();
                        long e2 = h2.e(a);
                        if (e == e2) {
                            ovwVar.h += (h.b(ovwVar.g) + 1) - a;
                        } else if (e >= e2) {
                            ovwVar.h += h.c(e2, ovwVar.g) - a;
                        } else {
                            throw new osr();
                        }
                    } else {
                        continue;
                    }
                }
                i2++;
            } else {
                c(d, (owm) list.get(iArr[0]));
                return;
            }
        }
    }
}
