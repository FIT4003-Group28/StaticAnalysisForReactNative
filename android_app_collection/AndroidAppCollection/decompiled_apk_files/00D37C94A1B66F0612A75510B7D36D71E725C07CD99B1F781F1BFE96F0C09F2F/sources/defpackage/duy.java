package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: duy  reason: default package */
/* loaded from: classes3.dex */
public final class duy {
    private final Map a = new HashMap();

    public final AtomicReference a(String str) {
        synchronized (this) {
            if (!this.a.containsKey(str)) {
                this.a.put(str, new AtomicReference());
            }
        }
        return (AtomicReference) this.a.get(str);
    }
}
