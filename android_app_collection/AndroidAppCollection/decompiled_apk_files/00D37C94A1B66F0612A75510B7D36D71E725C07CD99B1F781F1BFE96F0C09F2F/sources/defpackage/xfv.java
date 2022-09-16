package defpackage;

import android.os.CountDownTimer;
/* compiled from: PG */
/* renamed from: xfv  reason: default package */
/* loaded from: classes4.dex */
final class xfv extends CountDownTimer {
    final /* synthetic */ xfx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfv(xfx xfxVar, long j) {
        super(j, 1000L);
        this.a = xfxVar;
        xfxVar.i = j;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        xfx xfxVar = this.a;
        xfxVar.i = 0L;
        xfxVar.g(0L);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        xfx xfxVar = this.a;
        xfxVar.i = j;
        xfxVar.g(j);
    }
}
