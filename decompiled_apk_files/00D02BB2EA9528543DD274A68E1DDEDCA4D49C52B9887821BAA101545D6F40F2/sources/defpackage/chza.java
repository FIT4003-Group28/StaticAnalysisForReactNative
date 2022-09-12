package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: chza  reason: default package */
/* loaded from: classes4.dex */
public abstract class chza {
    public static chza f(long j, Animator animator, chzh chzhVar, Runnable runnable) {
        return new chzb(j, animator, dbsg.i(chzhVar), runnable);
    }

    public static chza g(long j, Animator animator, Runnable runnable) {
        return new chzb(j, animator, dbpy.a, runnable);
    }

    public static chza h() {
        return g(0L, ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(0L), chyz.a);
    }

    public abstract long a();

    public abstract Animator b();

    public abstract dbsg<chzh> c();

    public abstract Runnable d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        d().run();
    }
}
