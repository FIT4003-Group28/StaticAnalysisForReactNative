package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azpr  reason: default package */
/* loaded from: classes2.dex */
public final class azpr extends AtomicInteger implements aypg {
    private static final long serialVersionUID = 466549804534799122L;
    final ayom a;
    final azpt b;
    Object c;
    volatile boolean d;

    public azpr(ayom ayomVar, azpt azptVar) {
        this.a = ayomVar;
        this.b = azptVar;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (!this.d) {
            this.d = true;
            this.b.aI(this);
        }
    }
}
