package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azpc  reason: default package */
/* loaded from: classes2.dex */
public final class azpc extends AtomicLong implements bamf {
    private static final long serialVersionUID = 3562861878281475070L;
    final bame a;
    final azpd b;

    public azpc(bame bameVar, azpd azpdVar) {
        this.a = bameVar;
        this.b = azpdVar;
    }

    @Override // defpackage.bamf
    public final void si() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.b.as(this);
        }
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.b(this, j);
        }
    }
}
