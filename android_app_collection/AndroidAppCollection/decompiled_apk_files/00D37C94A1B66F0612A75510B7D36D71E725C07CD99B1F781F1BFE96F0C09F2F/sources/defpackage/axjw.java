package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: axjw  reason: default package */
/* loaded from: classes2.dex */
public final class axjw extends axjc {
    final axjh d;
    private final int e;
    private final int f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public axjw(defpackage.axjh r4, long r5, long r7) {
        /*
            r3 = this;
            r0 = r4
            axjc r0 = (defpackage.axjc) r0
            java.lang.String r0 = r0.a
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 6
            r2.<init>(r1)
            java.lang.String r1 = "crop("
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.<init>(r0)
            r3.d = r4
            int r4 = (int) r5
            r3.e = r4
            int r4 = (int) r7
            r3.f = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axjw.<init>(axjh, long, long):void");
    }

    @Override // defpackage.axjc, defpackage.axjh
    public final cwy b() {
        return ((axjf) this.d).k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // defpackage.axjc, defpackage.axjh
    public final List d() {
        cvv cvvVar;
        long j;
        List list = ((axjf) this.d).g;
        long j2 = this.e;
        long j3 = this.f;
        ArrayList arrayList = null;
        if (list != null && !list.isEmpty()) {
            ListIterator listIterator = list.listIterator();
            arrayList = new ArrayList();
            long j4 = 0;
            while (true) {
                cvvVar = (cvv) listIterator.next();
                j = cvvVar.a + j4;
                if (j > j2) {
                    break;
                }
                j4 = j;
            }
            if (j >= j3) {
                arrayList.add(new cvv((int) (j3 - j2), cvvVar.b));
            } else {
                arrayList.add(new cvv((int) (j - j2), cvvVar.b));
                int i = cvvVar.a;
                while (true) {
                    j4 += i;
                    if (!listIterator.hasNext()) {
                        break;
                    }
                    cvvVar = (cvv) listIterator.next();
                    if (cvvVar.a + j4 >= j3) {
                        break;
                    }
                    arrayList.add(cvvVar);
                    i = cvvVar.a;
                }
                arrayList.add(new cvv((int) (j3 - j4), cvvVar.b));
            }
        }
        return arrayList;
    }

    @Override // defpackage.axjc, defpackage.axjh
    public final List f() {
        List list = ((axjf) this.d).h;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return ((axjf) this.d).h.subList(this.e, this.f);
    }

    @Override // defpackage.axjc, defpackage.axjh
    public final synchronized long[] h() {
        if (this.d.h() != null) {
            long[] h = this.d.h();
            int length = h.length;
            int i = 0;
            while (i < h.length && h[i] < this.e) {
                i++;
            }
            while (length > 0) {
                int i2 = length - 1;
                if (this.f >= h[i2]) {
                    break;
                }
                length = i2;
            }
            long[] copyOfRange = Arrays.copyOfRange(this.d.h(), i, length);
            for (int i3 = 0; i3 < copyOfRange.length; i3++) {
                copyOfRange[i3] = copyOfRange[i3] - this.e;
            }
            return copyOfRange;
        }
        return null;
    }

    @Override // defpackage.axjh
    public final cwp i() {
        return ((axjf) this.d).e;
    }

    @Override // defpackage.axjh
    public final axji j() {
        return ((axjf) this.d).i;
    }

    @Override // defpackage.axjh
    public final String k() {
        return ((axjf) this.d).j;
    }

    @Override // defpackage.axjh
    public final List l() {
        return ((axjf) this.d).d.subList(this.e, this.f);
    }

    @Override // defpackage.axjh
    public final synchronized long[] m() {
        long[] jArr;
        int i = this.f - this.e;
        jArr = new long[i];
        System.arraycopy(this.d.m(), this.e, jArr, 0, i);
        return jArr;
    }
}
