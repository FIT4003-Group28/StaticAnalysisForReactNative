package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cmky  reason: default package */
/* loaded from: classes5.dex */
public final class cmky {
    private final Map<String, String> a = new HashMap();
    private Map<String, String> b;

    public final synchronized Map<String, String> a() {
        if (this.b == null) {
            this.b = Collections.unmodifiableMap(new HashMap(this.a));
        }
        return this.b;
    }
}
