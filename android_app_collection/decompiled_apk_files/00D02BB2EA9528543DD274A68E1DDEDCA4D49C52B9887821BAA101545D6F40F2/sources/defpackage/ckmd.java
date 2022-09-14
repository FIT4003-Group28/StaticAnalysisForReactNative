package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ckmd  reason: default package */
/* loaded from: classes4.dex */
public final class ckmd {
    public final ckmm a;
    private final ckcw b;
    private final AtomicInteger c = new AtomicInteger(0);

    public ckmd(ckmm ckmmVar, ckcw ckcwVar) {
        this.a = ckmmVar;
        this.b = ckcwVar;
    }

    public final void a() {
        ((ckco) this.b.a(ckja.ap)).a(this.c.incrementAndGet());
    }

    public final void b() {
        int i = this.c.get();
        if (i > 0) {
            this.c.compareAndSet(i, i - 1);
        }
    }
}
