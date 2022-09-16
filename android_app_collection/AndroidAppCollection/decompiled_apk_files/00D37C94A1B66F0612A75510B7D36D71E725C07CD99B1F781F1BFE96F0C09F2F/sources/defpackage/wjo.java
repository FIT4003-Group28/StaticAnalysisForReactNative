package defpackage;

import android.os.CountDownTimer;
/* compiled from: PG */
/* renamed from: wjo  reason: default package */
/* loaded from: classes4.dex */
final class wjo extends CountDownTimer {
    final /* synthetic */ wjq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjo(wjq wjqVar, long j) {
        super(j, 1000L);
        this.a = wjqVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        wjp wjpVar = this.a.b;
        if (wjpVar != null) {
            wjpVar.aU();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.a.a = j;
    }
}
