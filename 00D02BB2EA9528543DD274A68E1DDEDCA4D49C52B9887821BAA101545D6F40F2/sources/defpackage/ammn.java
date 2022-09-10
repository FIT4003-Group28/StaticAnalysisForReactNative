package defpackage;

import java.util.TimerTask;
/* compiled from: PG */
/* renamed from: ammn  reason: default package */
/* loaded from: classes2.dex */
final class ammn extends TimerTask {
    final /* synthetic */ ammo a;

    public ammn(ammo ammoVar) {
        this.a = ammoVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.a.v();
    }
}
