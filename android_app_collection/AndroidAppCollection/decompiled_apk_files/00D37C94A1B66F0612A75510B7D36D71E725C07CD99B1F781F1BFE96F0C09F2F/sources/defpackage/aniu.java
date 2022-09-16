package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aniu  reason: default package */
/* loaded from: classes.dex */
public final class aniu implements ankb {
    final /* synthetic */ anjd a;
    final /* synthetic */ Executor b;

    public aniu(anjd anjdVar, Executor executor) {
        this.a = anjdVar;
        this.b = executor;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.b.a.a((Closeable) obj, this.b);
    }
}
