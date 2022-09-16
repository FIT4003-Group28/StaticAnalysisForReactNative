package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcdo  reason: default package */
/* loaded from: classes5.dex */
final class dcdo<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final dcdn<K, V> a;

    public dcdo(dcdn<K, V> dcdnVar) {
        this.a = dcdnVar;
    }

    Object readResolve() {
        return this.a.entrySet();
    }
}
