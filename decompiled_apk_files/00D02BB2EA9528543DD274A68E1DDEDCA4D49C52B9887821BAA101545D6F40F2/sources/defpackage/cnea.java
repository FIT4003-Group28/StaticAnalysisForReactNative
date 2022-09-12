package defpackage;

import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cnea  reason: default package */
/* loaded from: classes5.dex */
public final class cnea extends cmxs {
    private volatile boolean a;
    private volatile int b;
    private final Set<cnac> c = new LinkedHashSet();
    private final cojb d = new cojb(Looper.getMainLooper());

    @Override // defpackage.cmxt
    public final synchronized void b(final int i) {
        if (!this.a) {
            this.a = true;
            this.b = i;
            for (final cnac cnacVar : this.c) {
                this.d.post(new Runnable(cnacVar, i) { // from class: cndy
                    private final cnac a;
                    private final int b;

                    {
                        this.a = cnacVar;
                        this.b = i;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b(this.b);
                    }
                });
            }
        }
    }

    @Override // defpackage.cmxt
    public final synchronized void c() {
        if (this.a) {
            this.a = false;
            for (final cnac cnacVar : this.c) {
                cojb cojbVar = this.d;
                cnacVar.getClass();
                cojbVar.post(new Runnable(cnacVar) { // from class: cndz
                    private final cnac a;

                    {
                        this.a = cnacVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.c();
                    }
                });
            }
        }
    }

    @Override // defpackage.cmxt
    public final synchronized void d() {
        c();
    }

    public final synchronized void e(cnac cnacVar) {
        if (!this.c.add(cnacVar) || !this.a) {
            return;
        }
        cnacVar.b(this.b);
    }

    public final synchronized void f(cnac cnacVar) {
        this.c.remove(cnacVar);
    }

    public final synchronized void g() {
        this.c.clear();
    }
}
