package defpackage;

import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aluo  reason: default package */
/* loaded from: classes.dex */
final class aluo {
    public Integer a;
    private Map b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alup a() {
        c(Collections.unmodifiableMap(b()));
        Map map = this.b;
        if (map == null) {
            throw new IllegalStateException("Missing required properties: splitInstallErrorCodeByModule");
        }
        return new alup(this.a, map);
    }

    public final Map b() {
        Map map = this.b;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }

    public final void c(Map map) {
        if (map != null) {
            this.b = map;
            return;
        }
        throw new NullPointerException("Null splitInstallErrorCodeByModule");
    }
}
