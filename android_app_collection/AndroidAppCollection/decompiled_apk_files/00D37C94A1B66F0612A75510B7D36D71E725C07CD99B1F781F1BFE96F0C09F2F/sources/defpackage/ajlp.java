package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
@Deprecated
/* renamed from: ajlp  reason: default package */
/* loaded from: classes.dex */
public final class ajlp {
    private final AtomicReference a;

    public ajlp(aysm aysmVar) {
        AtomicReference atomicReference = new AtomicReference();
        this.a = atomicReference;
        atomicReference.set(aysmVar);
    }

    public final boolean a() {
        return this.a.get() == null;
    }

    public final aysm b() {
        aysm aysmVar = (aysm) this.a.getAndSet(null);
        if (aysmVar != null) {
            return aysmVar;
        }
        throw new ted("ElementCallback was already consumed");
    }
}
