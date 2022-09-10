package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: vtc  reason: default package */
/* loaded from: classes7.dex */
public final class vtc<T> extends btrh<T> {
    private final int d;

    public vtc(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            vtb vtbVar = (vtb) this.a;
            amqo amqoVar = (amqo) obj;
            vtbVar.x = amqoVar;
            synchronized (vtbVar.v) {
                for (WeakReference<vtw> weakReference : vtbVar.v) {
                    vtw vtwVar = weakReference.get();
                    if (vtwVar != null) {
                        vtwVar.f();
                    }
                }
            }
            if (!vtbVar.i.getNavigationParameters().Q() || amqoVar.a() == null) {
                return;
            }
            synchronized (vtbVar.o) {
                for (akte akteVar : vtbVar.o) {
                    akteVar.b(amqoVar.a());
                }
            }
            return;
        }
        vtb vtbVar2 = (vtb) this.a;
        amuj amujVar = (amuj) obj;
        vtbVar2.u = amujVar;
        synchronized (vtbVar2.v) {
            for (WeakReference<vtw> weakReference2 : vtbVar2.v) {
                vtw vtwVar2 = weakReference2.get();
                if (vtwVar2 != null) {
                    vtwVar2.c(amujVar);
                }
            }
        }
    }
}
