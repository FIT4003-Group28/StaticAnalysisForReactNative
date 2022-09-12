package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: coap  reason: default package */
/* loaded from: classes5.dex */
public final class coap<K, V> {
    public final Map<K, V> a = Collections.synchronizedMap(new HashMap());

    public final V a(K k) {
        return this.a.get(k);
    }
}
