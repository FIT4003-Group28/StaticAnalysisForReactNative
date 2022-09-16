package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ath  reason: default package */
/* loaded from: classes2.dex */
public final class ath {
    private final Map a = new HashMap();
    private Map b;

    public final synchronized Map a() {
        if (this.b == null) {
            this.b = Collections.unmodifiableMap(new HashMap(this.a));
        }
        return this.b;
    }

    public final synchronized void b() {
        this.b = null;
        this.a.clear();
    }

    public final synchronized void c(String str, String str2) {
        this.b = null;
        this.a.put(str, str2);
    }
}
