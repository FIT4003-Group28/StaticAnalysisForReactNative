package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: brn  reason: default package */
/* loaded from: classes4.dex */
public final class brn {
    public final Map<Class<?>, brm> a;

    public brn(brl brlVar) {
        this.a = Collections.unmodifiableMap(new HashMap(brlVar.a));
    }

    public final boolean a(Class<? extends brm> cls) {
        return this.a.containsKey(cls);
    }
}
