package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayuy  reason: default package */
/* loaded from: classes2.dex */
final class ayuy extends AtomicReference implements Runnable, aypg {
    private static final long serialVersionUID = 6812032969491025141L;
    final Object a;
    final long b;
    final ayuz c;
    final AtomicBoolean d = new AtomicBoolean();

    public ayuy(Object obj, long j, ayuz ayuzVar) {
        this.a = obj;
        this.b = j;
        this.c = ayuzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (this.d.compareAndSet(false, true)) {
            ayuz ayuzVar = this.c;
            long j = this.b;
            Object obj = this.a;
            if (j != ayuzVar.g) {
                return;
            }
            if (ayuzVar.get() == 0) {
                ayuzVar.si();
                ayuzVar.a.b(new aypp("Could not deliver value due to lack of requests"));
                return;
            }
            ayuzVar.a.c(obj);
            ayno.e(ayuzVar, 1L);
            ayqi.c(this);
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == ayqi.a;
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a();
    }
}
