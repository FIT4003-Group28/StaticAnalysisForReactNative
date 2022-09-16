package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ajqe  reason: default package */
/* loaded from: classes.dex */
final class ajqe {
    public final Map a;
    public final agd b = new agd();
    private final Map c;

    public ajqe(Map map, Map map2) {
        this.c = map;
        this.a = map2;
    }

    public final ajry a(Class cls) {
        int c = this.b.c(cls);
        if (c >= 0) {
            return (ajry) this.b.i(c);
        }
        if (!this.c.containsKey(cls)) {
            return null;
        }
        ajry ajryVar = (ajry) ((azqb) this.c.get(cls)).get();
        this.b.put(cls, ajryVar);
        return ajryVar;
    }
}
