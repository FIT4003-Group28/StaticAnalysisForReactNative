package com.google.android.libraries.youtube.livecreation.ui.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.CountDownTimer;
import android.os.PowerManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class WaitingIndicatorView extends RelativeLayout {
    public Circle a;
    public TextView b;
    public acnr c;
    public boolean d;
    public boolean e;
    public int f;
    private AnimatorSet g;
    private CountDownTimer h;
    private boolean i;

    public WaitingIndicatorView(Context context) {
        this(context, null);
    }

    public final void a() {
        c();
        boolean isPowerSaveMode = ((PowerManager) getContext().getSystemService("power")).isPowerSaveMode();
        this.i = isPowerSaveMode;
        if (isPowerSaveMode) {
            return;
        }
        this.g = new AnimatorSet();
        float f = this.a.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        ofFloat.addUpdateListener(new acnl(this));
        ofFloat.addListener(new acnm(this));
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(650L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 360.0f);
        ofFloat2.addUpdateListener(new acnn(this, f));
        ofFloat2.addListener(new acno(this));
        ofFloat2.setDuration(350L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.b, "translationY", 50.0f, 0.0f);
        ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
        long j = 300;
        ofFloat3.setDuration(300L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.b, "alpha", 0.0f, 1.0f);
        ofFloat4.setDuration(300L);
        this.g.play(ofFloat).before(ofFloat2);
        this.g.play(ofFloat).with(ofFloat3).with(ofFloat4);
        this.g.addListener(new acnp(this));
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder play = animatorSet.play(this.g);
        if (true == zdg.e(getContext())) {
            j = 5000;
        }
        play.after(j);
        animatorSet.start();
    }

    public final void b(int i) {
        if (!this.i) {
            this.f = i;
            this.e = true;
            this.d = true;
            return;
        }
        this.b.setVisibility(0);
        acnq acnqVar = new acnq(this, TimeUnit.SECONDS.toMillis(3L) + 300);
        this.h = acnqVar;
        acnqVar.start();
    }

    public final void c() {
        AnimatorSet animatorSet = this.g;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.g.end();
            this.g.cancel();
            this.g = null;
        }
        CountDownTimer countDownTimer = this.h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.h = null;
        }
        this.d = false;
        this.e = false;
        this.f = 0;
        this.a.setVisibility(4);
        this.b.setVisibility(4);
        this.b.setText("");
    }

    public WaitingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = false;
        LayoutInflater.from(context).inflate(R.layout.lc_waiting_indicator, (ViewGroup) this, true);
        this.a = (Circle) findViewById(R.id.circle);
        this.b = (TextView) findViewById(R.id.digit);
    }
}
