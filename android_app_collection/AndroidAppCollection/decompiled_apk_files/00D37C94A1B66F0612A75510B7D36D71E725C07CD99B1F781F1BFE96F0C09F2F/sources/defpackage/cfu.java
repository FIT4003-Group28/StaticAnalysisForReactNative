package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cfu  reason: default package */
/* loaded from: classes2.dex */
public final class cfu {
    public final Map a;

    public cfu() {
        this.a = new HashMap();
    }

    public final boolean a(Class cls) {
        return this.a.containsKey(cls);
    }

    public cfu(cfu cfuVar, byte[] bArr) {
        this.a = Collections.unmodifiableMap(new HashMap(cfuVar.a));
    }
}
