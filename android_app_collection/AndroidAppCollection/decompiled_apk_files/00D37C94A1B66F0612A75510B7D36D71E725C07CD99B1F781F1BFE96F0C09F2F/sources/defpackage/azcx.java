package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azcx  reason: default package */
/* loaded from: classes2.dex */
public final class azcx extends AtomicReference implements ayod {
    private static final long serialVersionUID = 3323743579927613702L;
    final azcw a;
    final int b;

    public azcx(azcw azcwVar, int i) {
        this.a = azcwVar;
        this.b = i;
    }

    @Override // defpackage.ayod
    public final void b(Throwable th) {
        this.a.c(th, this.b);
    }

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        azcw azcwVar = this.a;
        azcwVar.d[this.b] = obj;
        if (azcwVar.decrementAndGet() == 0) {
            try {
                Object a = azcwVar.b.a(azcwVar.d);
                ayrd.b(a, "The zipper returned a null value");
                azcwVar.a.sh(a);
            } catch (Throwable th) {
                bapv.j(th);
                azcwVar.a.b(th);
            }
        }
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }

    @Override // defpackage.ayod
    public final void sm() {
        azcw azcwVar = this.a;
        int i = this.b;
        if (azcwVar.getAndSet(0) > 0) {
            azcwVar.a(i);
            azcwVar.a.sm();
        }
    }
}
