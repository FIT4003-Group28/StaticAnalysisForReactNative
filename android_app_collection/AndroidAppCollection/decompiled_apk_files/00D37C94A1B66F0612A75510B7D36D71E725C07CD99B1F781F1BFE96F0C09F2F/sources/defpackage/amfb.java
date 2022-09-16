package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: amfb  reason: default package */
/* loaded from: classes.dex */
public final class amfb {
    public final amey a;
    public final SettableFuture d;
    public final AtomicLong b = new AtomicLong(b(CellularSignalStrengthError.ERROR_NOT_SUPPORTED, CellularSignalStrengthError.ERROR_NOT_SUPPORTED));
    public final AtomicReference c = new AtomicReference(null);
    private final AtomicReference e = new AtomicReference(null);
    private final Executor f = anlz.g(anjk.a);

    public amfb(aniq aniqVar, Executor executor) {
        SettableFuture f = SettableFuture.f();
        this.d = f;
        amey ameyVar = new amey(aniqVar, executor);
        this.a = ameyVar;
        f.qY(ameyVar, anjk.a);
    }

    public static int a(long j) {
        return (int) (j >>> 32);
    }

    public static long b(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final ankt c() {
        long j;
        final int a;
        ankt i;
        if (!this.d.isDone()) {
            do {
                j = this.b.get();
                a = a(j);
            } while (!this.b.compareAndSet(j, b(a, ((int) j) + 1)));
            final SettableFuture f = SettableFuture.f();
            ankt anktVar = (ankt) this.e.getAndSet(f);
            if (anktVar == null) {
                i = anlz.v(ammo.b(new aniq() { // from class: amev
                    @Override // defpackage.aniq
                    public final ankt a() {
                        return amfb.this.d(a);
                    }
                }), anjk.a);
            } else {
                i = anhq.i(anktVar, Throwable.class, ammo.c(new anir() { // from class: amew
                    @Override // defpackage.anir
                    public final ankt a(Object obj) {
                        Throwable th = (Throwable) obj;
                        return amfb.this.d(a);
                    }
                }), this.f);
            }
            f.lV(i);
            final amez amezVar = new amez(this, a);
            f.qY(new Runnable() { // from class: amex
                @Override // java.lang.Runnable
                public final void run() {
                    amfb amfbVar = amfb.this;
                    SettableFuture settableFuture = f;
                    amez amezVar2 = amezVar;
                    try {
                        amfbVar.d.o(anlz.y(settableFuture));
                        amezVar2.lV(amfbVar.d);
                    } catch (Throwable unused) {
                        amezVar2.lV(settableFuture);
                    }
                }
            }, anjk.a);
            return amezVar;
        }
        return this.d;
    }

    public final ankt d(int i) {
        amfa amfaVar;
        if (a(this.b.get()) > i) {
            return anlz.o();
        }
        amfa amfaVar2 = new amfa(i);
        do {
            amfaVar = (amfa) this.c.get();
            if (amfaVar != null && amfaVar.a > i) {
                return anlz.o();
            }
        } while (!this.c.compareAndSet(amfaVar, amfaVar2));
        if (a(this.b.get()) > i) {
            amfaVar2.cancel(true);
            this.c.compareAndSet(amfaVar2, null);
            return amfaVar2;
        }
        amey ameyVar = this.a;
        aniq aniqVar = ameyVar.a;
        Executor executor = ameyVar.b;
        if (aniqVar == null || executor == null) {
            amfaVar2.lV(this.d);
        } else {
            amfaVar2.lV(anlz.v(ammo.b(aniqVar), executor));
        }
        return amfaVar2;
    }

    public final boolean e() {
        return this.d.isDone();
    }
}
