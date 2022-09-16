package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: bkw  reason: default package */
/* loaded from: classes2.dex */
public abstract class bkw {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final bks b;
    private volatile bmb c;

    public bkw(bks bksVar) {
        this.b = bksVar;
    }

    private final bmb a() {
        return this.b.j(c());
    }

    protected abstract String c();

    public final bmb d() {
        this.b.d();
        if (this.a.compareAndSet(false, true)) {
            if (this.c == null) {
                this.c = a();
            }
            return this.c;
        }
        return a();
    }

    public final void e(bmb bmbVar) {
        if (bmbVar == this.c) {
            this.a.set(false);
        }
    }
}
