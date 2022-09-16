package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azoe  reason: default package */
/* loaded from: classes2.dex */
public class azoe extends AtomicInteger implements bamf {
    private static final long serialVersionUID = -2189523197179400958L;
    public bamf f;
    public long g;
    public final AtomicReference h = new AtomicReference();
    final AtomicLong i = new AtomicLong();
    public final AtomicLong j = new AtomicLong();
    public volatile boolean k;
    protected boolean l;

    public final void d() {
        if (getAndIncrement() != 0) {
            return;
        }
        g();
    }

    public final void g() {
        int i = 1;
        bamf bamfVar = null;
        long j = 0;
        do {
            bamf bamfVar2 = (bamf) this.h.get();
            if (bamfVar2 != null) {
                bamfVar2 = (bamf) this.h.getAndSet(null);
            }
            long j2 = this.i.get();
            if (j2 != 0) {
                j2 = this.i.getAndSet(0L);
            }
            long j3 = this.j.get();
            if (j3 != 0) {
                j3 = this.j.getAndSet(0L);
            }
            bamf bamfVar3 = this.f;
            if (this.k) {
                if (bamfVar3 != null) {
                    bamfVar3.si();
                    this.f = null;
                }
                if (bamfVar2 != null) {
                    bamfVar2.si();
                }
            } else {
                long j4 = this.g;
                if (j4 != Long.MAX_VALUE) {
                    j4 = ayno.c(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        j4 -= j3;
                        if (j4 < 0) {
                            azof.b(j4);
                            j4 = 0;
                        }
                    }
                    this.g = j4;
                }
                if (bamfVar2 != null) {
                    this.f = bamfVar2;
                    if (j4 != 0) {
                        j = ayno.c(j, j4);
                        bamfVar = bamfVar2;
                    }
                } else if (bamfVar3 != null && j2 != 0) {
                    j = ayno.c(j, j2);
                    bamfVar = bamfVar3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            bamfVar.sp(j);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        if (!this.k) {
            this.k = true;
            d();
        }
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (!azof.h(j) || this.l) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            ayno.a(this.i, j);
            d();
            return;
        }
        long j2 = this.g;
        if (j2 != Long.MAX_VALUE) {
            long c = ayno.c(j2, j);
            this.g = c;
            if (c == Long.MAX_VALUE) {
                this.l = true;
            }
        }
        bamf bamfVar = this.f;
        if (decrementAndGet() != 0) {
            g();
        }
        if (bamfVar == null) {
            return;
        }
        bamfVar.sp(j);
    }
}
