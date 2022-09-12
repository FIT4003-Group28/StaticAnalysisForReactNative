package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcck  reason: default package */
/* loaded from: classes5.dex */
final class dcck implements Serializable {
    private static final long serialVersionUID = 0;
    final dccr<?> a;

    public dcck(dccr<?> dccrVar) {
        this.a = dccrVar;
    }

    Object readResolve() {
        return this.a.v();
    }
}
