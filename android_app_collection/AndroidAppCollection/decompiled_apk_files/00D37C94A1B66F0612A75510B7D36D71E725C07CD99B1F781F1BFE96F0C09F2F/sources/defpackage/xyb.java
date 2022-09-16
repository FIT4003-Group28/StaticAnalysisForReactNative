package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: xyb  reason: default package */
/* loaded from: classes4.dex */
public final class xyb {
    public final Map a = DesugarCollections.synchronizedMap(new WeakHashMap());
    private final Map b = DesugarCollections.synchronizedMap(new WeakHashMap());

    public final List a(aqbm aqbmVar) {
        if (aqbmVar == null) {
            return amuk.q();
        }
        amuk amukVar = (amuk) this.b.get(aqbmVar);
        return amukVar != null ? amukVar : aqbmVar.d;
    }

    public final void b(aqbm aqbmVar, amuk amukVar) {
        this.b.put(aqbmVar, amukVar);
    }
}
