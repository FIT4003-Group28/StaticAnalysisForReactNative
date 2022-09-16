package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: dzeo  reason: default package */
/* loaded from: classes6.dex */
final class dzeo extends dyzy {
    final AtomicBoolean a = new AtomicBoolean();
    private final dzaj b = new dzaj();
    private final dzen c;
    private final dzep d;

    public dzeo(dzen dzenVar) {
        dzep dzepVar;
        this.c = dzenVar;
        if (!dzenVar.c.b) {
            while (true) {
                if (!dzenVar.b.isEmpty()) {
                    dzepVar = dzenVar.b.poll();
                    if (dzepVar != null) {
                        break;
                    }
                } else {
                    dzepVar = new dzep(dzenVar.d);
                    dzenVar.c.b(dzepVar);
                    break;
                }
            }
        } else {
            dzepVar = dzeq.c;
        }
        this.d = dzepVar;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        if (this.a.compareAndSet(false, true)) {
            this.b.SQ();
            dzen dzenVar = this.c;
            dzep dzepVar = this.d;
            dzepVar.a = System.nanoTime() + dzenVar.a;
            dzenVar.b.offer(dzepVar);
        }
    }

    @Override // defpackage.dyzy
    public final dzak c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.b.b) {
            return dzbe.INSTANCE;
        }
        return this.d.f(runnable, j, timeUnit, this.b);
    }
}
