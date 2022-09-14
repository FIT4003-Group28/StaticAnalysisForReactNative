package a.r;

import a.r.a;
import a.r.x;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class v0 extends x {
    private static final String[] L = {"android:visibility:visibility", "android:visibility:parent"};
    private int K = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends y {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f690a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f691b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f692c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f690a = viewGroup;
            this.f691b = view;
            this.f692c = view2;
        }

        @Override // a.r.y, a.r.x.f
        public void c(x xVar) {
            j0.a(this.f690a).b(this.f691b);
        }

        @Override // a.r.y, a.r.x.f
        public void d(x xVar) {
            if (this.f691b.getParent() == null) {
                j0.a(this.f690a).a(this.f691b);
            } else {
                v0.this.cancel();
            }
        }

        @Override // a.r.x.f
        public void e(x xVar) {
            this.f692c.setTag(s.save_overlay_view, null);
            j0.a(this.f690a).b(this.f691b);
            xVar.mo24b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements x.f, a.InterfaceC0033a {

        /* renamed from: a  reason: collision with root package name */
        private final View f694a;

        /* renamed from: b  reason: collision with root package name */
        private final int f695b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f696c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f697d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f698e;

        /* renamed from: f  reason: collision with root package name */
        boolean f699f = false;

        b(View view, int i, boolean z) {
            this.f694a = view;
            this.f695b = i;
            this.f696c = (ViewGroup) view.getParent();
            this.f697d = z;
            a(true);
        }

        private void a() {
            if (!this.f699f) {
                o0.a(this.f694a, this.f695b);
                ViewGroup viewGroup = this.f696c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }

        private void a(boolean z) {
            ViewGroup viewGroup;
            if (!this.f697d || this.f698e == z || (viewGroup = this.f696c) == null) {
                return;
            }
            this.f698e = z;
            j0.b(viewGroup, z);
        }

        @Override // a.r.x.f
        public void a(x xVar) {
        }

        @Override // a.r.x.f
        public void b(x xVar) {
        }

        @Override // a.r.x.f
        public void c(x xVar) {
            a(false);
        }

        @Override // a.r.x.f
        public void d(x xVar) {
            a(true);
        }

        @Override // a.r.x.f
        public void e(x xVar) {
            a();
            xVar.mo24b(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f699f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, a.r.a.InterfaceC0033a
        public void onAnimationPause(Animator animator) {
            if (!this.f699f) {
                o0.a(this.f694a, this.f695b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, a.r.a.InterfaceC0033a
        public void onAnimationResume(Animator animator) {
            if (!this.f699f) {
                o0.a(this.f694a, 0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f700a;

        /* renamed from: b  reason: collision with root package name */
        boolean f701b;

        /* renamed from: c  reason: collision with root package name */
        int f702c;

        /* renamed from: d  reason: collision with root package name */
        int f703d;

        /* renamed from: e  reason: collision with root package name */
        ViewGroup f704e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f705f;

        c() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        if (r9 == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
        if (r0.f704e == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
        if (r0.f702c == 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private a.r.v0.c b(a.r.d0 r8, a.r.d0 r9) {
        /*
            r7 = this;
            a.r.v0$c r0 = new a.r.v0$c
            r0.<init>()
            r1 = 0
            r0.f700a = r1
            r0.f701b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f583a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f583a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f702c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f583a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f704e = r6
            goto L37
        L33:
            r0.f702c = r4
            r0.f704e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f583a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f583a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f703d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f583a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f705f = r2
            goto L5e
        L5a:
            r0.f703d = r4
            r0.f705f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L86
            if (r9 == 0) goto L86
            int r8 = r0.f702c
            int r9 = r0.f703d
            if (r8 != r9) goto L70
            android.view.ViewGroup r8 = r0.f704e
            android.view.ViewGroup r9 = r0.f705f
            if (r8 != r9) goto L70
            return r0
        L70:
            int r8 = r0.f702c
            int r9 = r0.f703d
            if (r8 == r9) goto L7c
            if (r8 != 0) goto L79
            goto L97
        L79:
            if (r9 != 0) goto L9a
            goto L8c
        L7c:
            android.view.ViewGroup r8 = r0.f705f
            if (r8 != 0) goto L81
            goto L97
        L81:
            android.view.ViewGroup r8 = r0.f704e
            if (r8 != 0) goto L9a
            goto L8c
        L86:
            if (r8 != 0) goto L91
            int r8 = r0.f703d
            if (r8 != 0) goto L91
        L8c:
            r0.f701b = r2
        L8e:
            r0.f700a = r2
            goto L9a
        L91:
            if (r9 != 0) goto L9a
            int r8 = r0.f702c
            if (r8 != 0) goto L9a
        L97:
            r0.f701b = r1
            goto L8e
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r.v0.b(a.r.d0, a.r.d0):a.r.v0$c");
    }

    private void d(d0 d0Var) {
        d0Var.f583a.put("android:visibility:visibility", Integer.valueOf(d0Var.f584b.getVisibility()));
        d0Var.f583a.put("android:visibility:parent", d0Var.f584b.getParent());
        int[] iArr = new int[2];
        d0Var.f584b.getLocationOnScreen(iArr);
        d0Var.f583a.put("android:visibility:screenLocation", iArr);
    }

    public Animator a(ViewGroup viewGroup, d0 d0Var, int i, d0 d0Var2, int i2) {
        if ((this.K & 1) != 1 || d0Var2 == null) {
            return null;
        }
        if (d0Var == null) {
            View view = (View) d0Var2.f584b.getParent();
            if (b(a(view, false), b(view, false)).f700a) {
                return null;
            }
        }
        return a(viewGroup, d0Var2.f584b, d0Var, d0Var2);
    }

    @Override // a.r.x
    public Animator a(ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        c b2 = b(d0Var, d0Var2);
        if (b2.f700a) {
            if (b2.f704e == null && b2.f705f == null) {
                return null;
            }
            return b2.f701b ? a(viewGroup, d0Var, b2.f702c, d0Var2, b2.f703d) : b(viewGroup, d0Var, b2.f702c, d0Var2, b2.f703d);
        }
        return null;
    }

    public abstract Animator a(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2);

    public void a(int i) {
        if ((i & (-4)) == 0) {
            this.K = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // a.r.x
    public void a(d0 d0Var) {
        d(d0Var);
    }

    @Override // a.r.x
    public boolean a(d0 d0Var, d0 d0Var2) {
        if (d0Var == null && d0Var2 == null) {
            return false;
        }
        if (d0Var != null && d0Var2 != null && d0Var2.f583a.containsKey("android:visibility:visibility") != d0Var.f583a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c b2 = b(d0Var, d0Var2);
        if (!b2.f700a) {
            return false;
        }
        return b2.f702c == 0 || b2.f703d == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0080, code lost:
        if (r9.w != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator b(android.view.ViewGroup r10, a.r.d0 r11, int r12, a.r.d0 r13, int r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r.v0.b(android.view.ViewGroup, a.r.d0, int, a.r.d0, int):android.animation.Animator");
    }

    public abstract Animator b(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2);

    @Override // a.r.x
    public void c(d0 d0Var) {
        d(d0Var);
    }

    @Override // a.r.x
    public String[] n() {
        return L;
    }
}
