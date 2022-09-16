package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: anyp  reason: default package */
/* loaded from: classes.dex */
public final class anyp {
    private final String a;
    private Map b = null;

    public anyp(String str) {
        this.a = str;
    }

    public final anyq a() {
        Map unmodifiableMap;
        String str = this.a;
        Map map = this.b;
        if (map == null) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new HashMap(map));
        }
        return new anyq(str, unmodifiableMap);
    }

    public final void b(Annotation annotation) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.put(anyz.class, annotation);
    }
}
