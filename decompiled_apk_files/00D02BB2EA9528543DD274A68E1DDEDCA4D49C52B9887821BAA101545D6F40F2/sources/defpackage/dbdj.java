package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import com.google.ar.sceneform.animation.ModelAnimatorImpl;
/* compiled from: PG */
/* renamed from: dbdj  reason: default package */
/* loaded from: classes5.dex */
public final class dbdj extends Animator {
    public final dbei a;

    private dbdj(dbdj dbdjVar) {
        dbei b = dbei.b.b(dbdjVar.a);
        this.a = b;
        if (b instanceof ModelAnimatorImpl) {
            ((ModelAnimatorImpl) b).a = this;
        }
    }

    @Override // android.animation.Animator
    /* renamed from: a */
    public final dbdj mo10clone() {
        return new dbdj(this);
    }

    @Override // android.animation.Animator
    public final void cancel() {
        this.a.r();
    }

    @Override // android.animation.Animator
    public final void end() {
        this.a.q();
    }

    @Override // android.animation.Animator
    public final long getDuration() {
        return this.a.d();
    }

    @Override // android.animation.Animator
    public final long getStartDelay() {
        return this.a.g();
    }

    @Override // android.animation.Animator
    public final long getTotalDuration() {
        return this.a.e();
    }

    @Override // android.animation.Animator
    public final boolean isRunning() {
        return this.a.h();
    }

    @Override // android.animation.Animator
    public final boolean isStarted() {
        return this.a.i();
    }

    @Override // android.animation.Animator
    public final void pause() {
        super.pause();
        this.a.o();
    }

    @Override // android.animation.Animator
    public final void resume() {
        super.resume();
        this.a.p();
    }

    @Override // android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        this.a.k(j);
        return this;
    }

    @Override // android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        this.a.l(timeInterpolator);
    }

    @Override // android.animation.Animator
    public final void setStartDelay(long j) {
        this.a.m(j);
    }

    @Override // android.animation.Animator
    public final void start() {
        this.a.n();
    }

    public dbdj(dbef dbefVar, dbgt dbgtVar) {
        dbei a = dbei.b.a(dbefVar, dbgtVar);
        this.a = a;
        if (a instanceof ModelAnimatorImpl) {
            ((ModelAnimatorImpl) a).a = this;
        }
    }
}
