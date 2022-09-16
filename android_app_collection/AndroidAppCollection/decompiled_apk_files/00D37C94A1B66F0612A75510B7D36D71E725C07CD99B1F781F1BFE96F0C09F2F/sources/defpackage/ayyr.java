package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayyr  reason: default package */
/* loaded from: classes2.dex */
public final class ayyr implements bamd {
    private final AtomicReference a;
    private final Callable b;

    public ayyr(AtomicReference atomicReference, Callable callable) {
        this.a = atomicReference;
        this.b = callable;
    }

    @Override // defpackage.bamd
    public final void ad(bame bameVar) {
        ayys ayysVar;
        ayyo[] ayyoVarArr;
        ayyo[] ayyoVarArr2;
        while (true) {
            ayysVar = (ayys) this.a.get();
            if (ayysVar != null) {
                break;
            }
            try {
                ayys ayysVar2 = new ayys((ayyn) this.b.call());
                if (this.a.compareAndSet(null, ayysVar2)) {
                    ayysVar = ayysVar2;
                    break;
                }
            } catch (Throwable th) {
                bapv.j(th);
                azoc.f(th, bameVar);
                return;
            }
        }
        ayyo ayyoVar = new ayyo(ayysVar, bameVar);
        bameVar.f(ayyoVar);
        do {
            ayyoVarArr = (ayyo[]) ayysVar.d.get();
            if (ayyoVarArr == ayys.b) {
                break;
            }
            int length = ayyoVarArr.length;
            ayyoVarArr2 = new ayyo[length + 1];
            System.arraycopy(ayyoVarArr, 0, ayyoVarArr2, 0, length);
            ayyoVarArr2[length] = ayyoVar;
        } while (!ayysVar.d.compareAndSet(ayyoVarArr, ayyoVarArr2));
        if (ayyoVar.e()) {
            ayysVar.g(ayyoVar);
            return;
        }
        ayysVar.d();
        ayysVar.i.b(ayyoVar);
    }
}
