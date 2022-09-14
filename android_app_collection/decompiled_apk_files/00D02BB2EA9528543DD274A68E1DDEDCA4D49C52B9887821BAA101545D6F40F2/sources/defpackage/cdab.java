package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cdab  reason: default package */
/* loaded from: classes4.dex */
public final class cdab extends TextView {
    public static final cqkv a = new cdac();
    public int b;
    public int c;
    public boolean d;
    public int e;
    private boolean f;
    private boolean g;
    private Locale h;

    public cdab(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.f = false;
        this.c = 0;
        this.g = true;
        this.h = Locale.getDefault();
        this.d = false;
        this.e = 0;
        setSingleLine(true);
    }

    private final void c(int i) {
        this.b = i;
        this.c = (int) getPaint().measureText(b(i));
        setText(b(i));
        requestLayout();
    }

    public final void a() {
        if (this.c == 0 || (this.g && !isShown())) {
            c(this.e);
        } else if (this.d) {
        } else {
            final Runnable runnable = new Runnable(this) { // from class: cczw
                private final cdab a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cdab cdabVar = this.a;
                    cdabVar.d = false;
                    cdabVar.a();
                }
            };
            if (this.f) {
                this.d = true;
                setAlpha(1.0f);
                animate().alpha(0.0f).setInterpolator(irf.a).setDuration(250L).withEndAction(new Runnable(this, runnable) { // from class: cczx
                    private final cdab a;
                    private final Runnable b;

                    {
                        this.a = this;
                        this.b = runnable;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cdab cdabVar = this.a;
                        cdabVar.animate().alpha(1.0f).setInterpolator(irf.a).setDuration(250L).withEndAction(this.b).start();
                    }
                }).start();
                return;
            }
            int i = this.b;
            int i2 = this.e;
            if (i == i2) {
                return;
            }
            this.d = true;
            final int height = i < i2 ? getHeight() : -getHeight();
            setTranslationY(0.0f);
            c(this.b);
            animate().translationY(height).setInterpolator(irf.a).setDuration(112L).withEndAction(new Runnable(this, height, runnable) { // from class: cczy
                private final cdab a;
                private final int b;
                private final Runnable c;

                {
                    this.a = this;
                    this.b = height;
                    this.c = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cdab cdabVar = this.a;
                    int i3 = this.b;
                    Runnable runnable2 = this.c;
                    cdabVar.setTranslationY(-i3);
                    int i4 = cdabVar.e;
                    cdabVar.b = i4;
                    cdabVar.setText(cdabVar.b(i4));
                    cdabVar.animate().translationY(0.0f).setInterpolator(irf.a).setDuration(112L).withEndAction(runnable2).start();
                }
            }).start();
            ValueAnimator ofInt = ValueAnimator.ofInt(this.c, (int) getPaint().measureText(b(this.e)));
            ofInt.setInterpolator(irf.a);
            ofInt.setDuration(112L);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: cczz
                private final cdab a;

                {
                    this.a = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    cdab cdabVar = this.a;
                    cdabVar.c = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    cdabVar.requestLayout();
                }
            });
            ofInt.start();
        }
    }

    public final String b(int i) {
        return String.format(this.h, "%d", Integer.valueOf(i));
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c(this.e);
        a();
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c = 0;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.c + getPaddingRight() + getPaddingLeft(), 1073741824), i2);
    }

    public void setCount(int i) {
        this.e = i;
        a();
    }

    public void setIndeterminate(boolean z) {
        this.f = z;
        a();
    }

    public void setLocale(Locale locale) {
        this.h = locale;
    }

    public void setSkipAnimationWhenNotVisible(boolean z) {
        this.g = z;
    }
}
