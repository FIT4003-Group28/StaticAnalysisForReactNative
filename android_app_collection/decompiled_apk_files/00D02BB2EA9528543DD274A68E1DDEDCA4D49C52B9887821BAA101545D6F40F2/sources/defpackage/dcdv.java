package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcdv  reason: default package */
/* loaded from: classes5.dex */
final class dcdv<V> implements Serializable {
    private static final long serialVersionUID = 0;
    final dcdn<?, V> a;

    public dcdv(dcdn<?, V> dcdnVar) {
        this.a = dcdnVar;
    }

    Object readResolve() {
        return this.a.values();
    }
}
