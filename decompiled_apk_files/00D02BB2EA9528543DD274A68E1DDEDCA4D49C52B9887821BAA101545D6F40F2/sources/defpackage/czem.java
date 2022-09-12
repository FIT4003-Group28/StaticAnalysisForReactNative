package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: czem  reason: default package */
/* loaded from: classes5.dex */
final class czem {
    static final czem a = new czem(cygo.b);
    private final cygo b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public czem(cygo cygoVar) {
        this.b = cygoVar;
    }

    public final void a(cygn cygnVar) {
        if (this.c.compareAndSet(false, true)) {
            this.b.a(cygnVar);
        }
    }
}
