package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: pfd  reason: default package */
/* loaded from: classes7.dex */
public final class pfd extends Enum<pfd> implements pfg {
    public static final pfd a;
    private static final /* synthetic */ pfd[] b;

    static {
        pfd pfdVar = new pfd();
        a = pfdVar;
        b = new pfd[]{pfdVar};
    }

    private pfd() {
    }

    public static void c(AtomicReference<pfg> atomicReference) {
        pfg andSet;
        pfg pfgVar = atomicReference.get();
        pfd pfdVar = a;
        if (pfgVar == pfdVar || (andSet = atomicReference.getAndSet(pfdVar)) == pfdVar || andSet == null) {
            return;
        }
        andSet.a();
    }

    public static pfd[] values() {
        return (pfd[]) b.clone();
    }

    @Override // defpackage.pfg
    public final void a() {
    }

    @Override // defpackage.pfg
    public final boolean b() {
        return true;
    }
}
