package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: daas  reason: default package */
/* loaded from: classes5.dex */
public final class daas {
    public final ArrayList<daar> a = new ArrayList<>();
    public daar b = null;
    public ValueAnimator c = null;
    private final Animator.AnimatorListener d = new daaq(this);

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        daar daarVar = new daar(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.a.add(daarVar);
    }
}
