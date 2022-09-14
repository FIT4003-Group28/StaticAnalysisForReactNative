package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    static final ThreadLocal<e> f2093f = new ThreadLocal<>();

    /* renamed from: g  reason: collision with root package name */
    static Comparator<c> f2094g = new a();

    /* renamed from: c  reason: collision with root package name */
    long f2096c;

    /* renamed from: d  reason: collision with root package name */
    long f2097d;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<RecyclerView> f2095b = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<c> f2098e = new ArrayList<>();

    /* loaded from: classes.dex */
    static class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            if ((cVar.f2106d == null) != (cVar2.f2106d == null)) {
                return cVar.f2106d == null ? 1 : -1;
            }
            boolean z = cVar.f2103a;
            if (z != cVar2.f2103a) {
                return z ? -1 : 1;
            }
            int i = cVar2.f2104b - cVar.f2104b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.f2105c - cVar2.f2105c;
            if (i2 == 0) {
                return 0;
            }
            return i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.o.c {

        /* renamed from: a  reason: collision with root package name */
        int f2099a;

        /* renamed from: b  reason: collision with root package name */
        int f2100b;

        /* renamed from: c  reason: collision with root package name */
        int[] f2101c;

        /* renamed from: d  reason: collision with root package name */
        int f2102d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            int[] iArr = this.f2101c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2102d = 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i, int i2) {
            if (i >= 0) {
                if (i2 < 0) {
                    throw new IllegalArgumentException("Pixel distance must be non-negative");
                }
                int i3 = this.f2102d * 2;
                int[] iArr = this.f2101c;
                if (iArr == null) {
                    this.f2101c = new int[4];
                    Arrays.fill(this.f2101c, -1);
                } else if (i3 >= iArr.length) {
                    this.f2101c = new int[i3 * 2];
                    System.arraycopy(iArr, 0, this.f2101c, 0, iArr.length);
                }
                int[] iArr2 = this.f2101c;
                iArr2[i3] = i;
                iArr2[i3 + 1] = i2;
                this.f2102d++;
                return;
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        void a(RecyclerView recyclerView, boolean z) {
            this.f2102d = 0;
            int[] iArr = this.f2101c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || oVar == null || !oVar.w()) {
                return;
            }
            if (z) {
                if (!recyclerView.mAdapterHelper.c()) {
                    oVar.a(recyclerView.mAdapter.a(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                oVar.a(this.f2099a, this.f2100b, recyclerView.mState, this);
            }
            int i = this.f2102d;
            if (i <= oVar.m) {
                return;
            }
            oVar.m = i;
            oVar.n = z;
            recyclerView.mRecycler.j();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean a(int i) {
            if (this.f2101c != null) {
                int i2 = this.f2102d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f2101c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        void b(int i, int i2) {
            this.f2099a = i;
            this.f2100b = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2103a;

        /* renamed from: b  reason: collision with root package name */
        public int f2104b;

        /* renamed from: c  reason: collision with root package name */
        public int f2105c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f2106d;

        /* renamed from: e  reason: collision with root package name */
        public int f2107e;

        c() {
        }

        public void a() {
            this.f2103a = false;
            this.f2104b = 0;
            this.f2105c = 0;
            this.f2106d = null;
            this.f2107e = 0;
        }
    }

    private RecyclerView.d0 a(RecyclerView recyclerView, int i, long j) {
        if (a(recyclerView, i)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.d0 a2 = vVar.a(i, false, j);
            if (a2 != null) {
                if (!a2.n() || a2.o()) {
                    vVar.a(a2, false);
                } else {
                    vVar.b(a2.f1924a);
                }
            }
            return a2;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    private void a() {
        c cVar;
        int size = this.f2095b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f2095b.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.a(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.f2102d;
            }
        }
        this.f2098e.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f2095b.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.f2099a) + Math.abs(bVar.f2100b);
                int i5 = i3;
                for (int i6 = 0; i6 < bVar.f2102d * 2; i6 += 2) {
                    if (i5 >= this.f2098e.size()) {
                        cVar = new c();
                        this.f2098e.add(cVar);
                    } else {
                        cVar = this.f2098e.get(i5);
                    }
                    int i7 = bVar.f2101c[i6 + 1];
                    cVar.f2103a = i7 <= abs;
                    cVar.f2104b = abs;
                    cVar.f2105c = i7;
                    cVar.f2106d = recyclerView2;
                    cVar.f2107e = bVar.f2101c[i6];
                    i5++;
                }
                i3 = i5;
            }
        }
        Collections.sort(this.f2098e, f2094g);
    }

    private void a(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.b() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.a(recyclerView, true);
        if (bVar.f2102d == 0) {
            return;
        }
        try {
            a.g.j.d.a("RV Nested Prefetch");
            recyclerView.mState.a(recyclerView.mAdapter);
            for (int i = 0; i < bVar.f2102d * 2; i += 2) {
                a(recyclerView, bVar.f2101c[i], j);
            }
        } finally {
            a.g.j.d.a();
        }
    }

    private void a(c cVar, long j) {
        RecyclerView.d0 a2 = a(cVar.f2106d, cVar.f2107e, cVar.f2103a ? Long.MAX_VALUE : j);
        if (a2 == null || a2.f1925b == null || !a2.n() || a2.o()) {
            return;
        }
        a(a2.f1925b.get(), j);
    }

    static boolean a(RecyclerView recyclerView, int i) {
        int b2 = recyclerView.mChildHelper.b();
        for (int i2 = 0; i2 < b2; i2++) {
            RecyclerView.d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.d(i2));
            if (childViewHolderInt.f1926c == i && !childViewHolderInt.o()) {
                return true;
            }
        }
        return false;
    }

    private void b(long j) {
        for (int i = 0; i < this.f2098e.size(); i++) {
            c cVar = this.f2098e.get(i);
            if (cVar.f2106d == null) {
                return;
            }
            a(cVar, j);
            cVar.a();
        }
    }

    void a(long j) {
        a();
        b(j);
    }

    public void a(RecyclerView recyclerView) {
        this.f2095b.add(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f2096c == 0) {
            this.f2096c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.b(i, i2);
    }

    public void b(RecyclerView recyclerView) {
        this.f2095b.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a.g.j.d.a("RV Prefetch");
            if (!this.f2095b.isEmpty()) {
                int size = this.f2095b.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f2095b.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    a(TimeUnit.MILLISECONDS.toNanos(j) + this.f2097d);
                }
            }
        } finally {
            this.f2096c = 0L;
            a.g.j.d.a();
        }
    }
}
