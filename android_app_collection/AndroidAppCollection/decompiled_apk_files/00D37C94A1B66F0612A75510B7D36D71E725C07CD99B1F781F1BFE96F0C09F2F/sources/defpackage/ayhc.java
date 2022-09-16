package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: ayhc  reason: default package */
/* loaded from: classes2.dex */
final class ayhc implements aymh {
    @Override // defpackage.aymh
    public final /* bridge */ /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(ayhf.j("grpc-default-executor-%d"));
    }

    @Override // defpackage.aymh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    public final String toString() {
        return "grpc-default-executor";
    }
}
