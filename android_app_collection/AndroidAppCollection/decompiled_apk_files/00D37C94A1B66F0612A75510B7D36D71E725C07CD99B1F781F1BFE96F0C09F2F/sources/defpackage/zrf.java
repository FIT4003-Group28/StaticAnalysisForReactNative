package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: zrf  reason: default package */
/* loaded from: classes4.dex */
public final class zrf {
    public zsy c;
    private final Executor d;
    public final Map a = new HashMap();
    public final Set b = new HashSet();
    private boolean e = true;

    public zrf(Executor executor) {
        executor.getClass();
        this.d = executor;
    }

    private final void g(final zri zriVar) {
        this.d.execute(new Runnable() { // from class: zre
            @Override // java.lang.Runnable
            public final void run() {
                zrf zrfVar = zrf.this;
                zri zriVar2 = zriVar;
                zsy zsyVar = zrfVar.c;
                if (zsyVar != null) {
                    String[] i = zsyVar.i();
                    synchronized (zrfVar) {
                        zrfVar.b.remove(zriVar2);
                        Set set = (Set) zrfVar.a.get(zriVar2);
                        if (set != null) {
                            Collections.addAll(set, i);
                        }
                        zrfVar.c();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(zri zriVar) {
        if (zriVar == null) {
            return;
        }
        if (!this.a.containsKey(zriVar)) {
            this.b.add(zriVar);
            this.a.put(zriVar, new HashSet());
        }
        g(zriVar);
    }

    public final synchronized void b(boolean z) {
        this.e = z;
        c();
    }

    public final synchronized void c() {
        if (!this.e) {
            return;
        }
        for (zri zriVar : this.a.keySet()) {
            if (!this.b.contains(zriVar)) {
                Set<String> set = (Set) this.a.get(zriVar);
                if (set != null) {
                    for (String str : set) {
                        zriVar.a(str);
                    }
                }
                this.a.put(zriVar, new HashSet());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(String str) {
        for (Set set : this.a.values()) {
            if (set != null) {
                set.add(str);
            }
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(zri zriVar) {
        if (zriVar == null) {
            return;
        }
        this.a.remove(zriVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(zsy zsyVar) {
        if (this.c != null) {
            zep.b("Only a single VideoEffectsFileManager is supported.");
        }
        zsyVar.getClass();
        this.c = zsyVar;
        for (zri zriVar : this.a.keySet()) {
            g(zriVar);
        }
    }
}
