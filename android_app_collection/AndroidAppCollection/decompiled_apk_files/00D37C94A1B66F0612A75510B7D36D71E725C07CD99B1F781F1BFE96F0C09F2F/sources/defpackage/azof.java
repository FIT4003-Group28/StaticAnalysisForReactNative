package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: azof  reason: default package */
/* loaded from: classes2.dex */
public final class azof extends Enum implements bamf {
    public static final azof a;
    private static final /* synthetic */ azof[] b;

    static {
        azof azofVar = new azof();
        a = azofVar;
        b = new azof[]{azofVar};
    }

    private azof() {
    }

    public static void a(AtomicReference atomicReference, AtomicLong atomicLong, long j) {
        bamf bamfVar = (bamf) atomicReference.get();
        if (bamfVar != null) {
            bamfVar.sp(j);
        } else if (!h(j)) {
        } else {
            ayno.a(atomicLong, j);
            bamf bamfVar2 = (bamf) atomicReference.get();
            if (bamfVar2 == null) {
                return;
            }
            long andSet = atomicLong.getAndSet(0L);
            if (andSet == 0) {
                return;
            }
            bamfVar2.sp(andSet);
        }
    }

    public static void b(long j) {
        StringBuilder sb = new StringBuilder(50);
        sb.append("More produced than requested: ");
        sb.append(j);
        azqc.d(new aypr(sb.toString()));
    }

    public static void d() {
        azqc.d(new aypr("Subscription already set!"));
    }

    public static boolean f(AtomicReference atomicReference) {
        bamf bamfVar;
        bamf bamfVar2 = (bamf) atomicReference.get();
        azof azofVar = a;
        if (bamfVar2 == azofVar || (bamfVar = (bamf) atomicReference.getAndSet(azofVar)) == azofVar) {
            return false;
        }
        if (bamfVar == null) {
            return true;
        }
        bamfVar.si();
        return true;
    }

    public static boolean g(AtomicReference atomicReference, bamf bamfVar) {
        ayrd.b(bamfVar, "s is null");
        if (!atomicReference.compareAndSet(null, bamfVar)) {
            bamfVar.si();
            if (atomicReference.get() == a) {
                return false;
            }
            d();
            return false;
        }
        return true;
    }

    public static boolean h(long j) {
        if (j <= 0) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("n > 0 required but it was ");
            sb.append(j);
            azqc.d(new IllegalArgumentException(sb.toString()));
            return false;
        }
        return true;
    }

    public static boolean i(bamf bamfVar, bamf bamfVar2) {
        if (bamfVar2 == null) {
            azqc.d(new NullPointerException("next is null"));
            return false;
        } else if (bamfVar == null) {
            return true;
        } else {
            bamfVar2.si();
            d();
            return false;
        }
    }

    public static void j(AtomicReference atomicReference, AtomicLong atomicLong, bamf bamfVar) {
        if (g(atomicReference, bamfVar)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet == 0) {
                return;
            }
            bamfVar.sp(andSet);
        }
    }

    public static void k(AtomicReference atomicReference, bamf bamfVar, long j) {
        if (g(atomicReference, bamfVar)) {
            bamfVar.sp(j);
        }
    }

    public static azof[] values() {
        return (azof[]) b.clone();
    }

    @Override // defpackage.bamf
    public final void si() {
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
    }
}
