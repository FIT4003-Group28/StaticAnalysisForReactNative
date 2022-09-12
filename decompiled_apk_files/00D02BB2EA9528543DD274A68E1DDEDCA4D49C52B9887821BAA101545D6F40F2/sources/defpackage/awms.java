package defpackage;

import android.os.SystemClock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awms  reason: default package */
/* loaded from: classes3.dex */
public final class awms<R> implements Runnable {
    public final awmn<R> a;
    public final deig<R> b = deig.d();
    final /* synthetic */ awmu c;

    public awms(awmu awmuVar, awmn awmnVar) {
        this.c = awmuVar;
        this.a = awmnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dehn<? extends R> b;
        SystemClock.elapsedRealtime();
        deig<R> deigVar = this.b;
        if (deigVar.isDone()) {
            b = deha.c();
        } else {
            try {
                b = this.a.a(this.c.a);
            } catch (Exception e) {
                b = deha.b(e);
            }
        }
        deigVar.p(b);
        this.b.Pk(new Runnable(this) { // from class: awmr
            private final awms a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                awms awmsVar = this.a;
                SystemClock.elapsedRealtime();
                awmsVar.c.d();
            }
        }, this.c.a);
    }
}
