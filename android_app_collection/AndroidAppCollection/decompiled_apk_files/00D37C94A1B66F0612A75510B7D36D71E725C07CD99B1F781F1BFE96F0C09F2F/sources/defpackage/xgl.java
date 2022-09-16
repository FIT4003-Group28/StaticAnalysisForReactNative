package defpackage;

import android.os.CountDownTimer;
/* compiled from: PG */
/* renamed from: xgl  reason: default package */
/* loaded from: classes4.dex */
final class xgl extends CountDownTimer {
    final /* synthetic */ xgm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgl(xgm xgmVar, int i) {
        super(i, 1000L);
        this.a = xgmVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        xgm xgmVar = this.a;
        xgmVar.a.d(xgmVar.e.c.g, xgmVar.a());
        xgmVar.g = null;
        xgmVar.i();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
