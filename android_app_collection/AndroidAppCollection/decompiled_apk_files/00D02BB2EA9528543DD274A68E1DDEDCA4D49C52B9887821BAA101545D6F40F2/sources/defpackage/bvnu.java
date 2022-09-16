package defpackage;

import android.os.SystemClock;
import android.view.animation.AnimationUtils;
/* compiled from: PG */
/* renamed from: bvnu  reason: default package */
/* loaded from: classes.dex */
public final class bvnu implements cqat, bvnx {
    private final cqaz a = new cqaz();

    @Override // defpackage.bvnx
    public final long a() {
        return AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // defpackage.cqat
    public final long b() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.cqat
    public final long c() {
        return System.nanoTime();
    }

    @Override // defpackage.cqat
    public final long d() {
        return SystemClock.currentThreadTimeMillis();
    }

    @Override // defpackage.cqat
    public final long e() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.cqat
    public final long f() {
        return this.a.f();
    }

    @Override // defpackage.cqat
    public final long g() {
        return SystemClock.uptimeMillis();
    }
}
