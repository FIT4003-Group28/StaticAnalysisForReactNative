package defpackage;

import java.util.concurrent.ScheduledFuture;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alhb  reason: default package */
/* loaded from: classes.dex */
public final class alhb {
    public final amej a;
    private boolean b = false;
    private ankt c;
    private ScheduledFuture d;

    public alhb(amej amejVar) {
        this.a = amejVar;
        amejVar.a(new Runnable() { // from class: alha
            @Override // java.lang.Runnable
            public final void run() {
                alhb.this.a();
            }
        }, anjk.a);
    }

    public final synchronized void a() {
        this.b = true;
        ankt anktVar = this.c;
        if (anktVar != null) {
            anktVar.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final synchronized void b(ankt anktVar) {
        this.c = anktVar;
        if (this.b) {
            anktVar.cancel(true);
        }
    }

    public final synchronized void c(ScheduledFuture scheduledFuture) {
        this.d = scheduledFuture;
        if (this.b) {
            scheduledFuture.cancel(true);
        }
    }

    public final synchronized boolean d() {
        return this.b;
    }
}
