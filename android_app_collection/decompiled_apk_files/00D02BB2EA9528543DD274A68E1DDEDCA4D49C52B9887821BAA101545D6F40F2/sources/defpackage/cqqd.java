package defpackage;

import java.lang.ref.WeakReference;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqqd  reason: default package */
/* loaded from: classes.dex */
public final class cqqd<K> extends WeakReference<K> implements cqqb<K> {
    public final Map<?, ?> a;
    private final int b;

    public cqqd(K k, Map<?, ?> map) {
        super(k, cqqe.a);
        this.b = System.identityHashCode(k);
        this.a = map;
    }

    public final boolean equals(@dzsi Object obj) {
        return this == obj || ((obj instanceof cqqb) && cqqe.a(this, (cqqb) obj));
    }

    public final int hashCode() {
        return this.b;
    }
}
