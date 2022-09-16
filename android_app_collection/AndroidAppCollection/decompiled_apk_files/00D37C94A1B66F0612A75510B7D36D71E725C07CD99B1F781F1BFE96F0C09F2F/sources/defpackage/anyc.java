package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anyc  reason: default package */
/* loaded from: classes.dex */
public final class anyc implements anzh, anzg {
    private final Executor c;
    private final Map b = new HashMap();
    public Queue a = new ArrayDeque();

    public anyc(Executor executor) {
        this.c = executor;
    }

    public final synchronized Set a(anze anzeVar) {
        Map map;
        map = (Map) this.b.get(anzeVar.a());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    @Override // defpackage.anzh
    public final void b(Class cls, anzf anzfVar) {
        c(cls, this.c, anzfVar);
    }

    @Override // defpackage.anzh
    public final synchronized void c(Class cls, Executor executor, anzf anzfVar) {
        anzk.c(anzfVar);
        anzk.c(executor);
        if (!this.b.containsKey(cls)) {
            this.b.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.b.get(cls)).put(anzfVar, executor);
    }
}
