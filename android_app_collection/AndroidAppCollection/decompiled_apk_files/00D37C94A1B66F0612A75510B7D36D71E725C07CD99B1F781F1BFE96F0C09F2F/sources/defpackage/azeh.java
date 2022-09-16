package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azeh  reason: default package */
/* loaded from: classes2.dex */
public final class azeh extends AtomicReference implements aypg, aynw {
    private static final long serialVersionUID = -3434801548987643227L;
    final ayom a;

    public azeh(ayom ayomVar) {
        this.a = ayomVar;
    }

    @Override // defpackage.aynw
    public final void a(Object obj) {
        if (obj == null) {
            d(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else if (e()) {
        } else {
            this.a.c(obj);
        }
    }

    public final void c() {
        if (!e()) {
            try {
                this.a.sm();
            } finally {
                ayqi.c(this);
            }
        }
    }

    public final void d(Throwable th) {
        if (!e()) {
            try {
                this.a.b(th);
                return;
            } finally {
                ayqi.c(this);
            }
        }
        azqc.d(th);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) get());
    }

    public final void f(ayqa ayqaVar) {
        ayqi.f(this, new ayqg(ayqaVar));
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
