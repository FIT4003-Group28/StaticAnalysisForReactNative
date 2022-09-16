package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aztf  reason: default package */
/* loaded from: classes2.dex */
public final class aztf implements aztg {
    private final AtomicReference a;

    public aztf(aztg aztgVar) {
        this.a = new AtomicReference(aztgVar);
    }

    @Override // defpackage.aztg
    public final Iterator a() {
        aztg aztgVar = (aztg) this.a.getAndSet(null);
        if (aztgVar == null) {
            throw new IllegalStateException("This sequence can be consumed only once.");
        }
        return aztgVar.a();
    }
}
