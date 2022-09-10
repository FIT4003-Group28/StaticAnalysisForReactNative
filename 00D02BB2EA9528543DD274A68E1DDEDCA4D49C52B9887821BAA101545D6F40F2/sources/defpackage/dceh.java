package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dceh  reason: default package */
/* loaded from: classes5.dex */
final class dceh<E> implements Serializable {
    final dcei<E> a;

    public dceh(dcei<E> dceiVar) {
        this.a = dceiVar;
    }

    Object readResolve() {
        return this.a.l();
    }
}
