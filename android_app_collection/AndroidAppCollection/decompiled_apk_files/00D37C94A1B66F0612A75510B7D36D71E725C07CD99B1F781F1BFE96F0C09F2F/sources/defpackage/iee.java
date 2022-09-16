package defpackage;

import android.util.SparseBooleanArray;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: iee  reason: default package */
/* loaded from: classes3.dex */
public final class iee {
    public final SparseBooleanArray a = new SparseBooleanArray();
    private final airr b;
    private final Optional c;
    private final aadd d;
    private int e;
    private final ich f;

    public iee(airr airrVar, Optional optional, ich ichVar, aadd aaddVar) {
        this.b = airrVar;
        this.c = optional;
        this.f = ichVar;
        this.d = aaddVar;
    }

    private final boolean e() {
        return !this.c.isPresent() || ((fdu) this.c.get()).b == fdq.REEL;
    }

    public final int a() {
        int i;
        int i2;
        if (!e()) {
            return 0;
        }
        this.b.a();
        synchronized (this.a) {
            do {
                i = this.e + 1;
                this.e = i;
                if (i == Integer.MAX_VALUE) {
                    this.e = 1;
                    i = 1;
                }
            } while (this.a.get(i));
            this.a.put(this.e, true);
            i2 = this.e;
        }
        return i2;
    }

    public final int b() {
        auld auldVar = this.d.a().u;
        if (auldVar == null) {
            auldVar = auld.a;
        }
        aull aullVar = auldVar.d;
        if (aullVar == null) {
            aullVar = aull.a;
        }
        if (!aullVar.E || !((Boolean) this.f.a.a().map(iob.b).orElse(false)).booleanValue()) {
            return a();
        }
        return 0;
    }

    public final void c(int i) {
        synchronized (this.a) {
            if (i != 0) {
                if (this.a.get(i)) {
                    this.a.delete(i);
                    if (this.a.size() == 0 && e()) {
                        this.b.b();
                    }
                }
            }
        }
    }

    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            z = this.a.size() > 0;
        }
        return z;
    }
}
