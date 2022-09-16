package defpackage;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: szl  reason: default package */
/* loaded from: classes4.dex */
final class szl extends azov {
    final /* synthetic */ AtomicReference a;

    public szl(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.a.set(Status.l);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        this.a.set(Status.b);
    }
}
