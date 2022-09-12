package com.google.android.apps.gmm.base.views.core;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Message;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GmmProgressBar extends ProgressBar {
    public final jeg a;
    public long b;
    public View[] c;
    public final AnimatorSet d;

    public GmmProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1L;
        this.c = new View[0];
        this.d = new AnimatorSet();
        this.a = new jeg(new WeakReference(this));
    }

    public final void a() {
        this.b = -1L;
        this.a.removeMessages(2);
        if (!this.a.hasMessages(1)) {
            jeg jegVar = this.a;
            jegVar.sendMessageDelayed(Message.obtain(jegVar, 1), 500L);
        }
    }

    public final void b() {
        this.a.removeMessages(1);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.b;
        long j2 = elapsedRealtime - j;
        if (j2 >= 500 || j == -1) {
            setVisibility(4);
            c();
        } else if (this.a.hasMessages(2)) {
        } else {
            jeg jegVar = this.a;
            jegVar.sendMessageDelayed(Message.obtain(jegVar, 2), 500 - j2);
        }
    }

    public final void c() {
        View[] viewArr = this.c;
        int length = viewArr.length;
        if (length == 0) {
            return;
        }
        Animator[] animatorArr = new Animator[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            View view = viewArr[i];
            view.setAlpha(0.0f);
            view.setVisibility(0);
            animatorArr[i2] = ObjectAnimator.ofFloat(view, "alpha", 1.0f);
            i++;
            i2++;
        }
        this.d.playTogether(animatorArr);
        this.d.start();
    }

    public void setDependentViews(View... viewArr) {
        this.c = viewArr;
    }
}
