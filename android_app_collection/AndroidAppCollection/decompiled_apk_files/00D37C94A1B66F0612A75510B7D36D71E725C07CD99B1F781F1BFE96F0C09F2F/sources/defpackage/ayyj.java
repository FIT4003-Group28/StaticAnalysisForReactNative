package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayyj  reason: default package */
/* loaded from: classes2.dex */
public final class ayyj extends aypt implements ayql {
    final bamd b;
    final int c;
    final AtomicReference d = new AtomicReference();

    public ayyj(bamd bamdVar, int i) {
        this.b = bamdVar;
        this.c = i;
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        ayyi ayyiVar;
        ayyh[] ayyhVarArr;
        ayyh[] ayyhVarArr2;
        do {
            ayyiVar = (ayyi) this.d.get();
            if (ayyiVar != null) {
                break;
            }
            ayyiVar = new ayyi(this.d, this.c);
        } while (!this.d.compareAndSet(null, ayyiVar));
        ayyh ayyhVar = new ayyh(bameVar, ayyiVar);
        bameVar.f(ayyhVar);
        do {
            ayyhVarArr = (ayyh[]) ayyiVar.f.get();
            if (ayyhVarArr == ayyi.b) {
                Throwable th = ayyiVar.k;
                if (th != null) {
                    bameVar.b(th);
                    return;
                } else {
                    bameVar.sm();
                    return;
                }
            }
            int length = ayyhVarArr.length;
            ayyhVarArr2 = new ayyh[length + 1];
            System.arraycopy(ayyhVarArr, 0, ayyhVarArr2, 0, length);
            ayyhVarArr2[length] = ayyhVar;
        } while (!ayyiVar.f.compareAndSet(ayyhVarArr, ayyhVarArr2));
        if (ayyhVar.a()) {
            ayyiVar.g(ayyhVar);
        } else {
            ayyiVar.d();
        }
    }

    @Override // defpackage.aypt
    public final void ar(ayqb ayqbVar) {
        ayyi ayyiVar;
        while (true) {
            ayyiVar = (ayyi) this.d.get();
            if (ayyiVar != null && !ayyiVar.e()) {
                break;
            }
            ayyi ayyiVar2 = new ayyi(this.d, this.c);
            if (this.d.compareAndSet(ayyiVar, ayyiVar2)) {
                ayyiVar = ayyiVar2;
                break;
            }
        }
        boolean z = true;
        if (ayyiVar.e.get() || !ayyiVar.e.compareAndSet(false, true)) {
            z = false;
        }
        try {
            ayqbVar.a(ayyiVar);
            if (!z) {
                return;
            }
            this.b.ad(ayyiVar);
        } catch (Throwable th) {
            bapv.j(th);
            throw azom.b(th);
        }
    }

    @Override // defpackage.ayql
    public final void sr(aypg aypgVar) {
        this.d.compareAndSet((ayyi) aypgVar, null);
    }
}
