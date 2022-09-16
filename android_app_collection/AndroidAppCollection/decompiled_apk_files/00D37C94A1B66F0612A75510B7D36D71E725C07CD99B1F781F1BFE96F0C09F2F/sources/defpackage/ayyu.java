package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayyu  reason: default package */
/* loaded from: classes2.dex */
public final class ayyu extends aypt implements ayql {
    final aynx b;
    final AtomicReference c;
    final Callable d;
    final bamd e;

    public ayyu(bamd bamdVar, aynx aynxVar, AtomicReference atomicReference, Callable callable) {
        this.e = bamdVar;
        this.b = aynxVar;
        this.c = atomicReference;
        this.d = callable;
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        this.e.ad(bameVar);
    }

    @Override // defpackage.aypt
    public final void ar(ayqb ayqbVar) {
        ayys ayysVar;
        while (true) {
            ayysVar = (ayys) this.c.get();
            if (ayysVar != null && !ayysVar.e()) {
                break;
            }
            try {
                ayys ayysVar2 = new ayys((ayyn) this.d.call());
                if (this.c.compareAndSet(ayysVar, ayysVar2)) {
                    ayysVar = ayysVar2;
                    break;
                }
            } finally {
                bapv.j(th);
                RuntimeException b = azom.b(th);
            }
        }
        boolean z = !ayysVar.e.get() && ayysVar.e.compareAndSet(false, true);
        try {
            ayqbVar.a(ayysVar);
            if (!z) {
                return;
            }
            this.b.ac(ayysVar);
        } catch (Throwable th) {
            if (z) {
                ayysVar.e.compareAndSet(true, false);
            }
            throw azom.b(th);
        }
    }

    @Override // defpackage.ayql
    public final void sr(aypg aypgVar) {
        this.c.compareAndSet((ayys) aypgVar, null);
    }
}
