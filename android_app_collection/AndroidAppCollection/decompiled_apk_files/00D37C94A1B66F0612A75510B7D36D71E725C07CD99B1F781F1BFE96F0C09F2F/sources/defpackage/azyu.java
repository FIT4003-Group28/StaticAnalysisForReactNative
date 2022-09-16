package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: PG */
/* renamed from: azyu  reason: default package */
/* loaded from: classes2.dex */
public final class azyu {
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    public final aztu b = ayme.f(null);
    public final azts c = ayme.g();
    public final azts d = ayme.g();
    public final azts e = ayme.g();

    private final azyq g(azyq azyqVar) {
        if (azyqVar.h.e() == 1) {
            this.e.b();
        }
        if (a() == 127) {
            return azyqVar;
        }
        int i = this.c.a & 127;
        while (this.a.get(i) != null) {
            Thread.yield();
        }
        this.a.lazySet(i, azyqVar);
        this.c.b();
        return null;
    }

    public final int a() {
        return this.c.a - this.d.a;
    }

    public final long b(azyu azyuVar, boolean z) {
        azyq azyqVar;
        do {
            azyqVar = (azyq) azyuVar.b.a;
            if (azyqVar == null) {
                return -2L;
            }
            if (z && azyqVar.h.e() != 1) {
                return -2L;
            }
            long j = azyt.a;
            long nanoTime = System.nanoTime() - azyqVar.g;
            if (nanoTime < azyt.a) {
                return azyt.a - nanoTime;
            }
        } while (!azyuVar.b.c(azyqVar, null));
        c(azyqVar, false);
        return -1L;
    }

    public final azyq c(azyq azyqVar, boolean z) {
        if (z) {
            return g(azyqVar);
        }
        azyq azyqVar2 = (azyq) this.b.a(azyqVar);
        if (azyqVar2 != null) {
            return g(azyqVar2);
        }
        return null;
    }

    public final azyq d() {
        azyq azyqVar = (azyq) this.b.a(null);
        return azyqVar == null ? e() : azyqVar;
    }

    public final azyq e() {
        azyq azyqVar;
        while (true) {
            int i = this.d.a;
            if (i - this.c.a == 0) {
                return null;
            }
            int i2 = i & 127;
            if (this.d.c(i, i + 1) && (azyqVar = (azyq) this.a.getAndSet(i2, null)) != null) {
                if (azyqVar.h.e() == 1) {
                    this.e.a();
                    boolean z = azuy.a;
                }
                return azyqVar;
            }
        }
    }
}
