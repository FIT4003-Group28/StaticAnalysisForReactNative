package a.r;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l0 implements n0 {

    /* renamed from: a  reason: collision with root package name */
    protected a f661a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends ViewGroup {

        /* renamed from: b  reason: collision with root package name */
        ViewGroup f662b;

        /* renamed from: c  reason: collision with root package name */
        View f663c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Drawable> f664d;

        /* renamed from: e  reason: collision with root package name */
        l0 f665e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f666f;

        static {
            try {
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, l0 l0Var) {
            super(context);
            this.f664d = null;
            this.f662b = viewGroup;
            this.f663c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f665e = l0Var;
        }

        private void a() {
            if (!this.f666f) {
                return;
            }
            throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
        }

        private void a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f662b.getLocationOnScreen(iArr2);
            this.f663c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        private void b() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f664d;
                if (arrayList != null && arrayList.size() != 0) {
                    return;
                }
                this.f666f = true;
                this.f662b.removeView(this);
            }
        }

        public void a(Drawable drawable) {
            a();
            if (this.f664d == null) {
                this.f664d = new ArrayList<>();
            }
            if (!this.f664d.contains(drawable)) {
                this.f664d.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        public void a(View view) {
            a();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f662b && viewGroup.getParent() != null && a.g.m.v.H(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f662b.getLocationOnScreen(iArr2);
                    a.g.m.v.d(view, iArr[0] - iArr2[0]);
                    a.g.m.v.e(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        public void b(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f664d;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                b();
            }
        }

        public void b(View view) {
            super.removeView(view);
            b();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f662b.getLocationOnScreen(iArr);
            this.f663c.getLocationOnScreen(iArr2);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.clipRect(new Rect(0, 0, this.f663c.getWidth(), this.f663c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f664d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f664d.get(i).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f662b != null) {
                rect.offset(iArr[0], iArr[1]);
                if (!(this.f662b instanceof ViewGroup)) {
                    invalidate(rect);
                    return null;
                }
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                a(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            return null;
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f664d) != null && arrayList.contains(drawable));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(Context context, ViewGroup viewGroup, View view) {
        this.f661a = new a(context, viewGroup, view, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l0 c(View view) {
        ViewGroup d2 = d(view);
        if (d2 != null) {
            int childCount = d2.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = d2.getChildAt(i);
                if (childAt instanceof a) {
                    return ((a) childAt).f665e;
                }
            }
            return new g0(d2.getContext(), d2, view);
        }
        return null;
    }

    static ViewGroup d(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // a.r.n0
    public void a(Drawable drawable) {
        this.f661a.a(drawable);
    }

    @Override // a.r.n0
    public void b(Drawable drawable) {
        this.f661a.b(drawable);
    }
}
