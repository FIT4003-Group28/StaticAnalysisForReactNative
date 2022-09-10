package defpackage;

import java.io.Serializable;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: dcfb  reason: default package */
/* loaded from: classes5.dex */
final class dcfb<E> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<? super E> a;
    final Object[] b;

    public dcfb(Comparator<? super E> comparator, Object[] objArr) {
        this.a = comparator;
        this.b = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    Object readResolve() {
        dcfa dcfaVar = new dcfa(this.a);
        dcfaVar.l(this.b);
        return dcfaVar.f();
    }
}
