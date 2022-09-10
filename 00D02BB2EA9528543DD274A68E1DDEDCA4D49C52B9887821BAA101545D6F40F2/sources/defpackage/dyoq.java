package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: dyoq  reason: default package */
/* loaded from: classes6.dex */
final class dyoq implements dyvf<Executor> {
    @Override // defpackage.dyvf
    public final /* bridge */ /* synthetic */ void a(Executor executor) {
        ((ExecutorService) executor).shutdown();
    }

    @Override // defpackage.dyvf
    public final /* bridge */ /* synthetic */ Executor b() {
        return Executors.newCachedThreadPool(dyow.k("grpc-default-executor-%d"));
    }

    public final String toString() {
        return "grpc-default-executor";
    }
}
