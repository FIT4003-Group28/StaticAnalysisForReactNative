package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cusw  reason: default package */
/* loaded from: classes5.dex */
public final class cusw extends cuss<cusv> {
    public int b;
    private final Set<cusu<?>> c = new HashSet();
    public final Map<cuss<?>, Object> a = new HashMap();

    private <T> cusw(Collection<cuss<T>> collection) {
        for (cuss<T> cussVar : collection) {
            this.c.add(p(cussVar));
            this.a.put(cussVar, null);
        }
    }

    public static cusw d(cuss<?>... cussVarArr) {
        return new cusw(cussVarArr);
    }

    public static <T> cusw e(Collection<cuss<T>> collection) {
        return new cusw(collection);
    }

    private final synchronized void n() {
        this.b = this.c.size();
        for (cusu<?> cusuVar : this.c) {
            cusuVar.a();
        }
    }

    private final synchronized void o() {
        this.b = -1;
        i();
        for (cusu<?> cusuVar : this.c) {
            cusuVar.b();
        }
    }

    private final <T> cusu<T> p(cuss<T> cussVar) {
        return new cusu<>(this, cussVar);
    }

    @Override // defpackage.cuss
    protected final synchronized void b() {
        n();
    }

    @Override // defpackage.cuss
    protected final synchronized void c() {
        o();
    }

    private cusw(cuss<?>... cussVarArr) {
        for (cuss<?> cussVar : cussVarArr) {
            this.c.add(p(cussVar));
            this.a.put(cussVar, null);
        }
    }
}
