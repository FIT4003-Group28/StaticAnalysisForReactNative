package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: alle  reason: default package */
/* loaded from: classes.dex */
public final class alle {
    public final ArrayList a = new ArrayList();
    private final Animator.AnimatorListener b = new alld(this);

    public final void a(ValueAnimator valueAnimator) {
        amyv amyvVar = new amyv();
        valueAnimator.addListener(this.b);
        this.a.add(amyvVar);
    }
}
