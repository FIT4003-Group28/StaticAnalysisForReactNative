package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcdr  reason: default package */
/* loaded from: classes5.dex */
final class dcdr<K> implements Serializable {
    private static final long serialVersionUID = 0;
    final dcdn<K, ?> a;

    public dcdr(dcdn<K, ?> dcdnVar) {
        this.a = dcdnVar;
    }

    Object readResolve() {
        return this.a.keySet();
    }
}
