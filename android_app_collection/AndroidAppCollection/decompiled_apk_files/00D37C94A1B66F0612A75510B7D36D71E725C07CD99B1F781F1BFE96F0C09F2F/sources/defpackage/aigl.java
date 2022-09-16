package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aigl  reason: default package */
/* loaded from: classes.dex */
public abstract class aigl extends FrameLayout implements aigo {
    private final acti a;
    public final Rect b;
    public final aign c;
    public final axnm d;
    public final int e;
    public RecyclerView f;
    public byte[] g;
    public int h;
    public jzr i;
    private boolean j;
    private float k;
    private ObjectAnimator l;

    public aigl(Context context, acti actiVar, aign aignVar, axnm axnmVar, boolean z) {
        super(context);
        this.b = new Rect();
        actiVar.getClass();
        this.a = actiVar;
        aignVar.getClass();
        this.c = aignVar;
        this.d = axnmVar;
        this.e = z ? 0 : context.getResources().getDimensionPixelSize(R.dimen.related_end_screen_peek_margin);
    }

    private final int l(int i) {
        if (i == 0) {
            return a();
        }
        if (i != 1) {
            return 0;
        }
        return b();
    }

    private final void m(boolean z, float f) {
        if (!k() || this.c.e()) {
            this.j = false;
            return;
        }
        if (!this.j) {
            this.k = this.f.getTranslationY();
            this.j = true;
        }
        float min = Math.min(Math.max(this.k + f, l(2)), l(1));
        this.c.c(d(min), true);
        if (!z) {
            this.j = false;
            f(min);
            if (min > (l(1) + l(2)) / 2.0f) {
                j(1, true, 1);
                return;
            } else {
                j(2, true, 1);
                return;
            }
        }
        f(min);
    }

    @Override // defpackage.aigo
    public final void K(float f) {
        m(true, f);
    }

    @Override // defpackage.aigo
    public final void L(float f) {
        m(true, f);
    }

    @Override // defpackage.aigo
    public final void M(float f) {
        m(false, f);
    }

    protected abstract int a();

    protected abstract int b();

    protected void c(RecyclerView recyclerView) {
        throw null;
    }

    public final float d(float f) {
        int l = l(1);
        float l2 = l(2);
        return 1.0f - ((f - l2) / (l - l2));
    }

    public final void e(int i) {
        i(1, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(float f) {
        this.f.setTranslationY(f);
    }

    public final void g() {
        byte[] bArr;
        if (k()) {
            aigi aigiVar = (aigi) this.d.get();
            if (aigiVar.g != null) {
                if (aigiVar.e.e()) {
                    aigiVar.g.setContentDescription(null);
                }
                if (aigiVar.e.d()) {
                    aigiVar.g.setContentDescription(aigiVar.c.getResources().getString(R.string.accessibility_related_screen_swipe_down));
                } else if (aigiVar.e.f()) {
                    aigiVar.g.setContentDescription(aigiVar.c.getResources().getString(R.string.accessibility_related_screen_swipe_up));
                }
            }
        }
        if (this.c.e()) {
            this.f.setVisibility(8);
        }
        if (this.c.d() && (bArr = this.g) != null) {
            this.a.u(new acte(bArr), null);
        }
        float l = l(this.c.a);
        f(l);
        this.c.c(d(l), false);
    }

    public final void h() {
        if (k() && (this.f.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            zgd.t(this.f, zgd.e(this.h), ViewGroup.MarginLayoutParams.class);
            j(this.c.a, false, 0);
        }
    }

    public final void i(int i, int i2) {
        if (this.c.a != i) {
            j(i, true, i2);
        }
    }

    public final boolean k() {
        return this.f != null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.i.d(this, motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.i.d(this, motionEvent);
    }

    public final void j(int i, boolean z, int i2) {
        if (!k()) {
            if (i == 0) {
                return;
            }
            if (!k()) {
                aigi aigiVar = (aigi) this.d.get();
                RecyclerView recyclerView = aigiVar.g;
                if (recyclerView == null) {
                    aigiVar.g = (RecyclerView) LayoutInflater.from(aigiVar.c).inflate(R.layout.app_related_endscreen_results, (ViewGroup) this, false);
                    RecyclerView recyclerView2 = aigiVar.g;
                    recyclerView2.getClass();
                    recyclerView2.af(null);
                    aigiVar.g.v(new aige(aigiVar));
                    aigiVar.h = aigiVar.g.getPaddingLeft();
                    aigiVar.i = aigiVar.g.getPaddingRight();
                    aigiVar.j = aigiVar.g.getPaddingBottom();
                    Context context = aigiVar.c;
                    aigf aigfVar = new aigf(aigiVar);
                    aigfVar.ab(0);
                    aigiVar.g.ag(aigfVar);
                    aigiVar.b.rZ(new aigh(aigiVar));
                    aigiVar.b.h(aigiVar.a);
                    ((akdb) aigiVar.f).a(aigiVar.g, aigiVar.b).a(aigiVar.g);
                    RecyclerView recyclerView3 = aigiVar.g;
                    recyclerView3.ac(new aigg(recyclerView3));
                    recyclerView = aigiVar.g;
                }
                this.f = recyclerView;
                if (recyclerView != null) {
                    ViewGroup viewGroup = (ViewGroup) recyclerView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(this.f);
                    }
                    addView(this.f);
                    c(this.f);
                    ((aigi) this.d.get()).a(this.b);
                }
                if (this.h > 0) {
                    h();
                }
            }
        }
        aign aignVar = this.c;
        int i3 = aignVar.a;
        aignVar.a = i;
        for (aigm aigmVar : aignVar.c) {
            aigmVar.nF(i3, i, i2);
        }
        ObjectAnimator objectAnimator = this.l;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.l.removeAllListeners();
            this.l.cancel();
            this.l = null;
        }
        if (!z) {
            g();
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this.f, PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, l(i))).setDuration(300L);
        this.l = duration;
        duration.addListener(new aigk(this));
        this.l.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: aigj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                aigl aiglVar = aigl.this;
                float translationY = aiglVar.f.getTranslationY();
                aiglVar.c.c(aiglVar.d(translationY), false);
                aiglVar.f(translationY);
            }
        });
        this.l.start();
    }
}
