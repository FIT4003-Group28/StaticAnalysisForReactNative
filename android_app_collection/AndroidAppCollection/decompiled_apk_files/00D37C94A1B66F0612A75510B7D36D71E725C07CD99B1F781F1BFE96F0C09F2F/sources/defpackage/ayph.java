package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayph  reason: default package */
/* loaded from: classes2.dex */
abstract class ayph extends AtomicReference implements aypg {
    private static final long serialVersionUID = 6537757548749041217L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayph(Object obj) {
        super(obj);
        ayrd.b(obj, "value is null");
    }

    protected abstract void a(Object obj);

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == null;
    }

    @Override // defpackage.aypg
    public final void qr() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }
}
