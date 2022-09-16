package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azmg  reason: default package */
/* loaded from: classes2.dex */
public final class azmg extends AtomicReference implements ayot {
    private static final long serialVersionUID = 3323743579927613702L;
    final azmf a;
    final int b;

    public azmg(azmf azmfVar, int i) {
        this.a = azmfVar;
        this.b = i;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.a.a(th, this.b);
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        azmf azmfVar = this.a;
        azmfVar.d[this.b] = obj;
        if (azmfVar.decrementAndGet() == 0) {
            try {
                Object a = azmfVar.b.a(azmfVar.d);
                ayrd.b(a, "The zipper returned a null value");
                azmfVar.a.sh(a);
            } catch (Throwable th) {
                bapv.j(th);
                azmfVar.a.b(th);
            }
        }
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }
}
