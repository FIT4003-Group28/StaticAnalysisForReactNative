package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anyf  reason: default package */
/* loaded from: classes.dex */
public final class anyf implements aoaf {
    private volatile Set b = null;
    private volatile Set a = Collections.newSetFromMap(new ConcurrentHashMap());

    public anyf(Collection collection) {
        this.a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static anyf b(Collection collection) {
        return new anyf((Set) collection);
    }

    private final synchronized void d() {
        for (aoaf aoafVar : this.a) {
            this.b.add(aoafVar.a());
        }
        this.a = null;
    }

    @Override // defpackage.aoaf
    public final /* bridge */ /* synthetic */ Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(aoaf aoafVar) {
        if (this.b == null) {
            this.a.add(aoafVar);
        } else {
            this.b.add(aoafVar.a());
        }
    }
}
