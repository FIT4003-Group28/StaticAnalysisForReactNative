package defpackage;

import android.animation.ObjectAnimator;
/* compiled from: PG */
/* renamed from: cppm  reason: default package */
/* loaded from: classes5.dex */
public final class cppm {
    public final cppl a;
    public final ObjectAnimator b;

    public cppm(cppl cpplVar) {
        this.a = cpplVar;
        this.b = ObjectAnimator.ofFloat(cpplVar, "animationPercent", 0.0f, 1.0f);
    }
}
