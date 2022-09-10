package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
@Deprecated
/* renamed from: jma  reason: default package */
/* loaded from: classes7.dex */
public final class jma implements jlo {
    private volatile int A;
    private volatile Drawable B;
    public final View a;
    private final CharSequence l;
    private volatile boolean r;
    private volatile int x;
    private volatile int y;
    public final List<Pair<Runnable, Executor>> b = Collections.synchronizedList(new ArrayList());
    public final List<Pair<Runnable, Executor>> c = Collections.synchronizedList(new ArrayList());
    public final List<Pair<Runnable, Executor>> d = Collections.synchronizedList(new ArrayList());
    private final List<dbty<Boolean>> m = Collections.synchronizedList(new ArrayList());
    public final AtomicInteger e = new AtomicInteger(0);
    public final Handler f = new Handler(Looper.getMainLooper());
    public dbsg<cjqy> g = dbpy.a;
    public dbsg<cjqq> h = dbpy.a;
    public dbsg<cjtd> i = dbpy.a;
    private volatile jll n = jll.ABOVE;
    private volatile jlk o = jlk.ANCHOR_VIEW_CENTER;
    private volatile jlj p = jlj.DEFAULT;
    public volatile int j = 0;
    private volatile boolean q = true;
    public volatile boolean k = true;
    private volatile boolean s = false;
    private int t = 0;
    private volatile float u = 1.0f;
    private boolean v = true;
    private volatile jln w = jln.QUANTUM;
    private volatile int z = 8388659;

    public jma(CharSequence charSequence, View view) {
        this.l = charSequence;
        this.a = view;
        E();
    }

    public static void D(List<Pair<Runnable, Executor>> list) {
        for (Pair<Runnable, Executor> pair : list) {
            ((Executor) pair.second).execute((Runnable) pair.first);
        }
    }

    private final void E() {
        Context context = this.a.getContext();
        jln jlnVar = jln.QUANTUM;
        int ordinal = this.w.ordinal();
        if (ordinal == 0) {
            this.x = ibm.b().b(context);
            this.y = ibm.w().b(context);
            this.A = R.style.Tooltip;
        } else if (ordinal != 1) {
        } else {
            this.x = ibm.b().b(context);
            this.y = ibm.x().b(context);
            this.A = 2132018142;
        }
    }

    public final void A(final jlm jlmVar, final AtomicBoolean atomicBoolean) {
        this.f.post(new Runnable(this, atomicBoolean, jlmVar) { // from class: jlw
            private final jma a;
            private final AtomicBoolean b;
            private final jlm c;

            {
                this.a = this;
                this.b = atomicBoolean;
                this.c = jlmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                jma jmaVar = this.a;
                AtomicBoolean atomicBoolean2 = this.b;
                final jlm jlmVar2 = this.c;
                if (!jmaVar.C() || atomicBoolean2.getAndSet(true)) {
                    return;
                }
                Rect rect = new Rect();
                jmaVar.a.getGlobalVisibleRect(rect);
                jlmVar2.a.setAnchorRect(rect);
                final jmi jmiVar = jlmVar2.a;
                jmiVar.b.setClippingEnabled(false);
                jmiVar.b.setAnimationStyle(16973826);
                jmiVar.b.setBackgroundDrawable(new BitmapDrawable(jmiVar.f.getResources(), ""));
                jmiVar.b.setOutsideTouchable(jmiVar.c);
                jmiVar.b.setOnDismissListener(jmiVar.g);
                if (jmiVar.d) {
                    jmiVar.b.setTouchable(true);
                    jmiVar.b.setTouchInterceptor(new jmh(jmiVar));
                }
                jmiVar.f.post(new Runnable(jmiVar) { // from class: jmg
                    private final jmi a;

                    {
                        this.a = jmiVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Activity activity;
                        jmi jmiVar2 = this.a;
                        Context context = jmiVar2.f.getContext();
                        while (true) {
                            if (!(context instanceof ContextWrapper)) {
                                activity = null;
                                break;
                            } else if (!(context instanceof Activity)) {
                                context = ((ContextWrapper) context).getBaseContext();
                            } else {
                                activity = (Activity) context;
                                break;
                            }
                        }
                        if (activity == null || activity.isFinishing()) {
                            return;
                        }
                        jmiVar2.b.showAtLocation(jmiVar2.f, 0, jmiVar2.i, jmiVar2.h);
                    }
                });
                jmaVar.e.incrementAndGet();
                jma.D(jmaVar.c);
                if (jmaVar.j > 0) {
                    Handler handler = jmaVar.f;
                    jlmVar2.getClass();
                    handler.postDelayed(new Runnable(jlmVar2) { // from class: jlz
                        private final jlm a;

                        {
                            this.a = jlmVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.a();
                        }
                    }, jmaVar.j);
                }
                if (!jmaVar.h.a() || !jmaVar.i.a()) {
                    return;
                }
                jmaVar.h.b().g().d(jmaVar.i.b());
            }
        });
    }

    public final void B(final jlm jlmVar, final AtomicBoolean atomicBoolean) {
        this.f.post(new Runnable(atomicBoolean, jlmVar) { // from class: jly
            private final AtomicBoolean a;
            private final jlm b;

            {
                this.a = atomicBoolean;
                this.b = jlmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AtomicBoolean atomicBoolean2 = this.a;
                jlm jlmVar2 = this.b;
                if (!atomicBoolean2.getAndSet(false)) {
                    return;
                }
                jlmVar2.a();
            }
        });
    }

    public final boolean C() {
        for (dbty<Boolean> dbtyVar : this.m) {
            if (!dbtyVar.a().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.jlo
    public final jmb a() {
        if (this.i.a() && !this.g.a()) {
            bvoo.h("Ue3LoggingParams is set when ue3Reporter is null. You should use dagger to get an instance of TooltipCenterImpl instead of new", new Object[0]);
        }
        Context context = this.a.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setClickable(this.v);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        textView.setTextAppearance(context, this.A);
        textView.setTextColor(this.x);
        textView.setText(this.l);
        textView.setGravity(this.z);
        textView.setClickable(this.v);
        if (this.w != jln.QUANTUM) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom() + jmj.a(context, 1));
        }
        linearLayout.addView(textView);
        final jme jmeVar = new jme(this.a);
        final jlm jlmVar = new jlm(linearLayout, this.n, this.a, this.o, this.t, this.p);
        jlmVar.a.setDismissWhenTouchedOutside(this.q);
        jlmVar.a.setDismissWhenTouchedInside(this.r);
        jlmVar.a.setOnDismissListener(new PopupWindow.OnDismissListener(this, jmeVar) { // from class: jlr
            private final jma a;
            private final jme b;

            {
                this.a = this;
                this.b = jmeVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                jma jmaVar = this.a;
                jme jmeVar2 = this.b;
                if (jmaVar.k && jmaVar.e.get() > 0) {
                    jmeVar2.a();
                }
                jma.D(jmaVar.b);
            }
        });
        jlmVar.a.setStyle(this.w);
        jlmVar.a.setSuggestedMaxWidthPercentage(this.u);
        jlmVar.a.setBackgroundPaintColor(this.y);
        jlmVar.a.setClickable(this.v);
        synchronized (jmeVar.e) {
            if (!jmeVar.f) {
                jmeVar.a.getViewTreeObserver().addOnGlobalLayoutListener(jmeVar);
                jmeVar.a.getViewTreeObserver().addOnDrawListener(jmeVar);
                jmeVar.f = true;
            }
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (this.s && jmeVar.a.isShown()) {
            A(jlmVar, atomicBoolean);
        }
        jmeVar.b.add(new Runnable(this, jlmVar, atomicBoolean) { // from class: jls
            private final jma a;
            private final jlm b;
            private final AtomicBoolean c;

            {
                this.a = this;
                this.b = jlmVar;
                this.c = atomicBoolean;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.A(this.b, this.c);
            }
        });
        jmeVar.c.add(new Runnable(this, jlmVar, atomicBoolean) { // from class: jlt
            private final jma a;
            private final jlm b;
            private final AtomicBoolean c;

            {
                this.a = this;
                this.b = jlmVar;
                this.c = atomicBoolean;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final jma jmaVar = this.a;
                final jlm jlmVar2 = this.b;
                final AtomicBoolean atomicBoolean2 = this.c;
                jmaVar.f.post(new Runnable(jmaVar, jlmVar2, atomicBoolean2) { // from class: jlx
                    private final jma a;
                    private final jlm b;
                    private final AtomicBoolean c;

                    {
                        this.a = jmaVar;
                        this.b = jlmVar2;
                        this.c = atomicBoolean2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        jma jmaVar2 = this.a;
                        jlm jlmVar3 = this.b;
                        AtomicBoolean atomicBoolean3 = this.c;
                        if (!jmaVar2.C()) {
                            return;
                        }
                        Rect rect = new Rect();
                        jmaVar2.a.getGlobalVisibleRect(rect);
                        Context context2 = jmaVar2.a.getContext();
                        Point point = new Point();
                        ((WindowManager) context2.getSystemService("window")).getDefaultDisplay().getSize(point);
                        if (rect.left < point.x && rect.top < point.y && ((rect.left >= 0 || rect.right > 0) && (rect.top >= 0 || rect.bottom > 0))) {
                            jlmVar3.a.setAnchorRect(rect);
                            jlmVar3.a.invalidate();
                            return;
                        }
                        jmaVar2.B(jlmVar3, atomicBoolean3);
                    }
                });
            }
        });
        jmeVar.d.add(new Runnable(this, jlmVar, atomicBoolean) { // from class: jlu
            private final jma a;
            private final jlm b;
            private final AtomicBoolean c;

            {
                this.a = this;
                this.b = jlmVar;
                this.c = atomicBoolean;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.B(this.b, this.c);
            }
        });
        if (this.v) {
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: jlv
                private final jma a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jma jmaVar = this.a;
                    jma.D(jmaVar.d);
                    if (!jmaVar.g.a() || !jmaVar.i.a()) {
                        return;
                    }
                    jmaVar.g.b().i(jmaVar.i.b());
                }
            });
        }
        return new jmb(jlmVar, jmeVar, atomicBoolean);
    }

    @Override // defpackage.jlo
    public final void b(int i) {
        this.n = jll.ABOVE;
        this.t = i;
    }

    @Override // defpackage.jlo
    public final void c(dbty<Boolean> dbtyVar) {
        this.m.add(dbtyVar);
    }

    @Override // defpackage.jlo
    public final void d() {
        this.m.add(new dbty(this) { // from class: jlq
            private final jma a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(this.a.e.get() <= 0);
            }
        });
    }

    @Override // defpackage.jlo
    public final void e(Runnable runnable, Executor executor) {
        this.b.add(Pair.create(runnable, executor));
    }

    @Override // defpackage.jlo
    public final void f(Runnable runnable, Executor executor) {
        this.c.add(Pair.create(runnable, executor));
    }

    @Override // defpackage.jlo
    public final void g() {
        this.p = jlj.ANCHOR_VIEW_CENTER;
    }

    @Override // defpackage.jlo
    public final void h() {
        this.p = jlj.ANCHOR_VIEW_START;
    }

    @Override // defpackage.jlo
    public final void i() {
        this.o = jlk.ANCHOR_VIEW_CENTER;
    }

    @Override // defpackage.jlo
    public final void j() {
        this.o = jlk.ANCHOR_VIEW_END;
    }

    @Override // defpackage.jlo
    public final void k() {
        this.o = jlk.ANCHOR_VIEW_START;
    }

    @Override // defpackage.jlo
    public final void l(int i) {
        this.n = jll.BELOW;
        this.t = i;
    }

    @Override // defpackage.jlo
    public final void m(int i) {
        this.j = i;
    }

    @Override // defpackage.jlo
    public final void n() {
        this.r = true;
    }

    @Override // defpackage.jlo
    public final void o(boolean z) {
        this.q = z;
    }

    @Override // defpackage.jlo
    public final void p() {
        this.s = true;
    }

    @Override // defpackage.jlo
    public final void q(int i) {
        this.y = i;
    }

    @Override // defpackage.jlo
    public final void r() {
        this.v = false;
    }

    @Override // defpackage.jlo
    public final void s(float f) {
        this.u = f;
    }

    @Override // defpackage.jlo
    public final void t(jln jlnVar) {
        this.w = jlnVar;
        E();
    }

    @Override // defpackage.jlo
    public final void u(int i) {
        this.x = i;
    }

    @Override // defpackage.jlo
    public final void v() {
        this.z = 1;
    }

    @Override // defpackage.jlo
    public final void w(cjtd cjtdVar) {
        this.i = dbsg.i(cjtdVar);
    }

    @Override // defpackage.jlo
    public final void x() {
        this.n = jll.START;
        this.t = 0;
    }

    @Override // defpackage.jlo
    public final void y() {
        b(0);
    }

    @Override // defpackage.jlo
    public final void z() {
        l(0);
    }
}
