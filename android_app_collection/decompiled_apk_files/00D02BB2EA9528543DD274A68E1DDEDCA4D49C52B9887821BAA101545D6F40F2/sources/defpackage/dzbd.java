package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: dzbd  reason: default package */
/* loaded from: classes6.dex */
public final class dzbd extends Enum<dzbd> implements dzak {
    public static final dzbd a;
    private static final /* synthetic */ dzbd[] b;

    static {
        dzbd dzbdVar = new dzbd();
        a = dzbdVar;
        b = new dzbd[]{dzbdVar};
    }

    private dzbd() {
    }

    public static boolean b(AtomicReference<dzak> atomicReference, dzak dzakVar) {
        dzbm.a(dzakVar, "d is null");
        if (!atomicReference.compareAndSet(null, dzakVar)) {
            dzakVar.SQ();
            if (atomicReference.get() == a) {
                return false;
            }
            d();
            return false;
        }
        return true;
    }

    public static boolean c(dzak dzakVar, dzak dzakVar2) {
        if (dzakVar2 == null) {
            dzfy.a(new NullPointerException("next is null"));
            return false;
        } else if (dzakVar == null) {
            return true;
        } else {
            dzakVar2.SQ();
            d();
            return false;
        }
    }

    public static void d() {
        dzfy.a(new dzav("Disposable already set!"));
    }

    public static void e(AtomicReference<dzak> atomicReference) {
        dzak andSet;
        dzak dzakVar = atomicReference.get();
        dzbd dzbdVar = a;
        if (dzakVar == dzbdVar || (andSet = atomicReference.getAndSet(dzbdVar)) == dzbdVar || andSet == null) {
            return;
        }
        andSet.SQ();
    }

    public static void f(AtomicReference<dzak> atomicReference, dzak dzakVar) {
        dzak dzakVar2;
        do {
            dzakVar2 = atomicReference.get();
            if (dzakVar2 == a) {
                if (dzakVar == null) {
                    return;
                }
                dzakVar.SQ();
                return;
            }
        } while (!atomicReference.compareAndSet(dzakVar2, dzakVar));
    }

    public static dzbd[] values() {
        return (dzbd[]) b.clone();
    }

    @Override // defpackage.dzak
    public final void SQ() {
    }
}
