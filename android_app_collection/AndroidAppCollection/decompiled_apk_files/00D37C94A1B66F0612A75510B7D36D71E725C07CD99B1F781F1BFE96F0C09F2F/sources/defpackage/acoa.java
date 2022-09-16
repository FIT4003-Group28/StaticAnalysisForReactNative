package defpackage;

import android.os.CountDownTimer;
/* compiled from: PG */
/* renamed from: acoa  reason: default package */
/* loaded from: classes.dex */
final class acoa extends CountDownTimer {
    final /* synthetic */ acob a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acoa(acob acobVar) {
        super(1000L, 1000L);
        this.a = acobVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.a.a();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
