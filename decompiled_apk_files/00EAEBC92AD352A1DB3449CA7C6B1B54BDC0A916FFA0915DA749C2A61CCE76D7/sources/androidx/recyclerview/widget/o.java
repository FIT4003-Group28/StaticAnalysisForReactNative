package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public abstract class o extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f2127a;

    /* renamed from: b  reason: collision with root package name */
    private Scroller f2128b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView.t f2129c = new a();

    /* loaded from: classes.dex */
    class a extends RecyclerView.t {

        /* renamed from: a  reason: collision with root package name */
        boolean f2130a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            super.a(recyclerView, i);
            if (i != 0 || !this.f2130a) {
                return;
            }
            this.f2130a = false;
            o.this.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f2130a = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends h {
        b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.h
        protected float a(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.z
        protected void a(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            o oVar = o.this;
            RecyclerView recyclerView = oVar.f2127a;
            if (recyclerView == null) {
                return;
            }
            int[] a2 = oVar.a(recyclerView.getLayoutManager(), view);
            int i = a2[0];
            int i2 = a2[1];
            int d2 = d(Math.max(Math.abs(i), Math.abs(i2)));
            if (d2 <= 0) {
                return;
            }
            aVar.a(i, i2, d2, this.j);
        }
    }

    private void b() {
        this.f2127a.removeOnScrollListener(this.f2129c);
        this.f2127a.setOnFlingListener(null);
    }

    private boolean b(RecyclerView.o oVar, int i, int i2) {
        RecyclerView.z a2;
        int a3;
        if (!(oVar instanceof RecyclerView.z.b) || (a2 = a(oVar)) == null || (a3 = a(oVar, i, i2)) == -1) {
            return false;
        }
        a2.c(a3);
        oVar.b(a2);
        return true;
    }

    private void c() {
        if (this.f2127a.getOnFlingListener() == null) {
            this.f2127a.addOnScrollListener(this.f2129c);
            this.f2127a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    public abstract int a(RecyclerView.o oVar, int i, int i2);

    protected RecyclerView.z a(RecyclerView.o oVar) {
        return b(oVar);
    }

    void a() {
        RecyclerView.o layoutManager;
        View c2;
        RecyclerView recyclerView = this.f2127a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (c2 = c(layoutManager)) == null) {
            return;
        }
        int[] a2 = a(layoutManager, c2);
        if (a2[0] == 0 && a2[1] == 0) {
            return;
        }
        this.f2127a.smoothScrollBy(a2[0], a2[1]);
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2127a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            b();
        }
        this.f2127a = recyclerView;
        if (this.f2127a == null) {
            return;
        }
        c();
        this.f2128b = new Scroller(this.f2127a.getContext(), new DecelerateInterpolator());
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(int i, int i2) {
        RecyclerView.o layoutManager = this.f2127a.getLayoutManager();
        if (layoutManager == null || this.f2127a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f2127a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && b(layoutManager, i, i2);
    }

    public abstract int[] a(RecyclerView.o oVar, View view);

    @Deprecated
    protected h b(RecyclerView.o oVar) {
        if (!(oVar instanceof RecyclerView.z.b)) {
            return null;
        }
        return new b(this.f2127a.getContext());
    }

    public int[] b(int i, int i2) {
        this.f2128b.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        return new int[]{this.f2128b.getFinalX(), this.f2128b.getFinalY()};
    }

    public abstract View c(RecyclerView.o oVar);
}
