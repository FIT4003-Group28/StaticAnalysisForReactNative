package defpackage;

import android.os.CountDownTimer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xgk  reason: default package */
/* loaded from: classes4.dex */
public final class xgk extends CountDownTimer {
    final /* synthetic */ xgm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgk(xgm xgmVar, int i) {
        super(i, 1000L);
        this.a = xgmVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.a.d(0L);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.a.d(j);
    }
}
