package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ywd  reason: default package */
/* loaded from: classes4.dex */
public final class ywd {
    int a;
    final int[] b;
    final long[] c;
    final /* synthetic */ ywg d;

    public ywd(ywg ywgVar, int i) {
        this.d = ywgVar;
        this.b = new int[i];
        this.c = new long[i];
    }

    public final void a() {
        ywf ywfVar;
        ywg ywgVar;
        ywe b;
        do {
            ywfVar = (ywf) this.d.a.get();
            long[] copyOf = Arrays.copyOf(ywfVar.a, 7);
            long[] copyOf2 = Arrays.copyOf(ywfVar.b, 7);
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                if (i2 == 0) {
                    Arrays.fill(copyOf, 0L);
                    Arrays.fill(copyOf2, 0L);
                    copyOf2 = ywg.q(copyOf2);
                    copyOf = ywg.q(copyOf);
                } else {
                    ywg.j(copyOf2, i2, this.c[i]);
                    if (ywh.e(i2)) {
                        ywg.j(copyOf, i2, this.c[i]);
                    }
                }
            }
            if (Arrays.equals(ywfVar.b, copyOf2)) {
                return;
            }
            ywgVar = this.d;
            b = ywfVar.b();
            b.h(copyOf);
            b.g(copyOf2);
            b.e(true);
        } while (!ywgVar.k(ywfVar, b));
    }

    public final void b(int i, long j) {
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        long[] jArr = this.c;
        this.a = i2 + 1;
        jArr[i2] = j;
    }

    public final void c(int i, boolean z) {
        b(i, true != z ? 0L : 1L);
    }
}
