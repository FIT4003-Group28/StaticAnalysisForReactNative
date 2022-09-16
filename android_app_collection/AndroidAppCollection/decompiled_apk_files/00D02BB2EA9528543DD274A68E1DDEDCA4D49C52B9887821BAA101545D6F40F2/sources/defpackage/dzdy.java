package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzdy  reason: default package */
/* loaded from: classes6.dex */
final class dzdy<E> extends AtomicReference<dzdy<E>> {
    private static final long serialVersionUID = 2404266111789071508L;
    private E a;

    public dzdy() {
    }

    public final E a() {
        E e = this.a;
        this.a = null;
        return e;
    }

    public final dzdy<E> b() {
        return get();
    }

    public dzdy(E e) {
        this.a = e;
    }
}
