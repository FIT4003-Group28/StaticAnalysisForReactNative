package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: wg  reason: default package */
/* loaded from: classes4.dex */
public final class wg implements Runnable {
    public static final ThreadLocal a = new ThreadLocal();
    static final Comparator b = new wd();
    long d;
    public long e;
    public final ArrayList c = new ArrayList();
    private final ArrayList f = new ArrayList();

    private static final yo b(RecyclerView recyclerView, int i, long j) {
        int b2 = recyclerView.g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            yo l = RecyclerView.l(recyclerView.g.e(i2));
            if (l.c == i && !l.t()) {
                return null;
            }
        }
        yd ydVar = recyclerView.d;
        try {
            recyclerView.R();
            yo n = ydVar.n(i, j);
            if (n != null) {
                if (!n.s() || n.t()) {
                    ydVar.d(n, false);
                } else {
                    ydVar.i(n.a);
                }
            }
            return n;
        } finally {
            recyclerView.T(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.r && this.d == 0) {
            this.d = System.nanoTime();
            recyclerView.post(this);
        }
        we weVar = recyclerView.L;
        weVar.a = i;
        weVar.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wf wfVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        wf wfVar2;
        long j = 0;
        try {
            if (this.c.isEmpty()) {
                this.d = 0L;
                return;
            }
            int size = this.c.size();
            long j2 = 0;
            for (int i = 0; i < size; i++) {
                RecyclerView recyclerView3 = (RecyclerView) this.c.get(i);
                if (recyclerView3.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView3.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.d = 0L;
                return;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(j2) + this.e;
            int size2 = this.c.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                RecyclerView recyclerView4 = (RecyclerView) this.c.get(i3);
                if (recyclerView4.getWindowVisibility() == 0) {
                    recyclerView4.L.c(recyclerView4, false);
                    i2 += recyclerView4.L.d;
                }
            }
            this.f.ensureCapacity(i2);
            int i4 = 0;
            int i5 = 0;
            while (i4 < size2) {
                RecyclerView recyclerView5 = (RecyclerView) this.c.get(i4);
                if (recyclerView5.getWindowVisibility() == 0) {
                    we weVar = recyclerView5.L;
                    int abs = Math.abs(weVar.a) + Math.abs(weVar.b);
                    int i6 = 0;
                    while (true) {
                        int i7 = weVar.d;
                        if (i6 < i7 + i7) {
                            if (i5 >= this.f.size()) {
                                wfVar2 = new wf();
                                this.f.add(wfVar2);
                            } else {
                                wfVar2 = (wf) this.f.get(i5);
                            }
                            int[] iArr = weVar.c;
                            try {
                                int i8 = iArr[i6 + 1];
                                wfVar2.a = i8 <= abs;
                                wfVar2.b = abs;
                                wfVar2.c = i8;
                                wfVar2.d = recyclerView5;
                                wfVar2.e = iArr[i6];
                                i5++;
                                i6 += 2;
                            } catch (Throwable th) {
                                th = th;
                                j = 0;
                                this.d = j;
                                throw th;
                            }
                        }
                    }
                }
                i4++;
                j = 0;
            }
            Collections.sort(this.f, b);
            for (int i9 = 0; i9 < this.f.size() && (recyclerView = (wfVar = (wf) this.f.get(i9)).d) != null; i9++) {
                yo b2 = b(recyclerView, wfVar.e, true != wfVar.a ? nanos : Long.MAX_VALUE);
                if (b2 != null && b2.b != null && b2.s() && !b2.t() && (recyclerView2 = (RecyclerView) b2.b.get()) != null) {
                    if (recyclerView2.y && recyclerView2.g.b() != 0) {
                        recyclerView2.X();
                    }
                    we weVar2 = recyclerView2.L;
                    weVar2.c(recyclerView2, true);
                    if (weVar2.d != 0) {
                        yl ylVar = recyclerView2.M;
                        xo xoVar = recyclerView2.m;
                        ylVar.d = 1;
                        ylVar.e = xoVar.b();
                        ylVar.g = false;
                        ylVar.h = false;
                        ylVar.i = false;
                        int i10 = 0;
                        while (true) {
                            int i11 = weVar2.d;
                            if (i10 >= i11 + i11) {
                                break;
                            }
                            b(recyclerView2, weVar2.c[i10], nanos);
                            i10 += 2;
                        }
                    }
                }
                wfVar.a = false;
                wfVar.b = 0;
                wfVar.c = 0;
                wfVar.d = null;
                wfVar.e = 0;
            }
            this.d = 0L;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
