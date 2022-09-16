package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bxds  reason: default package */
/* loaded from: classes4.dex */
public class bxds implements bxcf {
    public final float a;
    public int b;
    public int c;
    public float d = 1.0f;
    public float e = 0.0f;
    @dzsi
    public final ValueAnimator f;
    public boolean g;
    @dzsi
    private final bxdr h;
    private final Handler i;
    private final CharSequence j;

    public bxds(Context context, float f, boolean z, DisplayMetrics displayMetrics) {
        this.a = f;
        this.g = z;
        this.i = new Handler(context.getMainLooper());
        if (this.g) {
            this.j = "";
            this.f = null;
            this.h = null;
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f = ofFloat;
        ofFloat.setDuration(15000L);
        ofFloat.setInterpolator(new LinearInterpolator());
        bxdr bxdrVar = new bxdr(this);
        this.h = bxdrVar;
        ofFloat.addUpdateListener(bxdrVar);
        ofFloat.addListener(bxdrVar);
        this.j = context.getResources().getText(R.string.SWIPE_TUTORIAL_TEXT);
    }

    @Override // defpackage.bxcf
    public Integer a() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.bxcf
    public Integer b() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.bxcf
    public Float c() {
        return Float.valueOf(0.0f);
    }

    @Override // defpackage.bxcf
    public Boolean d() {
        ValueAnimator valueAnimator;
        boolean z = false;
        if (!this.g && this.e > 0.0f && (valueAnimator = this.f) != null && valueAnimator.isRunning()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bxcf
    public Float e() {
        return Float.valueOf(this.d);
    }

    @Override // defpackage.bxcf
    public Float f() {
        return Float.valueOf(this.e);
    }

    @Override // defpackage.bxcf
    public CharSequence g() {
        return this.j;
    }

    public void h() {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void i() {
        this.i.post(new Runnable(this) { // from class: bxdq
            private final bxds a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ValueAnimator valueAnimator = this.a.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
        });
    }
}
