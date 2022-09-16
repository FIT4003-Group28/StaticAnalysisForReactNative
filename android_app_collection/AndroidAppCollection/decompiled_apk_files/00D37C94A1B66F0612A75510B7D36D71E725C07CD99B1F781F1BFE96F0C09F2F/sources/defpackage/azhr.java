package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azhr  reason: default package */
/* loaded from: classes2.dex */
abstract class azhr extends AtomicReference implements azhv {
    private static final long serialVersionUID = 2346567790059478686L;
    azhu a;
    int b;

    public azhr() {
        azhu azhuVar = new azhu(null);
        this.a = azhuVar;
        set(azhuVar);
    }

    final void a(azhu azhuVar) {
        this.a.set(azhuVar);
        this.a = azhuVar;
        this.b++;
    }

    @Override // defpackage.azhv
    public final void b() {
        a(new azhu(azoq.a));
        f();
    }

    @Override // defpackage.azhv
    public final void c(Throwable th) {
        a(new azhu(azoq.b(th)));
        f();
    }

    @Override // defpackage.azhv
    public final void d(Object obj) {
        azoq azoqVar = azoq.a;
        a(new azhu(obj));
        g();
    }

    @Override // defpackage.azhv
    public final void e(azht azhtVar) {
        if (azhtVar.getAndIncrement() == 0) {
            int i = 1;
            do {
                azhu azhuVar = (azhu) azhtVar.c;
                if (azhuVar == null) {
                    azhuVar = (azhu) get();
                    azhtVar.c = azhuVar;
                }
                while (!azhtVar.d) {
                    azhu azhuVar2 = (azhu) azhuVar.get();
                    if (azhuVar2 != null) {
                        if (azoq.e(azhuVar2.a, azhtVar.b)) {
                            azhtVar.c = null;
                            return;
                        }
                        azhuVar = azhuVar2;
                    } else {
                        azhtVar.c = azhuVar;
                        i = azhtVar.addAndGet(-i);
                    }
                }
                azhtVar.c = null;
                return;
            } while (i != 0);
        }
    }

    final void f() {
        azhu azhuVar = (azhu) get();
        if (azhuVar.a != null) {
            azhu azhuVar2 = new azhu(null);
            azhuVar2.lazySet((azhu) azhuVar.get());
            set(azhuVar2);
        }
    }

    public abstract void g();
}
