package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azib  reason: default package */
/* loaded from: classes2.dex */
public final class azib extends azot implements ayql {
    static final azhs a = new azhz();
    final ayok b;
    final AtomicReference c;
    final azhs d;
    final ayok e;

    private azib(ayok ayokVar, ayok ayokVar2, AtomicReference atomicReference, azhs azhsVar) {
        this.e = ayokVar;
        this.b = ayokVar2;
        this.c = atomicReference;
        this.d = azhsVar;
    }

    public static azot b(ayok ayokVar, azhs azhsVar) {
        AtomicReference atomicReference = new AtomicReference();
        azib azibVar = new azib(new azhx(atomicReference, azhsVar), ayokVar, atomicReference, azhsVar);
        azqc.l();
        return azibVar;
    }

    public static azot c(ayok ayokVar) {
        return b(ayokVar, a);
    }

    @Override // defpackage.azot
    public final void a(ayqb ayqbVar) {
        azhw azhwVar;
        while (true) {
            azhwVar = (azhw) this.c.get();
            if (azhwVar != null && !azhwVar.e()) {
                break;
            }
            azhw azhwVar2 = new azhw(this.d.a());
            if (this.c.compareAndSet(azhwVar, azhwVar2)) {
                azhwVar = azhwVar2;
                break;
            }
        }
        boolean z = !azhwVar.f.get() && azhwVar.f.compareAndSet(false, true);
        try {
            ayqbVar.a(azhwVar);
            if (!z) {
                return;
            }
            this.b.az(azhwVar);
        } catch (Throwable th) {
            if (z) {
                azhwVar.f.compareAndSet(true, false);
            }
            bapv.j(th);
            throw azom.b(th);
        }
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        this.e.az(ayomVar);
    }

    @Override // defpackage.ayql
    public final void sr(aypg aypgVar) {
        this.c.compareAndSet((azhw) aypgVar, null);
    }
}
