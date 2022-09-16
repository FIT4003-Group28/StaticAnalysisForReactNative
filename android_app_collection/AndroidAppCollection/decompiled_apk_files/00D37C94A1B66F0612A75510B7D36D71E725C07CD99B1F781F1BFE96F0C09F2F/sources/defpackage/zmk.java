package defpackage;

import java.util.TimerTask;
/* compiled from: PG */
/* renamed from: zmk  reason: default package */
/* loaded from: classes4.dex */
final class zmk extends TimerTask {
    final /* synthetic */ zmp a;

    public zmk(zmp zmpVar) {
        this.a = zmpVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.a.ap.obtainMessage(1).sendToTarget();
    }
}
