package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: xyd  reason: default package */
/* loaded from: classes4.dex */
public final class xyd {
    private final Map a = DesugarCollections.synchronizedMap(new WeakHashMap());
    private final Map b = DesugarCollections.synchronizedMap(new WeakHashMap());
    private final Map c = DesugarCollections.synchronizedMap(new WeakHashMap());

    public final aqav a(aqav aqavVar) {
        if (!this.c.containsKey(aqavVar)) {
            aqax aqaxVar = aqavVar.E;
            if (aqaxVar == null) {
                aqaxVar = aqax.a;
            }
            if (aqaxVar.b != 62285947) {
                return null;
            }
            aqax aqaxVar2 = aqavVar.E;
            if (aqaxVar2 == null) {
                aqaxVar2 = aqax.a;
            }
            return aqaxVar2.b == 62285947 ? (aqav) aqaxVar2.c : aqav.a;
        }
        return (aqav) this.c.get(aqavVar);
    }

    public final void b(aqav aqavVar) {
        this.b.put(aqavVar, true);
    }

    public final void c(aqav aqavVar, aqav aqavVar2) {
        this.c.put(aqavVar, aqavVar2);
    }

    public final void d(aqav aqavVar, boolean z) {
        this.a.put(aqavVar, Boolean.valueOf(z));
    }

    public final boolean e(aqav aqavVar) {
        Boolean bool = (Boolean) this.a.get(aqavVar);
        return bool == null ? aqavVar.N : bool.booleanValue();
    }

    public final boolean f(aqav aqavVar) {
        return this.b.get(aqavVar) == null && aqavVar.G.size() > 0;
    }
}
