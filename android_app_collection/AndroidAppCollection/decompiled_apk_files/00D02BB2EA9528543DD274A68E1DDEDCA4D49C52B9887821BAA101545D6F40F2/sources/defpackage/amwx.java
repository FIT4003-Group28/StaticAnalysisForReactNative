package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: PG */
/* renamed from: amwx  reason: default package */
/* loaded from: classes2.dex */
public final class amwx implements amwf {
    private static final int[] b = {2, 4, 6, 8, 10, 11, 12, 13, 14};
    private static final int[] c = {2, 2, 2, 2, 3, 4, 4, 6, 8};
    private final ConcurrentLinkedQueue<alyh> a = new ConcurrentLinkedQueue<>();

    public amwx(List<alyh> list, int i) {
        Collections.reverse(list);
        HashSet c2 = dcnm.c();
        for (alyh alyhVar : list) {
            ConcurrentLinkedQueue<alyh> concurrentLinkedQueue = this.a;
            int i2 = 1;
            dbsk.a(true);
            int i3 = 0;
            while (i3 < 9) {
                int i4 = b[i3];
                int i5 = c[i3];
                int i6 = i4 - alyhVar.a;
                int e = (e(alyhVar.b, i6) + i5) - 1;
                int e2 = (e(alyhVar.c, i6) - i5) + i2;
                int e3 = (e(alyhVar.c, i6) + i5) - 1;
                int i7 = i2 << i4;
                for (int e4 = (e(alyhVar.b, i6) - i5) + i2; e4 <= e; e4++) {
                    for (int i8 = e2; i8 <= e3; i8++) {
                        alyh alyhVar2 = new alyh(i4, d(e4, i7), d(i8, i7));
                        if (!c2.contains(alyhVar2) && c2.size() < i) {
                            c2.add(alyhVar2);
                            concurrentLinkedQueue.add(alyhVar2);
                        }
                    }
                }
                i3++;
                i2 = 1;
            }
        }
        this.a.size();
    }

    private static int d(int i, int i2) {
        if (i >= 0) {
            return i % i2;
        }
        return (i % i2) + i2;
    }

    private static int e(int i, int i2) {
        return (int) Math.floor(Math.scalb(i, i2));
    }

    @Override // defpackage.amwf
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.alyi
    @dzsi
    public final alyh b() {
        return this.a.poll();
    }

    @Override // defpackage.amwf
    public final int c() {
        return 0;
    }
}
