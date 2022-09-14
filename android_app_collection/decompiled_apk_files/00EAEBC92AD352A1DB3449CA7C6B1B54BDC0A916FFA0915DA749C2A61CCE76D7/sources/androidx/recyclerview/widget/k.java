package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    protected final RecyclerView.o f2119a;

    /* renamed from: b  reason: collision with root package name */
    private int f2120b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f2121c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends k {
        a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.k
        public int a() {
            return this.f2119a.r();
        }

        @Override // androidx.recyclerview.widget.k
        public int a(View view) {
            return this.f2119a.i(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public void a(int i) {
            this.f2119a.e(i);
        }

        @Override // androidx.recyclerview.widget.k
        public int b() {
            return this.f2119a.r() - this.f2119a.p();
        }

        @Override // androidx.recyclerview.widget.k
        public int b(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f2119a.h(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int c() {
            return this.f2119a.p();
        }

        @Override // androidx.recyclerview.widget.k
        public int c(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f2119a.g(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int d() {
            return this.f2119a.s();
        }

        @Override // androidx.recyclerview.widget.k
        public int d(View view) {
            return this.f2119a.f(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int e() {
            return this.f2119a.i();
        }

        @Override // androidx.recyclerview.widget.k
        public int e(View view) {
            this.f2119a.a(view, true, this.f2121c);
            return this.f2121c.right;
        }

        @Override // androidx.recyclerview.widget.k
        public int f() {
            return this.f2119a.o();
        }

        @Override // androidx.recyclerview.widget.k
        public int f(View view) {
            this.f2119a.a(view, true, this.f2121c);
            return this.f2121c.left;
        }

        @Override // androidx.recyclerview.widget.k
        public int g() {
            return (this.f2119a.r() - this.f2119a.o()) - this.f2119a.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends k {
        b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.k
        public int a() {
            return this.f2119a.h();
        }

        @Override // androidx.recyclerview.widget.k
        public int a(View view) {
            return this.f2119a.e(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public void a(int i) {
            this.f2119a.f(i);
        }

        @Override // androidx.recyclerview.widget.k
        public int b() {
            return this.f2119a.h() - this.f2119a.n();
        }

        @Override // androidx.recyclerview.widget.k
        public int b(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f2119a.g(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int c() {
            return this.f2119a.n();
        }

        @Override // androidx.recyclerview.widget.k
        public int c(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f2119a.h(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int d() {
            return this.f2119a.i();
        }

        @Override // androidx.recyclerview.widget.k
        public int d(View view) {
            return this.f2119a.j(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int e() {
            return this.f2119a.s();
        }

        @Override // androidx.recyclerview.widget.k
        public int e(View view) {
            this.f2119a.a(view, true, this.f2121c);
            return this.f2121c.bottom;
        }

        @Override // androidx.recyclerview.widget.k
        public int f() {
            return this.f2119a.q();
        }

        @Override // androidx.recyclerview.widget.k
        public int f(View view) {
            this.f2119a.a(view, true, this.f2121c);
            return this.f2121c.top;
        }

        @Override // androidx.recyclerview.widget.k
        public int g() {
            return (this.f2119a.h() - this.f2119a.q()) - this.f2119a.n();
        }
    }

    private k(RecyclerView.o oVar) {
        this.f2120b = RecyclerView.UNDEFINED_DURATION;
        this.f2121c = new Rect();
        this.f2119a = oVar;
    }

    /* synthetic */ k(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static k a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static k a(RecyclerView.o oVar, int i) {
        if (i != 0) {
            if (i != 1) {
                throw new IllegalArgumentException("invalid orientation");
            }
            return b(oVar);
        }
        return a(oVar);
    }

    public static k b(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int a();

    public abstract int a(View view);

    public abstract void a(int i);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int e(View view);

    public abstract int f();

    public abstract int f(View view);

    public abstract int g();

    public int h() {
        if (Integer.MIN_VALUE == this.f2120b) {
            return 0;
        }
        return g() - this.f2120b;
    }

    public void i() {
        this.f2120b = g();
    }
}
