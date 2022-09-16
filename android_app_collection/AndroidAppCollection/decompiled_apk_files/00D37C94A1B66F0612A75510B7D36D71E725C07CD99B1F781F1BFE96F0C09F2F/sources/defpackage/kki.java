package defpackage;

import android.os.CountDownTimer;
/* compiled from: PG */
/* renamed from: kki  reason: default package */
/* loaded from: classes3.dex */
final class kki extends CountDownTimer {
    final /* synthetic */ kkj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kki(kkj kkjVar, long j) {
        super(j, 1000L);
        this.a = kkjVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        kkj kkjVar = this.a;
        kkjVar.d = 0L;
        kkjVar.a(wzq.ENDCAP_ENDED);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.a.d = j;
    }
}
