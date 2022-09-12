package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzuq  reason: default package */
/* loaded from: classes6.dex */
public final class dzuq implements Serializable, dzup {
    public static final dzuq a = new dzuq();
    private static final long serialVersionUID = 0;

    private dzuq() {
    }

    private final Object readResolve() {
        return a;
    }

    @Override // defpackage.dzup
    public final <R> R fold(R r, dzvi<? super R, ? super dzum, ? extends R> dzviVar) {
        dzvx.c(dzviVar, "operation");
        return r;
    }

    @Override // defpackage.dzup
    public final <E extends dzum> E get(dzun<E> dzunVar) {
        dzvx.c(dzunVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.dzup
    public final dzup minusKey(dzun<?> dzunVar) {
        dzvx.c(dzunVar, "key");
        return this;
    }

    @Override // defpackage.dzup
    public final dzup plus(dzup dzupVar) {
        dzvx.c(dzupVar, "context");
        return dzupVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
