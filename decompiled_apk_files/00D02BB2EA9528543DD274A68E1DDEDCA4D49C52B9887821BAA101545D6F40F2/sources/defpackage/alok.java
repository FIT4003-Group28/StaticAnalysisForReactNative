package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: alok  reason: default package */
/* loaded from: classes.dex */
public final class alok {
    public final dcka<akti, aloj> a = dccg.O();
    public final Set<akti> b = new HashSet();
    public final Map<akti, amia> c = new HashMap();
    public final dclb<akti> d = dcci.n();

    public final synchronized boolean a(akti aktiVar) {
        return this.d.contains(aktiVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(akti aktiVar) {
        this.b.add(aktiVar);
        amia remove = this.c.remove(aktiVar);
        this.d.h(aktiVar);
        if (remove != null) {
            throw null;
        }
    }

    public final synchronized boolean c(akti aktiVar) {
        boolean z;
        if (this.c.get(aktiVar) != null) {
            if (this.d.contains(null)) {
                z = true;
            }
        }
        z = false;
        return z;
    }
}
