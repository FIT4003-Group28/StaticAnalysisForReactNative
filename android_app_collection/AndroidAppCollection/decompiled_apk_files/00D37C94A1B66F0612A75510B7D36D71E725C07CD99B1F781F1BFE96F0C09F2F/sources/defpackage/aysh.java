package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aysh  reason: default package */
/* loaded from: classes2.dex */
public final class aysh extends AtomicBoolean implements aypg {
    private static final long serialVersionUID = 8943152917179642732L;
    final ayns a;
    final /* synthetic */ aysi b;

    public aysh(aysi aysiVar, ayns aynsVar) {
        this.b = aysiVar;
        this.a = aynsVar;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get();
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (compareAndSet(false, true)) {
            this.b.W(this);
        }
    }
}
