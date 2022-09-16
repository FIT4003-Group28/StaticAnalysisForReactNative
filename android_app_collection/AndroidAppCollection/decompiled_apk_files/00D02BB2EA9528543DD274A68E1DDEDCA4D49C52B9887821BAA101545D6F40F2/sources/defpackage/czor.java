package defpackage;

import android.os.CountDownTimer;
/* compiled from: PG */
/* renamed from: czor  reason: default package */
/* loaded from: classes5.dex */
final class czor extends CountDownTimer {
    final /* synthetic */ dtyx a;
    final /* synthetic */ czos b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czor(czos czosVar, long j, dtyx dtyxVar) {
        super(j, 100L);
        this.b = czosVar;
        this.a = dtyxVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        czos czosVar = this.b;
        czosVar.d.a(czosVar.d(this.a));
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
