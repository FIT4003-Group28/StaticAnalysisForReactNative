package defpackage;

import android.animation.AnimatorSet;
import android.os.CountDownTimer;
/* compiled from: PG */
/* renamed from: dfrd  reason: default package */
/* loaded from: classes6.dex */
final class dfrd extends CountDownTimer {
    final /* synthetic */ dfrh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfrd(dfrh dfrhVar) {
        super(750L, 750L);
        this.a = dfrhVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        dfrh dfrhVar = this.a;
        if (dfrhVar.k.isRunning() || dfrhVar.f() || dfrhVar.d()) {
            return;
        }
        dfrhVar.l.cancel();
        dfrhVar.k.cancel();
        dfrhVar.k = new AnimatorSet();
        dfrhVar.k.playTogether(dfrhVar.d.b("railWidthMeters", 0.15f), dfrhVar.d.b("uiSwipeRailOpacity", 0.3f));
        dfrhVar.k.setDuration(400L);
        dfrhVar.k.start();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
