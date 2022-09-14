package defpackage;

import dagger.internal.Factory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: cleu  reason: default package */
/* loaded from: classes5.dex */
public final class cleu implements Factory<Executor> {
    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        dxjg.f(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }
}
