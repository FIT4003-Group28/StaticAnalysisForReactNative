package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayyg  reason: default package */
/* loaded from: classes2.dex */
public final class ayyg extends aypt {
    public final aynx b;
    final AtomicReference c;
    public final int d;
    final bamd e;

    public ayyg(bamd bamdVar, aynx aynxVar, AtomicReference atomicReference, int i) {
        this.e = bamdVar;
        this.b = aynxVar;
        this.c = atomicReference;
        this.d = i;
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        this.e.ad(bameVar);
    }

    @Override // defpackage.aypt
    public final void ar(ayqb ayqbVar) {
        ayyf ayyfVar;
        while (true) {
            ayyfVar = (ayyf) this.c.get();
            if (ayyfVar != null && !ayyfVar.e()) {
                break;
            }
            ayyf ayyfVar2 = new ayyf(this.c, this.d);
            if (this.c.compareAndSet(ayyfVar, ayyfVar2)) {
                ayyfVar = ayyfVar2;
                break;
            }
        }
        boolean z = true;
        if (ayyfVar.f.get() || !ayyfVar.f.compareAndSet(false, true)) {
            z = false;
        }
        try {
            ayqbVar.a(ayyfVar);
            if (!z) {
                return;
            }
            this.b.ac(ayyfVar);
        } catch (Throwable th) {
            bapv.j(th);
            throw azom.b(th);
        }
    }
}
