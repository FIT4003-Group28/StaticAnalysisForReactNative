package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ghc  reason: default package */
/* loaded from: classes3.dex */
public final class ghc implements ajzh {
    private final Map a;

    public ghc() {
        this(null);
    }

    private static Object c(Object obj) {
        if (obj instanceof atpl) {
            return new ghb(obj.getClass(), ((atpl) obj).f.I());
        }
        if (obj instanceof arkf) {
            return new ghb(obj.getClass(), ((arkf) obj).m.I());
        }
        return obj instanceof atou ? new ghb(obj.getClass(), ((atou) obj).g.I()) : obj;
    }

    public final ampq a(Object obj) {
        return ampq.i(this.a.remove(c(obj)));
    }

    public final void b(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        this.a.put(c(obj), obj2);
    }

    @Override // defpackage.ajzh
    public final akam pn() {
        return new gha(amup.j(this.a));
    }

    public ghc(akam akamVar) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        if (akamVar instanceof gha) {
            hashMap.putAll(((gha) akamVar).a);
        }
    }
}
