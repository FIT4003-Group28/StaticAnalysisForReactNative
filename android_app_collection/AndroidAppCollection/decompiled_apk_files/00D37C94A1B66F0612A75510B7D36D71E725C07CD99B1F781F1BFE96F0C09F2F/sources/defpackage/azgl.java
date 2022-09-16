package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: azgl  reason: default package */
/* loaded from: classes2.dex */
public final class azgl extends AtomicInteger implements ayom, aypg {
    static final Object a = new Object();
    private static final long serialVersionUID = -3688291656102519502L;
    final ayom b;
    final ayqe c;
    final int d;
    aypg f;
    final AtomicBoolean g = new AtomicBoolean();
    final Map e = new ConcurrentHashMap();

    public azgl(ayom ayomVar, ayqe ayqeVar, int i) {
        this.b = ayomVar;
        this.c = ayqeVar;
        this.d = i;
        lazySet(1);
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        ArrayList arrayList = new ArrayList(this.e.values());
        this.e.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            azgm azgmVar = ((azou) arrayList.get(i)).b;
            azgmVar.e = th;
            azgmVar.d = true;
            azgmVar.a();
        }
        this.b.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        try {
            Object a2 = this.c.a(obj);
            Object obj2 = a2 != null ? a2 : a;
            azou azouVar = (azou) this.e.get(obj2);
            if (azouVar == null) {
                if (this.g.get()) {
                    return;
                }
                azouVar = new azou(a2, new azgm(this.d, this, a2));
                this.e.put(obj2, azouVar);
                getAndIncrement();
                this.b.c(azouVar);
            }
            try {
                ayrd.b(obj, "The value supplied is null");
                azgm azgmVar = azouVar.b;
                azgmVar.b.k(obj);
                azgmVar.a();
            } catch (Throwable th) {
                bapv.j(th);
                this.f.qr();
                b(th);
            }
        } catch (Throwable th2) {
            bapv.j(th2);
            this.f.qr();
            b(th2);
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.g.get();
    }

    public final void f(Object obj) {
        if (obj == null) {
            obj = a;
        }
        this.e.remove(obj);
        if (decrementAndGet() == 0) {
            this.f.qr();
        }
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (!this.g.compareAndSet(false, true) || decrementAndGet() != 0) {
            return;
        }
        this.f.qr();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.f, aypgVar)) {
            this.f = aypgVar;
            this.b.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        ArrayList arrayList = new ArrayList(this.e.values());
        this.e.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            azgm azgmVar = ((azou) arrayList.get(i)).b;
            azgmVar.d = true;
            azgmVar.a();
        }
        this.b.sm();
    }
}
