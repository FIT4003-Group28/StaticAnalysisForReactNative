package com.google.android.material.behavior;

import a.g.m.v;
import a.i.b.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    a.i.b.c f7893a;

    /* renamed from: b  reason: collision with root package name */
    b f7894b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7895c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7897e;

    /* renamed from: d  reason: collision with root package name */
    private float f7896d = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    int f7898f = 2;

    /* renamed from: g  reason: collision with root package name */
    float f7899g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    float f7900h = 0.0f;
    float i = 0.5f;
    private final c.AbstractC0021c j = new a();

    /* loaded from: classes.dex */
    class a extends c.AbstractC0021c {

        /* renamed from: a  reason: collision with root package name */
        private int f7901a;

        /* renamed from: b  reason: collision with root package name */
        private int f7902b = -1;

        a() {
        }

        private boolean a(View view, float f2) {
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i == 0) {
                return Math.abs(view.getLeft() - this.f7901a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f7899g);
            }
            boolean z = v.p(view) == 1;
            int i2 = SwipeDismissBehavior.this.f7898f;
            if (i2 == 2) {
                return true;
            }
            if (i2 == 0) {
                if (z) {
                    if (f2 >= 0.0f) {
                        return false;
                    }
                } else if (i <= 0) {
                    return false;
                }
                return true;
            } else if (i2 != 1) {
                return false;
            } else {
                if (z) {
                    if (i <= 0) {
                        return false;
                    }
                } else if (f2 >= 0.0f) {
                    return false;
                }
                return true;
            }
        }

        @Override // a.i.b.c.AbstractC0021c
        public int a(View view) {
            return view.getWidth();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
            r5 = r2.f7901a;
            r3 = r3.getWidth() + r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
            if (r5 != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
            if (r5 != false) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
            r5 = r2.f7901a - r3.getWidth();
            r3 = r2.f7901a;
         */
        @Override // a.i.b.c.AbstractC0021c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = a.g.m.v.p(r3)
                r0 = 1
                if (r5 != r0) goto L9
                r5 = 1
                goto La
            L9:
                r5 = 0
            La:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f7898f
                if (r1 != 0) goto L24
                if (r5 == 0) goto L1c
            L12:
                int r5 = r2.f7901a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f7901a
                goto L37
            L1c:
                int r5 = r2.f7901a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L37
            L24:
                if (r1 != r0) goto L29
                if (r5 == 0) goto L12
                goto L1c
            L29:
                int r5 = r2.f7901a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f7901a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L37:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.a(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        @Override // a.i.b.c.AbstractC0021c
        public void a(View view, float f2, float f3) {
            int i;
            boolean z;
            b bVar;
            this.f7902b = -1;
            int width = view.getWidth();
            if (a(view, f2)) {
                int left = view.getLeft();
                int i2 = this.f7901a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f7901a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f7893a.d(i, view.getTop())) {
                v.a(view, new c(view, z));
            } else if (!z || (bVar = SwipeDismissBehavior.this.f7894b) == null) {
            } else {
                bVar.a(view);
            }
        }

        @Override // a.i.b.c.AbstractC0021c
        public void a(View view, int i) {
            this.f7902b = i;
            this.f7901a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // a.i.b.c.AbstractC0021c
        public void a(View view, int i, int i2, int i3, int i4) {
            float width = this.f7901a + (view.getWidth() * SwipeDismissBehavior.this.f7900h);
            float width2 = this.f7901a + (view.getWidth() * SwipeDismissBehavior.this.i);
            float f2 = i;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.a(0.0f, 1.0f - SwipeDismissBehavior.b(width, width2, f2), 1.0f));
            }
        }

        @Override // a.i.b.c.AbstractC0021c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // a.i.b.c.AbstractC0021c
        public boolean b(View view, int i) {
            int i2 = this.f7902b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.a(view);
        }

        @Override // a.i.b.c.AbstractC0021c
        public void c(int i) {
            b bVar = SwipeDismissBehavior.this.f7894b;
            if (bVar != null) {
                bVar.a(i);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(int i);

        void a(View view);
    }

    /* loaded from: classes.dex */
    private class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final View f7904b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f7905c;

        c(View view, boolean z) {
            this.f7904b = view;
            this.f7905c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar;
            a.i.b.c cVar = SwipeDismissBehavior.this.f7893a;
            if (cVar != null && cVar.a(true)) {
                v.a(this.f7904b, this);
            } else if (!this.f7905c || (bVar = SwipeDismissBehavior.this.f7894b) == null) {
            } else {
                bVar.a(this.f7904b);
            }
        }
    }

    static float a(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    static int a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    private void a(ViewGroup viewGroup) {
        if (this.f7893a == null) {
            this.f7893a = this.f7897e ? a.i.b.c.a(viewGroup, this.f7896d, this.j) : a.i.b.c.a(viewGroup, this.j);
        }
    }

    static float b(float f2, float f3, float f4) {
        return (f4 - f2) / (f3 - f2);
    }

    public void a(float f2) {
        this.i = a(0.0f, f2, 1.0f);
    }

    public void a(int i) {
        this.f7898f = i;
    }

    public boolean a(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f7895c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7895c = coordinatorLayout.a(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            z = this.f7895c;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f7895c = false;
        }
        if (z) {
            a((ViewGroup) coordinatorLayout);
            return this.f7893a.b(motionEvent);
        }
        return false;
    }

    public void b(float f2) {
        this.f7900h = a(0.0f, f2, 1.0f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        a.i.b.c cVar = this.f7893a;
        if (cVar != null) {
            cVar.a(motionEvent);
            return true;
        }
        return false;
    }
}
