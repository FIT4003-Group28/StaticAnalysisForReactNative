package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayyn  reason: default package */
/* loaded from: classes2.dex */
class ayyn extends AtomicReference {
    private static final long serialVersionUID = 2346567790059478686L;
    ayyp a;
    int b;
    long c;

    public ayyn() {
        ayyp ayypVar = new ayyp(null, 0L);
        this.a = ayypVar;
        set(ayypVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ayyp ayypVar) {
        this.a.set(ayypVar);
        this.a = ayypVar;
        this.b++;
    }

    public final void b(ayyo ayyoVar) {
        ayyp ayypVar;
        synchronized (ayyoVar) {
            if (ayyoVar.e) {
                ayyoVar.f = true;
                return;
            }
            ayyoVar.e = true;
            while (!ayyoVar.e()) {
                long j = ayyoVar.get();
                Object obj = ayyoVar.c;
                ayyp ayypVar2 = obj;
                if (obj == null) {
                    ayyp ayypVar3 = (ayyp) get();
                    ayyoVar.c = ayypVar3;
                    ayno.a(ayyoVar.d, ayypVar3.b);
                    ayypVar2 = ayypVar3;
                }
                long j2 = j;
                long j3 = 0;
                ayyp ayypVar4 = ayypVar2;
                while (j2 != 0 && (ayypVar = (ayyp) ((ayyp) ayypVar4).get()) != null) {
                    Object obj2 = ayypVar.a;
                    try {
                        bame bameVar = ayyoVar.b;
                        if (obj2 != azoq.a) {
                            if (!(obj2 instanceof azoo)) {
                                bameVar.c(obj2);
                                j3++;
                                j2--;
                                if (ayyoVar.e()) {
                                    ayyoVar.c = null;
                                    return;
                                }
                                ayypVar4 = ayypVar;
                            } else {
                                bameVar.b(((azoo) obj2).a);
                            }
                        } else {
                            bameVar.sm();
                        }
                        ayyoVar.c = null;
                        return;
                    } catch (Throwable th) {
                        bapv.j(th);
                        ayyoVar.c = null;
                        ayyoVar.qr();
                        if (azoq.h(obj2) || azoq.g(obj2)) {
                            return;
                        }
                        ayyoVar.b.b(th);
                        return;
                    }
                }
                if (j3 != 0) {
                    ayyoVar.c = ayypVar4;
                    if (j != Long.MAX_VALUE) {
                        ayno.f(ayyoVar, j3);
                    }
                }
                synchronized (ayyoVar) {
                    if (ayyoVar.f) {
                        ayyoVar.f = false;
                    } else {
                        ayyoVar.e = false;
                        return;
                    }
                }
            }
            ayyoVar.c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        ayyp ayypVar = (ayyp) get();
        if (ayypVar.a != null) {
            ayyp ayypVar2 = new ayyp(null, 0L);
            ayypVar2.lazySet((ayyp) ayypVar.get());
            set(ayypVar2);
        }
    }

    public void d() {
    }
}
