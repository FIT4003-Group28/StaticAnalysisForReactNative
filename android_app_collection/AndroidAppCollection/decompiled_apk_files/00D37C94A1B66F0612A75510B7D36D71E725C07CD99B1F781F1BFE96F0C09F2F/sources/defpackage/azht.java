package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azht  reason: default package */
/* loaded from: classes2.dex */
public final class azht extends AtomicInteger implements aypg {
    private static final long serialVersionUID = 2728361546769921047L;
    final azhw a;
    final ayom b;
    Object c;
    volatile boolean d;

    public azht(azhw azhwVar, ayom ayomVar) {
        this.a = azhwVar;
        this.b = ayomVar;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (!this.d) {
            this.d = true;
            this.a.f(this);
            this.c = null;
        }
    }
}
