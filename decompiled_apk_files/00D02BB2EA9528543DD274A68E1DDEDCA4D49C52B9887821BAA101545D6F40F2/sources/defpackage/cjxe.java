package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: cjxe  reason: default package */
/* loaded from: classes4.dex */
public class cjxe implements Handler.Callback, Animator.AnimatorListener {
    private static final dcqe a = dcqe.c("cjxe");
    public final Collection<View> d;
    private final fd f;
    private float g;
    @dzsi
    Handler c = null;
    @dzsi
    private AnimatorSet b = null;
    public boolean e = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public cjxe(fd fdVar, Collection<View> collection) {
        this.f = fdVar;
        this.d = collection;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(float f) {
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.b = null;
        }
        ArrayList f2 = dchl.f(this.d.size());
        for (View view : this.d) {
            view.requestLayout();
            if (f != 0.0f) {
                view.setVisibility(0);
            }
            f2.add(ObjectAnimator.ofFloat(view, "alpha", f));
        }
        this.g = f;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.b = animatorSet2;
        animatorSet2.playTogether(f2);
        this.b.addListener(this);
        this.b.start();
    }

    public void b(boolean z) {
        e().removeMessages(1);
        if (z && (this.f.H() == null || !cpv.a.e(this.f.H()))) {
            Message obtainMessage = e().obtainMessage(1);
            Handler e = e();
            long j = 3000;
            if (this.f.H() != null && cpv.a.d(this.f.H())) {
                j = 5000;
            }
            e.sendMessageDelayed(obtainMessage, j);
        }
        a(1.0f);
        this.e = true;
    }

    final Handler e() {
        if (this.c == null) {
            this.c = new Handler(Looper.getMainLooper(), this);
        }
        return this.c;
    }

    public final void f() {
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.b = null;
        }
        this.d.clear();
    }

    public final void g() {
        if (this.e) {
            h();
        } else {
            b(false);
        }
    }

    public final void h() {
        e().removeMessages(1);
        a(0.0f);
        this.e = false;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.f.U()) {
            return false;
        }
        if (message.what != 1) {
            bvoo.h("Wrong type of message passed to HeaderFooterAnimator. Was %s", Integer.valueOf(message.what));
            return false;
        }
        a(0.0f);
        this.e = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(Collection<View> collection) {
        for (View view : collection) {
            this.d.add(view);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = null;
    }

    public void onAnimationEnd(Animator animator) {
        this.b = null;
        if (this.g == 0.0f) {
            for (View view : this.d) {
                view.setVisibility(4);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
