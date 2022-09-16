package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azhx  reason: default package */
/* loaded from: classes2.dex */
public final class azhx implements ayok {
    private final AtomicReference a;
    private final azhs b;

    public azhx(AtomicReference atomicReference, azhs azhsVar) {
        this.a = atomicReference;
        this.b = azhsVar;
    }

    @Override // defpackage.ayok
    public final void az(ayom ayomVar) {
        azhw azhwVar;
        azht[] azhtVarArr;
        azht[] azhtVarArr2;
        while (true) {
            azhwVar = (azhw) this.a.get();
            if (azhwVar != null) {
                break;
            }
            azhw azhwVar2 = new azhw(this.b.a());
            if (this.a.compareAndSet(null, azhwVar2)) {
                azhwVar = azhwVar2;
                break;
            }
        }
        azht azhtVar = new azht(azhwVar, ayomVar);
        ayomVar.sj(azhtVar);
        do {
            azhtVarArr = (azht[]) azhwVar.e.get();
            if (azhtVarArr == azhw.b) {
                break;
            }
            int length = azhtVarArr.length;
            azhtVarArr2 = new azht[length + 1];
            System.arraycopy(azhtVarArr, 0, azhtVarArr2, 0, length);
            azhtVarArr2[length] = azhtVar;
        } while (!azhwVar.e.compareAndSet(azhtVarArr, azhtVarArr2));
        if (azhtVar.d) {
            azhwVar.f(azhtVar);
        } else {
            azhwVar.c.e(azhtVar);
        }
    }
}
