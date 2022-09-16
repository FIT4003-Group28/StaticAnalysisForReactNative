package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aysm  reason: default package */
/* loaded from: classes2.dex */
public final class aysm extends AtomicReference implements aypg {
    private static final long serialVersionUID = -2467358622224974244L;
    final ayns a;

    public aysm(ayns aynsVar) {
        this.a = aynsVar;
    }

    public final void a() {
        aypg aypgVar;
        if (get() == ayqi.a || (aypgVar = (aypg) getAndSet(ayqi.a)) == ayqi.a) {
            return;
        }
        try {
            this.a.sm();
            if (aypgVar == null) {
                return;
            }
            aypgVar.qr();
        } catch (Throwable th) {
            if (aypgVar != null) {
                aypgVar.qr();
            }
            throw th;
        }
    }

    public final void c(Throwable th) {
        aypg aypgVar;
        Throwable nullPointerException = th == null ? new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.") : th;
        if (get() == ayqi.a || (aypgVar = (aypg) getAndSet(ayqi.a)) == ayqi.a) {
            azqc.d(th);
            return;
        }
        try {
            this.a.b(nullPointerException);
            if (aypgVar == null) {
                return;
            }
            aypgVar.qr();
        } catch (Throwable th2) {
            if (aypgVar != null) {
                aypgVar.qr();
            }
            throw th2;
        }
    }

    public final void d(ayqa ayqaVar) {
        ayqi.f(this, new ayqg(ayqaVar));
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) get());
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
    }
}
