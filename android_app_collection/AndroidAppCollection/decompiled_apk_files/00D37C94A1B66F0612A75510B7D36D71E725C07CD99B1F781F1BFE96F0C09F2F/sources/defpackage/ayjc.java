package defpackage;

import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayjc  reason: default package */
/* loaded from: classes2.dex */
public final class ayjc implements Runnable {
    final /* synthetic */ ayjd a;
    private final /* synthetic */ int b;

    public ayjc(ayjd ayjdVar) {
        this.a = ayjdVar;
    }

    public ayjc(ayjd ayjdVar, int i) {
        this.b = i;
        this.a = ayjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            axyx a = this.a.c.a();
            try {
                ayjd ayjdVar = this.a;
                axyg c = ayjdVar.f.c(ayjdVar.d, ayjdVar.e);
                this.a.c.c(a);
                ayjd ayjdVar2 = this.a;
                synchronized (ayjdVar2) {
                    if (ayjdVar2.b == null) {
                        ayjdVar2.i(c);
                        ayjdVar2.h();
                    }
                }
                ayjd ayjdVar3 = this.a;
                ayjdVar3.f.c.o.execute(new ayjc(ayjdVar3));
                return;
            } catch (Throwable th) {
                this.a.c.c(a);
                throw th;
            }
        }
        ayjd ayjdVar4 = this.a;
        Collection collection = ayjdVar4.f.c.w;
        if (collection == null) {
            return;
        }
        collection.remove(ayjdVar4);
        if (!this.a.f.c.w.isEmpty()) {
            return;
        }
        ayji ayjiVar = this.a.f.c;
        ayjiVar.Q.c(ayjiVar.x, false);
        ayji ayjiVar2 = this.a.f.c;
        ayjiVar2.w = null;
        if (!ayjiVar2.A.get()) {
            return;
        }
        this.a.f.c.z.a(ayji.d);
    }
}
