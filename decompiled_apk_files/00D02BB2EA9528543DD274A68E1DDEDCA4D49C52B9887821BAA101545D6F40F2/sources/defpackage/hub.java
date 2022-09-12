package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: hub  reason: default package */
/* loaded from: classes.dex */
public final class hub implements cqfk {
    public final cjqy a;
    public final htz b;
    @dzsi
    public View f;
    private final Activity g;
    private final bvpy j;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    private final hua h = new hua(this);
    private final ViewTreeObserver.OnScrollChangedListener i = new ViewTreeObserver.OnScrollChangedListener(this) { // from class: hty
        private final hub a;

        {
            this.a = this;
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            int scrollX;
            int i;
            hub hubVar = this.a;
            View view = hubVar.f;
            if (view == null || (scrollX = view.getScrollX()) == (i = hubVar.e)) {
                return;
            }
            hubVar.b(scrollX - i);
            hubVar.e = scrollX;
        }
    };

    public hub(cjqy cjqyVar, dehq dehqVar, Activity activity, bvpz bvpzVar, htz htzVar) {
        this.a = cjqyVar;
        this.g = activity;
        this.j = bvpzVar.a(dehqVar, new Runnable(this) { // from class: htx
            private final hub a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                hub hubVar = this.a;
                cjql b = hubVar.b.b();
                if (b == null) {
                    View view = hubVar.f;
                    b = view != null ? cjqg.e(view) : null;
                }
                if (b != null) {
                    hubVar.a.n(b, new cjte(deaf.SWIPE, hubVar.d > 0 ? dead.RIGHT : dead.LEFT), hubVar.b.a());
                }
                hubVar.c = 0;
                hubVar.d = 0;
            }
        });
        this.b = htzVar;
    }

    private final void c(View view) {
        this.f = null;
        if (view instanceof RecyclerView) {
            ((RecyclerView) view).j(this.h);
            return;
        }
        view.getViewTreeObserver().removeOnScrollChangedListener(this.i);
        this.e = 0;
    }

    @Override // defpackage.cqfk
    public final void a(View view) {
        c(view);
    }

    public final void b(int i) {
        if (i != 0) {
            int abs = this.c + Math.abs(i);
            this.c = abs;
            this.d += i;
            if (jmj.e(this.g, abs) <= 100) {
                return;
            }
            this.j.a(1000L);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f = view;
        if (view instanceof RecyclerView) {
            ((RecyclerView) view).i(this.h);
            return;
        }
        view.getViewTreeObserver().addOnScrollChangedListener(this.i);
        this.e = view.getScrollX();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        c(view);
    }
}
