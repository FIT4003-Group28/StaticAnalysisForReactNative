package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vlp  reason: default package */
/* loaded from: classes7.dex */
public final class vlp {
    public final ValueAnimator a;
    public int b = 0;

    private vlp() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f, 0.0f);
        this.a = ofFloat;
        ofFloat.setDuration(700L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addListener(new vlo(this));
    }

    public static vlp d() {
        return new vlp();
    }

    public final void a(View view) {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            this.a.start();
        }
        if (view.getTag(R.id.pulse_loading_animator_id) == null) {
            vln vlnVar = new vln(this, view);
            view.setTag(R.id.pulse_loading_animator_id, vlnVar);
            this.a.addUpdateListener(vlnVar);
            vlnVar.onAnimationUpdate(this.a);
        }
    }

    public final void b(View view) {
        c();
        Object tag = view.getTag(R.id.pulse_loading_animator_id);
        if (tag instanceof ValueAnimator.AnimatorUpdateListener) {
            this.a.removeUpdateListener((ValueAnimator.AnimatorUpdateListener) tag);
            view.setTag(R.id.pulse_loading_animator_id, null);
        }
    }

    public final void c() {
        int max = Math.max(0, this.b - 1);
        this.b = max;
        if (max == 0) {
            this.a.cancel();
        }
    }
}
