package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: ayqi  reason: default package */
/* loaded from: classes2.dex */
public final class ayqi extends Enum implements aypg {
    public static final ayqi a;
    private static final /* synthetic */ ayqi[] b;

    static {
        ayqi ayqiVar = new ayqi();
        a = ayqiVar;
        b = new ayqi[]{ayqiVar};
    }

    private ayqi() {
    }

    public static void a() {
        azqc.d(new aypr("Disposable already set!"));
    }

    public static boolean c(AtomicReference atomicReference) {
        aypg aypgVar;
        aypg aypgVar2 = (aypg) atomicReference.get();
        ayqi ayqiVar = a;
        if (aypgVar2 == ayqiVar || (aypgVar = (aypg) atomicReference.getAndSet(ayqiVar)) == ayqiVar) {
            return false;
        }
        if (aypgVar == null) {
            return true;
        }
        aypgVar.qr();
        return true;
    }

    public static boolean d(aypg aypgVar) {
        return aypgVar == a;
    }

    public static boolean f(AtomicReference atomicReference, aypg aypgVar) {
        aypg aypgVar2;
        do {
            aypgVar2 = (aypg) atomicReference.get();
            if (aypgVar2 == a) {
                if (aypgVar == null) {
                    return false;
                }
                aypgVar.qr();
                return false;
            }
        } while (!atomicReference.compareAndSet(aypgVar2, aypgVar));
        if (aypgVar2 != null) {
            aypgVar2.qr();
            return true;
        }
        return true;
    }

    public static boolean g(AtomicReference atomicReference, aypg aypgVar) {
        ayrd.b(aypgVar, "d is null");
        if (!atomicReference.compareAndSet(null, aypgVar)) {
            aypgVar.qr();
            if (atomicReference.get() == a) {
                return false;
            }
            a();
            return false;
        }
        return true;
    }

    public static boolean h(aypg aypgVar, aypg aypgVar2) {
        if (aypgVar2 == null) {
            azqc.d(new NullPointerException("next is null"));
            return false;
        } else if (aypgVar == null) {
            return true;
        } else {
            aypgVar2.qr();
            a();
            return false;
        }
    }

    public static void i(AtomicReference atomicReference, aypg aypgVar) {
        aypg aypgVar2;
        do {
            aypgVar2 = (aypg) atomicReference.get();
            if (aypgVar2 == a) {
                if (aypgVar == null) {
                    return;
                }
                aypgVar.qr();
                return;
            }
        } while (!atomicReference.compareAndSet(aypgVar2, aypgVar));
    }

    public static void j(AtomicReference atomicReference, aypg aypgVar) {
        if (atomicReference.compareAndSet(null, aypgVar) || atomicReference.get() != a) {
            return;
        }
        aypgVar.qr();
    }

    public static ayqi[] values() {
        return (ayqi[]) b.clone();
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return true;
    }

    @Override // defpackage.aypg
    public final void qr() {
    }
}
