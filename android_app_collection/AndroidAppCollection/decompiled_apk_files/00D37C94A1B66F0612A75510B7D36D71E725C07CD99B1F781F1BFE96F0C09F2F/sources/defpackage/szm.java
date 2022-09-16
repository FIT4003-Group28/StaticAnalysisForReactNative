package defpackage;

import com.google.android.libraries.elements.interfaces.JSPromiseResolver;
import io.grpc.Status;
/* compiled from: PG */
/* renamed from: szm  reason: default package */
/* loaded from: classes4.dex */
final class szm extends azov {
    final /* synthetic */ JSPromiseResolver a;

    public szm(JSPromiseResolver jSPromiseResolver) {
        this.a = jSPromiseResolver;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.a.reject(Status.d.withDescription(th.getMessage() == null ? "error" : th.getMessage()));
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        this.a.resolve();
    }
}
