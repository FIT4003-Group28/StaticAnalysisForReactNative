package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: PG */
/* renamed from: azmk  reason: default package */
/* loaded from: classes2.dex */
public final class azmk extends AtomicReferenceArray implements ayrm {
    private static final Integer f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final int a;
    final AtomicLong b;
    long c;
    final AtomicLong d;
    final int e;

    public azmk(int i) {
        super(azos.c(i));
        this.a = length() - 1;
        this.b = new AtomicLong();
        this.d = new AtomicLong();
        this.e = Math.min(i / 4, f.intValue());
    }

    @Override // defpackage.ayrn
    public final void d() {
        while (true) {
            if (sl() == null && j()) {
                return;
            }
        }
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return this.b.get() == this.d.get();
    }

    @Override // defpackage.ayrn
    public final boolean k(Object obj) {
        if (obj != null) {
            int i = this.a;
            long j = this.b.get();
            int i2 = ((int) j) & i;
            if (j >= this.c) {
                long j2 = this.e + j;
                if (get(i & ((int) j2)) == null) {
                    this.c = j2;
                } else if (get(i2) != null) {
                    return false;
                }
            }
            lazySet(i2, obj);
            this.b.lazySet(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // defpackage.ayrm, defpackage.ayrn
    public final Object sl() {
        long j = this.d.get();
        int i = ((int) j) & this.a;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        this.d.lazySet(j + 1);
        lazySet(i, null);
        return obj;
    }
}
