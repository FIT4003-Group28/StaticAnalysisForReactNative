package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
/* compiled from: PG */
/* renamed from: eni  reason: default package */
/* loaded from: classes3.dex */
abstract class eni implements enn {
    protected final azqb a;
    private final int b;
    private final boolean c;
    private final boolean d;
    private final String e;
    private final Set f = new HashSet();
    private final amsa g = amtu.g(16);
    private final ReferenceQueue h = new ReferenceQueue();
    private final Queue i = new ArrayDeque();

    public eni(azqb azqbVar, int i, boolean z, boolean z2, String str) {
        this.a = azqbVar;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = str;
    }

    private final void g() {
        if (!this.c) {
            return;
        }
        Reference poll = this.h.poll();
        while (poll != null) {
            if (poll instanceof WeakReference) {
                this.i.add((WeakReference) poll);
            }
            poll = this.h.poll();
        }
    }

    protected abstract int a();

    @Override // defpackage.enn
    public void b(eno enoVar) {
        if (this.c) {
            this.g.remove(enoVar);
        }
        if (this.d) {
            this.f.add(enoVar);
        }
    }

    @Override // defpackage.enn
    public void c(List list) {
        if (!this.c) {
            return;
        }
        g();
        for (WeakReference weakReference : this.i) {
            eno enoVar = (eno) this.g.a().get(weakReference);
            if (enoVar != null) {
                list.add(enoVar);
            }
        }
        this.i.clear();
    }

    @Override // defpackage.enn
    public void d(eno enoVar, String str, Object obj, boolean z) {
        WeakReference weakReference;
        if (z) {
            return;
        }
        if (this.c && ((weakReference = (WeakReference) this.g.get(enoVar)) == null || weakReference.get() != obj)) {
            if (obj != null) {
                this.g.put(enoVar, new WeakReference(obj, this.h));
                if (weakReference != null) {
                    ((vpg) ((akvm) this.a.get()).c.get()).b(amps.d(str), this.e);
                }
            } else if (weakReference != null) {
                this.g.remove(enoVar);
                ((vpg) ((akvm) this.a.get()).d.get()).b(amps.d(str), this.e);
            }
        }
        if (!this.d) {
            return;
        }
        this.f.remove(enoVar);
    }

    @Override // defpackage.enn
    public final boolean e() {
        g();
        return (this.b != 0 && a() > this.b) || (this.i.isEmpty() ^ true);
    }

    @Override // defpackage.enn
    public final boolean f(eno enoVar) {
        if (!this.d) {
            return false;
        }
        return this.f.contains(enoVar);
    }
}
