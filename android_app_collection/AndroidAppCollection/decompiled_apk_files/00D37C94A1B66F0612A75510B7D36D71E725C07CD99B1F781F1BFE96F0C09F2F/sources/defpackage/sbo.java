package defpackage;

import android.animation.ObjectAnimator;
/* compiled from: PG */
/* renamed from: sbo  reason: default package */
/* loaded from: classes4.dex */
public final class sbo {
    public final sbn a;
    public final ObjectAnimator b;

    public sbo(sbn sbnVar) {
        this.a = sbnVar;
        this.b = ObjectAnimator.ofFloat(sbnVar, "animationPercent", 0.0f, 1.0f);
    }
}
