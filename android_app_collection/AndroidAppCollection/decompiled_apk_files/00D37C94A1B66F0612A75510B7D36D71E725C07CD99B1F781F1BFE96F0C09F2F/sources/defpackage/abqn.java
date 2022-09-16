package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
/* compiled from: PG */
/* renamed from: abqn  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abqn implements Runnable {
    public final /* synthetic */ abqq a;
    private final /* synthetic */ int b;

    public /* synthetic */ abqn(abqq abqqVar) {
        this.a = abqqVar;
    }

    public /* synthetic */ abqn(abqq abqqVar, int i) {
        this.b = i;
        this.a = abqqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            abqq abqqVar = this.a;
            abqqVar.q = ObjectAnimator.ofFloat(abqqVar.k, View.TRANSLATION_Y, abqqVar.k.getHeight(), 0.0f);
            abqqVar.q.setDuration(300L);
            abqqVar.q.setInterpolator(new DecelerateInterpolator());
            abqqVar.q.addListener(new abqp(abqqVar));
            float height = abqqVar.n.getHeight();
            float height2 = height - abqqVar.k.getHeight();
            float f = height * 0.3f;
            if (height2 < f) {
                abqqVar.k.a(-((int) (f - height2)));
            } else {
                abqqVar.k.a(0);
            }
            abqqVar.q.start();
            return;
        }
        abqq abqqVar2 = this.a;
        if (abqqVar2.s) {
            abqqVar2.s = false;
            return;
        }
        for (abqi abqiVar : abqqVar2.g) {
            abqiVar.e.setVisibility(8);
            abqiVar.f.setVisibility(0);
        }
    }
}
