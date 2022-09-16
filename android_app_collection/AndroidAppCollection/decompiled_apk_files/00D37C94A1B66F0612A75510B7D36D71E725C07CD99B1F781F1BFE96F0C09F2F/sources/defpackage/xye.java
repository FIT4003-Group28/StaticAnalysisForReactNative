package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: xye  reason: default package */
/* loaded from: classes4.dex */
public final class xye {
    public final Map a = DesugarCollections.synchronizedMap(new WeakHashMap());
    public final Map b = DesugarCollections.synchronizedMap(new WeakHashMap());

    public final boolean a(aqbx aqbxVar) {
        return this.a.get(aqbxVar) == null && aqbxVar.i.size() > 0;
    }
}
