package defpackage;

import java.util.TimerTask;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: npq  reason: default package */
/* loaded from: classes3.dex */
public final class npq extends TimerTask {
    final /* synthetic */ npr a;

    public npq(npr nprVar) {
        this.a = nprVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.a.o.post(new Runnable() { // from class: npp
            @Override // java.lang.Runnable
            public final void run() {
                npq npqVar = npq.this;
                npr nprVar = npqVar.a;
                if (nprVar.m) {
                    nprVar.c(false);
                    npqVar.a.r = true;
                }
            }
        });
    }
}
