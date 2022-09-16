package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: aznx  reason: default package */
/* loaded from: classes2.dex */
public abstract class aznx extends AtomicLong implements ayoa, bamf {
    private static final long serialVersionUID = 7917814472626990048L;
    protected final bame b;
    protected bamf c;
    protected Object d;
    protected long e;

    public aznx(bame bameVar) {
        this.b = bameVar;
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.c, bamfVar)) {
            this.c = bamfVar;
            this.b.f(this);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        this.c.si();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        long j2;
        if (azof.h(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (!compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        return;
                    }
                    this.b.c(this.d);
                    this.b.sm();
                    return;
                }
            } while (!compareAndSet(j2, ayno.c(j2, j)));
            this.c.sp(j);
        }
    }
}
