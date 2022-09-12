package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: debm  reason: default package */
/* loaded from: classes6.dex */
final class debm extends dcbn {
    Set<Map.Entry> a;
    Collection<Collection> b;
    final /* synthetic */ Map c;
    final /* synthetic */ debn d;

    public debm(debn debnVar, Map map) {
        this.d = debnVar;
        this.c = map;
    }

    @Override // defpackage.dcbn, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.c;
    }

    @Override // defpackage.dcbn
    protected final Map c() {
        return this.c;
    }

    @Override // defpackage.dcbn, java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // defpackage.dcbn, java.util.Map
    public final Set<Map.Entry> entrySet() {
        Set<Map.Entry> set = this.a;
        if (set == null) {
            debe debeVar = new debe(this.c.entrySet());
            this.a = debeVar;
            return debeVar;
        }
        return set;
    }

    @Override // defpackage.dcbn, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        try {
            Collection f = this.d.f(obj);
            if (!f.isEmpty()) {
                return f;
            }
            return null;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // defpackage.dcbn, java.util.Map
    public final Collection<Collection> values() {
        Collection<Collection> collection = this.b;
        if (collection == null) {
            debg debgVar = new debg(this.c.values(), entrySet());
            this.b = debgVar;
            return debgVar;
        }
        return collection;
    }
}
