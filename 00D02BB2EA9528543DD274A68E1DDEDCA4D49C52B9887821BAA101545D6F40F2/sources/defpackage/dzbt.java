package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzbt  reason: default package */
/* loaded from: classes6.dex */
public final class dzbt extends AtomicReference<dzak> implements dyzq, dzak, dzaz {
    private static final long serialVersionUID = -4361286194466301354L;
    final dzaz<? super Throwable> a;
    final dzax b;

    public dzbt(dzax dzaxVar) {
        this.a = this;
        this.b = dzaxVar;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        dzbd.e(this);
    }

    @Override // defpackage.dzaz
    public final /* bridge */ /* synthetic */ void SR(Object obj) {
        dzfy.a(new dzau((Throwable) obj));
    }

    @Override // defpackage.dyzq
    public final void a(dzak dzakVar) {
        dzbd.b(this, dzakVar);
    }

    @Override // defpackage.dyzq
    public final void b() {
        try {
            this.b.a();
        } catch (Throwable th) {
            dzas.a(th);
            dzfy.a(th);
        }
        lazySet(dzbd.a);
    }

    @Override // defpackage.dyzq
    public final void c(Throwable th) {
        try {
            this.a.SR(th);
        } catch (Throwable th2) {
            dzas.a(th2);
            dzfy.a(th2);
        }
        lazySet(dzbd.a);
    }

    public dzbt(dzaz<? super Throwable> dzazVar, dzax dzaxVar) {
        this.a = dzazVar;
        this.b = dzaxVar;
    }
}
