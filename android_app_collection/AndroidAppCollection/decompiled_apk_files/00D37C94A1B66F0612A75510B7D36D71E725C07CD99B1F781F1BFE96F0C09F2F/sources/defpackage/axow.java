package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: axow  reason: default package */
/* loaded from: classes2.dex */
public final class axow extends axor {
    public static final azqb b = axov.a(Collections.emptyMap());

    public axow(Map map) {
        super(map);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final Map get() {
        LinkedHashMap l = awwc.l(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            l.put(entry.getKey(), ((azqb) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(l);
    }
}
