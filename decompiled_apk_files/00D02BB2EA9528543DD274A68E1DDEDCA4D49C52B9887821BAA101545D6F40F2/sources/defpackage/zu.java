package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: zu  reason: default package */
/* loaded from: classes.dex */
public final class zu implements Runnable {
    public static final ThreadLocal<zu> a = new ThreadLocal<>();
    static final Comparator<zt> e = new zr();
    long c;
    public long d;
    public final ArrayList<RecyclerView> b = new ArrayList<>();
    private final ArrayList<zt> f = new ArrayList<>();

    private static final acl b(RecyclerView recyclerView, int i, long j) {
        int g = recyclerView.e.g();
        for (int i2 = 0; i2 < g; i2++) {
            acl Y = RecyclerView.Y(recyclerView.e.h(i2));
            if (Y.c == i && !Y.m()) {
                return null;
            }
        }
        aca acaVar = recyclerView.b;
        try {
            recyclerView.G();
            acl n = acaVar.n(i, j);
            if (n != null) {
                if (!n.o() || n.m()) {
                    acaVar.i(n, false);
                } else {
                    acaVar.e(n.a);
                }
            }
            return n;
        } finally {
            recyclerView.I(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.p && this.c == 0) {
            this.c = System.nanoTime();
            recyclerView.post(this);
        }
        zs zsVar = recyclerView.I;
        zsVar.a = i;
        zsVar.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zt ztVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        zt ztVar2;
        long j = 0;
        try {
            aky.a("RV Prefetch");
            if (this.b.isEmpty()) {
                this.c = 0L;
            } else {
                int size = this.b.size();
                long j2 = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView3 = this.b.get(i);
                    if (recyclerView3.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView3.getDrawingTime(), j2);
                    }
                }
                if (j2 == 0) {
                    this.c = 0L;
                } else {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j2) + this.d;
                    int size2 = this.b.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        RecyclerView recyclerView4 = this.b.get(i3);
                        if (recyclerView4.getWindowVisibility() == 0) {
                            recyclerView4.I.a(recyclerView4, false);
                            i2 += recyclerView4.I.d;
                        }
                    }
                    this.f.ensureCapacity(i2);
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < size2) {
                        RecyclerView recyclerView5 = this.b.get(i4);
                        if (recyclerView5.getWindowVisibility() == 0) {
                            zs zsVar = recyclerView5.I;
                            int abs = Math.abs(zsVar.a) + Math.abs(zsVar.b);
                            int i6 = 0;
                            while (true) {
                                int i7 = zsVar.d;
                                if (i6 < i7 + i7) {
                                    if (i5 >= this.f.size()) {
                                        ztVar2 = new zt();
                                        this.f.add(ztVar2);
                                    } else {
                                        ztVar2 = this.f.get(i5);
                                    }
                                    int[] iArr = zsVar.c;
                                    try {
                                        int i8 = iArr[i6 + 1];
                                        ztVar2.a = i8 <= abs;
                                        ztVar2.b = abs;
                                        ztVar2.c = i8;
                                        ztVar2.d = recyclerView5;
                                        ztVar2.e = iArr[i6];
                                        i5++;
                                        i6 += 2;
                                    } catch (Throwable th) {
                                        th = th;
                                        j = 0;
                                        this.c = j;
                                        aky.b();
                                        throw th;
                                    }
                                }
                            }
                        }
                        i4++;
                        j = 0;
                    }
                    Collections.sort(this.f, e);
                    for (int i9 = 0; i9 < this.f.size() && (recyclerView = (ztVar = this.f.get(i9)).d) != null; i9++) {
                        acl b = b(recyclerView, ztVar.e, true != ztVar.a ? nanos : Long.MAX_VALUE);
                        if (b != null && b.b != null && b.o() && !b.m() && (recyclerView2 = b.b.get()) != null) {
                            if (recyclerView2.w && recyclerView2.e.g() != 0) {
                                recyclerView2.c();
                            }
                            zs zsVar2 = recyclerView2.I;
                            zsVar2.a(recyclerView2, true);
                            if (zsVar2.d != 0) {
                                aky.a("RV Nested Prefetch");
                                aci aciVar = recyclerView2.J;
                                abg abgVar = recyclerView2.k;
                                aciVar.d = 1;
                                aciVar.e = abgVar.c();
                                aciVar.g = false;
                                aciVar.h = false;
                                aciVar.i = false;
                                int i10 = 0;
                                while (true) {
                                    int i11 = zsVar2.d;
                                    if (i10 >= i11 + i11) {
                                        break;
                                    }
                                    b(recyclerView2, zsVar2.c[i10], nanos);
                                    i10 += 2;
                                }
                                aky.b();
                            }
                        }
                        ztVar.a = false;
                        ztVar.b = 0;
                        ztVar.c = 0;
                        ztVar.d = null;
                        ztVar.e = 0;
                    }
                    this.c = 0L;
                }
            }
            aky.b();
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
