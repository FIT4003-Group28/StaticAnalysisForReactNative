package defpackage;

import android.animation.TimeAnimator;
import android.content.Context;
import android.widget.Scroller;
/* compiled from: PG */
/* renamed from: aefm  reason: default package */
/* loaded from: classes2.dex */
public final class aefm extends TimeAnimator {
    public final Scroller a;
    public final aefl b;
    public int c = 0;
    private final float d;

    public aefm(Context context, float f, aefl aeflVar) {
        this.a = new Scroller(context);
        this.d = f;
        this.b = aeflVar;
    }

    @Override // android.animation.TimeAnimator, android.animation.ValueAnimator, android.animation.Animator
    public final void start() {
        this.a.fling(0, this.c, 0, (int) this.d, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        final float signum = Math.signum(this.d);
        setTimeListener(new TimeAnimator.TimeListener(this, signum) { // from class: aefk
            private final aefm a;
            private final float b;

            {
                this.a = this;
                this.b = signum;
            }

            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
                aefm aefmVar = this.a;
                float f = this.b;
                if (aefmVar.a.computeScrollOffset()) {
                    aefmVar.b.a(aefmVar, aefmVar.a.getCurrY() - aefmVar.c, aefmVar.a.getCurrVelocity() * f);
                    aefmVar.c = aefmVar.a.getCurrY();
                    return;
                }
                timeAnimator.end();
            }
        });
        super.start();
    }
}
