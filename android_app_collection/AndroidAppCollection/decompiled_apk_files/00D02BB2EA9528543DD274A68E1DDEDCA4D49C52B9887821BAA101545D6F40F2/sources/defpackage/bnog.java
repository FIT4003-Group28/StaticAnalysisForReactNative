package defpackage;

import android.os.CountDownTimer;
/* compiled from: PG */
/* renamed from: bnog  reason: default package */
/* loaded from: classes3.dex */
final class bnog extends CountDownTimer {
    final /* synthetic */ dbsz a;
    final /* synthetic */ Runnable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnog(long j, dbsz dbszVar, Runnable runnable) {
        super(j, 100L);
        this.a = dbszVar;
        this.b = runnable;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.b.run();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.a.NU(Long.valueOf(j));
    }
}
