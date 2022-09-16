package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: ocz  reason: default package */
/* loaded from: classes3.dex */
public final class ocz {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;

    public final void a(ocy ocyVar) {
        this.a.add(ocyVar);
    }

    public final void b(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        for (ocy ocyVar : this.a) {
            ocyVar.pm(!this.b);
        }
    }

    public final boolean c() {
        return !this.b;
    }
}
