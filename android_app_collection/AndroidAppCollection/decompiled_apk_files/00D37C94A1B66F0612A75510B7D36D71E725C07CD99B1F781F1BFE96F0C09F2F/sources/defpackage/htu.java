package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: htu  reason: default package */
/* loaded from: classes3.dex */
public final class htu implements Animator.AnimatorListener {
    static final long a = TimeUnit.SECONDS.toMillis(5);
    public final int b;
    public final float c;
    public final int d;
    public dp e;
    public TextView f;
    final float g;
    private final Handler h;
    private final int i;
    private final Runnable j = new hts(this, 1);

    public htu(Context context, Handler handler) {
        this.h = handler;
        Resources resources = context.getResources();
        this.b = resources.getDisplayMetrics().heightPixels;
        this.i = resources.getDisplayMetrics().widthPixels;
        this.c = resources.getDimension(R.dimen.comment_sticker_container_bottom_margin);
        this.g = resources.getDimension(R.dimen.reel_edit_video_tap_for_more_static_sticker_margin);
        this.d = resources.getColor(R.color.add_text_shadow_color);
    }

    public final void a() {
        this.h.post(new hts(this));
    }

    public final void b(int i) {
        TextView textView = this.f;
        textView.setShadowLayer(textView.getShadowRadius(), this.f.getShadowDx(), this.f.getShadowDy(), i);
    }

    public final void c(final int i) {
        this.h.post(new Runnable() { // from class: htt
            @Override // java.lang.Runnable
            public final void run() {
                htu htuVar = htu.this;
                int i2 = i;
                if (!hqs.i(htuVar.e)) {
                    return;
                }
                htuVar.f.setAlpha(1.0f);
                htuVar.f.setVisibility(0);
                htuVar.b(htuVar.d);
                zgd.u(htuVar.f, new ecp(11), zgd.b(zgd.s(-1, -2), zgd.p(i2 - htuVar.f.getMeasuredHeight())), FrameLayout.LayoutParams.class);
            }
        });
        this.h.removeCallbacks(this.j);
        this.h.postDelayed(this.j, a);
    }

    public final void d(axbn axbnVar) {
        axbl axblVar = (axbl) axbnVar;
        c(Math.round((this.b / 2.0f) - Math.min(((axbm) axblVar.instance).a(), (((axbm) axblVar.instance).a() / ((axbm) axblVar.instance).c()) * (this.i / 2.0f))));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f.setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
