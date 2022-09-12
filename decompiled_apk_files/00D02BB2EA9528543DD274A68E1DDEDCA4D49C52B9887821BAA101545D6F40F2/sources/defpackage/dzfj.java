package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: dzfj  reason: default package */
/* loaded from: classes6.dex */
public final class dzfj extends Enum<dzfj> implements eavm {
    public static final dzfj a;
    private static final /* synthetic */ dzfj[] b;

    static {
        dzfj dzfjVar = new dzfj();
        a = dzfjVar;
        b = new dzfj[]{dzfjVar};
    }

    private dzfj() {
    }

    public static boolean b(eavm eavmVar, eavm eavmVar2) {
        if (eavmVar2 == null) {
            dzfy.a(new NullPointerException("next is null"));
            return false;
        } else if (eavmVar == null) {
            return true;
        } else {
            eavmVar2.SS();
            c();
            return false;
        }
    }

    public static void c() {
        dzfy.a(new dzav("Subscription already set!"));
    }

    public static boolean d(long j) {
        if (j <= 0) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("n > 0 required but it was ");
            sb.append(j);
            dzfy.a(new IllegalArgumentException(sb.toString()));
            return false;
        }
        return true;
    }

    public static boolean e(AtomicReference<eavm> atomicReference, eavm eavmVar) {
        dzbm.a(eavmVar, "s is null");
        if (!atomicReference.compareAndSet(null, eavmVar)) {
            eavmVar.SS();
            if (atomicReference.get() == a) {
                return false;
            }
            c();
            return false;
        }
        return true;
    }

    public static void f(AtomicReference<eavm> atomicReference) {
        eavm andSet;
        eavm eavmVar = atomicReference.get();
        dzfj dzfjVar = a;
        if (eavmVar == dzfjVar || (andSet = atomicReference.getAndSet(dzfjVar)) == dzfjVar || andSet == null) {
            return;
        }
        andSet.SS();
    }

    public static dzfj[] values() {
        return (dzfj[]) b.clone();
    }

    @Override // defpackage.eavm
    public final void SS() {
    }

    @Override // defpackage.eavm
    public final void a(long j) {
    }
}
