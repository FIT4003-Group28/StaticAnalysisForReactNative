package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: zzx  reason: default package */
/* loaded from: classes4.dex */
public final class zzx {
    public final Handler a;
    public boolean b;
    public boolean c;
    public final Runnable d;
    public boolean e;
    public final ValueAnimator f;
    public final zzs g;

    public zzx(zzs zzsVar, Handler handler) {
        this.g = zzsVar;
        handler.getClass();
        this.a = handler;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        this.f = duration;
        duration.addUpdateListener(new zzv(zzsVar));
        this.d = new zzw(this);
    }
}
