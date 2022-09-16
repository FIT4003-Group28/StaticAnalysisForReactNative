package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azhk  reason: default package */
/* loaded from: classes2.dex */
public final class azhk extends azot implements ayql {
    final ayok a;
    final AtomicReference b = new AtomicReference();

    public azhk(ayok ayokVar) {
        this.a = ayokVar;
    }

    @Override // defpackage.azot
    public final void a(ayqb ayqbVar) {
        azhj azhjVar;
        while (true) {
            azhjVar = (azhj) this.b.get();
            if (azhjVar != null && !azhjVar.e()) {
                break;
            }
            azhj azhjVar2 = new azhj(this.b);
            if (this.b.compareAndSet(azhjVar, azhjVar2)) {
                azhjVar = azhjVar2;
                break;
            }
        }
        boolean z = true;
        if (azhjVar.c.get() || !azhjVar.c.compareAndSet(false, true)) {
            z = false;
        }
        try {
            ayqbVar.a(azhjVar);
            if (!z) {
                return;
            }
            this.a.az(azhjVar);
        } catch (Throwable th) {
            bapv.j(th);
            throw azom.b(th);
        }
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        azhj azhjVar;
        azhi[] azhiVarArr;
        azhi[] azhiVarArr2;
        do {
            azhjVar = (azhj) this.b.get();
            if (azhjVar != null) {
                break;
            }
            azhjVar = new azhj(this.b);
        } while (!this.b.compareAndSet(null, azhjVar));
        azhi azhiVar = new azhi(ayomVar, azhjVar);
        ayomVar.sj(azhiVar);
        do {
            azhiVarArr = (azhi[]) azhjVar.get();
            if (azhiVarArr == azhj.b) {
                Throwable th = azhjVar.f;
                if (th != null) {
                    ayomVar.b(th);
                    return;
                } else {
                    ayomVar.sm();
                    return;
                }
            }
            int length = azhiVarArr.length;
            azhiVarArr2 = new azhi[length + 1];
            System.arraycopy(azhiVarArr, 0, azhiVarArr2, 0, length);
            azhiVarArr2[length] = azhiVar;
        } while (!azhjVar.compareAndSet(azhiVarArr, azhiVarArr2));
        if (azhiVar.e()) {
            azhjVar.f(azhiVar);
        }
    }

    @Override // defpackage.ayql
    public final void sr(aypg aypgVar) {
        this.b.compareAndSet((azhj) aypgVar, null);
    }
}
