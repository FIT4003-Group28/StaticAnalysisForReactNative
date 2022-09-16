package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: acuh  reason: default package */
/* loaded from: classes.dex */
public final class acuh {
    protected final Map a = DesugarCollections.synchronizedMap(new WeakHashMap());

    public final void a(aoqu aoquVar) {
        this.a.put(aoquVar, true);
    }

    public final boolean b(aoqu aoquVar) {
        return this.a.containsKey(aoquVar);
    }
}
