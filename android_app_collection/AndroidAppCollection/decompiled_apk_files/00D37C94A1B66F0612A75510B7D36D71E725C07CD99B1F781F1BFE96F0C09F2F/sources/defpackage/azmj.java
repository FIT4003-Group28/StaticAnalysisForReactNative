package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azmj  reason: default package */
/* loaded from: classes2.dex */
public final class azmj implements ayrm {
    private final AtomicReference a = new AtomicReference();
    private final AtomicReference b = new AtomicReference();

    public azmj() {
        azmi azmiVar = new azmi();
        e(azmiVar);
        b(azmiVar);
    }

    final azmi a() {
        return (azmi) this.a.get();
    }

    final azmi b(azmi azmiVar) {
        return (azmi) this.a.getAndSet(azmiVar);
    }

    @Override // defpackage.ayrn
    public final void d() {
        while (sl() != null && !j()) {
        }
    }

    final void e(azmi azmiVar) {
        this.b.lazySet(azmiVar);
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return ((azmi) this.b.get()) == a();
    }

    @Override // defpackage.ayrn
    public final boolean k(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        azmi azmiVar = new azmi(obj);
        b(azmiVar).lazySet(azmiVar);
        return true;
    }

    @Override // defpackage.ayrm, defpackage.ayrn
    public final Object sl() {
        azmi a;
        azmi azmiVar = (azmi) this.b.get();
        azmi a2 = azmiVar.a();
        if (a2 != null) {
            Object b = a2.b();
            e(a2);
            return b;
        } else if (azmiVar == a()) {
            return null;
        } else {
            do {
                a = azmiVar.a();
            } while (a == null);
            Object b2 = a.b();
            e(a);
            return b2;
        }
    }
}
