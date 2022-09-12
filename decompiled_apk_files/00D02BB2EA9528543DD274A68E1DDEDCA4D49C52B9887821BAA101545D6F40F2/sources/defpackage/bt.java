package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: bt  reason: default package */
/* loaded from: classes4.dex */
public abstract class bt {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final bn b;
    private volatile awj c;

    public bt(bn bnVar) {
        this.b = bnVar;
    }

    private final awj a() {
        return this.b.p(d());
    }

    protected abstract String d();

    public final awj e() {
        this.b.D();
        if (this.a.compareAndSet(false, true)) {
            if (this.c == null) {
                this.c = a();
            }
            return this.c;
        }
        return a();
    }

    public final void f(awj awjVar) {
        if (awjVar == this.c) {
            this.a.set(false);
        }
    }
}
