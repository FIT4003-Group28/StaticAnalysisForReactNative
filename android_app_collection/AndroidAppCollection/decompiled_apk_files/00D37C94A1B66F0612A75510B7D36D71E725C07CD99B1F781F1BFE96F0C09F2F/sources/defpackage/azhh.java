package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azhh  reason: default package */
/* loaded from: classes2.dex */
public final class azhh extends azot {
    public final ayok a;
    final AtomicReference b;
    final ayok c;

    public azhh(ayok ayokVar, ayok ayokVar2, AtomicReference atomicReference) {
        this.c = ayokVar;
        this.a = ayokVar2;
        this.b = atomicReference;
    }

    @Override // defpackage.azot
    public final void a(ayqb ayqbVar) {
        azhf azhfVar;
        while (true) {
            azhfVar = (azhf) this.b.get();
            if (azhfVar != null && !azhfVar.e()) {
                break;
            }
            azhf azhfVar2 = new azhf(this.b);
            if (this.b.compareAndSet(azhfVar, azhfVar2)) {
                azhfVar = azhfVar2;
                break;
            }
        }
        boolean z = true;
        if (azhfVar.e.get() || !azhfVar.e.compareAndSet(false, true)) {
            z = false;
        }
        try {
            ayqbVar.a(azhfVar);
            if (!z) {
                return;
            }
            this.a.az(azhfVar);
        } catch (Throwable th) {
            bapv.j(th);
            throw azom.b(th);
        }
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        this.c.az(ayomVar);
    }
}
