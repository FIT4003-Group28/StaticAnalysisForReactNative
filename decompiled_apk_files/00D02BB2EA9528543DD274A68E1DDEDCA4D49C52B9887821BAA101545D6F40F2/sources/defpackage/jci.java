package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: jci  reason: default package */
/* loaded from: classes7.dex */
public final class jci extends TextView {
    public static final cqkv a = new jcj();
    public int b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    private boolean g;
    private Locale h;

    public jci(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 0;
        this.g = true;
        this.h = Locale.getDefault();
        this.d = false;
        this.e = 0;
        this.f = false;
        setSingleLine(true);
    }

    private final void b(int i) {
        this.b = i;
        this.c = (int) getPaint().measureText(a(i));
        setText(a(i));
        requestLayout();
    }

    public final String a(int i) {
        return String.format(this.h, "%d", Integer.valueOf(i));
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

    public void setCount(final int i) {
        if (this.c == 0 || (this.g && !isShown())) {
            b(i);
        } else if (this.d) {
            this.e = i;
            this.f = true;
        } else {
            int i2 = this.b;
            if (i2 == i) {
                return;
            }
            final int height = i2 < i ? getHeight() : -getHeight();
            this.d = true;
            setTranslationY(0.0f);
            b(this.b);
            animate().translationY(height).setInterpolator(irf.a).setDuration(112L).withEndAction(new Runnable(this, height, i) { // from class: jce
                private final jci a;
                private final int b;
                private final int c;

                {
                    this.a = this;
                    this.b = height;
                    this.c = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final jci jciVar = this.a;
                    int i3 = this.b;
                    int i4 = this.c;
                    jciVar.setTranslationY(-i3);
                    jciVar.b = i4;
                    jciVar.setText(jciVar.a(i4));
                    jciVar.animate().translationY(0.0f).setInterpolator(irf.a).setDuration(112L).withEndAction(new Runnable(jciVar) { // from class: jcg
                        private final jci a;

                        {
                            this.a = jciVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            jci jciVar2 = this.a;
                            jciVar2.d = false;
                            if (jciVar2.f) {
                                jciVar2.f = false;
                                jciVar2.setCount(jciVar2.e);
                            }
                        }
                    }).start();
                }
            }).start();
            ValueAnimator ofInt = ValueAnimator.ofInt(this.c, (int) getPaint().measureText(a(i)));
            ofInt.setInterpolator(irf.a);
            ofInt.setDuration(112L);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: jcf
                private final jci a;

                {
                    this.a = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    jci jciVar = this.a;
                    jciVar.c = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    jciVar.requestLayout();
                }
            });
            ofInt.start();
        }
    }

    public void setLocale(Locale locale) {
        this.h = locale;
    }

    public void setSkipAnimationWhenNotVisible(boolean z) {
        this.g = z;
    }
}
