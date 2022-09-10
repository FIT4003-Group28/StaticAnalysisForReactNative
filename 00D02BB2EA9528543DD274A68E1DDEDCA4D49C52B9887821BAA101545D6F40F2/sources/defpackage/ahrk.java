package defpackage;

import java.util.TimerTask;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahrk  reason: default package */
/* loaded from: classes.dex */
public final class ahrk extends TimerTask {
    final /* synthetic */ ahrl a;

    public ahrk(ahrl ahrlVar) {
        this.a = ahrlVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        ahrl ahrlVar = this.a;
        ahrlVar.U = ahrlVar.p();
    }
}
